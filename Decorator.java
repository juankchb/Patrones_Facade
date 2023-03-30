public abstract class Decorator implements Pagina {
	protected Pagina pagina;

	public Decorator(Pagina pagina) {
		this.pagina = pagina;
	}

	@Override
	public String display() {
		return pagina.display();
	}
}
