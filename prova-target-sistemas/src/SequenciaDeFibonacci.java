import java.util.Scanner;

public class SequenciaDeFibonacci {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int opcao = 0;

		do {
			System.out.println("Vamos la!");
			System.out.println("Qual numero voce deseja saber se pertence a sequencia de Fibonacci? ");
			int num = input.nextInt();

			int anterior = 0;
			int atual = 1;
			int proximo = 1;

			while (proximo < num) {
				proximo = anterior + atual;
				anterior = atual;
				atual = proximo;
			}

			if (proximo == num) {
				System.out.printf("%d pertence à sequência de Fibonacci.%n", num);
			} else {
				System.out.printf("%d não pertence à sequência de Fibonacci.%n", num);
			}

			System.out.println("Deseja consultar outro numero? Digite 0. Se deseja finalizar qualquer outra tecla");
			opcao = input.nextInt();
		} while (opcao == 0);

		input.close();
	}

}

