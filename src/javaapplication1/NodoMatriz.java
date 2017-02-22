/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import jdk.nashorn.internal.ir.TryNode;

/**
 *
 * @author cech
 */
public class NodoMatriz {
    String name;
    Object datos;
    Letras letra;
    NodoMatriz siguienteNodo;
    NodoMatriz superiorNodo;
    NodoMatriz anteriorNodo;
    NodoMatriz inferiorNodo;
    NodoMatriz(Object objeto) {
        this.name=null;
        this.datos = objeto;
        this.letra = null;
        siguienteNodo = null;
        superiorNodo = null;
        anteriorNodo = null;
        inferiorNodo = null;
    }
    NodoMatriz() {
        this.datos = 1;
        this.letra = null;
        siguienteNodo = null;
        superiorNodo = null;
        anteriorNodo = null;
        inferiorNodo = null;
    }
    NodoMatriz(Object objeto, NodoMatriz nodo) {
        this.datos = objeto;
        siguienteNodo = nodo;
    }
    public NodoMatriz(NodoMatriz siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    public void setDatos(Object datos) {
        this.datos = datos;
    }
    Object obtenerObject() {
        return datos;  // devuelve el objeto Object en este nodo  
    } // ﬁn del método obtenerObject  

    // devuelve la referencia al siguiente nodo en la lista  
    NodoMatriz obtenerSiguiente() {
        return siguienteNodo;  // obtiene el siguiente nodo
    }
    
}
