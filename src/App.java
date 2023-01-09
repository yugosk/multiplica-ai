import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num;

        System.out.println("Insira um número inteiro: ");
        num = myObj.nextInt();

        System.out.println("Tabela de multiplicação de X: ");
        for (int i = 1; i<11; i++) {
            int result = num * i;
            System.out.println(result);
        }
    }
}
