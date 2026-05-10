package org.iceforge.hydrasil.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.iceforge.hydrasil")
public class HydrasilApplication {
    public static void main(String[] args) {
        SpringApplication.run(HydrasilApplication.class, args);
    }
}
