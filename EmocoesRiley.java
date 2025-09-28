import java.util.Scanner;

public class EmocoesRiley {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alegria = 0;
        int tristeza = 0;

        // 1️⃣ Novas amizades
        System.out.print("Riley fez novas amizades na cidade? (S/N): ");
        char fezAmizade = sc.next().charAt(0);

        int numAmizades = 0;
        if (fezAmizade == 'S' || fezAmizade == 's') {
            System.out.print("Quantas amizades Riley fez? ");
            numAmizades = sc.nextInt();
            alegria += numAmizades * 10;
        } else {
            tristeza += 30;
        }

        // 2️⃣ Provas na universidade
        System.out.println("\nDigite as notas das provas A1, A2 e A3 (cada uma vale 10):");
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double a3 = sc.nextDouble();

        double media = (a1 + a2 + a3) / 3;
        if (media >= 7) {
            alegria += 50;
        } else {
            tristeza += 50;
        }

        // 3️⃣ Algoritmos de programação
        System.out.println("\nQuantos exercícios de programação Riley conseguiu fazer? (0 a 10)");
        int exerciciosFeitos = sc.nextInt();

        // Cada exercício feito soma 10 para Alegria, cada não feito soma 10 para Tristeza
        alegria += exerciciosFeitos * 10;
        tristeza += (10 - exerciciosFeitos) * 10;

        // 4️⃣ Comparar emoções
        System.out.println("\n--- Resultado das emoções ---");
        System.out.println("Alegria: " + alegria + " pontos");
        System.out.println("Tristeza: " + tristeza + " pontos");

        if (alegria > tristeza) {
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else if (tristeza > alegria) {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        } else {
            System.out.println("A Riley teve uma experiência equilibrada entre alegria e tristeza.");
        }
    }
}