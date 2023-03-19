import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method2();

    }

    public static void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira  a quantidade de nomes que serão colocados: ");
        try {
            int n = sc.nextInt();
            String[] name = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Insira um nome: ");
                name[i] = sc.next();
            }

            System.out.println("Qual a posicao que voce deseja consultar: ");
            int j = sc.nextInt();

            System.out.println(name[j - 1]);
        } catch (InputMismatchException e) {
            System.out.println("Voce inseriu um valor errado, tente novamente.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Essa posicao nao existe");
            //Para trackear, buscar onde esta a excecao
            e.printStackTrace();

        }
        System.out.println("End of program");
    }
}
