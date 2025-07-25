package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Точка входа для Spring Cloud Config Server.
 * <p>
 * Аннотация {@link SpringBootApplication} включает автоконфигурацию Spring Boot и
 * сканирование компонентов в пакете {@code org.example}.
 * Аннотация {@link EnableConfigServer} активирует функциональность Config Server,
 * позволяя приложению раздавать внешние конфигурационные файлы клиентам.
 * </p>
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
