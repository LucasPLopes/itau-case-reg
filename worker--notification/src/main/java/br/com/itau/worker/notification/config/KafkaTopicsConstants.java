package br.com.itau.worker.notification.config;

public final class KafkaTopicsConstants {

    public static final String COBRANCA_NOTIFICACOES = "cobranca.notificacoes";
    public static final String RENEGOCIACAO_SOLICITACOES = "renegociacao.solicitacoes";
    public static final String RENEGOCIACAO_RESULTADOS = "renegociacao.resultados";
    public static final String PAGAMENTO_PROCESSAMENTOS = "pagamento.processamentos";
    public static final String NEGATIVACAO_SOLICITACOES = "negativacao.solicitacoes";
    public static final String NEGATIVACAO_RESULTADOS = "negativacao.resultados";

    private KafkaTopicsConstants() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}