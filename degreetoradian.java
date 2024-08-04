import java.util.Scanner;
class degreetoradians
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
     double r,d;
         d=sc.nextDouble();
        r=sc.nextDouble();
        r=d*(3.14/180.0);
        System.out.println(d+"degress"+r+"radians");
        sc.close();
    }
}
