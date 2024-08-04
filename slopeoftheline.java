import java.util.Scanner;
    class slope
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float slope;
        int x1,x2,y1,y2;
        System.out.println("enter four coordinates");
        x1=sc.nextInt();
        x2=sc.nextInt();
        y1=sc.nextInt();
        y2=sc.nextInt();
        slope=(y2-y1)/(x2-x1);
        System.out.println("slope of the line"+slope);
        
    }
}
