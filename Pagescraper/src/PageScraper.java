import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class PageScraper {
    public static void main(String[] args) {
        try {
            // Page to scrape
            String url = "https://mirafit.co.uk/mirafit-m210-half-power-rack.html";


            // Connect to the page and parse the HTML
            org.jsoup.nodes.Document doc = org.jsoup.Jsoup.connect(url).get();


            // Check stock of item
            if (doc.body().text().contains("Subscribe to back in stock notification")) {
                System.out.println("Still out of stock");
            } else {
                System.out.println("IN STOCK !!!!!!!!!!!!!!!!!.");
            }
        } catch (IOException e) {
            System.out.println("Error connecting to url: " + e.getMessage());
        }
    }
}