//instrukcja iteracyjna, instrukcja zaniechania i kontynuacji, typ wyliczeniowy 18.10.2026
public class Main1{

	//typ wyliczeniowy: zamknięty zbiór nazwanych stałych
	enum DniTygodnia{
		PONIEDZIALEK,
		WTOREK,
		SRODA,
		CZWARTEK,
		PIATEK,
		SOBOTA,
		NIEDZIELA
	}

	void main() {

		IO.println("Hello");
		// aplikacja jak zatrzyma się na pętli nieskończonej nie wykona dalszego kodu.

		int x = 0;

		while(x<5){ //pamiętaj o nawiasach klamrowych. Bez nawiasów wykona się tylko pierwsza instrukcja (IO.println), a x++ już poza pętlą -> pętla nieskończona.
			IO.println("Hello z pętli");
			x++;
			//++x / x+=1/x=x+1
		}

		//inkrementacja w warunku uważaj na wyniki:

		x = 0;

		while(x++ <5){ //porównuje STARĄ wartość, w środku x jest już zwiększone -> 1 2 3 4 5
			IO.println(x);
			//x++; /++x / x+=1/x=x+1
		}

		x = 0;

		while(++x <5){ //porównuje NOWĄ wartość -> 1 2 3 4
			IO.println(x);
			//x++; /++x / x+=1/x=x+1
		}

		x = 0;

		while(++x <5);{  //średnik po nawiasach okrągłych instrukcja pusta. Wykonuje sie inkrementacja w nawiasach a IO.println wykona się raz, po pętli -> 5
			IO.println(x);
			//x++; /++x / x+=1/x=x+1
		}


		//Pętla nieskończona
		//short sh = 0;
		//while(true){
		//	IO.println(sh++);
		//}
		// ctrl+c zatrzymanie pętli nieskończonej w terminalu


		//pętla do while rzadko używana. Gdy chcemy żeby instrukcje wykonały się przynajmniej raz

		IO.println("===========DO WHILE===========");

		x = 10;

		do{
			IO.println("do-while: " + x); //wykona się raz, mimo że warunek od początku jest false
			x++;
		}while(x < 5); //średnik na końcu!

		//Pętla for(deklaracja; warunek; wyrażenie)

		IO.println("===========FOR===========");

		for(int i=0; i < 5; i++){
			//i istnieje tylko w pętli
			IO.println("Hello");
		}

		//IO.println("Czy mamy i ?: "+i); //nie mamy

		x = 0;

		for(;x<5;x++){ // w for nie ma znaczenia czy robimy preinkrementacje czy postinkrementacje ++i / i++ w przeciwienstwie do while
			//x zadeklarowane poza pętlą, więc istnieje też po niej
			IO.println(x);
		}

		//for uzywamy gdy wiemy ile razy chcemy coś wykonać
		//while uzywamy gdy nie wiemy ile będzie powtórzeń, powtarzamy dopóki warunek jest spełniony


		//for(;;)  //pętla nieskończona bez break -> kod poniżej nigdy się nie wykona,
		//	IO.println(); //więc kompilator zgłasza błąd "unreachable statement"


		//Pętle zagnieżdżone

		for(int i = 1; i <=10; i++ ){
			//IO.println("i: " + i);
			for(int j = 1;j <=10;j++){
				IO.print(i*j);
				IO.print('\t');
			}
			IO.println();
		}

		//instrukcje zaniechania i kontynuacji
		//break; kończy całą pętlę (używamy w pętlach i w switch)
		//continue; pomija resztę bieżącego obrotu i przechodzi do następnego

		IO.println("===========BREAK / CONTINUE===========");

		for(int i = 1; i <= 10; i++){
			if(i == 7)
				break; //pętla kończy się przy 7
			if(i % 2 == 0)
				continue; //parzyste pomijamy
			IO.println(i); // 1 3 5
		}

		//uwaga: continue w while przed x++ -> pętla nieskończona
		x = 0;
		while(x < 10){
			x++; //zwiększamy PRZED continue
			if(x == 5)
				continue;
			IO.print(x + " "); // 1 2 3 4 6 7 8 9 10
		}
		IO.println();

		//typ wyliczeniowy

		IO.println("===========ENUM===========");

		DniTygodnia dzisiaj = DniTygodnia.NIEDZIELA;

		IO.println(dzisiaj);

		if(dzisiaj == DniTygodnia.SOBOTA || dzisiaj == DniTygodnia.NIEDZIELA){ //enum porównujemy przez ==
			IO.println("Weekend");
		}

		//DniTygodnia d = "SOBOTA"; //błąd kompilacji: String to nie DniTygodnia

		switch(dzisiaj){
			case SOBOTA, NIEDZIELA -> IO.println("weekend");
			default -> IO.println("midweek");
		}

		for(DniTygodnia d : DniTygodnia.values()){ //pętla for-each po wszystkich stałych
			IO.print(d + " ");
		}
		IO.println();
	}
}
