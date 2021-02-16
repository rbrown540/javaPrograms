// Richard Brown
// CMIS 141 - homeworkThree
// 23 Sept 2019

import java.awt.*;
import java.util.Scanner;

/** This class creates a set of headphones **/
public class HeadPhone {
    // initializing volume variables
    private final String lowVolume = "Low";
    private final String mediumVolume = "Medium";
    private final String highVolume = "High";
    private int volume;
    private String volumeString;
    // initializing non-volume related variables
    private boolean pluggedIn;
    private String manufacturer;
    private Color headPhoneColor;
    private String headPhoneModel;
    /**
     * HeadPhone method with default constructor
     **/
    public HeadPhone() {
// default setting for Headphone
        this.volume = 1;
        this.pluggedIn = false;
        this.manufacturer = "Bose";
        this.headPhoneColor = Color.blue;
        this.headPhoneModel = "Sport";
    }
/**
 * toString() method that returns a string describing the whether the headphone are currently
 * plug in or not.
**/

public String toString() {
        // String for returning the entire method output. Variable returns at end of method
        String stVal = null;
        // String for returning the state of the headphone plugged in based on boolean variable
        String plugVal = null;

        /** determine which string to print based on which state the boolean variable is set to. **/
        // This if/else compares to a true boolean value
        if (isPluggedIn() == true)
        {
            plugVal = "Headphones are plugged in";
        } else
            plugVal = "Headphones are NOT plugged in";

    /**
     * setting the integer value for volume to a String variable for printing a string and not an integer
    **/
        // volume 1 set to 'low'
        if (volume == 1){
            volumeString = "Low";
        }
        // volume 2 set to 'medium'
        if (volume == 2){
            volumeString = "Medium";
        }
        // volume 3 set to 'high'
        if (volume == 3){
            volumeString = "High";
        }
        /**
         * returning a String value consisting of VOLUME , MANUFACTURER, COLOR, and MODEL
        **/
        stVal = "\nThe volume is at level " + volumeString + "\n" + plugVal + "\nThe manufacturer is "
                + getManufacturer() + "\nThe headphone color is " + getHeadPhoneColor() + "\nThe headphone model is "
                + getHeadPhoneModel();
        return stVal;
    }

/**
 * changeVolume() method that prompts user for a volume change, then sets the new volume based on the user Input.
 * A string is then returned, outputting the change to the volume
**/

public String changeVolume() {
        // create a scanner object for userInput to get the required change input
        Scanner userInput = new Scanner(System.in);
        // PROMPT for user to input the volume change desired
        System.out.println("\nWhat would you like to set the volume to?" +
                "\nValue must be (1) for Low, (2) for Medium, or (3) for High. \n>>");
        // set the instance variable, based on the user input
        this.volume = (userInput.nextInt());
        // String variable for returning the value of 'volume'
        String stVal2 = null;

    /**
     * setting the integer value for volume to a String variable for printing a string and not an integer
    **/
        // return low volume
        if (this.volume == 1) {
                 stVal2 = "Volume is set to " + lowVolume;
                 return stVal2;
        }
        // return medium volume
        if (this.volume == 2) {
                 stVal2 = "Volume is set to " + mediumVolume;
                 return stVal2;
        }
        // return high volume
        if (this.volume == 3) {
                 stVal2 = "Volume is set to " + highVolume;
                 return stVal2;
        } else
                 stVal2 = "That is not one of the options";
            return stVal2;
        }

    /**
     * getter and setter for private variables
    **/
    
    //volume getter
    public int getVolume() {
         return volume;
    }
    // volume setter
    public void setVolume(int volume) {
        this.volume = volume;
    }
    // pluggedIn getter ('is' for boolean)
    public boolean isPluggedIn() {
        return pluggedIn;
    }
    // pluggedIn setter
    public void setPluggedIn(boolean pluggedIn) {
        this.pluggedIn = pluggedIn;
    }
    // manufacturer getter
    public String getManufacturer() {
        return manufacturer;
    }
    // manufacturer setter
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    // headphone color getter
    public String getHeadPhoneColor() {

        if (Color.blue.equals(headPhoneColor)){
            return "Blue";}
        if (Color.green.equals(headPhoneColor)){
            return "Green";}
        if (Color.black.equals(headPhoneColor)){
            return "Black";}
        if (Color.orange.equals(headPhoneColor)){
            return "Orange";}
        if (Color.pink.equals(headPhoneColor)){
            return "Pink";}
        if (Color.red.equals(headPhoneColor)){
            return "Red";}
        else{
            return "That is not one of the possible colors";
        }
    }
    // headphone color setter
    public void setHeadPhoneColor(Color headPhoneColor) {
        this.headPhoneColor = headPhoneColor;
    }
    // headphone model getter
    public String getHeadPhoneModel() {
        return headPhoneModel;
    }
    // headphone model setter
    public void setHeadPhoneModel(String headPhoneModel) {
        this.headPhoneModel = headPhoneModel;
    }


}
