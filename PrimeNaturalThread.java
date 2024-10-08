package assi8;

class PrimeNaturalNoPrint {

	public synchronized void sumFirstTenPrimes() {
		int count = 0;
		int number = 2;
		int sum = 0;

		while (count < 10) {
			if (isPrime(number)) {
				sum += number;
				count++;
			}
			number++;
		}

		System.out.println("Sum of first 10 prime numbers: " + sum);
	}

	private boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public synchronized void displayNaturalNo() {
		System.out.println("Natural numbers between 20 and 30:");
		for (int i = 20; i <= 30; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

class Task implements Runnable {
	private PrimeNaturalNoPrint printer;
	private int taskType;

	public Task(PrimeNaturalNoPrint printer, int taskType) {
		this.printer = printer;
		this.taskType = taskType;
	}

	@Override
	public void run() {
		if (taskType == 1) {
			printer.sumFirstTenPrimes();
		} else if (taskType == 2) {
			printer.displayNaturalNo();
		}
	}
}

public class PrimeNaturalThread {

	public static void main(String[] args) {

		PrimeNaturalNoPrint printer = new PrimeNaturalNoPrint();

		Thread thread1 = new Thread(new Task(printer, 1));
		Thread thread2 = new Thread(new Task(printer, 2));

		thread1.start();
		thread2.start();
	}

}
