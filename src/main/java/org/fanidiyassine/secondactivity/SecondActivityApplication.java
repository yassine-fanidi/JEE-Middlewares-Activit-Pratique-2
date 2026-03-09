package org.fanidiyassine.secondactivity;

import org.fanidiyassine.secondactivity.entities.Product;
import org.fanidiyassine.secondactivity.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@SpringBootApplication
public class SecondActivityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondActivityApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(
                    Product.builder()
                            .name("Computer")
                            .price(5000)
                            .quantity(20)
                            .build()
            );
            productRepository.save(
                    Product.builder()
                            .name("Smart phone")
                            .price(3000)
                            .quantity(40)
                            .build()
            );
            productRepository.save(
                    Product.builder()
                            .name("Printer")
                            .price(1000)
                            .quantity(10)
                            .build()
            );

            Product p1 = new Product();
            p1.setName("Laptop");
            p1.setPrice(7000);
            p1.setQuantity(10);

            Product p2 = new Product(null, "Desktop", 9000, 40);

            productRepository.save(p1);
            productRepository.save(p2);

            productRepository.findAll().forEach(p -> {
                System.out.println(p.toString());
            });

        };
    }

}
