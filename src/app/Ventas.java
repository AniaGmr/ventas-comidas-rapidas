package app;

import java.util.Scanner;

public class Ventas {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] productos = {"Hamburguesa", "Perro caliente", "Papas fritas"};
        String[] turnos = {"Almuerzo", "Tarde", "Noche", "Madrugada"};

        double[][] ventas = new double[3][4];

        registrarVentas(ventas, productos, turnos);
    }

    public static void registrarVentas(double[][] ventas, String[] productos, String[] turnos) {

        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < turnos.length; j++) {
                System.out.println("Ingrese el valor de la venta de " + productos[i] + " en el turno de " + turnos[j] + ": ");
                ventas[i][j] = validarDato();
            }
        }
    }

}

