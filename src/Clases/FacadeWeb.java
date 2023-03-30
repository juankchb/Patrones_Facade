import java.util.ArrayList;

public class FacadeWeb {

	private Pagina pagina;

	/*
	 * Método que realiza la fachada de la pagina web
	 */
	public FacadeWeb() {
		ArrayList<Seccion> seccions = new ArrayList<>();

		Seccion seccion = new SeccionDeportes("Deportes");
		seccion.addArticleSeccion(new articulo("Argentina Campeon del mundo","La seleción Argentina gano en penales ante francia en la final del mundo","Deportes"));
		seccion.addArticleSeccion(new articulo("Manuel turizo saca album nuevo","El nuevo album del cantante ha sido un completo fracaso","Musica"));
		seccion.addArticleSeccion(new articulo("Alemania decepciona en el mundial","Alemania vuelve a perder en fase de grupos","Deportes"));
		seccions.add(seccion);

		seccion = new SeccionMusica("Musica");
		seccion.addArticleSeccion(new articulo("Estereo Picnic","Este fin de semana se presentaron multiples artistas al estereo picnic","Musica"));
		seccion.addArticleSeccion(new articulo("Shakira vuelve a Colombia","Este fin de semana se presentara Shakira en el Estadio el Campin,tras 90 años de su ultimo concierto","Musica"));
		seccions.add(seccion);

		this.pagina = new BasePagina("Fake news", seccions);
		guardarHtml(new BasePagina("Fake news", seccions));
    }

	/*
	 * Metodo que guarda el html en la carpeta html
	 */
	public void guardarHtml(BasePagina pag){
		guardarArchivos gA= new guardarArchivos();
		gA.setArchivo(pag.htmlShow());
		gA.escribirArchivo("./src/Html/html.html");
	}

	/* 
	 * Método que retorna el html creada de la pagina usada
	*/
	public String htmlShow() {
		return pagina.htmlShow();
	}
 }
