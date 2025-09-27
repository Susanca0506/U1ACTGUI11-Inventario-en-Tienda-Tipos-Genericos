/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package otro;

import utng.edu.mx.U1ACTGUI11.Electronico;
import utng.edu.mx.U1ACTGUI11.Libro;
import utng.edu.mx.U1ACTGUI11.Producto;

/**
 *
 * @author carde
 */
public class MainProducto{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Producto<?>[] productos = new Producto<?>[4];
    
        productos[0]= new Libro("Java Básico", (float) 299.9,350);
        productos[1]= new Electronico("Laptop ASUS", (float) 15999.99,"2 años de garantía");
        productos[2] = new Libro("Patrones de Diseño", (float) 499.50, 420);
        productos[3] = new Electronico("Smartphone Samsung", (float) 10999.00, "1 año de garantía");
        
        for (Producto<?> p : productos) {
            p.mostrarDetalles();
        }
    }
}
