/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.classes.historial;

import examples.classes.consola.*;

/**
 *
 * @author stevensanchezm
 */
public class NodoHistorial {
    
    private Historial dato;
    private NodoHistorial atras;

    public NodoHistorial(Historial dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "" + dato;
    }

    public Historial getDato() {
        return dato;
    }

    public NodoHistorial getAtras() {
        return atras;
    }

    public void setDato(Historial dato) {
        this.dato = dato;
    }

    public void setAtras(NodoHistorial atras) {
        this.atras = atras;
    }
    
}
