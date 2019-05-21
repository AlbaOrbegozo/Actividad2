package ende;

/**
 * @Author - Alba Orbegozo Martínez
 * Programa que simula el juego de Piedra, Papel o tijera
 */


public class Juego 
{
    public static void main(String args[])
    {
        Jugador p1 = new Jugador();
        Jugador p2 = new Jugador();
        boolean finDeJuego = false;  
        int rondasJugadas = 0;    // Número de rondas jugadas
        int exitosJugador1 = p1.éxitos;
        int exitosJugador2 = p2.éxitos;
        int empates = 0;
        String opcionJugador1;
        String opcionJugador2;
        
        // Bucle de juego
        do {
            System.out.println("***** Ronda: " + rondasJugadas + " *********************\n");
            System.out.println("Numero de empates: "+ empates + "\n");
            opcionJugador1 = p1.opcionAlAzar();
            System.out.println("Jugador 1: " + opcionJugador1 + "\t Jugador 1 - Partidas ganadas: " + exitosJugador1);
            opcionJugador2 = p2.opcionAlAzar();
            System.out.println("Jugador 2: " + opcionJugador2 + "\t Jugador 2 - Partidas ganadas: " + exitosJugador2);
            
            if((opcionJugador1.equals("piedra")) && (opcionJugador2.equals("papel"))) {
                System.out.println("Jugador 2 GANA");
                exitosJugador2 = ++ p2.éxitos;       
            }
            else if((opcionJugador1.equals("papel")) && (opcionJugador2.equals("piedra"))) {
            	exitosJugador1 = ++ p1.éxitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJugador1.equals("piedra")) && (opcionJugador2.equals("tijeras"))) {
            	exitosJugador1 = ++ p1.éxitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJugador1.equals("tijeras")) && (opcionJugador2.equals("piedra"))) {
            	exitosJugador2 = ++ p2.éxitos;
                System.out.println("Jugador 2 GANA");
            }
            else if((opcionJugador1.equals("tijeras")) && (opcionJugador2.equals("papel"))) {
            	exitosJugador1 = ++p1.éxitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJugador1.equals("papel")) && (opcionJugador2.equals("tijeras"))) {
            	exitosJugador2 = ++ p2.éxitos;
                System.out.println("Jugador 2 GANA");
            }
            if(opcionJugador1 == opcionJugador2) {
            	empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            rondasJugadas++;
            if((p1.éxitos>=3) || (p2.éxitos>=3)) {
            	finDeJuego = true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while (finDeJuego != true);
    }
}
/**
 * Clase jugador
 */
class Jugador{
   
    /**
     * Escoge piedra, papel o tijera al azar
     */
	
	int éxitos;      // número de partidas ganadas
    int winTotal;	// total partidas ganadas
	
    public void setÉxitos() {
        éxitos++;
    }
    
    public int getÉxitos() {
        return(éxitos);
    }
    
    public String opcionAlAzar()
    {
        String opcion = "";
        int c = (int) (Math.random()*3);
        switch(c) {
            case 0:
            	opcion = ("piedra");
                break;
            case 1:
            	opcion = ("papel");
                break;
            case 2:
            	opcion = ("tijeras");
        }
        return opcion;
    }  
    
}
