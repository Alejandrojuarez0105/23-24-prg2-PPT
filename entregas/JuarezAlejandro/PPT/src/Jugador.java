package src;

import java.util.Scanner;

public class Jugador {

    private String nombre;
    private int opcion;
    private int victorias;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void elegirOpcion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(nombre + " elige (1: Piedra, 2: Papel, 3: Tijera, 4:Lagarto, 5:Spock): ");
        int opcionElegida = scanner.nextInt();

        if (opcionElegida >= 1 && opcionElegida <= 5) {
            opcion = opcionElegida;
        } else {
            System.out.println("Opción incorrecta");
            elegirOpcion();
        }
    }

    public int getOpcion() {
        return opcion;
    }

    public void incrementarVictorias() {
        victorias++;
    }

    public int getVictorias() {
        return victorias;
    }
}
