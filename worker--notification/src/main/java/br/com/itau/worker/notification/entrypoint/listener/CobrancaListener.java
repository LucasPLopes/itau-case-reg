package br.com.itau.worker.notification.entrypoint.listener;

import br.com.itau.worker.notification.config.KafkaTopicsConstants;
import br.com.itau.worker.notification.usecase.NotificacaoSnsUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CobrancaListener {

    private final NotificacaoSnsUseCase notificacaoSnsUseCase;

    public CobrancaListener(NotificacaoSnsUseCase notificacaoSnsUseCase) {
        this.notificacaoSnsUseCase = notificacaoSnsUseCase;
    }

    @KafkaListener(topics = KafkaTopicsConstants.COBRANCA_NOTIFICACOES,
    groupId = "worker--notification")
    public void  listener(String payload) {
        log.info("Recebido payload: {}", payload);
        notificacaoSnsUseCase.enviarNotificacao(payload);
    }
}
