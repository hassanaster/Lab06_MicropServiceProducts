package com.udea.microservicio;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

    @Component
	public class ProductCRL implements CommandLineRunner {
		@Autowired
		private ProductRepository productRepository ;
	
		@Override
		public void run(String... args) throws Exception {
        Stream.of("Shampoo", "Crema", "Jabon").
                forEach(s -> productRepository.save(new Product(s)));
       productRepository.findAll().forEach(System.out::println);
    }
}
