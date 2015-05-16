package KataProgramming;

import java.util.Scanner;

public class Client {

	private static Scanner in;

	public static void main(String[] args) {

		System.out.println("Choisir votre programme : ");
		System.out.println("Pour QuickFind taper : 1");
		System.out.println("Pour QuickUnion taper : 2");
		System.out.println("Pour QuickUnionWeighted taper : 3");
		System.out.println("Pour StackOfString taper : 4");
		
		
		in = new Scanner(System.in);
		int choix = in.nextInt();
		switch (choix) {
		case 1:
			quickFind();
			break;
		case 4:
			stackOfString();
			break;			

		default:
			break;
		}
		

	}

	private static void stackOfString() {
		
		StackOfString stack = new StackOfString();
		
		while (in.hasNext()) {					
			String s = in.next();

			if (s.equals("-")) {
				System.out.println(stack.pop());
			}else{
				stack.push(s);
			}
		
		}
		
	}

	private static void quickFind() {
		System.out.println("Entrer un nombre pour la taille de votre tableau : ");
		int N = in.nextInt();
		
		QuickFind qf = new QuickFind(N);

		System.out.println("Entrer deux nombre : ");
		while (in.hasNextInt()) {
			
			int p = in.nextInt();
			int q = in.nextInt();

			if (!qf.connected(p, q)) {
				qf.union(p, q);
				System.out.println(p + " " + q);
			}

		}
	}

}
