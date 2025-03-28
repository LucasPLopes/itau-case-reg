package br.com.itau.service.notification.api.usecase;

import br.com.itau.service.notification.api.gateway.ServicoGateway;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotificacaoUsecase {

    private final ServicoGateway servicoGateway;

    public NotificacaoUsecase(ServicoGateway servicoGateway) {
        this.servicoGateway = servicoGateway;
    }

    public void notificar(String mensagem){
      log.info("Notificando gateway de serviços: {}", mensagem);
      servicoGateway.enviarSolicitacao(mensagem);
    }
}
