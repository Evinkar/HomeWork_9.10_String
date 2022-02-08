import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName = " ";

        do {
            fullName = scanner.nextLine();
            if(!fullName.equals("exit")) {
                fullNameSeparation(fullName);
                System.out.println();
            } else {
                System.out.println("Конец программы");
            }
        }   while (!fullName.equals("exit"));
        scanner.close();
    }


    public static boolean spellCheck(String fullName) {

        char symbol;
        boolean check = false;

        for (int i = 0; i < fullName.length(); i++) {
            symbol = fullName.charAt(i);
            boolean containsLetter = Character.isLetter(symbol);
            if (symbol != ' ' && symbol != '-' && !containsLetter) {
                check = false;
                break;
            } else {
                check = true;
            }

        }
        return check;
    }

    public static void fullNameSeparation(String fullName) {
        if (spellCheck(fullName)) {
            String[] fullNameMassive = fullName.split("\\s");

            if (fullNameMassive.length == 3) {
                for (int i = 0; i < fullNameMassive.length; i++) {
                    switch (i) {
                        case (0) -> System.out.println("Фамилия: " + fullNameMassive[i]);
                        case (1) -> System.out.println("Имя: " + fullNameMassive[i]);
                        case (2) -> System.out.println("Отчество: " + fullNameMassive[i]);
                    }
                }
            } else {
                System.out.println("ФИО должен состоять из трех слов");

            }
        } else {
            System.out.println("ФИО должен состоять из слов без символов, через пробел");

        }

    }
}
