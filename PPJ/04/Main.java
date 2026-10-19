//instrukcja iteracyjna,instrukcja zaniechania i kontynuacjio, typ wyliczneiowy 18.10.2026
public class Main{
	void main() {
		
		IO.println("Hello");
		// aplikacja jak zatrzyma się na pętli nieskończonej nien wykona dalszego kodu.
		
		int x = 0;
	
		while(x<5){ //pamiętaj o nawiasach klamrowych. Bez nawiasów wykona się tylko pierwszy wiersz w tym przypadku nr 11.
			IO.println("Hello z pętli");
			x++;
			//++x / x+=1/x=x+1
		}
		
		//inkrementacja w warunku uważaj na wyniki:
		
		x = 0;
		
		while(x++ <5){
			IO.println(x);
			//x++; /++x / x+=1/x=x+1
		}
		
		x = 0;
		
		while(++x <5){
			IO.println(x);
			//x++; /++x / x+=1/x=x+1
		}
		
		x = 0;
		
		while(++x <5);{  //średnik po nawiasach okrągłych instrukcja pusta. Wykonuje sie inkrementacja w nawiasach a io.println wykona się po pętli.
			IO.println(x);
			//x++; /++x / x+=1/x=x+1
		}
		
		
		//Pętla nieskończona
		//short sh = 0;
		//while(true){
		//	IO.println(sh++);
		//}
		// ctr+c zatrzymanie pętli nieskończonej w terminalu
		
		
		//pętla do while rzadko używana . Gdy chcemy żeby instrukcje wykonały się przynajmiej raz
		
		//Pętla for(deklaracja, warunek, wyrażenie)
			
		IO.println("===========FOR===========");
		
		for(int i=0; i < 5; i++){ 
        //i istnieje tylko w pętli
			IO.println("Hello");
		}
		
		//IO.println("Czy mamy i ?: "+i); //nie mamy
		
		x = 0; 
		 
		for(;x<5;x++){ // w for nie ma znaczenia czy robimy preinkrementacje czy postinkrementacje ++i / i++ w przeciwienstwie do while
        //i istnieje tylko w pętli
			IO.println(x);
		}
		
		//for uzywamy gdy chcemy ileś razy coś wykonać
		//while uzywamy gdy jednorazowo chcemy pojedynczo sprawdzic jakis warunek
		
		
		for(;;)
			IO.println();
		
		
		//Pętle zagnieżdzone
		
		for(int i = 1; i <=10; i++ ){
			//IO.println("i: " + i);
			for(int j = 1;j <=10;j++){
				IO.print(i*j);
				IO.print('\t');
			}
			IO.println();
		}
		
		//instrukcje zaniechania i kontynuacji 
		// z break; korzystamy tylko w switch
		//kontynuacja continue; stos - dane ,sterta - instukcje. / 
	}
}