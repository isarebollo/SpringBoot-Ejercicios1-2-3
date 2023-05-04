package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Saludo buenosDias = (Saludo) context.getBean("buenosDias");
        String texto = buenosDias.imprimirSaludo();
        System.out.println(texto);
    }
}
