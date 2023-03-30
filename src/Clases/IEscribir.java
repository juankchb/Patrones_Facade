import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IEscribir{
    public void escribir(){
        String filename = "archivo.txt";
        String texto = "Este es el texto que se va a agregar al archivo.";

        try {
            File file = new File(filename);
            FileWriter fileWriter = new FileWriter(file, true);
            // El segundo parámetro en el constructor FileWriter indica si se debe agregar texto al final del archivo (true) o sobrescribir el archivo (false).

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(texto);
            bufferedWriter.newLine(); // Agrega una nueva línea después del texto.

            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Se ha agregado texto al archivo " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}