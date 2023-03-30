public class SeccionMusica extends Seccion {
	public SeccionMusica (String name) {
	    super(name);
	}
	   
	/*
	 * Método que agrega un articulo si este pertenece a la sección de Musica
	 */
	@Override
	public void addArticleSeccion(articulo article) {
	    if (super.getNombre().compareToIgnoreCase(article.getSeccion())==0) {
            super.addArticle(article);
        }else{
            System.out.println("No se agrego el articulo,ya que no es de la sección Musica");
        }
		
	}
}