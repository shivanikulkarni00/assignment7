package assi8;


	import java.util.ArrayList;
	import java.util.Iterator;

	class Account1 {
	    private int accNo;
	    private String name;
	    private double balance;

	    public Account1(int accNo, String name, double balance) {
	        this.accNo = accNo;
	        this.name = name;
	        this.balance = balance;
	    }

	  
	    public String getName() {
	        return name;
	    }

	    @Override
	    public String toString() {
	        return "Account[AccNo: " + accNo + ", Name: " + name + ", Balance: " + balance + "]";
	    }
	}

	class Emp {
	    private int empId;
	    private String empName;
	    private double salary;

	    public Emp(int empId, String empName, double salary) {
	        this.empId = empId;
	        this.empName = empName;
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return "Emp[EmpId: " + empId + ", Name: " + empName + ", Salary: " + salary + "]";
	    }
	}
	public class Main {
	    public static void main(String[] args) {
	      
	        ArrayList<Object> list = new ArrayList<>();

	     
	        list.add(new Account(1001, "Shivani ", 50000.0));
	        list.add(new Account(1002, "Amita ", 75000.0));

	      
	        list.add(new Emp(201, "Rohini", 55000.0));
	        list.add(new Emp(202, "Sneha ", 65000.0));

	    
	        list.add("Pooja ");
	        list.add("Rani");
	        list.add("Anita ");

	    
	        System.out.println("All Objects:");
	        for (Object obj : list) {
	            System.out.println(obj);
	        }

	      
	        list.remove(2); 
	        System.out.println("\nAfter removing 3rd object:");
	        for (Object obj : list) {
	            System.out.println(obj);
	        }

	   
	        String nameToCheck = "Rani";
	        if (list.contains(nameToCheck)) {
	            System.out.println("\n\"" + nameToCheck + "\" is present in the list.");
	        } else {
	            System.out.println("\n\"" + nameToCheck + "\" is not present in the list.");
	        }

	       
	        System.out.println("\nDisplaying all objects using Iterator:");
	        Iterator<Object> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	       
	        list.clear();

	     
	        if (list.isEmpty()) {
	            System.out.println("\nAll objects deleted, list is empty.");
	        } else {
	            System.out.println("\nList is not empty.");
	        }
	    }
	}
