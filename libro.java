import java.io.Serializable;

public class libro extends producto implements Serializable{
    private String Autor;
    private String Editorial;
    private int NumPaginas;
    
    public libro(String nom,String des , int sk, int co,String autor, String editorial, int paginas){
        super(nom,des,sk,co);
        this.Autor=autor;
        this.Editorial=editorial;
        this.NumPaginas=paginas;
    }
    
    public libro(String autor, String editorial, int paginas){
        this.Autor=autor;
        this.Editorial=editorial;
        this.NumPaginas=paginas;
    }
    
    @Override
    public void mostrarDetalles(){
        System.out.println("----------");
        System.out.println("PRODUCTO: LIBRO");
        System.out.println("----------");
        
        super.mostrarDetalles();
        System.out.println("Autor: "+ this.Autor);
        System.out.println("Editorial: "+ this.Editorial);
        System.out.println("Numero de Paginas: "+ this.NumPaginas);
	}
    
}