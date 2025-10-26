
package e;

public class Producto {
 String id;
 String nombre;
 
 Producto(String id,String nombre){
 this.id=id;
 this.nombre= nombre;}
         
 public String showProducto(){
     return id + " " + nombre;
 }
}
