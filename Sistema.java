package obligatoriop2;
import java.util.*;

public class Sistema {
    private ArrayList<Jugador> listaJugadores= new ArrayList<>();
    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }
    public boolean nombreValido(String unNombre){
        boolean valido=true;
        for(int i=0;i<listaJugadores.size() && valido;i++){
            if(listaJugadores.get(i).getNombre().equals(unNombre)){
                valido=false;
            }
        }
        return valido;
    }
    public boolean edadValida(int unaEdad){
        return unaEdad>=18 && unaEdad<=100;
    }
    public void agregarJugador(Jugador unJugador){
        listaJugadores.add(unJugador);
    }
    public void ordenarListaAfabeticamente(){
        Collections.sort(listaJugadores);
    }
    private class OrdenarPorVictorias implements Comparator<Jugador>{
        @Override
        public int compare(Jugador j1, Jugador j2){
            return j1.getVictorias()-j2.getVictorias();
        }
    }
    public void ordenarListaPorVictorias(){
        Collections.sort(listaJugadores, new OrdenarPorVictorias());
    }
    
}
