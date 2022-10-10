import java.util.Scanner;
import java.util.StringTokenizer;

public class BirthdayTokenizer {
    public static void main(String[] args) {
        System.out.println("What is your birthday (MM/DD/YYYY)");
        Scanner scanner = new Scanner(System.in);
        String birthday = scanner.nextLine();

        tokenizeBirthday(birthday);

    }

    static String[] tokenizeBirthday(String birthday) {
        String[] finalArr = null;
        StringTokenizer tokenizer = new StringTokenizer(birthday, "/");
        System.out.println(tokenizer.countTokens());

        return finalArr;
    }
}
