import java.util.Scanner;

/*
 * LAB_03 – rozwiązania zadań 1–13.
 *
 * Kompilacja i uruchomienie (z linii poleceń, w folderze 03):
 *     javac Lab03.java
 *     java Lab03
 *
 * Zadania, które wymagają osobnych plików lub celowo się nie kompilują
 * (2, 3, 10, 12), są opisane w komentarzach razem z gotowym kodem do przetestowania.
 */
public class Lab03 {

	public static void main(String[] args) {
		zadanie1();
		zadanie4();
		zadanie5();
		zadanie6();		zadanie7();
		zadanie8();
		zadanie11();
		zadanie12();
		zadanie13();
		zadanie9(); // na końcu, bo czeka na dane z klawiatury
	}

	/*
	 * Zadanie 1
	 * Najprostsza aplikacja – plik Program1.java:
	 *
	 *     public class Program1 {
	 *         public static void main(String[] args) {
	 *             System.out.println("Hello world");
	 *         }
	 *     }
	 *
	 * Kompilacja:  javac Program1.java   -> powstaje Program1.class
	 * Uruchomienie: java Program1
	 */
	static void zadanie1() {
		System.out.println("=== Zadanie 1 ===");
		System.out.println("Hello world");
	}

	/*
	 * Zadanie 2
	 * a) main -> Main:
	 *    Kompilacja się udaje (Main to po prostu inna, poprawna metoda), ale uruchomienie nie:
	 *    "Error: Main method not found in class Program1, please define the main method as:
	 *        public static void main(String[] args)"
	 * b) main -> pjatk: dokładnie to samo – kompiluje się, nie da się uruchomić.
	 *
	 * Wniosek: Java rozróżnia wielkość liter, a JVM szuka punktu wejścia
	 * o nazwie dokładnie "main". Dla kompilatora nazwa metody jest dowolna,
	 * ale bez metody main nie ma od czego zacząć wykonywania programu.
	 */

	/*
	 * Zadanie 3
	 * W pliku Program1.java zmieniamy "public class Program1" na np. "public class Witaj".
	 * Kompilacja kończy się błędem:
	 *     error: class Witaj is public, should be declared in a file named Witaj.java
	 *
	 * Powód: klasa publiczna musi być zapisana w pliku o tej samej nazwie co klasa.
	 * (Gdyby usunąć słowo public, kompilacja by przeszła, ale powstałby plik Witaj.class
	 * i program trzeba by uruchamiać poleceniem "java Witaj".)
	 */

	// Zadanie 4
	static void zadanie4() {
		System.out.println("\n=== Zadanie 4 ===");

		// wszystkie literały logiczne
		System.out.println(true);
		System.out.println(false);

		// ta sama liczba (42) w różnych systemach liczbowych
		System.out.println(42);         // dziesiętnie
		System.out.println(052);        // ósemkowo (oktalnie) – prefiks 0
		System.out.println(0x2A);       // szesnastkowo – prefiks 0x
		System.out.println(0b101010);   // binarnie – prefiks 0b

		// literały liczb rzeczywistych
		System.out.println(3.14);       // double
		System.out.println(2.5f);       // float
		System.out.println(1.5e3);      // notacja naukowa = 1500.0

		// literały znakowe
		System.out.println('A');
		System.out.println('ą');   // UTF-16: 'ą'
		System.out.println('Ω');   // UTF-16: 'Ω'
	}

	// Zadanie 5 – tabela prawdy dla && i ||
	static void zadanie5() {
		System.out.println("\n=== Zadanie 5 ===");
		System.out.println("a\tb\ta && b\ta || b");
		System.out.println("false\tfalse\t" + (false && false) + "\t" + (false || false));
		System.out.println("false\ttrue\t" + (false && true) + "\t" + (false || true));
		System.out.println("true\tfalse\t" + (true && false) + "\t" + (true || false));
		System.out.println("true\ttrue\t" + (true && true) + "\t" + (true || true));
	}

