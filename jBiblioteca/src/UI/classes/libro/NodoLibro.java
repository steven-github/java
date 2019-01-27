/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.classes.libro;

import examples.classes.cuarto.*;

/**
 *
 * @author stevensanchezm
 */
public class NodoLibro {

    private Libro dato;
    private NodoLibro next;

    public NodoLibro(Libro dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "" + dato;
    }

    public Libro getDato() {
        return dato;
    }

    public NodoLibro getNext() {
        return next;
    }

    public void setDato(Libro dato) {
        this.dato = dato;
    }

    public void setNext(NodoLibro next) {
        this.next = next;
    }
}
