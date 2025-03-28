package br.com.itau.service.notification.api.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ServicoGateway {

    public void enviarSolicitacao(String mensagem){
      log.info("Enviando notificações via gateway ");
    }
}
