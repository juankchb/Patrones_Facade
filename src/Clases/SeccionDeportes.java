public class SeccionDeportes extends Seccion{ 
    public Farandolas(String name) {
        super(name);
    }
    
    public void addArticle(Article article, String select) {
        if (select.equals("Deportes")) {
            super.addArticle(article);
        }
    }
}