import java.util.Scanner;
public  class Exerption{
 public   void display(){
  System.out.println("error is occured please donot eneter zero "); 
    }
    public static void main(String[] args){
        Scanner hm=new Scanner(System.in);
        System.out.println("enter the first number ");
        int num1=hm.nextInt();
        System.out.println("enter the second number ");
        int num2=hm.nextInt();
        hm.close();
        try{
        int answer=num1/num2;
        System.out.println("the answer is "+ answer);
    }
    catch(ArithmeticException e){
         System.out.println("error is occured please donot eneter zero "); 
     // e.getMessage();
    }
 finally{
    System.out.println("this is must ");   
 }


    }
}