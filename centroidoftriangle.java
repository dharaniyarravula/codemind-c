import java.util.Scanner;
    class nthseries
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    double x,x1,x2,x3,y,y1,y2,y3;
    x1=sc.nextDouble();
    x2=sc.nextDouble();
    x3=sc.nextDouble();
    y1=sc.nextDouble();
    y2=sc.nextDouble();
    y3=sc.nextDouble();
    x=(x1+x2+x3)/3;
    y=(y1+y2+y3)/3;
      System.out.println("centroid(x,y)=("+x+","+y+")");
      sc.close();
        
    }
}
