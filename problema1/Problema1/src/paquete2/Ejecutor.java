/*
    Elaborar una solución que calcule e imprima el costo de un
    terreno cuadrado o rectangular; se tiene como datos el ancho
    y el largo en metros y el costo del metro cuadrado.
 */
package paquete2;

import paquete1.Terreno;

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
        Terreno terr1 = new Terreno(); // Se crea el primer objeto
        Terreno terr2 = new Terreno(); // Se crea el segundo objeto

        // Valores de los atributos del primer objeto
        terr1.establecerAncho(500.3);
        terr1.establecerLargo(400.9);
        terr1.establecerCostoMetroCuadrado(25);
        terr1.establecerArea();
        terr1.establecerCosto();

        // Valores de los atributos del segundo objeto
        terr2.establecerAncho(3650);
        terr2.establecerLargo(5003);
        terr2.establecerCostoMetroCuadrado(18.5);
        terr2.establecerArea();
        terr2.establecerCosto();
        System.out.printf("El terreno con dimensiones:\nLargo: %.2f metros\n"
                + "Ancho: %.2f metros\nTiene un área de: %.2f m2\n"
                + "El costo del m2 es de: $%.2f \nEl costo total del "
                + "terreno es: $%.2f\n\n"
                + "El terreno con dimensiones:\nLargo: %.2f metros\n"
                + "Ancho: %.2f metros\nTiene un área de: %.2f m2\n"
                + "El costo del m2 es de: $%.2f \nEl costo total del "
                + "terreno es: $%.2f\n",
                terr1.obtenerLargo(),
                terr1.obtenerAncho(),
                terr1.obtenerArea(),
                terr1.obtenerCostoMetroCuadrado(),
                terr1.obtenerCosto(),
                terr2.obtenerLargo(),
                terr2.obtenerAncho(),
                terr2.obtenerArea(),
                terr2.obtenerCostoMetroCuadrado(),
                terr2.obtenerCosto());
    }

}
