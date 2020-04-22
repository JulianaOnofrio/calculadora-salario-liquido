package br.com.codenation.calculadora;


public class CalculadoraSalario {

    public long calcularSalarioLiquido(double salarioBase) {
        if (salarioBase < 1039.00) return 0;
        double result = calcularInss(salarioBase);
        result = calcularIRRF(result);
        return Math.round(result);
    }


    private double calcularInss(double salarioBase) {
        double aliquota;
        if (salarioBase <= 1500.00){
            aliquota = 0.08;
        } else if (salarioBase <= 4000.00){
            aliquota = 0.09;
        } else {
            aliquota = 0.11;
        }

        return salarioBase - (salarioBase * aliquota);

    }

    private double calcularIRRF(double salarioBase) {
        double aliquota;
        if (salarioBase <= 3000.00){
            aliquota = 0.0;
        } else if (salarioBase <= 6000.00){
            aliquota = 0.075;
        } else {
            aliquota = 0.15;
        }

        return salarioBase - (salarioBase * aliquota);

    }

}