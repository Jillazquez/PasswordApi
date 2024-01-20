package com.example.ApiPass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassReader {

    @GetMapping("/")
    public String home() {
        return "¡Hola, esta es tu API Spring Boot para comprobar contraseñas!";
    }
    @GetMapping("/getPass/{password}")
    public String isMyPassFiltered(@PathVariable("password") String pass) {
        ArrayList<String> contraseñas = getListFromResource();
       return (contraseñas.contains(pass)) ? "Tu contraseña aparece en la lista cambia lo antes posible" : "Tu contraseña no aparece en la lista pero no te confies";
    }

     private ArrayList<String> getListFromResource() {
        ArrayList<String> lineas = new ArrayList<>();

        try (InputStream resourceStream = getClass().getClassLoader().getResourceAsStream("rockyou.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(resourceStream))) {

            String aux;
            while ((aux = br.readLine()) != null) {
                lineas.add(aux);
            }

        } catch (IOException e) {
            //TODO Exception
        }

        return lineas;
    }
}
