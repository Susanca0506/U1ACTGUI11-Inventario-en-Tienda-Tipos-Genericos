/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utng.edu.mx.U1ACTGUI11;

/**
 *
 * @author carde
 */
public class Electronico extends Producto<String>{
    
    public Electronico(String nombre, float precio, String garantia){
        super(nombre, precio, garantia);
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Electrónico: " + getNombre() + ", precio: $" +getPrecio() + ", garantía: " + getInformacion());
    }
    
}
