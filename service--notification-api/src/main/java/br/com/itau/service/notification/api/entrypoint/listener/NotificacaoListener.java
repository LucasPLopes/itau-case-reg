package br.com.itau.service.notification.api.entrypoint.listener;

import br.com.itau.service.notification.api.usecase.NotificacaoUsecase;
import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoListener {

    private final NotificacaoUsecase notificacaoUsecase;

    public NotificacaoListener(NotificacaoUsecase notificacaoUsecase) {
        this.notificacaoUsecase = notificacaoUsecase;
    }

    @SqsListener("cobranca.notificacoes")
    public void processar(String mensagem){
     notificacaoUsecase.notificar(mensagem);
    }

}
