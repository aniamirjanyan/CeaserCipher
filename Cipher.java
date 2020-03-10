import java.util.Scanner;

public class Cipher {

    public static int n = 5;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        inputText();
    }

    // Text Input
    public static void inputText() {
        System.out.print("Type the text you want to encrypt: ");
        String sentence = input.nextLine();
        toChar(sentence);
    }

    // String to char array
    public static void toChar(String sentence) {
        char[] text = sentence.toCharArray();
        encrypt(text);
    }

    // Encryption
    public static void encrypt(char[] text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length; i++) {
        if (Character.isUpperCase(text[i])) {
            char character = (char) (((int) text[i] + n - 65) % 26 + 65);
            result.append(character);
        } else if (Character.isLowerCase(text[i])) {
            char character = (char) (((int) text[i] + n - 97) % 26 + 97);
            result.append(character);
        } else {
            char character = (char) ((int) text[i]);
            result.append(character);
        }
    }
        System.out.println("Here is the encrypted text: " + result);
    }
}
