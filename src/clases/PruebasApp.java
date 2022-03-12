package clases;

import java.util.Scanner;

/**
 *
 * @author Vidal <vidalfm94@gmail.com>
 */
public class PruebasApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nif;
        
        Persona p1 = new Persona ("Vidal", "de la Fuente", "05718650", "Calle Falsa");
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println(p1.getDni());
        
        nif = p1.obtenerNif(p1.getDni());
        
        System.out.println(nif);
        
        p1.setEstatura(1.80f);
        
        System.out.println(p1.estaturaCentimetros(p1.getEstatura()));
        
        //L�nea de c�digo nueva que me dar� el apellido de la persona
        
        System.out.println(p1.getApellidos());
        
        //L�nea de codigo nueva que me dar� la direcci�n de la persona
        
        System.out.println(p1.getDireccion());
    }
    
}
