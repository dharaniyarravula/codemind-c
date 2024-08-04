import java.util.Scanner;
    class mean
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    double a,b,c,d,e,f,sum;
    a=sc.nextDouble();
    b=sc.nextDouble();
    c=sc.nextDouble();
    d=sc.nextDouble();
    e=sc.nextDouble();
    f=sc.nextDouble();
    sum=(a+b+c+d+e+f)/6;
      System.out.println("mean"+sum);
      sc.close();
    }
}
