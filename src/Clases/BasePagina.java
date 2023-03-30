import java.util.List;
import java.util.ArrayList;

/*
 * 
 */
public class BasePagina implements Pagina {
    private String title;
    private List<Seccion> sections;
    ArrayList<String> html;
    
    public BasePagina(String title, List<Seccion> sections) {
        this.title = title;
        this.sections = sections;
    }
    
    /*
     * Método que genera el html y crea las secciones de cada tipo con sus respectivos articulos
     * @return retorna un string con el html ya creado
     */
    public String htmlShow() {
        html = new ArrayList<String>();
        html.add("<!DOCTYPE html>");
        html.add("\n<hmtl lang=en>");

        //Encabezado del html
        html.add("\n<head>");
        html.add("\n\t<title>"+title+"</title>");

        //Cierre de encabezado y inicio del body
        html.add("\n</head>\n<body>");
        

        //Se generan las secciones,donde cada sección tendra su header(Nombre) y sus articulos
        for (Seccion section : sections) {
            html.add("\n\t<header>\n\t\t<h1>"+section.getNombre()+"</h1>");//Nombre
            html.add("\n\t</header>");
            html.add("\n\t<section>");
            
            //Se generan los articulos
            for (articulo article : section.getArticles()) {
                html.add("\n\t\t<article>");
                html.add("\n\t\t\t<h2>"+article.getTitle()+"</h2>");//Titulo del articulo
                html.add("\n\t\t\t<p>"+article.getContent()+"</p>"); //Contenido del articulo
                //html.add("\n\t\t\t<p>By:"+article.getAuthor()+"</p>");
                html.add("\n\t\t</article>");//Cierre del articulo
            }
            
            html.add("\n\t</section>");//Se cierra la seccion
        }
        
        html.add("\n</body>\n</html>");//se cierra el boy y el html
        
        
        return ArraylistTOString(html).toString();
    }

    /*
     * Método que pasa de Arraylist a string
     * @return retorna el string
     */
    public String ArraylistTOString(ArrayList<String> lista){
        String htmlF="";
        for (String s : lista) {
        	htmlF+=s;
		}
        return htmlF;
    }

}