package br.com.itau.worker.notification.model;

public record ContratoCobranca(
        ClientePJ cliente,
        double valor,
        String vencimento) {
}