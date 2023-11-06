
package EjercicioE1;

import java.time.LocalDate;


// @author new53
 
public class RentMooring {
    private String customerName;
    private long customerID;
    private LocalDate rentDate, devolutionDate;
    private MooringPosition mooringPosition;
    private Ship ship;

    public RentMooring(String customerName, long customerID, LocalDate rentDate, LocalDate devolutionDate, MooringPosition mooringPosition, Ship ship) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.rentDate = rentDate;
        this.devolutionDate = devolutionDate;
        this.mooringPosition = mooringPosition;
        this.ship = ship;
    }

    public String getCustomerName() {
        return customerName;
    }

    public long getCustomerID() {
        return customerID;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public LocalDate getDevolutionDate() {
        return devolutionDate;
    }

    public MooringPosition getMooringPosition() {
        return mooringPosition;
    }

    public Ship getShip() {
        return ship;
    }

    @Override
    public String toString() {
        return "RentMooring{" + "customerName=" + customerName + ", customerID=" + customerID + ", rentDate=" + rentDate + ", devolutionDate=" + devolutionDate + ", mooringPosition=" + mooringPosition + ", ship=" + ship.toString() + '}';
    }  
}