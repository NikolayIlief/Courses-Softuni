import java.util.ArrayDeque;
import java.util.Scanner;

public class JavaStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean areIdentical = false;
        do {
            String input = sc.nextLine();
            String[] inputArr = input.split("");
            ArrayDeque<String> openBrackets = new ArrayDeque<>();

            if (!(inputArr.length % 2 == 0)) {
                areIdentical = false;
            } else {
                for (String currentBracket : inputArr) {
                    if (currentBracket.equals("(") || currentBracket.equals("[") || currentBracket.equals("{")) {
                        openBrackets.push(currentBracket);
                    } else {
                        if (openBrackets.isEmpty()) {
                            areIdentical = false;
                            break;
                        }
                        String lastBracket = openBrackets.pop();

                        if (lastBracket.equals("(") && currentBracket.equals(")")) {
                            areIdentical = true;
                        } else if (lastBracket.equals("{") && currentBracket.equals("}")) {
                            areIdentical = true;
                        } else if (lastBracket.equals("[") && currentBracket.equals("]")) {

                            areIdentical = true;
                        } else {
                            areIdentical = false;
                            break;
                        }
                    }
                }
            }

            if (areIdentical){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } while (sc.hasNextLine());
    }
}
