import java.awt.Desktop;
import java.net.URI;

public class OpenWebsite {
    public static void main(String[] args) {
        try {
            // Replace this with your desired URL or local HTML file path
            String url = "https://github.com/SHRAMAJEEVI/push-and-Pull.git";  // Example online URL
            // Or for a local HTML file:
            // String url = "file:///C:/Users/YourName/Desktop/myPage.html";

            // Open in default browser
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI(url));

            System.out.println("Website opened successfully!");
        } catch (Exception e) {
            System.out.println("Error opening website: " + e.getMessage());
        }
    }
}
