package SecondHM;

public class ValleyBall extends SportEquipment implements Toss {
    ValleyBall(String price) {
        super(price);
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
        System.out.print("Artificial leather");
    }
}

