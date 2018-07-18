
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class cd extends producto implements Serializable{
	public String autor;
	public String interprete;
	public int numeroCanciones;
	public String genero;
	private ArrayList<String> canciones = new ArrayList<String>();

	public cd(String a, String c, int nc , String g){
		this.autor = a;
		this.interprete = c;
		this.numeroCanciones = nc;
		this.genero = g;
	}
	public cd (String nom , String des ,int sk, int costo, String a, String c, int nc , String g){
		super(nom,des,sk,costo);
		this.autor = a;
		this.interprete = c;
		this.numeroCanciones = nc;
		this.genero = g;
	}
	
	@Override
	public void mostrarDetalles(){
		System.out.println("----------");
		System.out.println("PRODUCTO: CD");
		System.out.println("----------");

		super.mostrarDetalles();
		System.out.println("");
		System.out.println("Autor: "+ this.autor);
		System.out.println("interprete: "+ this.interprete);
		System.out.println("Numero de Canciones: "+ this.numeroCanciones);
		System.out.println("Genero: "+ this.genero);
	}

	@Override
	public String obtenerInfoString(){
		return super.obtenerInfoString() + this.autor + "\n" + this.interprete + "\n" + this.numeroCanciones + "\n" + this.genero + "\n";
	}
}
