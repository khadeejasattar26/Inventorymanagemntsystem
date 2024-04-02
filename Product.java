package Electronics;
public class Product
{
    private int id;
    private String name;
    private double price;
    private Electronics.ProductType typeofproduct;
    private int quantity;

    public Product(String name,int id,double price)
    {
        setId(id);
        setName(name);
        setPrice(price);

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Electronics.ProductType getTypeofproduct() {
        return typeofproduct;
    }

    public void setTypeofproduct(Electronics.ProductType typeofproduct) {
        this.typeofproduct = typeofproduct;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void reduceQuantity(int amount) {
        if (amount < 0) {
            System.out.println("Invalid input");
            return;
        }
        if (quantity >= amount) {
            quantity -= amount;
            System.out.println("Items removed are: " + getName() + ". Items remaining are: " + getQuantity());
        } else {
            System.out.println("Products are not enough");
        }
    }

}