	/*
	 * Zadanie 6
	 * Jako osobny plik Underscore.java:
	 *
	 *     public class Underscore {
	 *         public static void main(String[] args) {
	 *             System.out.println(1000000);
	 *             System.out.println(1_000_000);
	 *         }
	 *     }
	 *
	 * Wydrukowana liczba się NIE zmienia – w obu przypadkach 1000000.
	 * Podkreślniki w literałach liczbowych służą tylko czytelności kodu, kompilator je pomija.
	 */
	static void zadanie6() {
		System.out.println("\n=== Zadanie 6 ===");
		System.out.println(1000000);
		System.out.println(1_000_000);
	}

	// Zadanie 7 – operacje +, -, *, /, % na int, double i char
	static void zadanie7() {
		System.out.println("\n=== Zadanie 7 ===");

		int i1 = 17, i2 = 5;
		System.out.println("int:    " + i1 + " i " + i2);
		System.out.println("  +  " + (i1 + i2));
		System.out.println("  -  " + (i1 - i2));
		System.out.println("  *  " + (i1 * i2));
		System.out.println("  /  " + (i1 / i2));   // 3 – dzielenie całkowite, część ułamkowa obcięta
		System.out.println("  %  " + (i1 % i2));   // 2 – reszta z dzielenia

		double d1 = 17.0, d2 = 5.0;
		System.out.println("double: " + d1 + " i " + d2);
		System.out.println("  +  " + (d1 + d2));
		System.out.println("  -  " + (d1 - d2));
		System.out.println("  *  " + (d1 * d2));
		System.out.println("  /  " + (d1 / d2));   // 3.4 – zwykłe dzielenie
		System.out.println("  %  " + (d1 % d2));   // 2.0 – reszta działa też na liczbach rzeczywistych

		char c1 = 'a', c2 = 'B';                  // 'a' = 97, 'B' = 66
		System.out.println("char:   " + c1 + " i " + c2);
		System.out.println("  +  " + (c1 + c2));   // 163 – char jest promowany do int
		System.out.println("  -  " + (c1 - c2));   // 31
		System.out.println("  *  " + (c1 * c2));   // 6402
		System.out.println("  /  " + (c1 / c2));   // 1
		System.out.println("  %  " + (c1 % c2));   // 31
		System.out.println("  (char)(c1 + 1) = " + (char) (c1 + 1)); // 'b' – rzutowanie z powrotem na char
		// Wniosek: działania na char wykonywane są na kodach znaków, a wynik ma typ int.
	}

	/*
	 * Zadanie 8
	 * 1_500_000_000 + 1_500_000_000 = 3_000_000_000 > Integer.MAX_VALUE (2_147_483_647),
	 * więc następuje przepełnienie i wynik to -1294967296.
	 * Rozwiązanie: użyć typu long (dla zmiennych albo przynajmniej dla jednego składnika sumy).
	 */
	static void zadanie8() {
		System.out.println("\n=== Zadanie 8 ===");
		int a = 1_500_000_000;
		int b = 1_500_000_000;
		System.out.println("int:  a + b = " + (a + b));          // -1294967296 (przepełnienie)
		System.out.println("long: a + b = " + ((long) a + b));   // 3000000000

		long la = 1_500_000_000;
		long lb = 1_500_000_000;
		System.out.println("long: la + lb = " + (la + lb));     // 3000000000
	}

	/*
	 * Zadanie 9
	 * Pięć liczb, maksymalnie trzy zmienne int, bez pętli i tablic.
	 * Zmienne "przesuwamy" – najstarsza wartość wypada, na jej miejsce wchodzi nowa.
	 */
	static void zadanie9() {
		System.out.println("\n=== Zadanie 9 ===");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj 5 liczb całkowitych:");

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println("Suma: " + (a + b + c));

		a = b;
		b = c;
		c = scanner.nextInt();
		System.out.println("Suma: " + (a + b + c));

		a = b;
		b = c;
		c = scanner.nextInt();
		System.out.println("Suma: " + (a + b + c));
	}

