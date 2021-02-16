import java.awt.*;

class TestHeadPhone {

    public static void main(String[] args) {

        // first headphone object
        HeadPhone headPhoneOne = new HeadPhone();
/**
 * for setting specific values to headphone attributes that are outside of default settings found in class.
 * Uncomment and adjust the setter lines to pass non-default information to the toString() method. As long as
 * the setter lines are commented, default values are returned and printed.
//**/
//        headPhoneOne.setVolume(1);
//        headPhoneOne.isPluggedIn();
//        headPhoneOne.setManufacturer("Lebron James Headphone Company");
//        headPhoneOne.setHeadPhoneColor(Color.pink);
//        headPhoneOne.setHeadPhoneModel("Beats");

    /** use both toString() and changeVolume() methods for printing values **/
        System.out.println(headPhoneOne.toString());
        System.out.println(headPhoneOne.changeVolume());
    }
}

