package br.com.itau.worker.notification.entrypoint.scheduler;


import br.com.itau.worker.notification.usecase.CobrancaUseCase;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CobrancaScheduler {
    private final CobrancaUseCase useCase;

    public CobrancaScheduler(CobrancaUseCase useCase) {
        this.useCase = useCase;
    }

    @Scheduled(fixedDelay = 5000L)
    public void acionar() {
        useCase.processarCobrancas();
    }


}
