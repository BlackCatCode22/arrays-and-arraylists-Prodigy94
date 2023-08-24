
public class ArraysAndVectors {
    public static void main(String[] args) {

        System.out.println("\n Welcome to the Array Program! \n");

        // Create an int array
        int[] myNumbers = new int[8];

        // Find the array with ints
        myNumbers[0] = 1;
        myNumbers[1] = 24;
        myNumbers[2] = 45;
        myNumbers[3] = 22;
        myNumbers[4] = 65;
        myNumbers[5] = 23;
        myNumbers[6] = 12;
        myNumbers[7] = 81;

        // output the array
        System.out.println("My number is " + myNumbers[3]);

        System.out.println("\n");

        for (int i = 0; i < 8; i++) {
            // print the elements of the array
            System.out.println("myNumbers[" +i + "] is: " + myNumbers[i]);
        }


        // Fill the array with  5, 10, 15, etc.
        System.out.println("\n This array should be the fives: ");
        int myFiveContainer = 0;
        for (int i = 0; i < 8; i++ ) {
            // print the elements of the array
            myNumbers[i] = myFiveContainer += 5;


            System.out.println("myNumbers[" +i + "] is: " + myNumbers[i]);

        }

            // Create a 2D array
        int[][] myNumberGrid = new int[4][3];

        // fill the array with a for() loop
        myFiveContainer = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                myNumberGrid[i][j] = myFiveContainer += 5;
            }
        }

        // output the array with a for() loop
        System.out.println("\n");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(myNumberGrid[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\n");

        int [][] numberGrid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {0}
        };


        for(int i = 0; i < numberGrid.length; i++){
            for(int j = 0; j < numberGrid[i].length; j++){
                System.out.print(numberGrid[i][j]);
            }
            System.out.println();
        }



    }
    }
