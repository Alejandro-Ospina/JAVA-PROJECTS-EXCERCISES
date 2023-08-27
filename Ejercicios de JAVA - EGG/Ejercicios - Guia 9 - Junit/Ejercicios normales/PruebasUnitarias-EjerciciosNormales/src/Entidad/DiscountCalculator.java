
package Entidad;


// @author new53
 
public class DiscountCalculator {
    private double precioProducto, descuento;

    public DiscountCalculator() {
    }

    public DiscountCalculator(double precioProducto, double descuento) {
        this.precioProducto = precioProducto;
        this.descuento = descuento;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
