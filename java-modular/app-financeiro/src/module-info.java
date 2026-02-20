module app.financeiro {
    uses br.com.cod3r.app.Calculadora;
    requires java.base; // por padrão

    // solicita o uso do modulo dentro do app.calculo
    requires app.calculo;

    requires app.api.publica;
}