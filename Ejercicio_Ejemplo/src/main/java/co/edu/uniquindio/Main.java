package co.edu.uniquindio;

import java.util.Scanner;
public class mostrarPh{
    public static void main(String[] args){
        int valorph= ingresarNumero("ingrese ph de la sustancia");
        String mensajeUnido= unirMensaje(valorph);
        mostrarMensaje(mensajeUnido);
    }