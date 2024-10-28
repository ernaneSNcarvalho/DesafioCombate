package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeao: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		Champion c1 = new Champion(name, life, attack, armor);
		
		System.out.println("Digite os dados do segundo campeao: ");	
		sc.nextLine();
		System.out.print("Nome: ");		
		name = sc.nextLine();		
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		Champion c2 = new Champion(name, life, attack, armor);
		
		System.out.print("Quantos turnos voce deseja executar? ");
		int turnos = sc.nextInt();
		
		for(int i = 1; i <= turnos; i++) {			
			while(c1.getLife() > 0 && c2.getLife() > 0) {
				System.out.println("Resultado do turno " + i + ":");
				c1.takeDamage(c2);
				c2.takeDamage(c1);
				System.out.println(c1.status());
				System.out.println(c2.status());
			}			
		}
		
		System.out.println("FIM DO COMBATE");
		
		
		sc.close();
	}

}
