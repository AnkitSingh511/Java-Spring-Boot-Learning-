
// inheritance and runtime polymorphism


//class Animal{
//   void sound(){
//        System.out.println("Animal Speak");
//    }
//}
//class Dog extends Animal{
//    void sound(){
//        System.out.println("Dog Barks");
//    }
//}
//class Cat extends Animal{
//    void sound(){
//        System.out.println("Cat meows");
//    }
//}
//public class Inheritance{
//    public static void main(String[] args){
//        Animal a;
//        a = new Dog();
//        a.sound();
//        a = new Cat();
//        a.sound();
//        a = new Animal();
//        a.sound();
//
//    }
//}


// Single Inheritance
//super class
//class vehicle{
//    vehicle(){
//        System.out.println("This is a vehicle");
//    }
//}
////sub class
//class car extends vehicle{
//    car(){
//        System.out.println("This is a car");
//    }
//}
//public class Inheritance{
//    public static void main(String[] args){
//        //creating the object of subclass invokes the subclass.
//        car mycar = new car();
//    }
//}




// Multilevel Inheritance
//class Vehicle{
//    Vehicle(){
//        System.out.println("This is a vehicle");
//    }
//}
//class FourWheeler extends Vehicle{
//    FourWheeler(){
//        System.out.println("This is a FourWheeler");
//    }
//}
//class car extends FourWheeler{
//    car(){
//        System.out.println("This is a car");
//    }
//}
//public class Inheritance{
//    public static void main(String[] args){
//        car myCar = new car();
//    }
//}

//Hierarchial inheritance
//    class Vehicle{
//        Vehicle(){
//            System.out.println("This is a vehicle");
//        }
//}
//class car extends Vehicle{
//        car(){
//            System.out.println("This is my car");
//        }
//}
//class bus extends Vehicle{
//        bus(){
//            System.out.println("This is my bus");
//        }
//}
//
//public class Inheritance{
//    public static void main(String[] args){
//        car mycar = new car();
//        bus mybus = new bus();
//    }
//}


    // Multiple Inheritance
    interface Landvehicle{
        default void landinfo(){
            System.out.println("This is a land vehicle");
        }
}
interface Watervehicle{
        default void waterinfo(){
            System.out.println("This is a water vehicle");
        }
}
class AmphibiousVehicle implements Landvehicle,Watervehicle{
         AmphibiousVehicle(){
            System.out.println("This is a land as well as water vehicle");
        }
}

public class Inheritance{
    public static void main(String[] args){
     AmphibiousVehicle obj = new AmphibiousVehicle();
     obj.landinfo();
     obj.waterinfo();
    }
}