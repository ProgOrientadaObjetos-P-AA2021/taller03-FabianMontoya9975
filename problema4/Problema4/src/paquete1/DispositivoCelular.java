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
public class DispositivoCelular {

    private String sistemaOperativo;
    private int tamanoPantalla;
    private double costo;
    private String direccionMac;
    private String informacionImei;

    public void establecerSistemaOperativo(String n) {
        sistemaOperativo = n;
    }

    public void establecerTamanoPantalla(int n) {
        tamanoPantalla = n;
    }

    public void establecerCosto(double n) {
        costo = n;
    }

    public void establecerDireccionMac(String n) {
        direccionMac = n;
    }

    public void establecerInformacionImei(String n) {
        informacionImei = n;
    }

    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }

    public int obtenerTamanoPantalla() {
        return tamanoPantalla;
    }

    public double obtenerCosto() {
        return costo;
    }

    public String obtenerDireccionMac() {
        return direccionMac;
    }

    public String obtenerInformacionImei() {
        return informacionImei;
    }

}
