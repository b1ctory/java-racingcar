import java.util.Random;

public class Car{
    private final String name;
    private int position = 0;
    private Random random = new Random();
    public Car(String name){
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

    public void printMove(){
        for(int i = 0; i < position; i++){
            System.out.print("-");
        }
        System.out.println();
    }
}