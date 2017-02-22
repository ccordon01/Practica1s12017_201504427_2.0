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
public class Matriz {

    int x, y;
    int contador = 0;
    NodoMatriz primerNodo;
    Boolean validador = true;

    public Matriz(int m, int n) {
        if (m > 0 && n > 0) {
            x = n;
            y = m;
            primerNodo = new NodoMatriz();
            asignacion_horizontal1(primerNodo);
            asignacion_interna(primerNodo.siguienteNodo, primerNodo.siguienteNodo);
        } else {
            System.out.println("limites no permitidos");
        }
    }
    public Matriz() {
        
    }

    private void asignacion_horizontal1(NodoMatriz actual) {
        if (contador != (x - 1)) {
            NodoMatriz nuevo = new NodoMatriz();
            actual.siguienteNodo = nuevo;
            nuevo.anteriorNodo = actual;
            contador++;
            asignacion_horizontal1(nuevo);
        } else {
            contador = 0;
            asignacion_vertical1(actual);
        }
    }

    private void asignacion_vertical1(NodoMatriz actual) {
        if (contador != (y - 1)) {
            NodoMatriz nuevo = new NodoMatriz();
            actual.inferiorNodo = nuevo;
            nuevo.superiorNodo = actual;
            contador++;
            asignacion_vertical1(nuevo);
        } else {
            contador = 0;
            asignacion_horizontal2(actual);
        }
    }

    private void asignacion_horizontal2(NodoMatriz actual) {
        if (contador != (x - 1)) {
            NodoMatriz nuevo = new NodoMatriz();
            actual.anteriorNodo = nuevo;
            nuevo.siguienteNodo = actual;
            contador++;
            asignacion_horizontal2(nuevo);
        } else {
            contador = 0;
            asignacion_vertical2(actual);
        }
    }

    private void asignacion_vertical2(NodoMatriz actual) {
        if (y != 1) {
            if (contador != (y - 2)) {
                NodoMatriz nuevo = new NodoMatriz();
                actual.superiorNodo = nuevo;
                nuevo.inferiorNodo = actual;
                contador++;
                asignacion_vertical2(nuevo);
            } else {
                contador = 0;
                actual.superiorNodo = primerNodo;
                primerNodo.inferiorNodo = actual;
            }
        }
    }

    private void asignacion_interna(NodoMatriz actual, NodoMatriz puntero) {
        if (actual != null) {
            NodoMatriz temporal = actual.anteriorNodo.inferiorNodo;
            if (actual.inferiorNodo == null) {
                NodoMatriz nuevo = new NodoMatriz();
                if (temporal != null) {
                    if (temporal.siguienteNodo == null) {
                        temporal.siguienteNodo = nuevo;
                        nuevo.anteriorNodo = temporal;
                        actual.inferiorNodo = nuevo;
                        nuevo.superiorNodo = actual;
                        asignacion_interna(nuevo, puntero);
                    } else {
                        temporal.siguienteNodo.superiorNodo = actual;
                        actual.inferiorNodo = temporal.siguienteNodo;
                        asignacion_interna(puntero.siguienteNodo, puntero.siguienteNodo);
                    }
                }
            }
            else {
                if (temporal != null) {
                    if (temporal.siguienteNodo == null) {
                        temporal.siguienteNodo= actual.inferiorNodo;
                        actual.inferiorNodo.anteriorNodo=temporal;
                        asignacion_interna(actual.inferiorNodo, puntero);
                    }
                    }
                }
        }
    }

    public NodoMatriz item(int x, int y) {
        //System.out.println("entro x: "+x);
        //System.out.println("entro y: "+y);
        int contador_busqueda = 0;
        NodoMatriz auxiliar = primerNodo;
        if (x != 0) {
            do {
                auxiliar = auxiliar.inferiorNodo;
                contador_busqueda++;
            } while (contador_busqueda != x);
            if (y != 0) {
                contador_busqueda = 0;
                do {
                    auxiliar = auxiliar.siguienteNodo;
                    contador_busqueda++;
                } while (contador_busqueda != y);
                return auxiliar;
            } else {
                return auxiliar;
            }
        } else {
            if (y != 0) {
                contador_busqueda = 0;
                do {
                    auxiliar = auxiliar.siguienteNodo;
                    contador_busqueda++;
                } while (contador_busqueda != y);
                return auxiliar;
            }
            return auxiliar;
        }
    }
}
