package br.com.cod3r.app.financeiro;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.CalculadoraImpl;

import java.util.ServiceLoader;

public class Teste {
    public static void main(String[] args) {

        Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();
        System.out.println(calc.soma(2,3,4));

        System.out.println(CalculadoraImpl.class.getName());
    }
}
