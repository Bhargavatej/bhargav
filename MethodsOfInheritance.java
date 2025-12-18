class Plane {
    void pp() {
        System.out.println("Plane is ready");
    }

    void takeoff() {
        System.out.println("Plane is taking off");
    }

    void fly() {
        System.out.println("Plane is flying");
    }

    void land() {
        System.out.println("Plane is landing");
    }
}

// Child class 1
class CargoPlane extends Plane {
    void fly() {
        System.out.println("Cargo Plane is flying with goods");
    }
}

// Child class 2
class PassengerPlane extends Plane {
    void fly() {
        System.out.println("Passenger Plane is flying with passengers");
    }
}

// Child class 3
class FighterPlane extends Plane {
    void fly() {
        System.out.println("Fighter Plane is flying at high speed");
    }
}

// Airport class
class Airport {
    void permit(Plane ref) {   // ✔ Correct method definition
        ref.pp();
        ref.takeoff();
        ref.fly();   // Polymorphism happens here
        ref.land();
        System.out.println();
    }
}

// Main class
public class MethodsOfInheritance {
    public static void main(String[] args) {

        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        Airport a = new Airport();
        a.permit(cp);
        a.permit(pp);
        a.permit(fp);
    }
}