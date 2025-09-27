/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utng.edu.mx.U1ACTGUI11;

/**
 *
 * @author carde
 */
public class Libro extends Producto<Integer> {

    public Libro(String nombre, float precio, Integer paginas) {
        super(nombre, precio, paginas);
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Libro: "+getNombre()+", precio: $"+getPrecio()+", paginas: "+getInformacion());
    }

}
