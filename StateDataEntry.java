/**
 * Richard Brown
 * CMIS 141 - HomeworkFour - state data
 * October 5, 2019
 *
**/



import java.util.Scanner;


public class StateDataEntry {
            // string array for storing state information
    private final String[] stateInTheUnion = { "Maine" , "New Hampshire" , "Vermont" , "Massachusetts" , "Rhode Island" , "Connecticut" };
            // string array for storing state flower information
    private final String[] stateFlower = { "the White Pine Cone" , "the Purple Lilac" , "the Red Clover" , "the American Elm" ,
            "the Common Blue Violet" , "the Mountain Laurel" };
            // string array for storing state bird information
    private final String[] stateBird = { "the Black-capped Chickadee" , "the Purple Finch" , "the Hermit Thrush" , "the Chickadee" ,
            "the Rhode Island Red" , "the American Robin" };

    String reportOutput;
            // string array for storing three summary reports
private String[] summaryReport = {"" , "" , ""};


/**
 * method that runs three loops, where the user is prompted each loop to enter a state in New England.
 * Once three inputs have been received, a summary report is displayed.  The summary report displays each of the three
 * input states in a string with its flower and bird.
**/

    public String StateDataEntry(){

        String stVal1 = "Which New England state wold you like to enter?"; // user input prompt used within loop
// create string to storage results of each loops true statement. string is added into summary array at the end of each loop
        String returnStateVal1 =null;

            // scanner for user input. input expected is a string
        Scanner userInput = new Scanner(System.in);

    /** this loop runs three times and compares a user string input and assigns a state/flower/bird connection **/
        for (int count = 1 ; count < 4 ; count ++) {
            System.out.println(stVal1); // repeats prompt for user input at the start of each loop

            String stateCheck = userInput.nextLine(); // next line of input is checked in six different 'if' statements

            // compare stateCheck user input against a state
            if (stateCheck.equalsIgnoreCase("Maine"))
            {
                returnStateVal1 = "The state you selected: " + stateInTheUnion[0] + "\nhas a state flower: " + stateFlower[0] + "\nand a state bird: " + stateBird[0];
            }

            // compare stateCheck user input against a state
            if (stateCheck.equalsIgnoreCase("New Hampshire"))
            {
                returnStateVal1 = "The state you selected: " + stateInTheUnion[1] + "\nhas a state flower: " + stateFlower[1] + "\nand a state bird: " + stateBird [1];
            }

            // compare stateCheck user input against a state
            if (stateCheck.equalsIgnoreCase("Vermont"))
            {
                returnStateVal1 = "The state you selected: " + stateInTheUnion[2] + "\nhas a state flower: " + stateFlower[2] + "\nand a state bird: " + stateBird [2];
            }

            // compare stateCheck user input against a state
            if (stateCheck.equalsIgnoreCase("Massachusetts"))
            {
                returnStateVal1 = "The state you selected: " + stateInTheUnion[3] + "\nhas a state flower: " + stateFlower[3] + "\nand a state bird: " + stateBird [3];
            }

            // compare stateCheck user input against a state
            if (stateCheck.equalsIgnoreCase("Rhode Island"))
            {
                returnStateVal1 = "The state you selected: " + stateInTheUnion[4] + "\nhas a state flower: " + stateFlower[4] + "\nand a state bird: " + stateBird [4];
            }

            // compare stateCheck user input against a state
            if (stateCheck.equalsIgnoreCase("Connecticut"))
            {
                returnStateVal1 = "The state you selected: " + stateInTheUnion[5] + "\nhas a state flower: " + stateFlower[5] + "\nand a state bird: " + stateBird [5];
            }

        /** each loop result is assigned a location in the summary report array based on the loop count  **/
                if (count == 1) // first user input result
                    summaryReport[0] = "\n" + returnStateVal1 + "\n";

                if (count == 2) // second user input result
                    summaryReport[1] = "\n" + returnStateVal1 + "\n";

                if (count == 3) // third user input result
                    summaryReport[2] = "\n" + returnStateVal1 + "\n";

            // summary report for the three inputs
        reportOutput = " \n\n---->> SUMMARY REPORT <<----\n" + summaryReport[0] + summaryReport [1] + summaryReport[2];
        } /** end FOR loop **/

            // string for output of final string value
        String finalReportOutput = reportOutput; // finalReportOutput is complete summary report

            return finalReportOutput;
    } /** end StateDataEntry() method **/

} /** end class StateDataEntry **/
