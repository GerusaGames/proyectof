import java.io.Serializable;

public class revista extends producto implements Serializable {
    private String Editorial;
    private String FechaPublicacion;
    private int NumPaginas;
    
    public revista(String nom,String des , int sk, int co,String editorial, String FechaPublicacion, int paginas){
        super(nom,des,sk,co);
        this.Editorial=editorial;
        this.FechaPublicacion=FechaPublicacion;
        this.NumPaginas=paginas;
    }
    
    public revista(String editorial, String FechaPublicacion, int paginas){
        this.Editorial=editorial;
        this.FechaPublicacion=FechaPublicacion;
        this.NumPaginas=paginas;
    }
    
    @Override
    public void mostrarDetalles(){
        System.out.println("----------");
        System.out.println("PRODUCTO: REVISTA");
        System.out.println("----------");
        
        super.mostrarDetalles();
        System.out.println("Editorial: "+ this.Editorial);
        System.out.println("Fecha de Publicacion: "+ this.FechaPublicacion);
        System.out.println("Numero de Paginas: "+ this.NumPaginas);
	}
    
}