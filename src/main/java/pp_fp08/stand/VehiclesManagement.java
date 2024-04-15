package pp_fp08.stand;

public class VehiclesManagement {

    private static final int MAX_VEHICLES = 100;
    private static final int DOUBLE_SIZE = 2;

    private int numberOfVehicles = 0;
    private Vehicle[] vehicles = new Vehicle[MAX_VEHICLES];

    public boolean addVehicle(Vehicle vehicle) {
        if (checkVin(vehicle) == false || vehicleExists(vehicle) == true) {
            return false;
        }

        doubleCapacity();
        vehicles[numberOfVehicles++] = vehicle;

        return true;
    }

    private void doubleCapacity() {
        if (vehicles.length == numberOfVehicles) {
            int newSize = vehicles.length * DOUBLE_SIZE;
            Vehicle[] tempVehicles = new Vehicle[newSize];

            for (int i = 0; i < numberOfVehicles; i++) {
                tempVehicles[i] = vehicles[i];
            }
            vehicles = tempVehicles;
        }
    }

    private int getVehiclePosition(Vehicle vehicle) {
        for (int i = 0; i < numberOfVehicles; i++) {
            if (vehicles[i] == vehicle) {
                return i;
            }
        }

        return -1;
    }

    public boolean removeVehicle(Vehicle vehicle) {
        int position = getVehiclePosition(vehicle);

        if (position == -1) {
            return false;
        }

        for (int i = position; i < numberOfVehicles - 1; i++) {
            vehicles[i] = vehicles[i + 1];
        }

        vehicles[numberOfVehicles - 1] = null;
        numberOfVehicles--;

        return true;

    }

    public void listVehicles() {
        for (int i = 0; i < numberOfVehicles; i++) {
            System.out.println(vehicles[i].vehicleToString());
        }
    }
    
    private boolean checkVin(Vehicle vehicle) {
        int vinNumberToCheck = vehicle.getVinNumber();

        for (int i = 0; i < numberOfVehicles; i++) {
            if (vehicles[i].getVinNumber() == vinNumberToCheck) {
                return false;
            }
        }
        return true;
    }

    private boolean vehicleExists(Vehicle vehicle) {
        for (int i = 0; i < numberOfVehicles; i++) {
            if (vehicles[i].equals(vehicle)) {
                return true;
            }
        }
        return false;
    }

    public String vehiclesForSale() {
        int numberOfCars = 0;
        int numberOfMotorcycles = 0;
        int numberOfTrucks = 0;
        String s = "\nAvailable veichles for sale: ";

        for (int i = 0; i < numberOfVehicles; i++) {
            if (vehicles[i].getForSale() == true) {
                if (vehicles[i] instanceof Car) {
                    numberOfCars++;
                } else if (vehicles[i] instanceof Motorcycle) {
                    numberOfMotorcycles++;
                } else if (vehicles[i] instanceof HeavyVehicle) {
                    numberOfTrucks++;
                }
            }
        }
        return s + "\nCars: " + numberOfCars + "\nMotorcycles: " + numberOfMotorcycles + "\nTrucks: " + numberOfTrucks;
    }
}
