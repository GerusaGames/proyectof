class producto{
	private String nombre;
	private int sku;
	private int costo;
	private String descripcion;
	public producto(){}
	public void productoSetter(String nom,String des , int sk, int co){
		nombre = nom;
		sku = sk;
		costo = co;
		descripcion = des;
	}
	public void cambiarNombre(String t){
		this.nombre = t;
	}
	public void cambiarCosto(int c){
		this.costo = c;
	}
	public String obtenerNombre(){
		return this.nombre;
	}
	public int obtenerCosto(){
		return this.costo;
	}
	public String obtenerDescripcion(){
		return this.descripcion;
	}
}