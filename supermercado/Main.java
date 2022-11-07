/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

/**
 *
 * @author marizase
 */
public class Main {
    public static void main(String[] args) {
        Supermercado supermarket = new Supermercado();
        supermarket.addProducto(new Producto("Leche Central Lechera asturiana", 1.2));
        supermarket.addProducto(new Producto("Patatas fritas congeladas", 2.2));
        supermarket.addProducto(new Producto("Bolsa 1kg Manzanas", 1.05));
        
        supermarket.showProductos();
    }
}
