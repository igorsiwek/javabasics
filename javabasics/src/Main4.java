import java.util.Scanner;

public class Main4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imie?");
        String name = scanner.next();
        System.out.println("Jak masz na nazwisko?");
        String surname = scanner.next();
        System.out.println("Ile masz lat?");
        String age = scanner.next();
        System.out.println(name + surname + age);
    }
}
