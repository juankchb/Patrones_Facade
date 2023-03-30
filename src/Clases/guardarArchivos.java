import java.io.*;

public class guardarArchivos {
    FileWriter fichero = null;
    PrintWriter pw = null;  
    String archivo;

    public void setArchivo(String str){
        this.archivo= str;
    }

    public void escribirArchivo(String ruta){
        try {
            fichero = new FileWriter(ruta);
            pw = new PrintWriter(fichero);

            //Se escribe el archivo
            pw.println(archivo);
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
