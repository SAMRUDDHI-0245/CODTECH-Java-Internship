import java.util.*;

public class RecommendationSystem {

    public static void main(String[] args) {

        // Product database (Category -> Products)
        Map<String, List<String>> products = new HashMap<>();

        products.put("Electronics", Arrays.asList(
                "Laptop", "Smartphone", "Headphones", "Smart Watch"));

        products.put("Books", Arrays.asList(
                "Java Programming", "Data Structures", "Machine Learning"));

        products.put("Clothing", Arrays.asList(
                "T-Shirts", "Jeans", "Jackets"));

        products.put("Sports", Arrays.asList(
                "Cricket Bat", "Football", "Badminton Racket"));

        // User preference
        Scanner sc = new Scanner(System.in);
        System.out.println("Available categories:");
        for (String category : products.keySet()) {
            System.out.println("- " + category);
        }

        System.out.print("\nEnter your preferred category: ");
        String userChoice = sc.nextLine();

        // Recommendation logic
        if (products.containsKey(userChoice)) {
            System.out.println("\nRecommended products for you:");
            for (String item : products.get(userChoice)) {
                System.out.println("- " + item);
            }
        } else {
            System.out.println("\nSorry! No recommendations available for this category.");
        }

        sc.close();
    }
}
