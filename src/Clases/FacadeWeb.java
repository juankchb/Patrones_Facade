import java.util.ArrayList;

public class FacadeWeb {

	private Pagina pagina;

	public FacadeWeb() {
		ArrayList<Seccion> seccions = new ArrayList<>();

		Seccion seccion = new SeccionDeportes("Deportes");
		seccion.addArticle(new articulo("Argentina Campeon del mundo","La seleción Argentina gano en penales ante francia en la final del mundo","Deportes"));

		seccions.add(seccion);

		seccion = new SeccionMusica("Musica");
		seccion.addArticle(new articulo("Estereo Picnic","Este fin de semana se presentaron multiples artistas al estereo picnic","Musica"));
		seccions.add(seccion);

		this.pagina = new BasePagina("Fake news", seccions);
    }

	public String htmlShow() {
		return pagina.htmlShow();
	}
 }
