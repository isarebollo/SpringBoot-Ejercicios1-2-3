package com.example;
import org.springframework.stereotype.Component;

@Component
public class UserService {

     NotificacionService notificacionService;


    public UserService(NotificacionService notificacionService){
        System.out.println("Ejecutando constructor userService");
        this.notificacionService = notificacionService;
    }


}