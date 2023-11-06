
package EjercicioE2;


// @author new53
 
public class SportCenterBuilding extends Building{
    private String nameBuilding;
    private RoofBuilding roof;
    
    public SportCenterBuilding(String nameBuilding, RoofBuilding roof, double widht, double lenght, double high) {
        super(widht, lenght, high);
        this.nameBuilding = nameBuilding;
        this.roof = roof;
    }

    public String getNameBuilding() {
        return nameBuilding;
    }

    public void setNameBuilding(String nameBuilding) {
        this.nameBuilding = nameBuilding;
    }

    public RoofBuilding getRoof() {
        return roof;
    }

    public void setRoof(RoofBuilding roof) {
        this.roof = roof;
    }  

    @Override
    public double calculateSurface() {
        return super.widht*super.lenght;
    }

    @Override
    public double calculateVolume() {
        return super.high*super.lenght*super.widht;
    }

    @Override
    public String toString() {
        return "\n{SPORT-CENTER BUILDING DETAILS...\n[" + 
                "\nBuilding name: " + this.nameBuilding +
                "\nWidth: " + super.widht + 
                "\nHigh: " + super.high + 
                "\nLength: " + super.lenght + 
                "\nRoof type: " + this.roof + "\n]";
    }  
}