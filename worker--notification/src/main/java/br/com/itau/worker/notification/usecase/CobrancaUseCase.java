package br.com.itau.worker.notification.usecase;

import br.com.itau.worker.notification.adapter.IntegracaoCobrancaAdapter;
import br.com.itau.worker.notification.config.KafkaTopicsConstants;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CobrancaUseCase {
    private final IntegracaoCobrancaAdapter integracaoCobrancaAdapter;
    private final KafkaTemplate<String, String> kafkaTemplate;

    public CobrancaUseCase(IntegracaoCobrancaAdapter integracaoCobrancaAdapter, KafkaTemplate<String, String> kafkaTemplate) {
        this.integracaoCobrancaAdapter = integracaoCobrancaAdapter;
        this.kafkaTemplate = kafkaTemplate;
    }

    public void processarCobrancas() {
        // TODO:  Ações que notificam os clientes sobre pendências (SMS, e-mail, carta).
        integracaoCobrancaAdapter.integrar();
        publicarCobranca("Notificando cobrança");
    }

    public void publicarCobranca(String payload) {
        kafkaTemplate.send(KafkaTopicsConstants.COBRANCA_NOTIFICACOES, payload);
    }
}
