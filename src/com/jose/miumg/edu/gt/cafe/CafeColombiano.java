package com.jose.miumg.edu.gt.cafe;

import com.jose.miumg.edu.gt.ingrediente.Ingrediente;

import java.util.List;

public class CafeColombiano extends Cafe {

    private String tipoGrano;

    public CafeColombiano(String nombre, int tamano, int precio, String tipoGrano , List<Ingrediente> ingredientes) {
        super(nombre, tamano, precio, ingredientes);
        this.tipoGrano = tipoGrano;
    }

    public String getTipoGrano() {
        return tipoGrano;
    }

    public void setTipoGrano(String tipoGrano) {
        this.tipoGrano = tipoGrano;
    }

    @Override
    public void preparar() {
        System.out.println("Sem empieza a preparar un  CafeColombiano");

    }



    @Override
    public void servir() {
        System.out.println("Se empieza a servir un  CafeColombiano");
    }
}
