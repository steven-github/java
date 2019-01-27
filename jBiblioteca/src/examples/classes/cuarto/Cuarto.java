/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.classes.cuarto;

import examples.classes.consola.ColaConsola;
import examples.classes.consola.Consola;

import examples.classes.comida.PilaComida;
import examples.classes.comida.Comida;

import examples.classes.historial.ColaHistorial;
import examples.classes.historial.Historial;

/**
 *
 * @author stevensanchezm
 */
public class Cuarto {

    private Integer cuarto, horas, total, cantidad_consolas;
    String cliente;

    ColaHistorial historial;

    ColaConsola consolas;
    PilaComida comidas;

    public Cuarto(Integer cuarto, Integer horas, Integer total, Integer cantidad_consolas, String cliente, ColaConsola consolas, PilaComida comidas, ColaHistorial historial) {
        this.cuarto = cuarto;
        this.horas = horas;
        this.total = total;
        this.cantidad_consolas = cantidad_consolas;
        this.cliente = cliente;
        this.consolas = consolas;
        this.comidas = comidas;
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "Cuarto{" + "cuarto=" + cuarto + ", horas=" + horas + ", total=" + total + ", cantidad_consolas=" + cantidad_consolas + ", cliente=" + cliente + ", historial=" + historial + ", consolas=" + consolas + ", comidas=" + comidas + '}';
    }

    public Integer getCuarto() {
        return cuarto;
    }

    public Integer getHoras() {
        return horas;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getCantidad_consolas() {
        return cantidad_consolas;
    }

    public String getCliente() {
        return cliente;
    }

    public ColaHistorial getHistorial() {
        return historial;
    }

    public ColaConsola getConsolas() {
        return consolas;
    }

    public PilaComida getComidas() {
        return comidas;
    }

    public void setCuarto(Integer cuarto) {
        this.cuarto = cuarto;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void setCantidad_consolas(Integer cantidad_consolas) {
        this.cantidad_consolas = cantidad_consolas;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setHistorial(ColaHistorial historial) {
        this.historial = historial;
    }

    public void setConsolas(ColaConsola consolas) {
        this.consolas = consolas;
    }

    public void setComidas(PilaComida comidas) {
        this.comidas = comidas;
    }

}
