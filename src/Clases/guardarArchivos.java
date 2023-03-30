import java.io.*;
import java.util.ArrayList;

public class guardarArchivos {
    FileWriter fichero = null;
    PrintWriter pw = null;  
    ArrayList<String> archivo = new ArrayList<String>();

    public void setArchivo(ArrayList<String> lista){
        archivo.addAll(lista);
    }

    public void escribirArchivo(String ruta){
        try {
            fichero = new FileWriter(ruta);
            pw = new PrintWriter(fichero);
            for (String string : archivo) {
                pw.println(string);
            }        
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
            // Nuevamente aprovechamos el finally para 
            // asegurarnos que se cierra el fichero.
            if (null != fichero)
               fichero.close();
            } catch (Exception e2) {
               e2.printStackTrace();
            }
         }
    }
}
