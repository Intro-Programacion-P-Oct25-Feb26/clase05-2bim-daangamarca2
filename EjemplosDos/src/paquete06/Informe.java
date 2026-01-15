/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author A S U S A16
 */
public class Informe {

    public static void imprimir(String a, String b, String c, String d, String e, double[] f, double g) {
        String cadena = "";
        cadena = cadena + String.format("\nLOS DATOS INGRESADOS SON :\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Nombre de la Empresa: %s\n"
                + "Direccion de la empresa: %s\n"
                + "Notas:",
                a,
                b,
                c,
                d,
                e);
        for (int i = 0; i < f.length; i++) {
            cadena = cadena + String.format(" %.2f ", f[i]);
        }
        cadena = cadena + String.format("\nPromedio: %.2f\n", g);
        System.out.printf(cadena);
    }
}
