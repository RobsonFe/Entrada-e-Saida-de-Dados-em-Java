import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario1, salario2;
		String nome1, nome2;
		int idade1, idade2;
		char sexo1, sexo2; 
		
		 System.out.print ("Nome da primeira pessoa: ");
		 nome1 = sc.nextLine();
		 System.out.print ("Idade: "); 
		 idade1 = sc.nextInt();
		 System.out.print("Sexo (F/M): ? ");
		 sexo1 = sc.next().charAt(0);
		 System.out.print("Salario da primeira pessoa ? ");
		 salario1 = sc.nextDouble(); 
		 		
		 System.out.println();
		 
		 System.out.print("Nome da segunda pessoa: ");
		 sc.nextLine();
		 nome2 = sc.nextLine();
		 System.out.print("Idade: ");
		 idade2 = sc.nextInt();
		 System.out.print("Sexo F/M: ? ");
		 sexo2 = sc.next().charAt(0);
		 System.out.print("Salario da segunda pessoa ? ");
		 salario2 = sc.nextDouble(); 
		 
		 System.out.println();
		 
		 System.out.println("Nome da primeira pessoa: " + nome1);
		 System.out.println("Idade da primeira pessoa " + idade1);
		 System.out.println("Sexo: " + sexo1);
		 System.out.println("Salario da primeira pessoa " + salario1);
		 
		 System.out.println();
		 
		 System.out.println("Nome da segunda pessoa: " + nome2);
		 System.out.println("Idade da segunda pessoa: " + idade2);
		 System.out.println("Sexo: " + sexo2);
		 System.out.println("Salario da segunda pessoa " + salario2);
		 
		 
		 
 sc.close();
	}

}
