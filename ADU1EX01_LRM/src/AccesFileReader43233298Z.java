import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class AccesFileReader43233298Z {
    static String texto = "";
    public static String leer(String archivo){
        try {
            Reader lector = new FileReader(archivo);
            int c = 0;
            while (c != -1){
                c = lector.read();
                char letra = (char)c;
                texto+=letra;
            }
            lector.close();
            System.out.println(texto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return texto;
    }
}
