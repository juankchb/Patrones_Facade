package Contenidos;

import java.util.List;
import java.util.ArrayList;

public class BasicWebpagina implements webpagina {
    private String title;
    private List<Section> sections;
    
    public BasicWebpagina(String title, List<Section> sections) {
        this.title = title;
        this.sections = sections;
    }
    
    public String display() {
        ArrayList<String> html = new ArrayList<String>();
        html.add("<!DOCTYPE html>");
        html.add("\n<hmtl lang=en>");
        html.add("\n<head>");
        html.add("\n\t<title>"+title+"</title>");
        html.add("\n</head>\n<body>");
        
        for (Section section : sections) {
            html.add("\n\t<header>\n\t\t<h1>Juan el despechado"+section.getName()+"</h1>");
            html.add("\n\t</header>");
            html.add("\n\t<section>");
            
            for (Article article : section.getArticles()) {
                html.add("\n\t\t<article>");
                html.add("\n\t\t\t<h2>"+article.getTitle()+"</h2>");
                html.add("\n\t\t\t<p>"+article.getContent()+"</p>");
                html.add("\n\t\t\t<p>By:"+article.getAuthor()+"</p>");
                html.add("\n\t\t</article>");
            }
            
            html.add("\n\t</section>");
        }
        
        html.add("\n</body>\n</html>");

        String htmlF="";
        
        for (String s : html) {
        	htmlF+=s;
		}
        
        return htmlF.toString();
    }

}