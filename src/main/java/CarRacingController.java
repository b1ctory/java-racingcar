import java.util.*;

public class CarRacingController {
    private int count = 0;
    private List<CarRacingModel> carRacingModels = new ArrayList<>();
    String input = "";

    public CarRacingController(String nameList) {
        this.input = nameList;
    }

    public void putCarName(){
        List<String> temp;
        String str = "";
        temp = Arrays.asList(input.split(","));
        for(int i = 0; i < temp.size(); i++){
            str = limitName(temp.get(i));
            carRacingModels.add(new CarRacingModel(str));
        }
    }

    public String limitName(String name){
        if(name.length() > 5){
            return name.substring(0,5);
        }
        return name;
    }

    public String drawRacing(){
        String gameResult = "";
        for(int i = 0; i < carRacingModels.size(); i++){
            carRacingModels.get(i).movePosition();
            gameResult += carRacingModels.get(i).getName() + " : " + carRacingModels.get(i).moving() + "\n";
        }
        return gameResult;
    }

    private void winCount(int i) {
        if (count < carRacingModels.get(i).getPosition()) {
                count = carRacingModels.get(i).getPosition();
        }
    }

    private String pickWinners(int i){
        String winner = "";
        if (count == carRacingModels.get(i).getPosition()) {
            winner += carRacingModels.get(i).getName() + " ";
        }
        return winner;
    }
    
    public String result() {
        String gameResult = "";
        for (int i = 0; i < carRacingModels.size(); i++) {
            winCount(i);
        }
        for (int i = 0; i < carRacingModels.size(); i++) {
            gameResult += pickWinners(i);
        }
        return gameResult;
    }
}