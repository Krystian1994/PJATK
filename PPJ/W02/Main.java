public class Main{

	void main(){
		
		IO.println("Wykład 02");
		
		IO.println(true);
		IO.println(false);
		
		IO.println(10);
		IO.println(0b1010101010);
		IO.println(0234);
		IO.println(0xFF);
		
		
		IO.println(3.14);
		IO.println(3.);
		IO.println(.14);
		IO.println(3d);
		IO.println(3D);
		IO.println(3f);
		IO.println(3F);
		
		IO.println(123123123123123L);
		IO.println(123123123123123l);
		
		IO.println('a');
		IO.println('\123');
		IO.println('\124');
		IO.println('\uFFF0');
		IO.println('\uFFFF');
		
		IO.println(!true);
		IO.println(true&&false);
		IO.println(true&&true);
		IO.println(true||true);
		IO.println(true||false);
		IO.println(false||false);
		
		boolean b1 = false;
		boolean b2;
		b2 = true;
		
		IO.println(b1);
		IO.println(b2);
		
		byte b3 = 125;
		IO.println(b3);
		
		long l1 = 12312312312312321L;
		
		IO.println(l1);
		
		
		int a1 = 2000000000;
		int a2 = 2000000000;
		
		IO.println(a1 + a2);
		
		double d1 = 3.14;
		float f1 = 3.14F;
		
		char c1 = 'a';
		
		IO.println(c1);
		
		char c2 = 98;
		
		IO.println(c2);
		
	}

}