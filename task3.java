import java.util.*;
class Task
{
String title;
boolean completed;

Task(String title)
 {
	this.title=title;
	completed=false;
 }
}

class taskmng
{  Scanner sc=new Scanner(System.in);
    static Task[] tasks = new Task[5];
	
	
	void addtask()
	{
	    for (int i = 0; i < 5; i++) 
		{
			if(tasks[i]==null)
            {
			System.out.print("Enter task " + (i + 1) + ": ");
            String title=sc.nextLine();
			tasks[i] = new Task(title);
			break;
		    }
		}	
	}
	
	void showtask()
	{
		for(int i=0;i<5;i++)
		{
			if(tasks[i]!=null)
			{
				String status;
				if(tasks[i].completed)
				{status="completed";}
			else{status="panding";}
			
			System.out.println((i+1)+". "+tasks[i].title+"["+status+"]");
			}
		}
	}
	
	void complete()
	{
		showtask();
		System.out.println("Enetr task number to mark as completed");
		int c=sc.nextInt();
		sc.nextLine();
		
		if(c>=1 && c<=5 && tasks[c-1]!=null)
		{
			tasks[c-1].completed=true;
			System.out.println("task"+c+"is Completed.");
		}
		else{
			System.out.println("Invalid task number.");
		}
	}
	void taskdelete()
	{
	showtask();
	System.out.println("Enter task no.to delete ");
	int d=sc.nextInt();
     sc.nextLine();
	 
	 if(d>=1 && d<=5)
	 {
		 if(tasks[d-1]==null || tasks[d-1].equals(""))
		 {
			 System.out.println("Task" + d+ "is already empty");
		 }
		 else{System.out.println("Task Deleted"+tasks[d-1].title );}
		 tasks[d-1]=null;
	 }
	 else{
		 System.out.println("Invalid task number!");
	 }
	 }
}

class todolist
{
public static void main(String ar[])
{
taskmng t1=new taskmng();
while(true)
{	
System.out.println();
System.out.println("TO Do List menu...");
System.out.println("1.Add task");
System.out.println("2.Show tasks ");
System.out.println("3.Mark complete");
System.out.println("4.Delete task");
System.out.println("5.Exit");

 System.out.println("Enter your choice\n");

Scanner sc=new Scanner(System.in);
int choice=sc.nextInt();
  
 
switch(choice)
{
	case 1:
	{
	System.out.println("add task");
	t1.addtask();
	
	break;
	}
	case 2:
	{
	System.out.println("Show task")	;
	t1.showtask();
	
	break;
	}
	case 3:
	{
	System.out.println("Mark task")	;
	t1.complete();
	break;
	}
	case 4:
	{
	System.out.println("Delete task");
	t1.taskdelete();
	break;
	}
	case 5:
	{
		System.exit(0);
	}
    default:
	{
	System.out.println("Invalid choice")	;
	break;
	}
}

}



}
}