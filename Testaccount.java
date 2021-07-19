package week2project;

import java.util.Scanner;
  class account {
		  Scanner c=new Scanner(System.in);
		int acc_no;
		String name; 
	    int amount;  

		//Method to initialize object  

		 void getdata(){  
		System.out.println("Account No is" );
	    acc_no=c.nextInt();
	    System.out.println("Name is ");
	    name=c.next();
	    System.out.println("Amount  is ");	
	    amount=c.nextInt();
	    

		}  
		 void putdata()
		    {
		        System.out.println("Account nunmber::"+acc_no);
		        System.out.println("name is::"+name);
		        System.out.println("amount is::"+amount);
		    }
  }

		//deposit method  
class operation extends account{
		void deposit(){  
			 System.out.println("Deposit is");
	    int amt=c.nextInt();
		amount=amount+amt;  

		System.out.println(amt+" deposited");  

		}  

		//withdraw method  

		void withdraw(){  
			System.out.println("The amount to be withdrawn");
		 int withdraw_amt=c.nextInt();
		if(amount<withdraw_amt){  
			System.out.println("Insufficient Balance");  

		}else{  

		amount=amount-withdraw_amt;  

		System.out.println(withdraw_amt+" withdrawn");  

		}  

		}  

		//method to check the balance of the account  

		void checkBalance(){
			System.out.println("Balance is: "+amount);

		}  

		//method to display the values of an object  

		void display(){

		System.out.println(name+" has currently total balance of "+ amount);

		                    

		}  
		void exit() {
			
			System.out.println("Exited from banking operation");
		}
}

		 

	public	class Testaccount{  

		public static void main(String[] args){  

		operation a1=new operation();  

		a1.getdata();
		a1.putdata();
		a1.deposit(); 
		a1.withdraw();
		  
	    a1.checkBalance();  
		a1.display();
		a1.exit();


	}

	}


