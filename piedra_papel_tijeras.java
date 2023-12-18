// Programa para jugar piedra papel o tijeras entre dos usuarios
// 

package org.generation;
import java.util.Scanner; // Se importa esta librería para poder usar Scanner y leer los datos de entrada

public class CodigoCuatro { // Cambié el nombre a Main
	
	public static void main(String[] args) { // Se agrega esto si no no corre el programa
	    
		Scanner sc = new Scanner(System.in); // Se cambió el nombre de la variable de s a sc
		
	    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = sc.nextLine();
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // Se deja 2 en vez de 1
	    String j2 = sc.nextLine();
	
	    if (j1.equals(j2)) { // Se modificó esta parte
	        System.out.println("Empate");
	    } else {
	        int g = 2;
	        switch(j1) {
	            case "piedra":
	                if (j2.equals("tijeras")) { // Se modificó esta parte
	                    g = 1;
	                    System.out.println("Gana el jugador "+ g);
	                } else {
	                    g = 2;
	                    System.out.println("Gana el jugador  " + g);
	                }
	                break; // Se agrega porque es parte del break
	            case "papel":
	                if (j2.equals("piedra")) { // Se modificó esta parte
	                    g = 1;
	                    System.out.println("Gana el jugador "+ g);
	                }
	                break; // Se agrega porque es parte del break
	            case "tijeras": // Se alinea con los de arriba
	            	if (j2.equals("papel")) {
	            		g = 1;
	            		System.out.println("Gana el jugador "+ g);
	            	}
	            	break;
	            default:
	                g = 2;
	                System.out.println("Gana el jugador  " + g);
	        } // Final switch
	    } // Final else
	    sc.close(); // Se agrega
	} // Final main
} // Se agrega esta llave de cierre
