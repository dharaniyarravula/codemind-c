import java.util.Scanner;
class bmi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);                //bmi=wehi/heig*weight
        float height,weight;
        System.out.println("enter height");
        weight=sc.nextFloat();
        System.out.println("enter weight");
        height=sc.nextFloat();
       float BMI=weight/(height*height);
        System.out.println("enter BMI"+BMI);
        sc.close();
    }
}
