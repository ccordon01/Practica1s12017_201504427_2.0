/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author cech
 */
public class Jugadores {
    String nombre_usuario;
    int puntos;
    ListaSimple palabras;

    public Jugadores(String nombre_usuario, int puntos, ListaSimple palabras) {
        this.nombre_usuario = nombre_usuario;
        this.puntos = puntos;
        this.palabras = palabras;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ListaSimple getPalabras() {
        return palabras;
    }

    public void setPalabras(ListaSimple palabras) {
        this.palabras = palabras;
    }
    
    
}
