/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author josef
 */
public class Terreno {

    private double costo;
    private double ancho;
    private double largo;
    private double area;
    private double costoMetroCuadrado;

    // Este método no recibe ningun parametro porque va a trabajar con valores
    // que ya estan guardados en otras variables dadas como lo son el 
    // area y el costoMetroCuadrado
    public void establecerCosto() {
        costo = area * costoMetroCuadrado;
    }

    public void establecerAncho(double c) {
        ancho = c;
    }

    public void establecerLargo(double c) {
        largo = c;
    }

    // El método establecerArea no recibe ningun parametro ya que para
    // obtener su valor trabaja con variables que ya tienen un valor, estas
    // son: largo y ancho
    public void establecerArea() {
        area = largo * ancho;
    }

    public void establecerCostoMetroCuadrado(double c) {
        costoMetroCuadrado = c;
    }

    public double obtenerCosto() {
        return costo;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerCostoMetroCuadrado() {
        return costoMetroCuadrado;
    }

}
