
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SGW08
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int leerAhora;
        
        
        do{
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Agregar un producto");
            System.out.println("2. Buscar producto ");
            System.out.println("3. Eliminar un producto ");
            System.out.println("4. Mostrar el catalogo");
            System.out.println("5. Cargar catalogo");
            System.out.println("6. Guardar catalogo");
            System.out.println("7. Salir");
            leerAhora=Integer.parseInt(leer.nextLine());
            
            switch(leerAhora){
                case 1:
                    System.out.println("¿QUE PRODUCTO AGREGARAS?");
                    System.out.println("1. CD");
                    System.out.println("2. DVD");
                    System.out.println("3. Libro");
                    System.out.println("4. Revista");
                    System.out.println("5. Regresar");
                    leerAhora=Integer.parseInt(leer.nextLine());
                    do{
                        switch(leerAhora){
                            case 1:
                            
                                break;
                            
                            case 2:
                            
                                break;
                        
                            case 3:
                            
                                break;
                            
                            case 4:
                            
                                break;
                            
                            case 5:
                            
                                break;
                    }
                    }while(leerAhora!=5);
                    break;
                    
                case 2:
                    System.out.println("¿COMO DESEAS BUSCAR?");
                    System.out.println("1. NOMBRE");
                    System.out.println("2. ID");
                    System.out.println("3. Regresar");
                    leerAhora=Integer.parseInt(leer.nextLine());
                    do{
                        switch(leerAhora){
                            case 1:
                            
                                break;
                            case 2:
                            
                                break;
                            case 3:
                            
                                break;
                    }
                    }while(leerAhora!=3);
                    break;
                    
                case 3:
                    System.out.println("¿ELIMINAR POR?");
                    System.out.println("1. NOMBRE");
                    System.out.println("2. ID");
                    System.out.println("3. Regresar");
                    leerAhora=Integer.parseInt(leer.nextLine());
                    do{
                        switch(leerAhora){
                            case 1:
                            
                                break;
                            case 2:
                            
                                break;
                            case 3:
                            
                                break;
                    }
                    }while(leerAhora!=3);
                    
                    break;
                    
                case 4:
                    System.out.println("¿MOSTRAR POR?");
                    System.out.println("1. NOMBRE");
                    System.out.println("2. ID");
                    System.out.println("3. Regresar");
                    leerAhora=Integer.parseInt(leer.nextLine());
                    do{
                        switch(leerAhora){
                            case 1:
                            
                                break;
                            case 2:
                            
                                break;
                            case 3:
                            
                                break;
                    }
                    }while(leerAhora!=3);
                    
                    break;
                    
                case 5:
                    System.out.println("MENU CARGAR CATALOGO");
                    System.out.println("1. INGRESAR EL NOMBRE");
                    System.out.println("2. Regresar");
                    leerAhora=Integer.parseInt(leer.nextLine());
                    do{
                        switch(leerAhora){
                            case 1:
                            
                                break;
                            case 2:
                            
                                break;
                    }
                    }while(leerAhora!=2);
                    
                    break;
                    
                case 6:
                    System.out.println("MENU GUARDAR CATALOGO");
                    System.out.println("1. INGRESAR EL NOMBRE");
                    System.out.println("2. Regresar");
                    leerAhora=Integer.parseInt(leer.nextLine());
                    do{
                        switch(leerAhora){
                            case 1:
                            
                                break;
                            case 2:
                            
                                break;
                    }
                    }while(leerAhora!=2);
                    
                    break; 
                    
                case 7:
                    
                    
                    break;  
            }

        }while(leerAhora!=7);
    }
   
}
