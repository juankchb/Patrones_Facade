public class articulo {
	private String Seccion;
    private String title;
    private String content;
       
    public articulo(String title, String content,String seccion) {
        this.title = title;
        this.content = content;
        this.Seccion=seccion;
    }
       
    public String getTitle() {
       return title;
    }       
    public String getContent() {
        return content;
    }

    public String getSeccion() {
        return Seccion;
    }
}