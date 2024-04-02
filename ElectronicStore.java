package Electronics;
import java.util.ArrayList;
public class ElectronicStore
{
    private static ArrayList<Product> productList = new ArrayList<>();
    public void addProduct(Product product) {
        boolean exists = false;
        for (Product p : productList) {
            if (p.getId() == product.getId()) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            productList.add(product);
            System.out.println("Product added to list: " + product.getName());
        } else {
            System.out.println("Product has the same id with: " + product.getId());
        }
    }

    public Product searchProduct(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
    public String sellProduct(int id, int quantity) {
        Product product = searchProduct(id);

        if (product != null) {
            if (product.getQuantity() >= quantity && quantity > 0) {  // Added quantity > 0 check
                product.reduceQuantity(quantity);
                return "Sold " + quantity + " units of " + product.getName() + ". Remaining quantity: " + product.getQuantity();
            } else if (product.getQuantity() < quantity) {
                return "Insufficient stock. Available quantity for " + product.getName() + ": " + product.getQuantity();
            } else {
                return "Invalid quantity.";
            }
        } else {
            return "Product with ID " + id + " not found.";
        }
    }

    public static void displayInventory() {
        System.out.println("Inventory Details:");
        for (Product product : productList) {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() +
                    ", Price: $" + product.getPrice() + ", Quantity: " + product.getQuantity());
        }
    }



}
