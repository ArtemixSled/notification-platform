package org.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * FallbackController предоставляет конечные точки резервного ответа (fallback),
 * которые используются в случае недоступности downstream-сервисов.
 * <p>
 * В частности, этот контроллер обрабатывает сценарий, когда Notification Service
 * временно недоступен, и возвращает клиенту предопределённый ответ с кодом 503.
 * </p>
 */
@RestController
public class FallbackController {

    @GetMapping("/fallback/notification")
    public Mono<ResponseEntity<String>> notificationFallback() {
        return Mono.just(ResponseEntity
                .status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("Notification Service is temporarily unavailable. Please try again later."));
    }
}
