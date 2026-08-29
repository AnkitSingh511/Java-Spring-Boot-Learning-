public class arrayMethodString{
//    static void myMethod(){
//        System.out.println("This mehtod has been called");
//    }
//    public static void main(String[] args){
//      myMethod();
//      myMethod();
//    }


    // Method with parameters

//    static void myMethod(String name){
//        System.out.println("Name is "+name);
//    }
//    public static void main(String[] args){
//        myMethod("Ankit Singh");
//    }

    // Method Overloading //
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    static double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println(add(2,3));
        System.out.println(add(1,2,3));
        System.out.println(add(1.2,2.2));
    }

}