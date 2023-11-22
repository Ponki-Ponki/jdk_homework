package home;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int numberOfSteps = 1000;
        int numDoors = 3;
        Map<Integer, Boolean> result1 = new HashMap<>();
        Map<Integer, Boolean> result2 = new HashMap<>();
        double counterWin = 0;

        // если игрок не меняет выбор двери
        int i = 0;
        while (i++ < numberOfSteps) {
            boolean[] doors = getDoors(rnd,numDoors);
            int selectedDoor = rnd.nextInt(numDoors);
            if (doors[selectedDoor]) counterWin++;
            result1.put(i, doors[selectedDoor]);
        }
        printResult(counterWin,numberOfSteps);

        //если игрок изменяет выбор после открытия одной двери
        counterWin = 0;
        i=0;
        while (i++ < numberOfSteps){
            boolean[] doors = getDoors(rnd,numDoors);
            int selectedDoor = rnd.nextInt(numDoors);
            selectedDoor = newChoice(doors,selectedDoor,rnd,numDoors);
            if(selectedDoor == -1){System.out.println("ERROR"); return;}
            if (doors[selectedDoor]) counterWin++;
            result2.put(i, doors[selectedDoor]);
        }
        printResult(counterWin,numberOfSteps);

        //printMap(result1);
        //printMap(result2);
    }

    private static void printMap(Map<Integer, Boolean> result) {
        for (Map.Entry<Integer, Boolean> item: result.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
        System.out.println();
    }

    private static void printResult(double counterWin,int numStep) {
        System.out.printf("побед =  %.3f%%", (counterWin / numStep) * 100);
        System.out.println();
    }

    private static int newChoice(boolean[] doors,int selDoor, Random rnd,int numDoors) {
        int selectDoor;
        if (doors[selDoor]){
            do {
                selectDoor = rnd.nextInt(numDoors);
            } while (selectDoor == selDoor);
            return selectDoor;
        } else {
            for (int i = 0; i < 3; i++) {
                if(doors[i]) return i;
            }
        }
        return  -1;
    }

    private static boolean[] getDoors(Random rnd,int numDoors) {
        boolean[] doors = new boolean[numDoors];
        Arrays.fill(doors,false);
        doors[rnd.nextInt(numDoors)] = true;
        return doors;
    }
}