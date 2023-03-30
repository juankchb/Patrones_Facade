public class SeccionDeportes extends Seccion{ 
    public SeccionDeportes(String name) {
        super(name);
    }
    
    
    public void addArticle(articulo article) {
        if (super.getNombre().compareToIgnoreCase(article.getSeccion())==0) {
            super.addArticle(article);
        }else{
            System.out.println("No se agrego el articulo,ya que no es de la sección deportes");
        }
    }
}