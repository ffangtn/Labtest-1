import java.util.Scanner;
public class labtest1 {

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		
		System.out.println("Question 1");
		System.out.println("Enter the number of items: ");
		int num = in.nextInt();
		System.out.println("Enter price of first item: RM");
		int price1 = in.nextInt();
		System.out.println("Enter quamtity of first item: ");
		int quantity1 = in.nextInt();

		System.out.println("Enter price of second item: RM");
		int price2 = in.nextInt();
		System.out.println("Enter quantity of second item: ");
		int quantity2 = in.nextInt();
		
		System.out.println("Enter price of third item: RM");
		int price3 = in.nextInt();
		System.out.println("Enter quantity of third item: ");
		int quantity3 = in.nextInt();
		
		int totalprice = ((price1*quantity1) + (price2*quantity2) + (price3*quantity3));
		System.out.println("Total price : RM" + totalprice);
		
		if( totalprice> 100) {
			double discount = (totalprice *0.2);
			System.out.println("Discount received : RM " + discount);
			double paid = (totalprice-discount);
			System.out.println("Price to be paid : RM " + paid);
		}
		else if( totalprice< 100) {
			double discount = (totalprice *0.1);
			System.out.println("Discount received : RM " + discount);
			double paid = (totalprice-discount);
			System.out.println("Price to be paid : RM " + paid);
		}
		System.out.println();
		System.out.println("Question 2");
		System.out.println("Enter sales : RM ");
		int sales = in.nextInt();
		
		System.out.println("Enter hours worked : ");
		int hours = in.nextInt();
		
		if(sales>= 150 && sales<=300 ) {
			double comission = (sales *0.05);
			System.out.println("Comission : RM "+ comission);
			double wages = (hours*5);
			double dailywages = (wages + comission );
			System.out.println("Daily wages : RM " + dailywages);

		}
		else if(sales>=301 && sales<=500) {
			double comission = (sales *0.1);
			System.out.println("Comission : RM " + comission);
			double wages = (hours*5);
			double dailywages = (wages + comission );
			System.out.println("Daily wages : RM " + dailywages);

		}
		else if(sales>500) {
			double comission = (sales *0.15);
			System.out.println("Comission : RM " + comission);
			double wages = (hours*5);
			double dailywages = (wages + comission );
			System.out.println("Daily wages : RM " + dailywages);

		}
				
		
	}

}

