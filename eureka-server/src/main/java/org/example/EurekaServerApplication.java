package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Точка входа для Spring Cloud Netflix Eureka Server.
 * <p>
 * Аннотация {@link SpringBootApplication} включает автоконфигурацию Spring Boot,
 * настройку встроенного сервера и сканирование компонентов в пакете {@code org.example}.
 * Аннотация {@link EnableEurekaServer} активирует функциональность Eureka Server,
 * позволяя этому приложению выступать в роли централизованного сервиса регистрации
 * и обнаружения для других микросервисов.
 * </p>
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
