package entities;

public class Elevator {

    private int currentFloor; //Andar atual
    private int totalFloors; //Total de andares
    private int capacityElevator; //Capacidade elevador
    private int currentPeople; //Pessoas atualmente

    public Elevator(int currentFloor, int totalFloors, int capacityElevator, int currentPeople) {
        this.currentFloor = currentFloor;
        this.totalFloors = totalFloors;
        this.capacityElevator = capacityElevator;
        this.currentPeople = currentPeople;
    }


    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public int getCapacityElevator() {
        return capacityElevator;
    }

    public int getCurrentPeople() {
        return currentPeople;
    }

    public void enterPeople(int enterPeople) {
        if (currentPeople >= capacityElevator) {
            System.out.println("Elevator Full");
        } else {
            currentPeople += enterPeople;
        }
    }

    public void leavePeople(int leavePeople) {
        if (currentPeople <= 0) {
            System.out.println("Elevator empty");
        } else {
            currentPeople -= leavePeople;
        }
    }

    public void upElevator(int upElevator) {
        if (currentFloor >= capacityElevator) {
            System.out.println("You are at the top");
        } else if (upElevator == 0) {
            System.out.println("you are already in the Ground floor");
        } else if (upElevator > capacityElevator || upElevator == currentFloor) {
            System.out.println("You are already on the floor " + currentFloor);
        } else if (upElevator == currentFloor) {
            System.out.println("you are already in the " + currentFloor + " floor");
        } else {
            currentFloor = upElevator;
        }
    }

    public void downElevator(int downElevator) {
        if (downElevator < 0) {
            System.out.println("You are at the ground floor");
        } else if (downElevator == 0) {
            System.out.println("you are already in the Ground floor");
        } else if (downElevator == currentFloor) {
            System.out.println("you are already in the " + currentFloor + " floor");
        } else {
            currentFloor = downElevator;
        }
    }

}
