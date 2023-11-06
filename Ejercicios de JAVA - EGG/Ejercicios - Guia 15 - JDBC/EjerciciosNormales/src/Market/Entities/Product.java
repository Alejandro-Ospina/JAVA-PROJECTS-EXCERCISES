
package Market.Entities;


// @author new53
 
public class Product {
    private int productCode;
    private String productName;
    private double productPrice;
    private int manufacturerCode;

    public Product() {
    }

    public Product(String productName, double productPrice, int manufacturerCode) {      
        this.productName = productName;
        this.productPrice = productPrice;
        this.manufacturerCode = manufacturerCode;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getManufacturerCode() {
        return manufacturerCode;
    }

    public void setManufacturerCode(int manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }

    @Override
    public String toString() {
        return "Product{" + "productCode=" + productCode + ", productName=" + productName + ", productPrice=" + productPrice + ", manufacturerCode=" + manufacturerCode + '}';
    } 
}