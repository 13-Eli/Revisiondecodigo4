package com.generation;
import java.util.Scanner;// se agrego el paquete de Scanner

public class Codigo4 {
   public static void main(String[] args) {//Se agregó el método main 
    
    Scanner s = new Scanner("System.in");//se coloco System.in
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    // Se elimino la entrada de Scanner                                
    String j2 = s.nextLine();
    
    if (j1 == (j2)) {// se colo parentesis en js
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
            g = 1;
          
             break;//se coloca break
        case "tijeras":
           if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
  
  
}   