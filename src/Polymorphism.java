//class employee{
//    void role(){
//        System.out.println("i am an employee");
//    }
//}
//class Father extends employee{
//    @Override
//    void role(){
//        System.out.println("i am a Father");
//    }
//}
//public class Polymorphism{
//    public static void main(String[] args){
//
//    }
//}

 // Method overloading which is compile time polymorphism
//class Main{
//    static int Multiply(int a,int b){
//        return a*b;
//    }
//    static double Multiply(double a,double b){
//        return a*b;
//    }
// }
//public class Polymorphism {
//    public static void main(String[] args){
//
//        System.out.println(Main.Multiply(2,3));
//        System.out.println(Main.Multiply(2.3,4.5));
//    }
//}


// Mehod overrinding /runtime polymorphism

// Class 1
// Helper class
class Parent {

    // Method of parent class
    void Print() { System.out.println("parent class"); }
}

// Class 2
// Helper class
class Subclass1 extends Parent {

    // Method
    void Print() { System.out.println("subclass1"); }
}

// Class 3
// Helper class
class Subclass2 extends Parent {

    // Method
    void Print() { System.out.println("subclass2"); }
}

// Class 4
// Main class
public class Polymorphism {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of class 1
        Parent a;

        // Now we will be calling print methods
        // inside main() method
        a = new Subclass1();
        a.Print();

        a = new Subclass2();
        a.Print();
    }
}