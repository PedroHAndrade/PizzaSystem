import java.util.Locale;
import java.util.Scanner;

public class Client {

    private String name;
    private String phone;
    private double cashOnHand;

    public Client(String name,String phone, double cashOnHand){
        this.name = name;
        this.phone = phone;
        this.cashOnHand = cashOnHand;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public double getCashOnHand(){
        return cashOnHand;
    }

    public void setCashOnHand(){
        this.cashOnHand = cashOnHand;
    }

    public void orderPizza(Sales sales, Pizza pizza, boolean hasCashOnHand) {
        if (hasCashOnHand == true) {
            if (getCashOnHand() >= pizza.getPrice()) {


                pizza.setPizzaFlavour();

                System.out.println("Do you want me to send the pizza to your address?");

                Scanner sc = new Scanner(System.in);
                String userAnswer = sc.nextLine();

                if (userAnswer.equals("yes")){
                    System.out.println("Ok! It'll be sent to your address");
                }

                System.out.println("Your pizza flavour is " + pizza.getPizzaFlavour() +
                        ". Also, the price is " + pizza.getPrice());
            }
        }
        System.out.println("Here's your money " + (this.getCashOnHand() - pizza.getPrice()));
        System.out.println("It will take about 50 minutes do get ready. Thank you.");
    }
}
