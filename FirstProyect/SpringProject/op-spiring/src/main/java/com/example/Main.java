package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Calculator calculadora = (Calculator) context.getBean("calculator");
        String texto = calculadora.helloWorld();
        System.out.println(texto);

        Calculator calculadora2 = (Calculator) context.getBean("calculator");
        String texto2 = calculadora2.helloWorld();
        System.out.println(texto2);

        //GestorFacturas cargar un bean dentro de otro bean

        GestorFacturas factura = (GestorFacturas) context.getBean("gestorFactura");
        System.out.println(factura.calculator.helloWorld());

        // Concepto: scope de bean
        // Los por defecto son singleton, se crea el objeto y se utiliza para toda la aplicacion 
        // podemos cambiarlo a scope="prototype" si queremos que se cree un nuevo objeto cada vez 

        




    }
}
