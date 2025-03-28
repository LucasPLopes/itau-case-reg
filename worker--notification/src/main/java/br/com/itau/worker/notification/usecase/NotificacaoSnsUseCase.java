package br.com.itau.worker.notification.usecase;

import io.awspring.cloud.sns.core.SnsTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class NotificacaoSnsUseCase {
    private final SnsTemplate snsTemplate;
    private final String topico;

    public NotificacaoSnsUseCase(SnsTemplate snsTemplate,
                                 @Value("${aws.sns.topic.cobranca.arn}") String topico) {
        this.snsTemplate = snsTemplate;
        this.topico = topico;
    }

    public void enviarNotificacao(String mensagem ) {
        try {
            log.info("Enviando notificação SNS para o tópico {}:  Mensagem='{}'",
                    topico, mensagem);

            snsTemplate.sendNotification(topico, mensagem);

            log.info("Notificação SNS enviada com sucesso.");

        } catch (MessagingException e) {
            log.error("Erro ao enviar notificação SNS para o tópico {}: {}", topico, e.getMessage(), e);
        }
    }
}
