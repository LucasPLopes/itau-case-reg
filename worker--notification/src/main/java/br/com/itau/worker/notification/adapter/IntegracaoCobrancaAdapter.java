package br.com.itau.worker.notification.adapter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class IntegracaoCobrancaAdapter {

    public void integrar() {
      log.info("Realizando integração");
    }
}
