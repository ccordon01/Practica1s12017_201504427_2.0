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
public class ListaCircular {

    ListaSimple jugadores;
    NodoLista primerNodo;
    NodoLista ultimoNodo;
    int tam;

    public ListaCircular() {
        this.jugadores = null;
        this.primerNodo = null;
        this.ultimoNodo = null;
        tam = 0;
    }

    public void insertarAlFinal(Object ei) {
        NodoLista nuevo = new NodoLista(ei);
        if (estaVacia()) {
            primerNodo = nuevo;
            ultimoNodo = nuevo;
            ultimoNodo.siguienteNodo = primerNodo;
        } else {
            ultimoNodo.siguienteNodo = nuevo;
            nuevo.siguienteNodo = primerNodo;
            ultimoNodo = nuevo;
        }
        tam++;
    }

    public Jugadores nodoPosicion(int posicion) {
        NodoLista temp = primerNodo;
        Jugadores jugador = (Jugadores) temp.datos;
        if (posicion == 0) {
            return jugador;
        } else {
            for (int i = 0; i < posicion; i++) {
                temp = temp.siguienteNodo;
            }
            jugador = (Jugadores) temp.datos;

            return jugador;
        }
    }
    public NodoLista nodoPosicionN(int posicion) {
        NodoLista temp = primerNodo;
        //Jugadores jugador = (Jugadores) temp.datos;
        if (posicion == 0) {
            return temp;
        } else {
            for (int i = 0; i < posicion; i++) {
                temp = temp.siguienteNodo;
            }
            //jugador = (Jugadores) temp.datos;

            return temp;
        }
    }

    public int getsize() {
        return tam;
    }

    public boolean estaVacia() {
        return primerNodo == null;
    }

    public boolean validar(String user) {
        NodoLista temp = primerNodo;
        Jugadores jugador = null;
        for (int i = 0; i < tam; i++) {
            jugador = (Jugadores) temp.datos;
            System.out.println(jugador.getNombre_usuario() + " = " + user);
            if (jugador.getNombre_usuario().equalsIgnoreCase(user)) {
                return false;
            }
            temp = temp.siguienteNodo;
        }
        return true;
    }

}
