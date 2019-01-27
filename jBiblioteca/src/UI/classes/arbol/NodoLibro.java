/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.classes.arbol;
/**
 *
 * @author steven
 */
public class NodoLibro {

    private Libro dato;
    private NodoLibro hijoIzq, hijoDer;

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

    public NodoLibro getHijoIzq() {
        return hijoIzq;
    }

    public NodoLibro getHijoDer() {
        return hijoDer;
    }

    public void setDato(Libro dato) {
        this.dato = dato;
    }

    public void setHijoIzq(NodoLibro hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public void setHijoDer(NodoLibro hijoDer) {
        this.hijoDer = hijoDer;
    }

}
