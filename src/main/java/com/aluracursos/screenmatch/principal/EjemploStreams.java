package com.aluracursos.screenmatch.principal;

import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
    public void muestraEjemplo(){
        List<String> nombres = Arrays.asList("Luisa", "Brenda","Emanuel","Julian","Elisa");

        nombres.stream()
                .sorted()
                .limit(2).
                filter(n -> n.startsWith("E"))
                .map   (n-> n.toUpperCase())
                .forEach(System.out::println);
    }
}
































