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
public class NodoLista {
    Object datos;
    NodoLista siguienteNodo;
    
    NodoLista(Object objeto) {
        this.datos = objeto;
        siguienteNodo = null;
    }
    NodoLista(Object objeto, NodoLista nodo) {
        this.datos = objeto;
        siguienteNodo = nodo;
    }
    public NodoLista(NodoLista siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }
    Object obtenerObject() {
        return datos;  // devuelve el objeto Object en este nodo  
    } // ﬁn del método obtenerObject  

    // devuelve la referencia al siguiente nodo en la lista  
    NodoLista obtenerSiguiente() {
        return siguienteNodo;  // obtiene el siguiente nodo
    }
}
