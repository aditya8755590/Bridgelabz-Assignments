public class Vehicle {
//     Create a Vehicle class with the following features:
// Static:
// ○       A static variable registrationFee common for all vehicles.
// ○       A static method updateRegistrationFee() to modify the fee.
// This:
// ○       Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
// Final:
// ○       Use a final variable registrationNumber to uniquely identify each vehicle.
// Instanceof:
// ○       Check if an object belongs to the Vehicle class before displaying its registration
// ○       details.

    static int registrationFee=500;
    private final String registrationNumber;
    String ownerName="";
    String vehicleType="";
    private static int totalVehicles=0;

    Vehicle(String registrationNumber,String ownerName,String vehicleType){
        this.registrationNumber=registrationNumber;
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        totalVehicles++;
    }

    public static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println(registrationNumber);
            System.out.println(ownerName);
            System.out.println(vehicleType);
            System.out.println(registrationFee);
        } else {
            System.out.println("Not a valid Vehicle");
        }
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    
}
