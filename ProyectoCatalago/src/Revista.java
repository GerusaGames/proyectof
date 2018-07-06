/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SGW08
 */
public class Revista extends producto {
    private String Editorial;
    private String FechaPublicacion;
    private int NumPaginas;
    
    public Revista(String nom,String des , int sk, int co,String editorial, String FechaPublicacion, int paginas){
        super(nom,des,sk,co);
        this.Editorial=editorial;
        this.FechaPublicacion=FechaPublicacion;
        this.NumPaginas=paginas;
    }
    
    public Revista(String editorial, String FechaPublicacion, int paginas){
        this.Editorial=editorial;
        this.FechaPublicacion=FechaPublicacion;
        this.NumPaginas=paginas;
    }   
    
}
