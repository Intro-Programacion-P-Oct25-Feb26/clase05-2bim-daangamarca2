/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;
import paquete02.DatoTrabajo;
import paquete06.Informe;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String nombreEmpresa;
        String direccionEmpresa;

        double[] misNotas;
        double promedio;

        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        nombreEmpresa = DatoTrabajo.obtenerNombreEmpresa();
        direccionEmpresa = DatoTrabajo.obtenerDireccionEmpresa();
        Informe.imprimir(nombre, apellidoRetornado, ciudad, nombreEmpresa,
                direccionEmpresa, misNotas, promedio);

    }

}
/*
Solicitar al usuario los datos de nombre, apellido, ciudad, notas, y calcular
el promedio de las notas, todo esto se debe hacer en tres funciones; en la
funcion 1 y 2 pedimos y retornamos el nombre y el apellido del usuario, en la 
funcion 3 pedimosy retornamos la ciudad del usuario, en la funcion 3 pedir 
las notas del estudiante 4 y 5 pedimos las notas y calculamos el promedio, y
finalmente en el metodo principal presentar un reporte de todos los datos 
presentados.
INVOCAR CADA UNA DE LAS FUNCIONES DESDE EL METODO PRINCIPAL
 */
