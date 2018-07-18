import java.util.*;
class dvd extends producto{
	private String director;
	private String productor;
	private String distribuidora;
	private int duracion;
	private String genero;
	private ArrayList<String> actores = new ArrayList<String>();
	
	public dvd(){}
	public dvd(String nom , String des ,int sk, int co, String dir, String prod, String dist , int d, String g){
		super(nom ,des ,sk, co);
		this.director = dir;
		this.productor = prod;
		this.distribuidora = dist;
		this.duracion = d;
		this.genero = g;
	}
	@Override
	public void mostrarDetalles(){
		System.out.println("----------");
		System.out.println("PRODUCTO: DVD");
		System.out.println("----------");

		super.mostrarDetalles();
		System.out.println("");
		System.out.println("Director: "+ this.director);
		System.out.println("Productor: "+ this.productor);
		System.out.println("Distribuidora: "+ this.distribuidora);
		System.out.println("Duracion: "+ this.duracion);
		System.out.println("Genero: "+ this.genero);
	}
	@Override
	public String obtenerInfoString(){
		return super.obtenerInfoString() + this.director + "\n" + this.productor + "\n" + this.distribuidora + "\n" + this.duracion + "\n" + this.genero + "\n";
	}
}
