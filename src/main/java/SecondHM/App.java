package SecondHM;

import static SecondHM.KindOfSport.*;

public class App {
    public static void main( String[] args ) {
        SportEquipment football = new FootBall(1000, 4 );
        football.kickBall();
        football.setKindOfSport(FOOTBALL);
        football.sell(football.getPrice());

        SportEquipment basketball = new BasketBall(1500, 5 );
        basketball.setKindOfSport(BASKETBALL);
        basketball.sell(basketball.getPrice());


        SportEquipment valleyball = new ValleyBall(500 );
        valleyball.setKindOfSport(VALLEYBALL);
        valleyball.sell(valleyball.getPrice());
        valleyball.kickBall();

        System.out.println(SportEquipment.soldBallsCount);













    }

}
