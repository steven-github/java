/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.classes.libro;

import examples.classes.cuarto.*;
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
public class Libro {

    private String nombre, autor, categoria, editorial, idioma, descripcion, fecha_lazamiento, fecha_ingreso;
    private int paginas, id;

    public Libro(int id, String nombre, String autor, String categoria, String editorial, String idioma, String descripcion, String fecha_lazamiento, String fecha_ingreso, int paginas) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.categoria = categoria;
        this.editorial = editorial;
        this.idioma = idioma;
        this.descripcion = descripcion;
        this.fecha_lazamiento = fecha_lazamiento;
        this.fecha_ingreso = fecha_ingreso;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        //return "Libro{" + "nombre=" + nombre + ", autor=" + autor + ", categoria=" + categoria + ", editorial=" + editorial + ", idioma=" + idioma + ", descripcion=" + descripcion + ", fecha_lazamiento=" + fecha_lazamiento + ", fecha_ingreso=" + fecha_ingreso + ", paginas=" + paginas + ", id=" + id + '}';
        return "[" + id + "," + nombre + "," + autor + "," + categoria + "," + editorial + "," + idioma + "," + descripcion + "," + fecha_lazamiento + "," + fecha_ingreso + "," + paginas + ']';
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha_lazamiento() {
        return fecha_lazamiento;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha_lazamiento(String fecha_lazamiento) {
        this.fecha_lazamiento = fecha_lazamiento;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

}
