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
public class EquivalenteHora {

    private int horas;
    private int minutos;
    private int segundos;
    private double dias;

    public void establecerHora(int h) {
        horas = h;
    }

    // No recibe ningun balor ya que para establecer su valor depende de 
    // la variable hora multiplicada por 60, proceso que se se realiza
    // internamente
    public void establecerMinuto() {
        minutos = horas * 60;
    }

    // No recibe ningun balor ya que para establecer su valor depende de 
    // la variable hora multiplicada por 3600, proceso que se se realiza
    // internamente
    public void establecerSegundo() {
        segundos = horas * 3600;
    }

    // No recibe ningun balor ya que para establecer su valor depende de 
    // la variable hora dividida para 24, proceso que se se realiza
    // internamente
    public void establecerDia() {
        dias = (double) horas / 24;
    }

    public int obtenerHora() {
        return horas;
    }

    public int obtenerMinuto() {
        return minutos;
    }

    public int obtenerSegundo() {
        return segundos;
    }

    public double obtenerDia() {
        return dias;
    }

}
