package com.example;

public class GestorFacturas {

    Calculator calculator;
    String nombre;
    public GestorFacturas(Calculator calculator,String nombre){
        this.calculator = calculator;
        this.nombre = nombre;
        System.out.println("Ejecutando contructor GestorFacturas");
    }

}
