/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.classes.cuarto;

/**
 *
 * @author stevensanchezm
 */
public class NodoCuarto {

    private Cuarto dato;
    private NodoCuarto next;

    public NodoCuarto(Cuarto dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return dato + "\n";
    }

    public Cuarto getDato() {
        return dato;
    }

    public NodoCuarto getNext() {
        return next;
    }

    public void setDato(Cuarto dato) {
        this.dato = dato;
    }

    public void setNext(NodoCuarto next) {
        this.next = next;
    }
}
