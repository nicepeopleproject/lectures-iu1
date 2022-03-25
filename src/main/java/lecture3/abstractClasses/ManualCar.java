package lecture3.abstractClasses;

public class ManualCar extends Car{


    @Override
    public void drive() {

    }

    public void changeGear(int gear){
        this.gear = gear;
    }
}
