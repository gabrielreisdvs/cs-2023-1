package org.example._05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CartaoUtilOriginal {
    private String numero;
    private String validade;
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM/yyyy");
    public static final int VISA = 1;
    public static final int MASTERCARD = 2;
    public static final int AMEX = 3;
    public static final int DINERS = 4;

    public CartaoUtilOriginal(String numero, String validade) {
        this.numero = numero;
        this.validade = validade;
    }

    public boolean isValido() {
        return validarValidade() && validarFormato();
    }

    private boolean validarValidade() {
        try {
            Date dataValidade = DATE_FORMAT.parse(validade);
            Calendar calValidade = new GregorianCalendar();
            calValidade.setTime(dataValidade);

            Calendar calHoje = Calendar.getInstance();
            calHoje.set(Calendar.DAY_OF_MONTH, 1);
            calHoje.set(Calendar.HOUR_OF_DAY, 0);
            calHoje.set(Calendar.MINUTE, 0);
            calHoje.set(Calendar.SECOND, 0);
            calHoje.set(Calendar.MILLISECOND, 0);

            return calHoje.before(calValidade);
        } catch (ParseException e) {
            return false;
        }
    }

    private boolean validarFormato() {
        String formatado = numero.replaceAll("\\D", "");

        switch (getBandeira()) {
            case VISA:
                return formatado.matches("^4(\\d{12}|\\d{15})$");
            case MASTERCARD:
                return formatado.matches("^5[1-5]\\d{14}$");
            case AMEX:
                return formatado.matches("^3[47]\\d{13}$");
            case DINERS:
                return formatado.matches("^3[68]\\d{12}|0[0-5]\\d{11}$");
            default:
                return false;
        }
    }

    private int getBandeira() {
        if (numero.startsWith("4")) {
            return VISA;
        } else if (numero.startsWith("51") || numero.startsWith("52") || numero.startsWith("53") ||
                numero.startsWith("54") || numero.startsWith("55")) {
            return MASTERCARD;
        } else if (numero.startsWith("34") || numero.startsWith("37")) {
            return AMEX;
        } else if (numero.startsWith("36") || numero.startsWith("38") || numero.startsWith("300") ||
                numero.startsWith("301") || numero.startsWith("302") || numero.startsWith("303") ||
                numero.startsWith("304") || numero.startsWith("305") || numero.matches("^0[0-5].*")) {
            return DINERS;
        } else {
            return -1;
        }
    }
}
