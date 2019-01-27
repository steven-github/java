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
public class ColaHistorial {

    private NodoHistorial frente, ultimo;

    public void encola(NodoHistorial n) {

        if (frente == null) {
            frente = n;
        } else {
            ultimo.setAtras(n);
        }

        ultimo = n;

    }

    public NodoHistorial atiende() {

        NodoHistorial aux = frente;

        if (aux != null) {

            frente = frente.getAtras();
            aux.setAtras(null);

            if (frente == null) {
                ultimo = null;
            }
        }

        return aux;
    }

    @Override
    public String toString() {
        //return "Cola{" + "frente=" + frente + ", ultimo=" + ultimo + '}';

        String msj = "";
        NodoHistorial aux = frente;

        while (aux != null) {
            msj += aux; //agrega
            aux = aux.getAtras(); //avanza
        }

        return msj;

    }

}
