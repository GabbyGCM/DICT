import java.util.Scanner;
class Aggr{
 int id;
  int numberhouse;
  String address;
        public int gethouse(){
        return numberhouse;
    }
  public int getid(){
    return id;
  }
        public String getaddres(){
        return address;
    }
 public Aggr(int id,int numberhouse,String address){
this.id=id;
this.numberhouse=numberhouse;
this.address=address;
}
 
} 


public  class Student{ 
  private Aggr details;               
   private String name;
    private int age;
    private String address;
    
    public Student(String name,int age,String address,Aggr details){
        setage(age);
        setName(name);
        setaddress(address);
        this.details=details;
    }
    public void setName(String name){
        this.name=name;
    }
        public void setage(int age){
         if(age>=30){
            this.age=age;
         }   
        else{
            
        this.age=18;
        }
       }
        public void setaddress(String address){
        this.address=address;
    }
        public String getName(){
        return name;
    }
         public int getage(){
        return age;
    }
         public String getaddress(){
        return address;
    }
        public Aggr getaddres(){
        return details;
    }
   
    public  String method(){
    return("student name is: "+this.getName()+",age is: "+this.getage()+",address is: "+this.getaddress()+"your id is "+ getaddres().getid());
    }
     
   
    public static void text(){
      System.out.println("hello");
    }
     public static void main(String[] args) throws Exception {
        int i,j;
        Scanner scanner = new Scanner(System.in);
        String[][] majina=new String[3][3];
        System.out.println("enter the names");
      for(i=0;i<3;i++) {
     for(j=0;j<3;j++){
     majina[i][j]=scanner.nextLine(); 
     }
    }
       int[][] age=new int[3][3];
    for(i=0;i<3;i++) {
     for(j=0;j<3;j++){
      System.out.println("enter the age of "+majina[i][j]);  
     age[i][j]=scanner.nextInt(); 
     }
    }
         String[][] address=new String[3][3];
    for(i=0;i<3;i++) {
     for(j=0;j<3;j++){
        System.out.println("enter the adress of "+ majina[i][j]);
     address[i][j]=scanner.nextLine(); 
     }
    }
    scanner.close();
    for(i=0;i<3;i++) {
     for(j=0;j<3;j++){
         Aggr details1=new Aggr(1,23,"tanzania");
        Student john=new Student(majina[i][j],age[i][j],address[i][j],details1);
        System.out.println(john.method());
       // System.out.println(john.getaddres().getid());
     }
    }

       
    }
}
