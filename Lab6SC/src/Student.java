import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;
public class Student 
{
	
	
	public static void main(String args[])
	{
		float take=(float) 2.5;
		Object[][] arr = new Object[6][3];
		
		for(int i=0;i<6;i++)
		{
			take+=0.1;
			arr[i][0]="a";
			arr[i][1]=i+1;
			arr[i][2]=take;
			
		}
		
		Scanner s =new Scanner(System.in);
		  for (int i=0; i<6;i++)	
		  {
			    System.out.println("Enter the name ");
				String name=s.nextLine();
				arr[i][0]=name;
				int reg;
				
			
				boolean com =false;
				while(com == false)
				{
					
					System.out.println("Enter the registration number ");
					reg =Integer.parseInt(s.nextLine());
				for( int j=0;j<6;j++)
				{
					if(reg == (int) arr[j][1])
					{   System.out.println("Invalid registration number");
					    com=false;
						break;
						
					}
					else {com=true;}
					
				}
				arr[i][1]=reg;
				
				
				}
				float gpa= -1;
				System.out.println("Enter the CGpa ");
				gpa =Float.parseFloat(s.nextLine());
				while(gpa<0.0 || gpa>4.0)
				{ 
					
					System.out.println("Invalid CGPA");
					System.out.println("Enter the CGpa again ");
					gpa =Float.parseFloat(s.nextLine());
				}
				
				arr[i][2]=gpa;
				
		  }

	  for(int i=0;i<6;i++)
	  {
		  System.out.println("Name "+arr[i][0]);
		  System.out.println("registration number "+arr[i][1]);
		  System.out.println("GPA "+arr[i][2]);
	  }
	 
		float[] GPA=new float[6];
		for(int i=0;i<6;i++)
		{
			GPA[i]=(float)arr[i][2];
		}
		
		Arrays.sort(GPA);
		float max=GPA[5];
		
		System.out.println("Max CGPA "+max);
		
		float min=GPA[0];
		 System.out.println("Min CGPA "+min); 
	 float sum=0;
	 for(int i=0;i<6;i++)
	  {
		  
			 sum+=(float)arr[i][2];
		  
	  }
	 float avg=sum/6;
	 System.out.println("Average CGPA "+avg);
	 
	 for(int i=0;i<6;i++)
	  {
		  
			if((float)arr[i][2]<avg)
			{
				System.out.println("Name "+arr[i][0] +" with GPA "+arr[i][2]+ " has less GPA than Avg ");
			}
		  
	  }

	String sname;
	int regno=0;
	System.out.println("Select 1 to enter student name or 2 to enter register no and select 0 to exit ");
	int option=Integer.parseInt(s.nextLine());
	boolean flag=false;
	
	switch(option)
	{
	case 1:
		System.out.println("Enter name ");
		sname=s.nextLine();
		
		for(int i=0;i<6;i++)
		{
			if(sname.equals((String)arr[i][0]))
			{
				System.out.println("Record present ");
				System.out.println("GPA of "+arr[i][0]+"is "+arr[i][2]);
				for(int j=0;j<6;j++)
				{
					if(GPA[j]==(float)arr[i][2])
					{
						System.out.println("Rank of "+arr[i][0]+"is "+(6-j));
						break;
					}
				}
				flag=true;
				break;
			}
			
		}
		
		if(flag==false)
		{
			System.out.println("Record not present ");
		}
		break;
	case 2:
		flag=false;
		System.out.println("Enter regno ");
		regno=Integer.parseInt(s.nextLine());
		for(int i=0;i<6;i++)
		{
			if(regno== (int)arr[i][1])
			{
				System.out.println("Record present ");
				System.out.println("GPA of "+arr[i][0]+"is "+arr[i][2]);
				for(int j=0;j<6;j++)
				{
					if(GPA[j]==(float)arr[i][2])
					{
						System.out.println("Rank of "+arr[i][0]+"is "+(6-j));
						break;
					}
				}
				flag=true;
				break;
			}
			
		}
		
		if(flag==false)
		{
			System.out.println("Record not present");
		}
		System.out.println("End Searching");
		break;
		
	case 0:
		break;
	default:
		System.out.println("Invalid Input");
		break;
		
	}
			
	 
	}}

