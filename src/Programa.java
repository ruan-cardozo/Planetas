import java.util.Scanner;

public class Programa {
    public static void main(String args[]) {
        SistemaSolar solar = new SistemaSolar();
        Planeta[] planetas = solar.getPlanetas();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu peso em kg: ");
        double peso = scanner.nextDouble();

        for (int i = 0; i < planetas.length ; i++) {
            System.out.println(i + ". " + planetas[i].getNome());
        }

        System.out.print("Digite o número do planeta escolhido: ");
        int indexPlaneta = scanner.nextInt();

        if (indexPlaneta < 0 || indexPlaneta >= planetas.length) {
            System.out.println("Planeta inválido!");
    } else {
            Planeta p = planetas[indexPlaneta];
            System.out.println("Seu peso no planeta " + p.getNome() + " é de " + p.getPeso(peso) + " Newtowns.");
        }

        scanner.close();
    }
}
