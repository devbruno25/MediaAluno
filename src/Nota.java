import java.text.DecimalFormat;
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double result;

        System.out.println("Digite a nota da primeira avaliação: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a nota da Segunda avaliação: ");
        double nota2 = scan.nextDouble();

        System.out.println("Digite a nota do trabalho: ");
        double test = scan.nextDouble();

        result = nota1 + nota2 + test / 3;

        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorFormatado = decimal.format(result);

        System.out.println("O resultado é: " + valorFormatado);

        if (result >= 60) {
            System.out.println("Você esta APROVADO!");
        } else if (result < 60) {
            System.out.println("Você esta REPROVADO");
        }
    }
}