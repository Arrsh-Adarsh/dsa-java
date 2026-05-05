package com.dsa.recursion;

import java.util.List;

public class TowerOfHanoi {

    public static int COUNTER = 0;
    public static int METHOD_CALL_COUNTER = 0;


    public static void main(String[] args) {
        TowerOfHanoi toh = new TowerOfHanoi();
        List<TOHInput> inputs = toh.getInput();


        for (TOHInput input : inputs) {
            COUNTER = 0;
            METHOD_CALL_COUNTER = 0;
            toh.calculateTowerOfHanoi(input.getAmountOfDisk(), input.getSourceTower(), input.getAuxiliaryTower(), input.getDestinationTower());
            System.out.printf("\nMoving %d disk of TOH from Tower %s to Tower %s took %d steps.\n", input.getAmountOfDisk(), input.getSourceTower(), input.getDestinationTower(), COUNTER);
            System.out.printf("This made %d called to TOH method.\n\n", METHOD_CALL_COUNTER);
        }
    }

    List<TOHInput> getInput() {
        return List.of(new TOHInput(2, "A", "B", "C"),
                new TOHInput(3, "A", "B", "C"),
                new TOHInput(4, "A", "B", "C"),
                new TOHInput(10, "A", "B", "C"),
                new TOHInput(30, "A", "B", "C"),
                new TOHInput(35, "A", "B", "C")         // will not give correct output due to stackoverflow
        );
    }

    void calculateTowerOfHanoi(int amountOfDisk, String sourceTower, String auxiliaryTower, String destinationTower) {
        METHOD_CALL_COUNTER++;
        if (amountOfDisk > 0) {
            COUNTER = COUNTER + 1;
            calculateTowerOfHanoi(amountOfDisk - 1, sourceTower, destinationTower, auxiliaryTower);
//            System.out.printf("Move Disk %d from (%s to %s)\n", amountOfDisk, sourceTower, destinationTower);
            calculateTowerOfHanoi(amountOfDisk - 1, auxiliaryTower, sourceTower,  destinationTower);
        }
    }
}

class TOHInput {
    private int amountOfDisk;
    private String sourceTower;
    private String auxiliaryTower;
    private String destinationTower;

    public TOHInput(int amountOfDisk, String sourceTower, String auxiliaryTower, String destinationTower) {
        this.destinationTower = destinationTower;
        this.auxiliaryTower = auxiliaryTower;
        this.sourceTower = sourceTower;
        this.amountOfDisk = amountOfDisk;
    }

    public int getAmountOfDisk() {
        return amountOfDisk;
    }

    public String getSourceTower() {
        return sourceTower;
    }

    public String getAuxiliaryTower() {
        return auxiliaryTower;
    }

    public String getDestinationTower() {
        return destinationTower;
    }
}