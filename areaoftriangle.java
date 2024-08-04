import java.util.Scanner;
    class areaoftriangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2;
        System.out.println("area of triangle"+s);
    }
}
