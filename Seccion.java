import java.util.ArrayList;
import java.util.List;

public class Seccion {
	private String nombre;
    private List<Articulo> articulos;
    
    public Seccion(String name) {
        this.nombre = name;
        this.articulos = new ArrayList<>();
    }
    
    public void addArticle(Article article) {
        articulos.add(article);
    }
}
