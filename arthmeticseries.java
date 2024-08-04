import java.util.Scanner;
    class arthmeticseries
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int s,n,a,l;
      n=sc.nextInt();
      a=sc.nextInt();
      l=sc.nextInt();
      s=n/2*(a+l);
      System.out.println("arthmetic series"+s);
      sc.close();
        
    }
}
