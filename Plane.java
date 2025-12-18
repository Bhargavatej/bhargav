
abstract class Plane {

    abstract void takeoff();
    abstract void fly();
    abstract void land();
}

class CargoPlane extends Plane {

    void takeoff() {
        System.out.println("CargoPlane is taking off");
    }

    void fly() {
        System.out.println("CargoPlane is flying at low height");
    }

    void land() {
        System.out.println("CargoPlane is landing");
    }
}

class PassengerPlane extends Plane {

    void takeoff() {
        System.out.println("PassengerPlane is taking off");
    }

    void fly() {
        System.out.println("PassengerPlane is flying at medium height");
    }

    void land() {
        System.out.println("PassengerPlane is landing");
    }
}

class Airport {

    void permit(Plane ref) {   
        ref.takeoff();
        ref.fly();
        ref.land();
        System.out.println();
    }
}


public class ExampleForAbstraction {

    public static void main(String[] args) {

        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();

        Airport a = new Airport();
        a.permit(cp);
        a.permit(pp);
    }
}
