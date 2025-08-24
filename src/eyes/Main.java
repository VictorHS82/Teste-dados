package eyes;

import java.util.Scanner;
import brain.*;

public class Main {

	static matematicaBasica art = new matematicaBasica();
	static Roll die = new Roll();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o dado você deseja rolar: /n");
		
		int lados = sc.nextInt();
		
		int a = art.somar(5, 12);
		System.out.println(a);
		
		int b = die.rolar(lados);
		System.out.println(b);
		
		sc.close();
	}

}
