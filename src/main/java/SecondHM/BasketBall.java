package SecondHM;

public class BasketBall extends SportEquipment implements Toss {
    BasketBall(String price,String size) {
        super(price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toss() {
        return "You can toss it";
    }

    public void Material() {
        System.out.print("Rubber");
    }
}
