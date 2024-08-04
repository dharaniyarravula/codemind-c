import java.util.Scanner;
    class volumeofcylinder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      double c,r,h;
      r=sc.nextDouble();
      h=sc.nextDouble();
      c=3.14*r*r*h;
      System.out.println("volumeofcylinder"+c);
      sc.close();
        
    }
}
