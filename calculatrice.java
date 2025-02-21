import java.util.Scanner;
public class Calculatrice {
    public double addition(float a, float b) {
        return a + b;
    }
    public double soustraction(float a, float b) {
        return a - b;
    }
    public double multiplication(float a, float b) {
        return a * b;
    }

    public double division(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("Erreur : Division par zéro");
        }
        return a / b;
    }
}

public class Test {

    public static void main(String[] args) {
        Calculatrice c= new Calculatrice();
        Scanner s = new Scanner(System.in);

        System.out.println("Bienvenue dans la calculatrice !");
        
        while (true) {
            System.out.println("Choisissez une choix : ");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quitter");

            int choix = scanner.nextInt();

            if (choix == 5) {
                System.out.println("Merci d'avoir utilisé la calculatrice !");
                break;
            }
            System.out.print("Entrez le premier nombre : ");
            double a = scanner.nextDouble();
            System.out.print("Entrez le deuxième nombre : ");
            double b = scanner.nextDouble();

            try {
                switch (choix) {
                    case 1:
                        System.out.println("Résultat : " + calc.addition(a, b));
                        break;
                    case 2:
                        System.out.println("Résultat : " + calc.soustraction(a, b));
                        break;
                    case 3:
                        System.out.println("Résultat : " + calc.multiplication(a, b));
                        break;
                    case 4:
                        System.out.println("Résultat : " + calc.division(a, b));
                        break;
                    default:
                        System.out.println("Choix invalide.");
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());  // Gérer l'exception de division par zéro
            }
        }

        scanner.close();
    }
}





