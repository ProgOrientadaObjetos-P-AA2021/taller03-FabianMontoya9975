/*
    Para un sistema, es necesario abstraer las características de 
    dispositivos electrónicos como los son los Equipo Celulares. 
    Cada Equipo Celular tienen como características: sistema operativo,
    tamaño de pantalla, costo, dirección mac, información IMEI.
 */
package paquete2;

import paquete1.DispositivoCelular;

/**
 *
 * @author josef
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DispositivoCelular cellUno = new DispositivoCelular(); // Se crea el primer objeto
        DispositivoCelular cellDos = new DispositivoCelular(); // Se cra el segundo objeto

        // Valores de los atributos del primer objeto
        cellUno.establecerSistemaOperativo("Android");
        cellUno.establecerTamanoPantalla(11);
        cellUno.establecerCosto(130.5);
        cellUno.establecerDireccionMac("G2:J8:S6.E0:W1");
        cellUno.establecerInformacionImei("1864d5684h123");

        // Valores de los atributos del segundo objeto
        cellDos.establecerSistemaOperativo("IOS");
        cellDos.establecerTamanoPantalla(15);
        cellDos.establecerCosto(500.3);
        cellDos.establecerDireccionMac("F5:H8:W2.J3:Y7");
        cellDos.establecerInformacionImei("8654G7351L915");

        System.out.printf("Caracteristicas del dispositivo:\n"
                + "-Sistema operativo: %s\n"
                + "-Tamaño de la pantalla: %d''\n"
                + "-Costo: $%.2f\n"
                + "-Dirección MAC: %s\n"
                + "-Información IMEI: %s\n\n"
                + "Caracteristicas del dispositivo:\n"
                + "-Sistema operativo: %s\n"
                + "-Tamaño de la pantalla: %d''\n"
                + "-Costo: $%.2f\n"
                + "-Dirección MAC: %s\n"
                + "-Información IMEI: %s\n",
                cellUno.obtenerSistemaOperativo(),
                cellUno.obtenerTamanoPantalla(),
                cellUno.obtenerCosto(),
                cellUno.obtenerDireccionMac(),
                cellUno.obtenerInformacionImei(),
                cellDos.obtenerSistemaOperativo(),
                cellDos.obtenerTamanoPantalla(),
                cellDos.obtenerCosto(),
                cellDos.obtenerDireccionMac(),
                cellDos.obtenerInformacionImei());

    }

}
