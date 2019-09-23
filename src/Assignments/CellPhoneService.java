package Assignments;

import java.util.Scanner;

public class CellPhoneService {

    public static void main(String[] args){

        int minUsed;
        int textUsed;
        int gbUSed;
        String result = null;

        Scanner input = new Scanner(System.in);

        System.out.println("How many minutes are you going to use? >>>");
        minUsed = input.nextInt();

        System.out.println("How many messages are you going to send? >>>");
        textUsed = input.nextInt();

        System.out.println("How many gigabytes are you going to use? >>>");
        gbUSed = input.nextInt();

        if(minUsed < 500 && textUsed == 0 && gbUSed == 0){
            result = "plan A";
        }
        else if(minUsed < 500 && textUsed >= 1 && textUsed <= 99 && gbUSed == 0){
            result = "plan B";
        }
        else if(minUsed > 500 && textUsed >= 1 && textUsed <= 100 && gbUSed == 0){
            result = "plan C";
        }
        else if(minUsed > 500 && textUsed >= 100 && gbUSed == 0 ){
            result = "plan D";
        }
        else if(minUsed > 500 && textUsed >=100 && gbUSed >= 1){
            if(gbUSed < 2){
                result = "plan E";
            }
            else if (gbUSed >= 2){
                result = "plan E";
            }

        }
        System.out.println("The plan you need is plan " + result);

    }


}
