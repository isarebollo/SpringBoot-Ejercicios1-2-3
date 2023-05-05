package com.example.Ejercico3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercico3Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Ejercico3Application.class, args);
        CocheRepository repository = context.getBean(CocheRepository.class);

        System.out.println("El numero inicial de coches en la base de datos es de: " + repository.count());

        Coche seat = new Coche(null, "Seat", "Ibiza", 2023);
        repository.save(seat);

        Coche renault = new Coche(null, "Renault", "Megane", 2020);
        repository.save(renault);
        Coche mercedes = new Coche(null, "Mercedes", "GL432", 2020);
        repository.save(mercedes);

        System.out.println("El número actual de coches en la base de datos es de: " + repository.count());
        System.out.println(repository.findAll());
    }

}
