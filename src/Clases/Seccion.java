import java.util.ArrayList;
import java.util.List;

public class Seccion {
	private String nombre;
    private List<articulo> articulos;
    
    public Seccion(String name) {
        this.nombre = name;
        this.articulos = new ArrayList<>();
    }
    
    public void addArticle(articulo article) {
        articulos.add(article);
    }

    public List<articulo> getArticles() {
        return articulos;
    }

    public String getNombre() {
        return nombre;
    }

    
}
