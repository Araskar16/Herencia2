/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Scanner;

/**
 *
 * @author soporte
 */
public class Herencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona persona1 = new Persona("Julio", 20, "hombre", "Celaya");
        
        System.out.println (persona1.getNombre() );
        
        Alumno alumno1 = new Alumno(
        "Emilio", //Nombre
        22, //Edad
        "Hombre", //sexo        
        "Celaya", //Direccion
        "A001", //clave
        "A", //grupo
        1, //semestre
        "Sistemas" //carrera        
                
                
        );
        
      
     System.out.println (alumno1.getCarrera() );
     
     Scanner entrada = new Scanner(System.in);
     String nombre;
     int edad;
     String sexo;
     String direccion;
     String clave;
     String grupo;  
     int semestre;
     String carrera;
     
     
     System.out.println("Ingresa el nombre del alumno: ");
     nombre = entrada.next();
     System.out.println("Ingresa la edad del alumno: ");
     edad = entrada.nextInt();
     System.out.println("Ingresa el sexo del alumno: ");
     sexo = entrada.next();
     System.out.println("Ingresa la direccion del alumno: ");
     direccion = entrada.next();
     System.out.println("Ingresa la clave del alumno: ");
     clave = entrada.next();
     System.out.println("Ingresa el grupo del alumno: ");
     grupo = entrada.next();
     System.out.println("Ingresa el semestre del alumno: ");
     semestre = entrada.nextInt();
     System.out.println("Ingresa la carrera del alumno: ");
     carrera = entrada.next();
     
     
     Alumno alumno_nuevo = new Alumno (
     nombre,
     edad,
     sexo,
     direccion,
     clave,
     grupo,
     semestre,
     carrera        
     );
     
     
     
     
     
    }
    
    
}
