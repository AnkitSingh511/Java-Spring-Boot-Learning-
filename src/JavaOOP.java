public class JavaOOP{
//    int x = 5;
//    static void main(String[] args){
//        JavaOOP myObj = new JavaOOP();
//        System.out.println(myObj.x);
//    }
//   static int x = 5;
//    static void main(String[] args){
//        System.out.println(x);
//    }


    // Constructor//
     String name;
    JavaOOP(String name){
        this.name = name;
    }
    public static void main(String[] args){
        JavaOOP myname = new JavaOOP("Ankit");
        System.out.println(myname.name);
    }
}