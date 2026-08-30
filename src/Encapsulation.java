class Programmer{
    private String name;
    public String  getName(){
     return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class Encapsulation{
    public static void main(String[] args){
        Programmer myprogrammer = new Programmer();
        myprogrammer.setName("Ankit");
        System.out.println(myprogrammer.getName());
    }
}