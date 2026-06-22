import java.util.*;
class task2
{
public static void main(String ar[])
{
	double temp;
	String unit;
	double newtem;
	
Scanner sc=new Scanner(System.in);


System.out.println("Enter the tempreture");
temp=sc.nextDouble();


System.out.println("Convert into Fahrenheit or Celsius(C or F)");
unit=sc.next().toUpperCase();


if(unit.equals("C"))
{
	newtem=(temp-32)*5/9;
}
else
{
	newtem=(temp*5/9)+32;
}
 System.out.printf("%.1f°%s",newtem,unit);
 
}
}



