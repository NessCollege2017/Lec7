package edu.tomer.java;

import java.util.Scanner;

/**
 * Created by Android2017 on 24/01/2017.
 */
public class Older {
    void studentsDb(){

        //Student phone book:
        int choice = -1;
        int size = 100;
        String[] phones = new String[size];
        String[] names = new String[size];

        int currentIndex = -1;
        Scanner scan = new Scanner(System.in);

        while (choice != 6) {
            System.out.println("Select an option: \n" +
                    "1: Add Student\n" +
                    "2: List Students\n" +
                    "3: delete student by index\n" +
                    "4: delete student by name\n" +
                    "5: search student by name\n" +
                    "6: quit");
            choice = scan.nextInt();
            if (choice == 1){
                if (currentIndex >= names.length - 1){
                    System.out.println("No more space, buy a new phone!");
                    continue;
                }
                currentIndex++;
                //Add student:
                System.out.println("Enter Student Name:");
                names[currentIndex] = scan.next();

                System.out.println("Enter Phone:");
                phones[currentIndex] = scan.next();
            }
            else if(choice == 2){
                //List Students:
                for (int i = 0; i <= currentIndex; i++) {
                    System.out.printf("%d) Name: %s | Phone: %s\n",
                            i + 1, names[i], phones[i]);
                }
            }
            else if(choice == 3 && currentIndex >=0){
                //Delete student by index:
                System.out.println("Enter the index to remove:");
                int idx = scan.nextInt() - 1;

                for (int i = idx; i < currentIndex; i++) {
                    names[i] = names[i + 1];
                    phones[i] = phones[i + 1];
                }
                phones[currentIndex] = null;
                names[currentIndex] = null;
                currentIndex--;
            }
            else if(choice == 4){
                //Delete student by name:

                //search user by name:
                //if found, save the index so can delete it.
                int idxToDelete = -1;
                System.out.println("Enter the name to search:");
                String name = scan.next();
                for (int i = 0; i <= currentIndex; i++) {
                    if (name.equals(names[i])){
                        idxToDelete = i;
                        break;
                    }
                }

                if (idxToDelete !=-1) {
                    for (int i = idxToDelete; i < currentIndex; i++) {
                        names[i] = names[i + 1];
                        phones[i] = phones[i + 1];
                    }
                    phones[currentIndex] = null;
                    names[currentIndex] = null;
                    currentIndex--;
                }else {
                    System.out.println("Not found!");
                }
            }else if (choice == 5){
                //search user by name:
                System.out.println("Enter the name to search:");
                String name = scan.next();
                for (int i = 0; i <= currentIndex; i++) {
                    if (name.equals(names[i])){
                        System.out.printf("Found: %d\n Name: %s\n  Phone: %s",
                                i, names[i], phones[i]);
                    }
                }
            }

            System.out.println("________________________________\n");
        }

        System.out.println("Goodbye!");
    }

    void matrix(){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {7, 8, 9}};

        //System.out.println(matrix[2][2]);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }












        Scanner scan = new Scanner(System.in);
        System.out.println("Enter matrix size");
        int n = scan.nextInt();

        //fill the array:
        int counter = 1;
        String[][] stars = new String[n][n];
        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                stars[i][j] = ""+counter;
                counter++;
            }
        }


        //print the array:
        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                System.out.print(stars[i][j]);
            }
            System.out.println();
        }


    }
}
