package lecture3.abstractClasses;

public class CarTest {
    public static void main(String[] args) {
        AUTOCar autoCar = new AUTOCar();
        ManualCar manualCar = new ManualCar();
        Object object = new AUTOCar();
        manualCar.changeGear(5);
        Car car = new AUTOCar();
        Car car2 = new ManualCar();

        if (autoCar instanceof Car){
            System.out.println("true");
        }
    }
}
