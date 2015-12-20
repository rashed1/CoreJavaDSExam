package month.design;

public class MonthsC {
	
	public void whichMonth(Month month){

        switch(month){

            case January:
            	System.out.println("Let's celebrate New Year");
	            break;
	        case February:
	            System.out.println("Let's celebrate Valentine's Day");
	            break;
	        case March:
	            System.out.println("Let's celebrate St. Patricks's Day");
	            break;
	        case April:
	            System.out.println("Let's celebrate Easter");
	            break;
	        case May:
	            System.out.println("Let's celebrate Mother's Day");
	            break;
	        case June:
	            System.out.println("Let's celebrate Father's Day");
	            break;
	        case July:
	            System.out.println("Let's celebrate Independence Day");
	            break;
	        case August:
	            System.out.println("Let's celebrate Senior Citizen Day");
	            break;
	        case September:
	            System.out.println("Let's celebrate Labor Day");
	            break;
	        case October:
	            System.out.println("Let's celebrate Halloween");
	            break;
	        case November:
	            System.out.println("Let's celebrate Thanksgiving");
	            break;
	        case December:
	            System.out.println("Let's celebrate Christmas");
	            break;  
	        default:
	            System.out.println("We celebarate at least one ocassion every month");
	            break; 



        }
    }
	
}
