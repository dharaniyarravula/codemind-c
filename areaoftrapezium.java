import java.util.Scanner;
    class areaoftrapezoid
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in)
    double t,b1,b2,h;
      b1=sc.nextDouble();
      b2=sc.nextDouble();
      h=sc.nextDouble();
      t=((b1+b2)*h)/2;
      System.out.println("areaoftrapezoid "+t);
      sc.close();
        
    }
}
