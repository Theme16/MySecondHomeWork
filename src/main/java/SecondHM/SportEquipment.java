package SecondHM;

import SecondHM.KindOfSport;

public abstract class SportEquipment {
    private String price;
    private KindOfSport kindofsport;
    static int soldBallsCount = 0;

    SportEquipment(String price) {

        setPrice(price);
    }

    String getPrice() {
        return price;
    }

    void setPrice(String price) {
        this.price = price;
    }
    void setKindOfSport(KindOfSport kindofsport) {
        this.kindofsport = kindofsport;


    }
    public abstract void Materials();

    void kickBall(){
        System.out.println("The ball flew away");

    }

    void sell(String Price) {
        try {
            System.out.println("You can sell this Ball" + price);
            soldBallsCount++;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sorry all balls for this kind of sport are sold");

        }
    }

    public void fly(boolean isLowered) throws BallLoweredException {
        if (isLowered) {
            throw new BallLoweredException("Your ball lowered and can't fly");
        }
        System.out.println("Fly");
        }
    }






}
