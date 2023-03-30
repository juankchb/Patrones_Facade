public class SeccionMusica extends Seccion {
	public SeccionMusica (String name) {
	    super(name);
	}
	    
	public void addSeccionMusica(articulo article,String str) {
	    if (str.equals("Deportes")) {
            super.addArticle(article);
        }else{
            System.out.println("No se agrego el articulo,ya que no es de la sección Musica");
        }
		
	}
}