public class Main{

	void main(){
		
		IO.println("Wykład 03");
		
		IO.println((char)97);
		
		IO.println(9 == 8);
		
		int zm1 = 5;
		int zm2 = 6;
		
		String zm3 = (zm1 == zm2)?"Równe":"Różne";
		IO.println(zm3);
		
		IO.println((zm1 == zm2)?"Równe":"Różne");
		
		
		String zm4 = (zm1 == zm2)?"Równe":((zm1 < zm2)?"zm1 < zm2":"zm1 > zm2");
		IO.println(zm4);
		
		
		if (zm1 == zm2){
			IO.println("Równe");
			IO.println("ASD");
		}else{
			IO.println("Różne");
			IO.println("ASD2");
		}
		
		
		
		String day = "Monday";
		
		switch(day){
			case "Monday": 
						   System.out.println("Start of the week"); 
						   break;
			case "Friday": 
						   System.out.println("End of the week");
						   break;
			case "Saturday":
						   System.out.println("Weekend");
						   break;
			case "Sunday": 
						   System.out.println("Weekend");
						   break;
			default: System.out.println("Midweek");
		}


		String zm5 = switch(day){
			case "Monday": yield "Start of the week"; 
			case "Friday": yield "End of the week";
			case "Saturday": yield "Weekend";
			case "Sunday": yield "Weekend";
			default: yield "Midweek";
		};
		
		IO.println(zm5);
		
		zm5 = switch(day){
			case "Monday" -> "Start of the week"; 
			case "Friday" -> "End of the week";
			case "Saturday" -> "Weekend";
			case "Sunday" -> "Weekend";
			default -> "Midweek";
		};
		
		IO.println(zm5);

		switch(day){
			case "Monday" -> IO.println("Start of the week"); 
			case "Friday" -> IO.println("End of the week");
			case "Saturday", "Sunday" -> IO.println("Weekend");
			default -> IO.println("Midweek");
		};
		
		
		long a = 51231238123213123L;
		
		switch(a){
			case short val when val == a -> IO.println("short = 5");
			case int val when val == 5 -> IO.println("int = 5");
			default -> IO.println("N/D");
		}
		
	}

}