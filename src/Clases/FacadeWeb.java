import java.util.ArrayList;
import java.util.List;

public class FacadeWeb {

	private Pagina pagina;

	public FacadeWeb() {
		List<Seccion> seccions = new ArrayList<>();

		seccions.add(new Deportes("Deportes"));
		// Cambios
		seccions.add(new Musica("Musica"));
    }
 }
