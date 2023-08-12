package org.example._03;

public class CalcQuadraticEq {
    private double a;
    private double b;
    private double c;

    public CalcQuadraticEq(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calcularEquacaoQuadratica() {
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            calcularDuasRaizes(delta);
        } else if (delta == 0) {
            calcularUmaRaiz();
        } else {
            System.out.println("A equação não possui raízes reais.");
        }
    }

    private void calcularDuasRaizes(double delta) {
        double x1 = (-b - Math.sqrt(delta)) / (2 * a);
        double x2 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.println("x1 = " + x1 + ", x2 = " + x2);
    }

    private void calcularUmaRaiz() {
        double x = -b / (2 * a);
        System.out.println("x = " + x);
    }
}
