
package clase1;

import modelo.*;

public class Clase1 {

    public static void main(String[] args) {
        Persona p;
        Alumno a=new Alumno();
        Profesor u=new Profesor();
        
        u.setNombre("maria"); // es de Persona        
        a.setNombre("jose"); // es de Persona
        a.setEdad(38); // es de Persona
        a.ingresar(); // es de Alumno
    }
    
}
