import java.util.Scanner;
    class nthseries
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    double a,n,s,d;
      a=sc.nextDouble();
      n=sc.nextDouble();
      d=sc.nextDouble();
      s=a+(n-1)*d;
      System.out.println("nthseries"+s);
      sc.close();
        
    }
}
