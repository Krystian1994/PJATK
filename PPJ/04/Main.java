public class Main{

	void main(){
		
		IO.println("Wykład 04");
		
		//IO.println("Hello");
		//IO.println("Hello");
		//IO.println("Hello");
		//IO.println("Hello");
		//IO.println("Hello");
		
		
		int x = 0;
		
		while(x < 5){
			IO.println("Hello");
			x++;
			//++x;
			//x += 1;
			//x = x+1;
		}
		
		x = 0;
		
		while(x++ < 5){
			IO.println(x);
			//x++;
		}
		
		x = 0;
		
		while(++x < 5){
			IO.println(x);
			//x++;
		}
		
		
		x = 0;
		
		while(++x < 5);
		
		{
			IO.println(x);
		}
		
		//short sh = 0;
		
		//while(true){
		//	IO.println(sh++);
		//}
		
		IO.println("=-=-=-= for -=-=-=-=");
		
		for(int i = 10; i < 5; i++){
			IO.println("Hello");
		}
		
		//IO.println(i);
		//x = 0;
		
		//for(;;){
		//	IO.println(x++);
		//}
		
		for(int i = 0, j = 10; i < 5; i++, j *= 2){
			IO.println("Hello");
			IO.println(j);
		}
		
		
		for(int i = 1; i <= 10; i++){
			for(int j = 1; j <= 10; j++){
				IO.print(i * j);
				IO.print("\t");
			}
			IO.println();
		}
		
		for(int i = 0; i < 5; i++);
		
		
		//x = 0;
		//while(x < 10){
		//	if(x == 5)
		//		continue;
		//	
		//	IO.println(x);
		//	x++;
		//}
		
		enum DniTygodnia{
			PONIEDZIALEK,
			WTOREK,
			SRODA,
			CZWARTEK,
			PIATEK,
			SOBOTA,
			NIEDZIELA
		}
		
		DniTygodnia dzisiaj = DniTygodnia.NIEDZIELA;
		
		IO.println(dzisiaj);
		
		if(dzisiaj == DniTygodnia.SOBOTA || dzisiaj == DniTygodnia.NIEDZIELA){
			IO.println("Weekend");
		}
		
		String dzisiaj2 = "NiedzielA";
		
		IO.println(dzisiaj2);
		
		if(dzisiaj2 == "Sobota" || dzisiaj2 == "Niedziela"){
			IO.println("Weekend");
		}
		
		switch(dzisiaj){
			case SOBOTA -> IO.println("weekend");
			case NIEDZIELA -> IO.println("weekend");
			default -> IO.println("midweek");
		}
		
	}

}