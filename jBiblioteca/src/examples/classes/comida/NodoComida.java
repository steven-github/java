/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.classes.comida;

/**
 *
 * @author stevensanchezm
 */
public class NodoComida {

    private Comida dato;
    private NodoComida abajo; //puntero

    public NodoComida(Comida dato) {
        this.dato = dato;
    }
    
    @Override
    public String toString() {
        return "" + dato;
    }
    
    public String getNombres() {
        return "" + dato.getNombre();
    }
    
    public String getPrecios() {
        return "" + dato.getPrecio();
    }

    public Comida getDato() {
        return dato;
    }

    public NodoComida getAbajo() {
        return abajo;
    }

    public void setDato(Comida dato) {
        this.dato = dato;
    }

    public void setAbajo(NodoComida abajo) {
        this.abajo = abajo;
    }

}
