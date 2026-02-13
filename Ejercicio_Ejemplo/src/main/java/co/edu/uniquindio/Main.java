package co.edu.uniquindio;

import java.util.Scanner;
public class mostrarPh{
    public static void main(String[] args){
        int valorph= ingresarNumero("ingrese ph de la sustancia");
        String mensajeUnido= unirMensaje(valorph);
        mostrarMensaje(mensajeUnido);
    }
    public static int ingresarNumero (String mensaje){
        Scanner scanner= new Scanner(System.in);
        System.out.println(mensaje);
        int valor= scanner.nextInt();
        return valor;
    }
    public static String unirMensaje (int valor){
        String mensajeUnido= "el ph de la sustancia es:" + valor;
        return mensajeUnido;
    }
    public static void mostrarMensaje (String mensaje){
        System.out.println (mensaje);
    }

}