

import java.util.Scanner;
public class Bank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 BankAccount o1=new BankAccount("Shivani pratap","Charming Girl");
 o1.showMenu();
	}

}
class BankAccount{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	       BankAccount(String cname,String cid){
	    	   customerName=cname;
	    	   customerId=cid;
	    	   
	       }
	            void deposit(int amount) {
	            	  if(amount!=0) {
	            		   balance=balance+amount;
	            		   previousTransaction=amount;
	            	  }
	            }
	             void withdraw(int amount) {
	            	 if(amount!=0) {
	            		 balance=balance-amount;
	            		 previousTransaction=-amount;
	            	 }
	            	 
	             }
	             void getPreviousTransaction() {
	            	 if(previousTransaction>0) {
	            		 System.out.println("Deposited:   "+previousTransaction);
	            	 }
	            	 else if(previousTransaction<0)
	            	 {
	            		 System.out.println("withdrawn:   "+Math.abs(previousTransaction));
	            	 }
	            	 else {
	            		    System.out.println("No transaction  occured");
	            	 }
	             }
	            void showMenu() {
	            	 char option='\0';
	            	 Scanner scanner=new Scanner(System.in);
	            	 System.out.println("welcome  "+customerName);
	            	 System.out.println("Your Id is      "+customerId);
	            	 System.out.println();
	            	 System.out.println("A.   Check Balance");
	            	 System.out.println("B.  Deposit");
	            	 System.out.println("C.    Withdraw");
	            	 System.out.println("D.  PreviousTransaction");
	            	 System.out.println("E.  Exit");
	            	 do {
	            		 System.out.println("==================");
	            		 System.out.println("Enter an option");
	            		 System.out.println("==================");
	            		 option=scanner.next().charAt(0);
	            		 System.out.println();
	            		 switch(option) {
	            		 case'A':
	            			    System.out.println("-------------");
	            			    System.out.println("Balance="+balance);
	            			    System.out.println("-------------");
	            			    System.out.println();
	            			    break;
	            		 case'B':
	            			    System.out.println("-------------");
	            			    System.out.println("Enter an amount to deposit");
	            			    System.out.println("-------------");
	            			    int amount=scanner.nextInt();
	            			    deposit(amount);
	            			    System.out.println();
	            			    break;
	            		 case'C':
	            			    System.out.println("------------");
	            			    System.out.println("Enter an amount to withdraw:");
	            			    System.out.println("-------------");
	            			    int amount2=scanner.nextInt();
	            			    withdraw(amount2);
	            			    System.out.println();
	            			    break;
	            		 case'D':
	            			  System.out.println("------------");
	            			  getPreviousTransaction();
	            			  System.out.println("------------");
	            			  System.out.println();
	            			  break;
	            		 case'E':
	            			   System.out.println("***********");
	            			   break;
	            		 default:
	            			   System.out.println("Invalid option! Please enter again");
	            			   break;
	            	 }
	            }        while(option!='E');
	            	 System.out.println("Thankyou for using our services!!!");
}
}