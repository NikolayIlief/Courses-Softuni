import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lineCounter = 0;
        while (sc.hasNext()){
            String input = sc.nextLine();
            lineCounter++;
            System.out.println(lineCounter + " " + input);

        }

    }
}
