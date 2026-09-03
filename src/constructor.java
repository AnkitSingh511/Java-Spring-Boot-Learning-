//class Example{
//    String name;
//     Example(String name){
//        this.name = name;
//    }
//    void display(){
//        System.out.println("This is a good "+ name);
//    }
//}
//public class constructor{
//     static void main(){
//        Example E = new Example("Ankit");
//        E.display();
//    }
//}



// Let's see default constructor
//class Example{
//    String name;
//    int age;
//    void display(){
//        System.out.println("My name is "+name + " and my age is "+ age);
//    }
//}
//
//public class constructor{
//    static void main(){
//        Example E = new Example();
//        E.name = "Ankit";
//        E.age = 20;
//        E.display();
//    }
// }

// copy constructor
//class Example{
//    String name;
//    int age;
//    Example(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//    Example(Example obj2){
//        this.name = obj2.name;
//        this.age = obj2.age;
//    }
//}
//public class constructor{
//    static void main(String[] args){
//        Example obj1 = new Example("Ankit",20);
//        System.out.println("My name is "+ obj1.name + "and age is "+ obj1.age);
//        Example obj2 = new Example(obj1);
//        System.out.println("My name is "+ obj2.name + "and age is "+ obj2.age);
//    }
//}



// What if the constructor is created private , what is its reason and why we need it
//class Example{
//    private Example(){
//    }
//    public static void display(){
//        System.out.println("This is running without creating object");
//    }
//}
//public class constructor{
//    public static void main(String[] args){
//      Example.display();
//    }
//}
// We can not create an object in the main method if we declared our constructor to be private.

// Multiple constructors can be created with the same name and different paraemeter that is called as constructor overloading.