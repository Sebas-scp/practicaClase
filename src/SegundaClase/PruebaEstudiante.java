/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundaClase;

/**
 *
 * @author usuario
 */
public class PruebaEstudiante
{
    public static void main (String[] args)
    {
        Estudiante cuenta1 = new Estudiante ("Jane Green", 93.5);
        Estudiante cuenta2= new Estudiante ("John Blue", 72.75);
        
        System.out.printf("La calificacion en letra de %s es:  %s%n",
                cuenta1.obtenerNombre(), cuenta1.obtenerCalificacionEstudiante());
        System.out.printf("La calificacion en letra de %s es:  %s%n",
                cuenta2.obtenerNombre(), cuenta2.obtenerCalificacionEstudiante());
    }
}
