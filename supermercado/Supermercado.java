/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.util.ArrayList;

/**
 *
 * @author marizase
 */
public class Supermercado {
    private ArrayList<Producto> productos = new ArrayList();

    public Supermercado() {
    }
    
    public void addProducto(Producto product) {
        this.productos.add(product);
    }
    
    public void showProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
