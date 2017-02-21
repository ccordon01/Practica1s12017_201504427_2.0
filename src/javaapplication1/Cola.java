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
public class Cola {

    NodoLista primerNodo;
    NodoLista ultimoNodo;
    String nombre;

    public Cola() {
        this("cola");
    }

    public Cola(String n) {
        nombre = n;
        primerNodo = ultimoNodo = null;
    }

    public void insertarAlFinal(Object ei) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new NodoLista(ei);
        } else {
            ultimoNodo = ultimoNodo.siguienteNodo = new NodoLista(ei);
        }
    }

    public Object eliminarDelFrente() {
        if (estaVacia()) {
            return "Lista Vacia";
        } else {
            Object ee = primerNodo.datos;
            if (primerNodo == ultimoNodo) {
                primerNodo = ultimoNodo = null;
            } else {
                primerNodo = primerNodo.siguienteNodo;
            }
            return ee;
        }
    }

    public boolean estaVacia() {

        return primerNodo == null;
    }

    public void imprimir() {
        if (estaVacia()) {
            System.out.printf("%s vacia\n", nombre);
            return;
        }
        System.out.printf("La %s es: ", nombre);
        NodoLista actual = primerNodo;

        System.out.println(" ");
        while (actual != null) {
            System.out.printf("%s", actual.datos);
            actual = actual.siguienteNodo;
            System.out.println("");
        }

    }

    public Jugadores[] imprimir2() {
        Jugadores[] arraydata = new Jugadores[getsize()];
        if (estaVacia()) {
            System.out.printf("%s vacia\n", nombre);
            return arraydata;
        }
        //System.out.printf("La %s es: ", nombre);
        NodoLista actual = primerNodo;
        int c = 0;
        System.out.println(" ");
        while (actual != null) {
            arraydata[c] = (Jugadores) actual.datos;
            //System.out.printf("%s", actual.datos);
            actual = actual.siguienteNodo;
            //System.out.println("");
            c++;
        }
        return arraydata;
    }

    public int getsize() {

        NodoLista actual = primerNodo;
        int c = 0;
        //System.out.println(" ");
        do {
            //7System.out.println("Lista: "+ c);
            //System.out.println(actual.lista.nombre);
            //actual.lista.imprimir();
            actual = actual.siguienteNodo;
            c++;
        } while (actual != null);
        return c;
    }
}
