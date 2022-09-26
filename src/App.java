import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do lado de um quadrado: ");
        double lado = sc.nextDouble();

        sc.close();

        double dobroArea = (lado * lado) * 2;

        System.out.println("O dobro da área do quadrado é: "+dobroArea);   
    }
}