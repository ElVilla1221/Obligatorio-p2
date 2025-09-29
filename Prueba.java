package obligatoriop2;
import java.util.*;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Prueba {
    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
        } catch (Exception excepcion) {
            excepcion.printStackTrace();
        }
        System.out.println("●○");
    }
}
