// Richard Brown
// CMIS 141 homework 2
// September 18th 2019

/** this program uses another class to get and print different guitar attributes.  **/
public class RunGuitar {

    public static void main (String [] args) // main
    {

        /** using constructor with set inputs**/
        //Guitar instrument1 = new Guitar(12, 42.0, "Leadbelly", Color.blue);

        /** using default constructor **/
        Guitar instrument1 = new Guitar();
        System.out.println(" *** OUTPUT *** ");
        System.out.println(instrument1.toString()); // print of toString
        System.out.println(instrument1.getNumStrings()); // print just number of guitar strings
        System.out.println(instrument1.getGuitarLength()); // print just guitar length
        System.out.println(instrument1.getGuitarManufacturer()); // print just guitar manufacturer
        System.out.println(instrument1.getGuitarColor()); // print only guitar color
        System.out.println(instrument1.playGuitar()); // print 16 random cord/duration combinations

    }// end of main
} // end class
