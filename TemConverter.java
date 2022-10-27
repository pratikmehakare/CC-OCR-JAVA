/*Tempreture Converter in java */
import java.util.*;
class TemConverter{
    
    static void FTC()
    {
        System.out.println("Enter Fahrenheit Value=");
        Scanner sc=new Scanner(System.in);
        float f=sc.nextInt();
        float c=(f-32)*5/9;
        System.out.println("Celsius Value is="+c+"°C");

    }
    static void CTF()
    {
        System.out.println("Enter Celsius Value=");
        Scanner sa=new Scanner(System.in);
        float c=sa.nextInt();
        float f=(9*c/5)+32;
        System.out.println("Fahrenheit Value is="+f+"°F");
    }
    public static void main(String args[])throws Exception
    {
        System.out.println("-------CONVERTER--------");
        
        System.out.println("Choose type of conversion");
        System.out.println("1.Fahrenheit to Celsius");
        System.out.println("2.Celsius to Fahrenheit");
        Scanner s=new Scanner(System.in);
        
        int ch=s.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Fahrenheit to Celsius Converter");
            FTC();
            break;
            case 2:
            System.out.println("Celsius to Fahrenheit Converter");
            CTF();
            break;
            default:
            System.out.println("Invalid choice...");

        }

    }
}