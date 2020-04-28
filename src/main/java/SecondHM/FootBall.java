package SecondHM;

public class FootBall extends SportEquipment implements Kick {
    FootBall(String price, String size) {
        super(price);
        this.size = size ;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void Material() {
        System.out.println("Leather");
    }

    public String Kick() {
        System.out.println("You can kick it");
    }

}

