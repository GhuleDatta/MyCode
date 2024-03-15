import java.util.Scanner;
class BloodDonation
{
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter your Age:");
	int age=sc.nextInt();
	
	if(age<20){
	System.out.println("your not eligibale tray after:"+(20-age)+"Yr");
	}
	else if(age>20){
	System.out.print("Enter the Type of alcohol product consume in 24Hr by doner(yes/no):");
	String TypeAlco=sc.next().toLowerCase();
	if(TypeAlco.equals("yes")){
			System.out.print("You can't donet Booled:");
		}else if (TypeAlco.equals("no")){
			System.out.print("Enter your Weight in kg:");
			double Weight=sc.nextDouble();

			if (Weight<=50){
				System.out.print("eat some food and incrise your weight:"+(50-Weight)+"Kg");
				}
			else if(Weight>50){
				System.out.println("you can donate boolde:"+(Weight)+"_Kg");
				}
			System.out.println("****************thans************************");
		}
	
	}
    }
}	

/*System.out.print("Enter the Type of alcohol product consume in 24Hr by doner(yes/no):");
	
			
			if (Weight<=50){
				System.out.print("eat some food and incrise your weight:"+(50-Weight)+"Kg");
				}
			else if(Weight>50){
				System.out.print("you can donate boolde:"+(Weight)+"Kg");
				}
				else{
					System.out.print("error");
			}
		}
	}
}
		*/