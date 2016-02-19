package com.Lab5;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        try{
        BufferedReader bufreader = new BufferedReader(new FileReader("recyclingreport-mainstreet (1).txt"));
        String line = bufreader.readLine();
        ArrayList<String> houses = new ArrayList<String>();
        //read the textfile into an arraylist
        while (line != null){
           // System.out.println(line);
            line = bufreader.readLine();
            houses.add(line);

        }
        //http://stackoverflow.com/questions/19461161/remove-a-string-from-an-array-list
        String listString  = "";
        //created an empty string
        for (String s: houses) {
            //String listStr = "";
            listString += s;
            //pass all parts of the array list called houses
            //into the string

        }
        //replace all of the following values in the string.
        //we also need to get rid annd replace with emptyness null
        listString = listString.replaceAll("House ","");
        listString = listString.replaceAll(" recycled ", ",");
        listString = listString.replaceAll(" creates", ",");
        listString = listString.replaceAll(" crates", ",");
        listString = listString.replaceAll(" crate", ",");
        listString = listString.replaceAll("null", "");
        //view the contents of the string
        System.out.println(listString);
        //convert the string to string array
        String value [] = listString.split(",");

        //System.out.println(value[i]);
        int [] numbers = new int [value.length];
        //as with the credit card we need to deal with numbers so we
        //created numbers array
        for (int O = 0; O < value.length; O += 1){
            //we cant work with a string number only we need numbers
            numbers[O] = Integer.parseInt(value[O]);
           // System.out.println(value[O]);
        }
        for(int h = 1; h < numbers.length; h += 2){
            //check our out put of numbers in a for loop and
            //it is printing only values of the houses
            System.out.print(numbers[h] + ", ");
            //System.out.println();
        }
        System.out.println();
        int hightest = numbers[0];
        for (int i = 1; i < numbers.length; i +=2 ){
            //this checks for the hightest values
            if (numbers[i]>hightest){
                hightest = numbers[i];
            }
        }
        System.out.println("the most crates recycled is " + hightest);

            for (int j = 1; j < numbers.length; j += 2) {
                if (numbers[j] == hightest) {
                    //we have all off our values being put int the string which
                    //is 1 through 180 starting at zero ergo to match the correct house number
                    //we needed to add the number +1 and then divide by 2.
                    System.out.println("House number " + (j + 1) / 2 + "\t");
                }
            }
            // print who recycled the most
            System.out.println("recycled the most");
            bufreader.close();
        }
        //catching an out of bounds for the array Exception
        catch (ArrayIndexOutOfBoundsException aie){
            System.out.println("Oops, tried to " +
                    "print too much");
        }
        System.out.println("That's the houses that " +
                "recycled the most.");

        }


    }

