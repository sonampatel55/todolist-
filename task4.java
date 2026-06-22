import java.util.*;
class task4
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
Random r=new Random();
 int random=r.nextInt(10);
 boolean playing=true;
 int attempts=0;
while(playing)
{
System.out.println("Enter the number from 0-9");
int guess=sc.nextInt();
attempts++;
if(random==guess)
{
System.out.println("you guessed it right:"+random);
System.out.println("Attempts:"+attempts);
playing=false;
}
else if(random<guess )
{System.out.println("number is Smaller than your guessed number");}
else if(random>guess )
{System.out.println("number is Greater than your guessed number");}
}

}
}
