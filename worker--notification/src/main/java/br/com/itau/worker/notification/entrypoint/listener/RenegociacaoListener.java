package br.com.itau.worker.notification.entrypoint.listener;

import br.com.itau.worker.notification.config.KafkaTopicsConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RenegociacaoListener {

    @KafkaListener(topics = KafkaTopicsConstants.RENEGOCIACAO_SOLICITACOES,
            groupId = "worker--notification")
    public void listener(String payload) {
        log.info("Recebido payload: {}", payload);
    }
}
