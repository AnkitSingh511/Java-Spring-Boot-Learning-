//abstract class TV{
//    abstract void turnon();
//    abstract void turnof();
//}
//class Tvremote extends TV{
//    @Override
//    void turnon(){
//        System.out.println("tv is on");
//    }
//    @Override
//    void turnof(){
//        System.out.println("tv is of");
//    }
//}
//
//public class Abstraction{
//    public static void main(String[] args){
//      TV mytv = new Tvremote();
//      mytv.turnof();
//      mytv.turnon();
//    }
//}

// Interface
interface Shape{
    double area();
}
class circle implements Shape{
     private double r;
    circle(double r){
        this.r = r;
    }
    public double area(){
        return Math.PI * Math.pow(r,2);
    }
}
public class Abstraction{
    public static void main(String[] args){
       Shape cr = new circle(3.1);
        System.out.println(cr.area());
    }
}