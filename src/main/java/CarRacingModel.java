import java.util.Random;

public class CarRacingModel {
    private final String name;
    private int position = 0;
    private Random random = new Random();

    public CarRacingModel(String name){
        this.name = name;
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }

    public void movePosition() {
        this.position += movingCar(random.nextInt(10));
    }

    public int movingCar(int random) {
        if (random > 3) return 1;
        return 0;
    }

    public String moving(){
        String str = "-";
        for(int i = 0; i < position; i++){
            str += "-";
        }
        return str;
    }
}