import java.io.*;
import java.util.*;
class task5
{
public static void main(String ar[])throws Exception
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Data..");
String s1=sc.nextLine();
FileOutputStream fo=new FileOutputStream("TextFile.txt",true);

int i=0;
while(i<s1.length())
{
fo.write(s1.charAt(i));
i++;
}
fo.close();

FileInputStream fi=new FileInputStream("TextFile.txt");
int x;
x=fi.read();
while(x!=-1)
{
	System.out.print((char)x);
	x=fi.read();
}
fi.close();
System.out.println("data insert....");
}
}