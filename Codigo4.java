package com.generation;
import java.util.Scanner; //Importar librerías

public class Codigo4 {
	
	public static void main(String[] args) {
		//Meter el código en un main para poder ejecutarlo en terminal   
		Scanner s = new Scanner(System.in); //Instanciar el objeto correctamente
    
		System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();
    
		System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		//Validar el nombre de las variables para conseguir la lógica correcta, así como el del contexto del usuario
		String j2 = s.nextLine();
    
	    if (j1 == j2) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2 == "tijeras") {
	            g = 1;
	          }
	
	        case "papel":
	          if (j2 == "piedra") {
	            g = 1;}
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	  s.close();//Buena práctica, cerrar el scanner 
	  
	    }

}//Verificar la apertura y cierre de las llaves, así como de los paréntesis
