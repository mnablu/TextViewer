/**
 * Text viewer App - prints the contents of a string to the console.
 * Created by Marc Nablu on 9/03/15.
 */
public class App {
    public static void main(String[] args) {
        String text = "This is a simple test\nOne Two Three\nHello World";
        for (int i = 0; i < text.length(); ++i) {
            System.out.println(text.charAt(i));
        }
        System.out.println();

    }
}
