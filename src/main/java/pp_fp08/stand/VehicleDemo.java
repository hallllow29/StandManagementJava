package pp_fp08.stand;

import pp_fp08.enums.Condition;
import pp_fp08.enums.Origin;
import pp_fp08.enums.TrailerType;
import pp_fp08.enums.TruckType;

public class VehicleDemo {

    public static void main(String[] args) {
        SemiTrailer scaniaTrailer = new SemiTrailer(10000, 4);
        TowHaul krone = new TowHaul(50000, TrailerType.FRIDGE);
        
        Car mercedes = new Car(10000, 5000, 123123, "Mercedes", "Classe S", "2023-03-01", Origin.IMPORTED, Condition.USED, 5, 3, false);
        Car mercedes1 = new Car(10000, 5000, 222222, "Mercedes", "Classe S", "2023-03-01", Origin.IMPORTED, Condition.USED, 5, 3, false);
        Car toyota = new Car(0, 15000, 123123, "Toyota", "Yaris", "2024-03-06", Origin.NATIONAL, Condition.NEW, 5, 4, true);
        
        Motorcycle bmw = new Motorcycle(50000, 15000, 22222222, "Bmw", "GS", "2016-01-29", Origin.IMPORTED, Condition.USED, 1200, 110, false);
        
        HeavyVehicle scaniaTruck = new HeavyVehicle(400000, 20000, 999999, "Scania", "Serie L", "2020-01-03", Origin.IMPORTED, Condition.USED, 5000, 14000, TruckType.TIR, scaniaTrailer, true);
        HeavyVehicle iveco = new HeavyVehicle(200000, 40000, 33333333, "Iveco", "Tector", "2015-03-02", Origin.IMPORTED, Condition.NEW, 6000, 10000, TruckType.TRUCK, krone, true);
        

        VehiclesManagement stand = new VehiclesManagement();

        stand.addVehicle(iveco);
        stand.addVehicle(bmw);
        stand.addVehicle(toyota);
        stand.addVehicle(mercedes);
        stand.addVehicle(mercedes1);
        stand.addVehicle(scaniaTruck);

        stand.listVehicles();
        System.out.println(stand.vehiclesForSale());

    }

}
