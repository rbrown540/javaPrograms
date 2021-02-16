// Richard Brown
// CMIS 141 homework 2
// September 18th 2019
/** This class is for a guitar and its attributes, to include, the playing of the guitar.  An output is printed for
 * 16 separate cords when played. The attributes of the guitar can be changed within the class and has two default setting,
 * depending on whether the constructor is used or set to default.  Getter methods are at the end of the class.
 * */

import java.awt.*;
import java.util.Random;

public class Guitar {

    // set variable to private for guitar attributes
    private int numStrings;
    private double guitarLength;
    private String guitarManufacturer;
    private Color guitarColor;

    /** Guitar method with constructor for guitar string count, guitar length, the manufacturer,
     * and the guitar color **/

    public Guitar (int initialStringCount , double initialGuitarLength , String initialGuitarManufacturer ,
                  Color initialGuitarColor) {
        numStrings = initialStringCount;
        guitarLength = initialGuitarLength;
        guitarManufacturer = initialGuitarManufacturer;
        guitarColor = initialGuitarColor;
        }


     /** when constructor is set to default, the following variables will output to each attribute. **/
    public Guitar ()
    {
        this.numStrings = 6; // default string count = 6
        this.guitarLength = 28.2; // default length = 28.2
        this.guitarManufacturer = "Gibson"; // default manufacturer is Gibson
        this.guitarColor = Color.RED; // default color is red
    }

/** printing the attributes of the guitar.  toString will print data based on constructor or default usage.  **/

    public String toString()
    {
        String stVal = null;
    // printing all four variable values in a String, with each variable name printed also
        stVal = "numString=" + getNumStrings() + " " +
                "Length=" + getGuitarLength() + " " + "manufacture=" + getGuitarManufacturer() + " " + "color=" + getGuitarColor();

        return stVal; // returns the value of the String above each time the program is run
    }

    /** because there should be a comment here too!  this portion creates 16 random note and duration pairings for when
     * the guitar is actually played.  Provides a nice printout sequence so everything looks really pleasing when printed **/
    public String playGuitar() {

        double[] noteDuration = {0.25, 0.5, 1.0, 2.0, 4.0}; // note duration variable for [5] different note lengths
        String[] noteCord = {"A", "B", "C", "D", "E", "F", "G"}; // note core variable for [7] different note cords

        Random randomGenerator = new Random(); // can't randomize without this

        int iNoteIndex; // declare variable for the 'for' loop to follow
        int iDurationIndex; // declare variable for the 'for' loop to follow

        String ret = "[ "; // opening bracket
        /** following loop is set to run 16 times, in order to, return 16 separate cord/duration pairings **/
            for (int i = 0 ; i < 16; i++)
            {
                iNoteIndex = randomGenerator.nextInt(7); // array that is [7] which is noteCord
                iDurationIndex = randomGenerator.nextInt(5); // array that is [5] which is noteDuration

                ret = ret + noteCord[iNoteIndex] + "(" + String.valueOf(noteDuration[iDurationIndex]) + ") ";

                if (i != 15) /** this is to add the comma between each set of cord/duration pairings **/
                {
                    ret = ret + " , ";
                }
            }
            ret = ret + "]"; // closing bracket

            return ret; // returns the String ret, which is the entire printout of the 16 note/duration pairings.
        }


    /** Getter for each variable used **/
    public int getNumStrings() // for getting the number of strings on the given guitar
    {
        return numStrings; // return numStrings data
    }

    public double getGuitarLength() // for getting the length of the guitar
    {
        return guitarLength; // return guitarLength data
    }

    public String getGuitarManufacturer() // for getting which company manufactured the guitar
    {
        return guitarManufacturer; // return guitarManufacturer data
    }

    public Color getGuitarColor() // for getting which rad color the guitar is
    {
       return guitarColor; // return guitarColor data
    }



}