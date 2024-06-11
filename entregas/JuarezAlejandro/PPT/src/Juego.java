package src;

public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;
    private int empates;

    private int[][] resultados = {
            { 0, 2, 1, 1, 2 }, // Piedra
            { 1, 0, 2, 2, 1 }, // Papel
            { 2, 1, 0, 1, 2 }, // Tijera
            { 2, 1, 2, 0, 1 }, // Lagarto
            { 1, 2, 1, 2, 0 } // Spock
    };

    public Juego(String nombreJugador1, String nombreJugador2) {
        jugador1 = new Jugador(nombreJugador1);
        jugador2 = new Jugador(nombreJugador2);
    }

    public void jugar() {
        jugador1.elegirOpcion();
        jugador2.elegirOpcion();
    }

    public void determinarGanador() {
        int opcion1 = jugador1.getOpcion() - 1;
        int opcion2 = jugador2.getOpcion() - 1;
        int resultado = resultados[opcion1][opcion2];

        if (resultado == 0) {
            System.out.println("Empate!");
            empates++;
        } else if (resultado == 1) {
            System.out.println(jugador1.getNombre() + " gana!");
            jugador1.incrementarVictorias();
        } else {
            System.out.println(jugador2.getNombre() + " gana!");
            jugador2.incrementarVictorias();
        }
    }

    public void mostrarResultado() {
        String[] opciones = { "Piedra", "Papel", "Tijera", "Lagarto", "Spock" };
        System.out.println("[" + jugador1.getNombre() + "] saca [" + opciones[jugador1.getOpcion() - 1] + "] / ["
                + jugador2.getNombre() + "] saca [" + opciones[jugador2.getOpcion() - 1] + "]");
        System.out.println("Resultados: ");
        System.out.println(jugador1.getNombre() + ": " + jugador1.getVictorias() + " victorias");
        System.out.println(jugador2.getNombre() + ": " + jugador2.getVictorias() + " victorias");
        System.out.println("Empates:" + empates);
        System.out.println("-".repeat(50));
    }

}
