//Esta clase debe generar el .txt
public class Launcher{
    public static void main(String[] args) {
        FacadeWeb pag = new FacadeWeb();
        System.out.print(pag.htmlShow());
    }
}