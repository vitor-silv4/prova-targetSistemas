package resultados;
import java.util.Scanner;

public class StringInvertida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Vamos la!");
		System.out.println("Palavra voce quer que eu inverta? ");
        String str = input.nextLine();

        String strInvertida = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            strInvertida += str.charAt(i);
        }

        System.out.println("Palavra invertida: " + strInvertida);
    }
}
