public class Sales {

    private String name;
    private String position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String concludeSale(){
        return "Your order is being prepared";
    }

    public Sales(String name, String position) {
        this.name = name;
        this.position = position;
    }
}
