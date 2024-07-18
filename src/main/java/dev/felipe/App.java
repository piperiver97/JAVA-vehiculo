package dev.felipe;

import dev.felipe.Automovil.tipoA;
import dev.felipe.Automovil.tipoColor;
import dev.felipe.Automovil.tipoCom;

public final class App {
    private App() {
    }
    public static void main(String args[]) { 
        Automovil auto1 = new Automovil("Ford", 2018, 3, tipoCom.Diesel, tipoA.Ejecutivo, 5, 6, 250, tipoColor.Negro, true); 
        auto1.imprimir(); 
        auto1.setVelocidadActual(100); 
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual()); 
        auto1.acelerar(20); 
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual()); 
        auto1.desacelerar(50); 
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual()); 
        auto1.frenar(); 
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual()); 
        auto1.desacelerar(20);

        
        auto1.acelerar(200);
        auto1.acelerar(60);


        if (auto1.tieneMultas()) {
            System.out.println("El vehículo tiene multas.");
            System.out.println("Total de multas: " + auto1.calcularTotalMultas() + " unidades monetarias.");
        } else {
            System.out.println("El vehículo no tiene multas.");
        }
    }
}
