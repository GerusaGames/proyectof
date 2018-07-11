import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class catalogo_handler{

	//VARIABLES MAS IMPORTANTES
	private String nombreCatalogo;
	public ArrayList<producto> productos = new ArrayList<producto>();
	private Map<Integer, Integer> inventario = new HashMap<Integer, Integer>();

	//CONSTRUCTOR
	public catalogo_handler(String s){
		this.nombreCatalogo = s;
	}

	//METODOS DE PRODUCTOS
	public static void mostrarDetallesDe(producto p){
		p.mostrarDetalles();
	}
	public void añadirProducto(producto p){
		productos.add(p);
	}
	public void añadirNuevoCd(String nom , String des ,int sk, int co, String a, String c, int nc , String g , int cantidad){
		cd nuevoCD = new cd(nom , des , sk,  co,  a, c,  nc , g);
		for (int i = 0; i<cantidad;i++) {
			añadirProducto(nuevoCD);
		}
	}

	//METODOS PARA GUARDAR Y CARGAR CATALOGO
	public void guardarCatalogoActual() throws IOException{
		serializarDatos();
		obtenerInventario();
	}
	public void cargarCatalogo() throws ClassNotFoundException{
		try{
			this.productos = (ArrayList<producto>) deserializarDatos();
		}catch(ClassNotFoundException e){

		}
		obtenerInventario();
	}	
	private void serializarDatos(){
		try {
			FileOutputStream fileOut = new FileOutputStream(this.nombreCatalogo);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(this.productos);
			out.close();
			fileOut.close();
			System.out.println("\nSerializacion Exitosa.\n");
 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private Object deserializarDatos() throws ClassNotFoundException{
		Object retorno = null;
		try {
			FileInputStream fileIn = new FileInputStream(this.nombreCatalogo);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			retorno = in.readObject();
			in.close();
			fileIn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return retorno ;
	}

	//METODOS DE INVENTARIO
	private void printMap(Map mp) {
    	Iterator it = mp.entrySet().iterator();
    	while (it.hasNext()) {
        	Map.Entry pair = (Map.Entry)it.next();

        	System.out.println(pair.getKey() + " = " + pair.getValue());
        	it.remove();
    	}
	}
	public void obtenerInventario(){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (producto p : this.productos) {
			int currSKU = p.obtenerSku();
			if (map.containsKey(currSKU)) {
				map.replace(currSKU,map.get(currSKU)+1);
				continue;
			} else{
				map.put(currSKU,1);
			}
		}
		System.out.println("inventario");
		this.inventario = map;
		printMap(inventario);
	}
}