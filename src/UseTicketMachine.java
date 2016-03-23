import java.util.Scanner;
public class UseTicketMachine {
	
	public static void main(String[] args){
		@SuppressWarnings("resource")
		double till_float = 0;
		double Paid = 0;
		double change = 0;
		Scanner scanner = new Scanner(System.in);
			TicketHandler Adult = new TicketHandler("Adult", 10);
			TicketHandler Child = new TicketHandler("Child", 5);
			TicketHandler Student = new TicketHandler("Student", 7);
			TicketHandler OAP = new TicketHandler("OAP", 8);
			
			TicketTypes ww2 = new TicketTypes("ww2", 300);
			TicketTypes roman = new TicketTypes("roman", 300);
			TicketTypes warhole = new TicketTypes("warhole" ,300);
			
		while(true){
			int choice = scanner.nextInt();
			TicketHandler TicketType = null;
			switch (choice) {
            case 1:  TicketType = Adult;
            	
            	System.out.println("Please Enter Amount of Adult tickets you want");
            	int d = scanner.nextInt();
            	System.out.println("Please Enter Desired Exhabition");
            	System.out.println("1: ww2");
            	System.out.println("2: roman");
            	System.out.println("3: warhole");
            	int choice2 = scanner.nextInt();
            	TicketTypes f = null;	
            	switch (choice2){
            		case 1: 
            			f = ww2;
            			break;
            		case 2: 
            			f = roman;
            			break;
            		case 3: 
            			f = warhole;
            			break;
            	}
            	if(f.left>0){
            	f.left = f.left - d;
            	double Price = TicketType.Price*d;
            	System.out.println(f.left);
            	System.out.println(Price);
				while(Paid  < Price){
				 double h = 0;
				 double g = 0;
				 System.out.println("Choose the amount given by the customer"+" 1 = 1p"+" 2 = 2p"+" 3 = 5p"+" 4 = 10p"+" 5 = 20p"+" 6 = 50p"+" 7 = £1"+" 8 = £2"+" 9 = £5"+" 10 = £10"+" 11 = $20"+" 12 = Input the amount given by the customer on youur own");
				int choice3 = scanner.nextInt();
				switch(choice3){
				 case 1:
					 System.out.println("1p");
					 g = 0.01;
					 break;
				 case 2:
					 System.out.println("2p");
					 g = 0.02;
					 break;
				 case 3:
					 System.out.println("5p");
					 g = 0.05;
					 break;
				 case 4:
					 System.out.println("10p");
					 g = 0.10;
					 break;
				 case 5:
					 System.out.println("20p");
					 g = 0.20;
					 break;
				 case 6:
					 System.out.println("50p");
					 g = 0.50;
					 break;
				 case 7:
					 System.out.println("£1");
					 g = 1;
					 break;
				 case 8:
					 System.out.println("£2");
					 g = 2;
					 break;
				 case 9:
					 System.out.println("£5");
					 g = 5;
					 break;
				 case 10:
					 System.out.println("£10");
					 g = 10;
					 break;
				 case 11:
					 System.out.println("£20");
					 g = 20;
					 break;
				 case 12:
					 System.out.println("Enter the amount given by the customer");
					 g = scanner.nextInt();
					 break;
				
					 
				 }
				Paid = Paid + g;
				System.out.println("Amount paid by ther customer = £"+ Paid);
				System.out.println("Amount still to pay = £"+ (Price - Paid));
				if(Paid>Price){
					change = Paid - Price;
				}
					
			
				}	
				till_float = till_float + (Paid - change);
				System.out.println("Change = £" + change);
				System.out.println("Till Float = £" + till_float);
				change = 0;
				Paid = 0;
				}
                     break;
            case 2:  TicketType = Child;
                     break;
            case 3:  TicketType = Student;
                     break;
            case 4:  TicketType = OAP;
            break;
            default: System.out.println("invalid ticket type");
                     break;
         		
			    
        }
			System.out.println(TicketType);
		}
}


}