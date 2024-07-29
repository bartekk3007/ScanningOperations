import java.io.Console;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        double liczba = scanner.nextDouble();
        System.out.println(liczba);

        Console console = System.console();
        var login = console.readLine("Podaj login ");
        System.out.println(login);
        var haslo = console.readPassword("Podad hasło\n");
        System.out.println(haslo);

        System.out.printf("%8.2f", liczba);
    }
}