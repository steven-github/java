/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.classes.consola;

/**
 *
 * @author stevensanchezm
 */
public class NodoConsola {
    
    private Consola dato;
    private NodoConsola atras;

    public NodoConsola(Consola dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
    
    public String getNombres() {
        return "" + dato.getNombre();
    }
    
    public String getPrecios() {
        return "" + dato.getPrecio();
    }

    public Consola getDato() {
        return dato;
    }

    public NodoConsola getAtras() {
        return atras;
    }

    public void setDato(Consola dato) {
        this.dato = dato;
    }

    public void setAtras(NodoConsola atras) {
        this.atras = atras;
    }
    
}
