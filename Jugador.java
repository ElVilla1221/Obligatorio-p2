package obligatoriop2;

public class Jugador implements Comparable<Jugador> {
    private String nombre;
    private int edad;
    private int victorias;
    private int derrotas;
    public Jugador(){
        this.nombre="Sin nombre";
        this.edad=18;
    }
    public Jugador(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public int getVictorias() {
        return victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    @Override 
    public String toString(){
        return this.nombre +". Edad: "+this.edad;
    }

    @Override
    public int compareTo(Jugador unJugador){
        return this.nombre.compareToIgnoreCase(unJugador.getNombre());
    }
}
