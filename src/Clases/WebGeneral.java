public class WebGeneral extends Decorator {
	public WebGeneral(Pagina pagina) {
		super(pagina);
	}
	
	public String htmlShow() {
		return "this.displaysuper()";
	}
}
