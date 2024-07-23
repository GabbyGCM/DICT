public class Special  extends Student{
    public int height;
    public Special(String name,int age,String address,int height){
    super(details,name,age,address);
    this.height=height;
    }
    //this i commit
    public String tarifa(){
        return("special height is "+this.height+"student name is: "+this.getName()+",age is: "+this.getage()+",address is: "+this.getaddress());
    }
    public static void main(String[] args){
     Special mimi=new Special("amina", 23, "Mwanza",70);
    System.out.println( mimi.method());
     System.out.println(mimi.tarifa());
     Student.text();
}
}
