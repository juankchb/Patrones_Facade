import java.util.ArrayList;
import java.util.List;

public abstract class Seccion {
	private String nombre;
    private List<articulo> articulos;
    
    public Seccion(String name) {
        this.nombre = name;
        this.articulos = new ArrayList<>();
    }
    
    protected void addArticle(articulo article) {
        articulos.add(article);
    }

    public List<articulo> getArticles() {
        return articulos;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void addArticleSeccion(articulo article);
}