	/*
	 * Zadanie 10
	 * Każdy program w osobnym pliku, np.:
	 *     public class hello { public static void main(String[] args) { System.out.println("hello"); } }
	 *
	 *   hello / hello.java          – dozwolone (działa, ale niezgodne z konwencją)
	 *   HELLO / HELLO.java          – dozwolone (działa, ale niezgodne z konwencją)
	 *   Hello / Hello.java          – dozwolone i ZALECANE (konwencja PascalCase)
	 *   hELLO / hELLO.java          – dozwolone (działa, ale niezgodne z konwencją)
	 *   _Hello, $Hello              – dozwolone ($ i _ to jedyne znaki specjalne, którymi można zacząć)
	 *   !Hello, @Hello, #Hello, ... – NIEDOZWOLONE – błąd kompilacji
	 *   (sam "_" jest słowem zarezerwowanym od Javy 9 i nie może być nazwą)
	 *   1Hello / 1Hello.java        – NIEDOZWOLONE – identyfikator nie może zaczynać się cyfrą
	 *   Hello1 / Hello1.java        – dozwolone – cyfry mogą być dalej w nazwie
	 *
	 * Zasady nazewnictwa klas:
	 *   - nazwa to identyfikator: litery, cyfry, _ i $; nie może zaczynać się cyfrą,
	 *   - nie może być słowem kluczowym (class, int, public, ...),
	 *   - wielkość liter ma znaczenie (Hello ≠ hello),
	 *   - klasa publiczna musi mieć nazwę identyczną z nazwą pliku .java,
	 *   - konwencja: PascalCase – każdy wyraz od wielkiej litery (np. HelloWorld).
	 */

	/*
	 * Zadanie 11
	 * HelloOne (print) wypisuje wszystko w jednej linii:
	 *     Hello student!Hello PJATK!Hello world!
	 * HelloTwo (println) po każdym tekście przechodzi do nowej linii:
	 *     Hello student!
	 *     Hello PJATK!
	 *     Hello world!
	 * Różnica: println dodaje na końcu znak nowej linii, print – nie.
	 */
	static void zadanie11() {
		System.out.println("\n=== Zadanie 11 ===");
		System.out.print("Hello student!");
		System.out.print("Hello PJATK!");
		System.out.print("Hello world!");
		System.out.println();
		System.out.println("Hello student!");
		System.out.println("Hello PJATK!");
		System.out.println("Hello world!");
	}

	/*
	 * Zadanie 12
	 * Program, który się nie skompiluje:
	 *
	 *     public class TooBig {
	 *         public static void main(String[] args) {
	 *             System.out.println(3000000000);   // error: integer number too large
	 *         }
	 *     }
	 *
	 * Literał całkowity bez sufiksu jest typu int (max 2_147_483_647).
	 * Dopisanie sufiksu L (3000000000L) zmienia typ literału na long, więc kompilacja się uda.
	 * Lepiej używać dużego L – małe l łatwo pomylić z cyfrą 1.
	 * (Dla liczby większej niż Long.MAX_VALUE sufiks też nie pomoże.)
	 */
	static void zadanie12() {
		System.out.println("\n=== Zadanie 12 ===");
		System.out.println(3000000000L);
	}

	/*
	 * Zadanie 13
	 * 2 * 3 * ... * 17 = 17! = 355687428096000, ale wszystkie literały są typu int,
	 * więc mnożenie odbywa się na int i dochodzi do przepełnienia – wynik to -288522240.
	 * Poprawka (jeden znak): dopisać L do pierwszego literału – 2L * 3 * ... * 17.
	 * Wtedy całe wyrażenie liczone jest na long.
	 */
	static void zadanie13() {
		System.out.println("\n=== Zadanie 13 ===");
		System.out.println(2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17);  // -288522240
		System.out.println(2L * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17); // 355687428096000
	}
}
