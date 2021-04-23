/*
    Elaborar una solución que lea una cantidad de horas e imprima
    su equivalente en minutos, segundos, días.
 */
package paquete2;

import paquete1.EquivalenteHora;

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
        EquivalenteHora converUno = new EquivalenteHora(); // Se crea el primer objeto
        EquivalenteHora converDos = new EquivalenteHora(); // Se crea el segundo objeto

        // Valores de los atributos del primer objeto
        converUno.establecerHora(50);
        converUno.establecerMinuto();
        converUno.establecerSegundo();
        converUno.establecerDia();

        // Valores de los atributos del segundo objeto
        converDos.establecerHora(189);
        converDos.establecerMinuto();
        converDos.establecerSegundo();
        converDos.establecerDia();

        System.out.printf("%d horas es equivalente a:\n%d minutos\n"
                + "%d segundos\n%.2f horas\n\n"
                + "%d horas es equivalente a:\n%d minutos\n%d segundos\n"
                + "%.2f horas\n",
                converUno.obtenerHora(),
                converUno.obtenerMinuto(),
                converUno.obtenerSegundo(),
                converUno.obtenerDia(),
                converDos.obtenerHora(),
                converDos.obtenerMinuto(),
                converDos.obtenerSegundo(),
                converDos.obtenerDia());
    }

}
