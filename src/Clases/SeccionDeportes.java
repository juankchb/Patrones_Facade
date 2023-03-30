public class SeccionDeportes extends Seccion{ 
    public SeccionDeportes(String name) {
        super(name);
    }
    
    public void addArticle(articulo article, String str) {
        if (str.equals("Deportes")) {
            super.addArticle(article);
        }else{
            System.out.println("No se agrego el articulo,ya que no es de la sección deportes");
        }
    }
}