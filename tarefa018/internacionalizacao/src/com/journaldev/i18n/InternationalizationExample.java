package com.journaldev.i18n;
import java.util.*;

public class InternationalizationExample {
    public static void main(String[] args) {
        // Lista dos códigos dos países
        String[] countryCodes = {"pt_BR", "es_AR", "ru_RU", "es_CL", "pt_PT", "es_UY", "en_CA", "en_IN", "es_MX", "en_AU"};

        // Loop para cada país
        for (String countryCode : countryCodes) {
            // Define o idioma e carrega o arquivo de propriedades
            Locale locale = new Locale(countryCode);
            ResourceBundle bundle = ResourceBundle.getBundle("ApplicationMessages", locale);

            // Imprime os dados do país
            System.out.println("----- " + bundle.getString("1.1.1") + " -----");
            System.out.println("Linguagem: " + bundle.getString("1.1.2"));
            System.out.println("Data (formato curto): " + bundle.getString("1.1.3"));
            System.out.println("Data (formato longo): " + bundle.getString("1.1.4"));
            System.out.println("Formato de hora: " + bundle.getString("1.1.5"));
            System.out.println("Símbolo da moeda local: " + bundle.getString("1.1.6"));
            System.out.println("Separador de decimal: " + bundle.getString("1.1.7"));
            System.out.println("Separador de milhar: " + bundle.getString("1.1.8"));
            System.out.println("Abreviação da moeda local: " + bundle.getString("1.1.9"));
            System.out.println("Código de página Windows: " + bundle.getString("1.1.10"));
            System.out.println();
        }
    }
}
