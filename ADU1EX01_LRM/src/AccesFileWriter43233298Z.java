import java.io.FileWriter;
import java.io.IOException;

public class AccesFileWriter43233298Z {
    public static void acceder(String archivo, String texto) {
        try {
            FileWriter escritor = new FileWriter(archivo);
            escritor.write(texto);
            escritor.close();
        } catch (IOException Manolo27) {
            System.out.println("No TIENES PERMISO PARA escribir");;
        }
    }
}
