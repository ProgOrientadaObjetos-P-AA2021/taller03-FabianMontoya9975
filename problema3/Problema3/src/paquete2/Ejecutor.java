/*
    Se necesita representar una entidad que permite administrar 
    Instituciones Educativas. Cada institución tienen como características: 
    nombre, tipo de institución, número de alumnos, número de docentes, 
    número de sedes.
 */
package paquete2;

import paquete1.InstitucionEducativa;

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
        InstitucionEducativa inst1 = new InstitucionEducativa(); // Se crea el primer objeto
        InstitucionEducativa inst2 = new InstitucionEducativa(); // Se crea el segundo objeto

        // Valores de los atributos del primer objeto
        inst1.establecerNombre("La Dolorosa");
        inst1.establecerTipoInstitucion("Fiscomisional");
        inst1.establecerNumeroAlumno(4800);
        inst1.establecerNumeroDocente(62);
        inst1.establecerNumeroSede(1);

        // Valores de los atributos del segundo objeto
        inst2.establecerNombre("Mater Dei");
        inst2.establecerTipoInstitucion("Fiscomisional");
        inst2.establecerNumeroAlumno(1200);
        inst2.establecerNumeroDocente(41);
        inst2.establecerNumeroSede(1);

        System.out.printf("Resumen Institución:\nNombre: %s\nTipo: %s\n"
                + "Alumnos: %d\nDocentes: %d\nSedes: %d\n\n"
                + "Resumen Institución:\nNombre: %s\nTipo: %s\n"
                + "Alumnos: %d\nDocentes: %d\nSedes: %d\n",
                inst1.obtenerNombre(),
                inst1.obtenerTipoInstitucion(),
                inst1.obtenerNumeroAlumnos(),
                inst1.obtenerNumeroDocentes(),
                inst1.obtenerNumeroSede(),
                inst2.obtenerNombre(),
                inst2.obtenerTipoInstitucion(),
                inst2.obtenerNumeroAlumnos(),
                inst2.obtenerNumeroDocentes(),
                inst2.obtenerNumeroSede());
    }

}
