/**
* @author Gerardo Torres y Erick Larios
* @version 1.0
* @since 6-jul-18
*/
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class catalogo_uso{
	public static void main(String[] args){
		catalogo_handler h = new catalogo_handler("Catalogo1.txt");
		cd micd1 = new cd("Cloud Nine","Album Recien salido",1110145,180,"Kygo","Kygo",18,"Dance");
		h.añadirProducto(micd1);
		h.añadirProducto(micd1);
		h.añadirProducto(micd1);
		try{
			h.guardarCatalogoActual();
		}catch(IOException e){

		}
		try{
			h.cargarCatalogo();
		}catch( ClassNotFoundException e){

		}
		for (producto p  : h.productos) {
			catalogo_handler.mostrarDetallesDe(p);
		}
	}
}
