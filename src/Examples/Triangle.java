package Examples;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args){

        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("What are you solving for? \n 1 -for right triangle \n" +
        " 2 -for Isosceles \n 3 -for Equilateral \n>>>>");
        choice = input.nextInt();

        if(choice == 1){
            rightTriangle();
        }
        else if(choice == 2){
            solvePerimeter();
        }
        else if (choice == 3){
            solveArea();
        }



    }
    public static void rightTriangle(){
        Scanner input = new Scanner(System.in);
        String choice;
        double side1;
        double side2;
        System.out.println("Which side do you want to solve for?\n" + "\nA- side\nB- side\nC- Side");
        choice = input.next();
        if(choice.equalsIgnoreCase("A")){
            System.out.println("Please enter for side B >>>");
            side1 = input.nextDouble();
            System.out.println("Please enter for side C >>>");
            side2 = input.nextDouble();
            rightTriangleMath(side1, side2, choice);
        }
        else if(choice.equalsIgnoreCase("B")) {
            System.out.println("Please enter for side A >>>");
            side1 = input.nextDouble();
            System.out.println("Please enter for side C >>>");
            side2 = input.nextDouble();
            rightTriangleMath(side1, side2, choice);
        }
        else{
            System.out.println("Please enter for side A>>>");
            side1 = input.nextDouble();
            System.out.println("Please enter for side B >>>");
            side2 = input.nextDouble();
            rightTriangleMathC(side1, side2, choice);
        }
    }
    public static void rightTriangleMath(double side1, double side2, String choice){
        double notC;
        notC = Math.sqrt((side2 * side2) - (side1 * side1));
        System.out.println("The side " + choice + " is " + notC);

    }
    public static void rightTriangleMathC(double side1, double side2, String choice) {
        double C;
        C = Math.sqrt((side2 * side2) + (side1 * side1));
        System.out.println("The side " + choice + " is " + C);
    }

    public static void solvePerimeter(){



    }
    public static void solveArea(){



    }

}
