
package Market.Entities;


 
public class Manufacturer {
    private int manufacturerCode;
    private String manufacturerName;

    public Manufacturer() {
    }

    public Manufacturer(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getManufacturerCode() {
        return manufacturerCode;
    }

    public void setManufacturerCode(int manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    @Override
    public String toString() {
        return "Manufacturer{" + "manufacturerCode=" + manufacturerCode + ", manufacturerName=" + manufacturerName + '}';
    }  
}