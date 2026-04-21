import java.util.Scanner;
class A
{
   static Scanner sc =new Scanner(System.in);
     int a=sc.nextInt();
     int m1(float a)
    {
      System.out.println(a);
      return sc.nextInt();
   }
}
class B extends A
{
    double a=sc.nextDouble();
    int m1(float a)
    {
     System.out.println("m1");
     System.out.println(a);
     return sc.nextInt();
    }
public static void main(String []args)
{
  B x=new B();
  System.out.println(x.m1());
  System.out.println(x.a);
}
  
   
