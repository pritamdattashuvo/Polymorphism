
public class Polymorphism_Class {

		public static void main(String args[]) {
			
			Calculator cal = new Calculator();
			int account1 = cal.add(10, 20);
			int account2 = cal.add(10, 20,30);
			double account3 = cal.add(20.00, 45.21, 12.25);
			double account4 = cal.add(10, 20.25);
			System.out.println(account1);
			System.out.println(account2);
			System.out.println(account3);
			System.out.println(account4);
			
		}
}