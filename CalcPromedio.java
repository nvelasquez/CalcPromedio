package calcpromedio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class CalcPromedio{

  static int conteo = 0;
  static int nota = 0;
  static String seguir = "S";
  static Console con = System.console();
  
  
  public static void main (String[] args){
    
    System.out.println("CALCULAR PROMEDIO DE CALIFICACIONES");
    //con.readLine("enter value");
    
    while (seguir.equals("S")){
      
      System.out.println("Favor ingresar la calificacion obtenida");
      nota = nota+(Integer.parseInt(con.readLine()));
      
      System.out.println("Desea ingresar otra calificacion S:si/N:no");
      seguir = con.readLine();
      seguir = seguir.trim();
      seguir = seguir.toUpperCase();
      
      conteo++;
    }//end loop
    
    System.out.println("El promedio de sus calificaciones es "+(nota/conteo));
    con.readLine();

  }
}//(seguir.toUpperCase() == "S")