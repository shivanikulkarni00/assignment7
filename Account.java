package assi8;

	import java.util.ArrayList;
	public class Account {
	
	   
	    private int accNo;
	    private String name;
	    private double balance;

	    
	    public Account(int accNo, String name, double balance) {
	        this.accNo = accNo;
	        this.name = name;
	        this.balance = balance;
	    }

	
	    public int getAccNo() {
	        return accNo;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getBalance() {
	        return balance;
	    }

	  
	    public void displayAccountInfo() {
	        System.out.println("Account Number: " + accNo);
	        System.out.println("Account Holder: " + name);
	        System.out.println("Account Balance: " + balance);
	        System.out.println("--------------------------");
	    }

	    public static void main(String[] args) {
	    
	        ArrayList<Account> accountList = new ArrayList<>();

	    
	        accountList.add(new Account(1001, "Shivani Kulkarni", 50000.0));
	        accountList.add(new Account(1002, "Amit Sharma", 75000.0));
	        accountList.add(new Account(1003, "Pooja Desai", 62000.0));
	        accountList.add(new Account(1004, "Rahul Patil", 47000.0));
	        accountList.add(new Account(1005, "Sneha Mehta", 83000.0));
	        accountList.add(new Account(1006, "Raj Verma", 29000.0));

	       
	        for (Account account : accountList) {
	            account.displayAccountInfo();
	        }
	    }
	}


