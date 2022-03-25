package lecture3.abstractClasses;

public class AUTOCar extends Car{
    @Override
    public void drive() {

    }

    private void changeGearIfNeeded(){
        this.gear = currentSpeed / 20 + 1;
    }
}
