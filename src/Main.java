import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        evenOdd();

    }

    //홀짝 판별
    public static void evenOdd() throws IOException {
        System.out.print("숫자를 입력 하세요. : ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int value = Integer.parseInt(input);
        String result = "";

        result = value % 2 == 0 ? "even" : "odd";

        System.out.println(result);
    }
}
