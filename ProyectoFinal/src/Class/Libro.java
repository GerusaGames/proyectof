/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SGW08
 */
public class Libro extends producto{
    private String Autor;
    private String Editorial;
    private int NumPaginas;
    
    public Libro(String nom,String des , int sk, int co,String autor, String editorial, int paginas){
        super(nom,des,sk,co);
        this.Autor=autor;
        this.Editorial=editorial;
        this.NumPaginas=paginas;
    }
    
    public Libro(String autor, String editorial, int paginas){
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
