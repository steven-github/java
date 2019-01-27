/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.classes.historial;

import examples.classes.historial.*;

/**
 *
 * @author stevensanchezm
 */
public class Historial {

    private String historial;

    public Historial(String historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "" + historial;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

}
