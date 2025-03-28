package br.com.itau.worker.notification.model;

public record ClientePJ(
        String cnpj,
        String email,
        String responsavel,
        String telefone
) {
}
