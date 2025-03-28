package br.com.itau.worker.notification.model;

import java.math.BigDecimal;

public record ContratoOferta(
        ClientePJ cliente,
        BigDecimal valorDesconto,
        Integer parcelas
) {
}
