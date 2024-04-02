package Electronics;
import java.util.Scanner;
public class TestElectronic {
    public static void main(String[] args) {
        ElectronicStore es=new ElectronicStore();
        Product p1=new Product("mosquito",1,0.0);
        p1.setQuantity(100);
        p1.setTypeofproduct(ProductType.TV);
        Product p2=new Product("iphone",2,1000.0);
        p2.setQuantity(1);
        p2.setTypeofproduct(ProductType.PHONE);
        Product p3=new Product("laptop",3,8.0);
        p3.setQuantity(2);
        p3.setTypeofproduct(ProductType.LAPTOP);
        es.addProduct(p1);
        es.addProduct(p2);
        es.addProduct(p3);
        System.out.println("After adding products:");
        ElectronicStore.displayInventory();
        System.out.println("products after selling:");
        System.out.println(es.sellProduct(3,1));
        System.out.println("Remaining");
        ElectronicStore.displayInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID to search: ");
        int searchId = scanner.nextInt();
        Product searchedProduct = es.searchProduct(searchId);
        if (searchedProduct != null) {
            System.out.println("Product found: " + searchedProduct.getName() +
                    ", Price: " + searchedProduct.getPrice() +
                    ", Quantity: " + searchedProduct.getQuantity());
        } else {
            System.out.println("No product found with ID: " + searchId);
        }

    }
}
