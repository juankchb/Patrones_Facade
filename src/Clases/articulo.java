public class articulo {
	 
    private String title;
    private String content;
       
    public articulo(String title, String content) {
       this.title = title;
        this.content = content;
    }
       
    public String getTitle() {
       return title;
    }       
    public String getContent() {
        return content;
    }
}