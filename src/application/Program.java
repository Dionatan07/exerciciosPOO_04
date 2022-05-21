package application;

import entities.Elevator;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Enter the capacity of elevator: ");
        int capacityElevator = key.nextInt();

        System.out.print("Enter total floors of the building: ");
        int totalFloors = key.nextInt();

        Elevator elevator = new Elevator(0, capacityElevator, totalFloors, 0);


        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("Capacity total is " + elevator.getCapacityElevator() + " people");
        System.out.println("The building have " + elevator.getTotalFloors() + " floors");
        System.out.println("-------------------------------------------");

        System.out.println();
        System.out.println("1) Enter people");
        System.out.println("2) Leave people");
        System.out.println("3) Up");
        System.out.println("4) Down");
        System.out.println("5) Exit");
        System.out.print("Enter the option: ");
        int response = key.nextInt();

        while (response != 5) {

            if (response == 1) {
                System.out.println();
                System.out.print("How many people will enter? ");
                int enterPeople = key.nextInt();
                elevator.enterPeople(enterPeople);
                System.out.println();
                System.out.println("-------------------------------------------");
                System.out.println("total number of people in the elevator: " + elevator.getCurrentPeople());
                if (elevator.getCurrentFloor() == 0) {
                    System.out.println("Current floor : Ground floor");
                } else {
                    System.out.println("Current floor : " + elevator.getCurrentFloor());
                }
                System.out.println("-------------------------------------------");

            } else if (response == 2) {
                System.out.println();
                if (elevator.getCurrentPeople() == 0) {
                    System.out.println("-------------------------------------------");
                    System.out.println("Elevator is empty");
                    System.out.println("-------------------------------------------");
                } else {
                    System.out.print("How many people will leave? ");
                    int leavePeople = key.nextInt();
                    if (leavePeople > elevator.getCurrentPeople()) {
                        System.out.println("There are " + elevator.getCurrentPeople() + " in the elevator");
                    } else {
                        elevator.leavePeople(leavePeople);
                        System.out.println("-------------------------------------------");
                        System.out.println("total number of people in the elevator: " + elevator.getCurrentPeople());
                        if (elevator.getCurrentFloor() == 0) {
                            System.out.println("Current floor : Ground floor");
                        } else {
                            System.out.println("Current floor : " + elevator.getCurrentFloor());
                        }
                        System.out.println("-------------------------------------------");
                    }
                }

            } else if (response == 3) {
                System.out.println();
                if (elevator.getCurrentPeople() == 0) {
                    System.out.println("-------------------------------------------");
                    System.out.println("Elevator is empty");
                    System.out.println("-------------------------------------------");
                } else {
                    System.out.print("Enter the floor you want to go up: ");
                    int upElevator = key.nextInt();
                    elevator.upElevator(upElevator);

                    System.out.println();
                    System.out.println("-------------------------------------------");
                    System.out.println("total number of people in the elevator: " + elevator.getCurrentPeople());
                    if (elevator.getCurrentFloor() == 0) {
                        System.out.println("Current floor : Ground floor");
                    } else {
                        System.out.println("Current floor : " + elevator.getCurrentFloor());
                    }
                    System.out.println("-------------------------------------------");
                }
            } else if (response == 4) {
                System.out.println();
                if (elevator.getCurrentPeople() == 0) {
                    System.out.println("Elevator is empty");
                } else {
                    System.out.print("Enter the floor you want to go up: ");
                    int downElevator = key.nextInt();
                    elevator.downElevator(downElevator);

                    System.out.println();
                    System.out.println("total number of people in the elevator: " + elevator.getCurrentPeople());
                    if (elevator.getCurrentFloor() == 0) {
                        System.out.println("Current floor : Ground floor");
                    } else {
                        System.out.println("Current floor : " + elevator.getCurrentFloor());
                    }
                    System.out.println("-------------------------------------------");
                }
            }


            System.out.println();
            System.out.println("1) Enter people");
            System.out.println("2) Leave people");
            System.out.println("3) Up");
            System.out.println("4) Down");
            System.out.println("5) Exit");
            System.out.print("Enter the option: ");
            response = key.nextInt();

        }
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("Thank you and come again!");
        System.out.println("-------------------------------------------");


    }

}
