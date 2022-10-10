import java.util.Scanner;
import java.util.StringTokenizer;

public class BirthdayTokenizer {
    public static void main(String[] args) {
        System.out.println("What is your birthday (MM/DD/YYYY)");
        Scanner scanner = new Scanner(System.in);
        String birthday = scanner.nextLine();

        String[] tokens = tokenizeBirthday(birthday);

        System.out.println("Your birthday is on:\nMonth " + tokens[0] + "\nDay " + tokens[1] + "\nYear " + tokens[2]);

    }

    static String[] tokenizeBirthday(String birthday) {
        String[] finalArr = new String[3];
        StringTokenizer tokenizer = new StringTokenizer(birthday, "/");
        int j = tokenizer.countTokens();
        for (int i=0; i<j; i++) {
            finalArr[i] = tokenizer.nextToken("/");
        }

        return finalArr;
    }
}
