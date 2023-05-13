package com.entidade;

/**
 * Classe para armazenar o resultado da calculadora.
 * 
 * @author osmar
 */
public class CalculadoraResultado {

    private double a;
    private double b;
    private String operador;
    private double resultado;
    
    public CalculadoraResultado(){
        this(0,0,"",0);
    }

    public CalculadoraResultado(double a, double b, String operador, double resultado) {
        this.a = a;
        this.b = b;
        this.operador = operador;
        this.resultado = resultado;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}