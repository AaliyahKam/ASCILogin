import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Scanner;

public class ASCIILogin {
    public static void main(String[] args) {
        // define username and password
        String username = "CSCI1302";
        String password = "SpRiNg23";

        // prompt user for username and password
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // compare input credentials to pre-defined credentials
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            int width = 200;
            int height = 30;
            BufferedImage image = new BufferedImage (width, height, BufferedImage.TYPE_INT_RGB);
            Graphics g = image.getGraphics();
            g.setFont (new Font("Times roman", Font.PLAIN, 12));
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint (RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            graphics.drawString ("CSCI 1302 AALIYAH LOCKETT" , 0, 20);
            for (int y = 0; y < height; y++) {
                StringBuilder stringbuilder = new StringBuilder();
                for (int x = 0; x < width; x++) {
                    stringbuilder.append(image.getRGB(x, y) == -16777216 ? " " : "*");
                }
                if (stringbuilder.toString().trim().isEmpty()) {
                }
                System.out.println(stringbuilder);
            }
        } else {
            System.out.println("Incorrect username or password. Access denied.");
        }
    }
}
