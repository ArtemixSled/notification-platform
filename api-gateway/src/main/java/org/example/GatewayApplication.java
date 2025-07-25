package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Точка входа для запуска Spring Cloud Gateway приложения.
 * <p>
 * Аннотация {@link SpringBootApplication} включает:
 * <ul>
 *   <li>Автоматическую конфигурацию Spring Boot;</li>
 *   <li>Компонентный сканинг пакета {@code org.example} и его подпакетов;</li>
 *   <li>Включение поддержки Spring Cloud Gateway и связанных компонентов.</li>
 * </ul>
 * </p>
 */
@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}