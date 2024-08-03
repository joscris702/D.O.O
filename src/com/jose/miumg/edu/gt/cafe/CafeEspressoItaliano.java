package com.jose.miumg.edu.gt.cafe;

import com.jose.miumg.edu.gt.ingrediente.Ingrediente;

import java.util.List;

public class CafeEspressoItaliano extends Cafe {

    private int intensidad;


    public CafeEspressoItaliano(String nombre, int tamano, int precio, int intensidad, List<Ingrediente> ingredientes) {
        super(nombre, tamano, precio, ingredientes);
        this.intensidad = intensidad;
    }




    @Override
    public void preparar() {

        System.out.println("Preparando CafeEspresso");
        System.out.println("Cafe preparado con los siguientes ingredientes: ");
        ingredientes.stream().forEach(ingrediente -> {System.out.println(ingrediente.getNombre());});
    }


    @Override
    public void servir() {
        System.out.println("Sirviendo cafespress");

    }
}
