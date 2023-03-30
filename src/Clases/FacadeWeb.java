import java.util.ArrayList;
import java.util.List;

public class FacadeWeb {

	private Pagina pagina;

	public FacadeWeb() {
		List<Seccion> seccions = new ArrayList<>();

		seccions.add(new SeccionDeportes("Deportes"));
		seccions.add(new SeccionMusica("Musica"));
    }

	public String htmlShow() {
		return pagina.htmlShow();
	}
 }
