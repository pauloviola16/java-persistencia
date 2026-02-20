import br.com.cod3r.app.calculo.CalculadoraImpl;

module app.calculo {
    requires app.logging;
    // faz com que fique visível para outros módulos
    exports br.com.cod3r.app.calculo;

    // exporta para um módulo específico
    exports br.com.cod3r.app.calculo.interno
            to app.financeiro;

    requires app.api.publica;
    provides br.com.cod3r.app.Calculadora with br.com.cod3r.app.calculo.CalculadoraImpl;


}