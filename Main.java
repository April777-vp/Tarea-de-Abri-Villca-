import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        final double costoFijoDiario = 800.0;  
        final double costoVariablePorSombrero = 20.0;  
        final double costoMaximoPorSombrero = 25.0; 

        
        double cantidadMinimaDiaria = costoFijoDiario / (costoMaximoPorSombrero - costoVariablePorSombrero);
        
        int sombrerosDiarios = (int) Math.ceil(cantidadMinimaDiaria);

        
        int sombrerosMensuales = sombrerosDiarios * 30; 

        
        System.out.println("La cantidad mínima de sombreros que debe producir la fábrica mensualmente es: " + sombrerosMensuales);
    }
}