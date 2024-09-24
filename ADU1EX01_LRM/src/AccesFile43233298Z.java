import java.io.File;
import java.io.FileNotFoundException;

public class AccesFile43233298Z {
    public static void AccesFile (String nombre ){
        try {
            File archivo = new File(nombre);
            archivo.setReadOnly();
        }catch (RuntimeException e) {
            System.out.println("No tienes permisos");
        }

    }
}
