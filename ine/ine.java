package ine;
//Autor: Alejandro Valenzuela
import java.util.Scanner;
public class ine {
    public void DeterminarSiIne(){
        Scanner teclado = new Scanner(System.in);
        //Definir variable de salida
        String resultado;
        //Definir variables de entrada
        int anioActual,anioNacimiento;
        //Definir variable auxiliar
        int anios;

        System.out.print("Proporciona año actual: ");
        anioActual = teclado.nextInt();
        System.out.print("Proporciona año de nacimiento: ");
        anioNacimiento = teclado.nextInt();

        anios = anioActual - anioNacimiento;

        if(anios>=18){
            resultado = "Usted puede tramitar su INE";
        }
        else{
            resultado = "Usted no puede tramitar su INE";
        }
        System.out.println(resultado);
    }
        
    }
