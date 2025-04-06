import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class listafeira {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedList<String> frutas = new LinkedList<>();

        System.out.println("Quais frutas deseja adicionar a lista?\n" );

        String input = scanner.nextLine();

        frutas.add(input);

        System.out.println("\nAs frutas adicionadas a lista foram: " + frutas);

        LinkedList<Double> precos = new LinkedList<Double>();

        System.out.println("\nDeseja adicionar preços as frutas?");

        double preco = scanner.nextDouble();

        precos.add(preco);

        System.out.println("\n Os preços adicionados foram: " + precos);

        System.out.println("\nA lista atualizada das frutas com os preços são: \n" + frutas + "R$" + precos);
    }
}
