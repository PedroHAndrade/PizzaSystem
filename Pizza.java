import java.util.Scanner;

public class Pizza {

    private String pizzaFlavour;
    private double price;

    public String getPizzaFlavour(){
        return pizzaFlavour;
    }

    public void setPizzaFlavour(){
        System.out.println("What's the flavour of your pizza?");
        Scanner sc = new Scanner(System.in);
        this.pizzaFlavour = sc.nextLine();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pizza(String pizzaFlavour, double price) {
        this.pizzaFlavour = pizzaFlavour;
        this.price = price;
    }
}
