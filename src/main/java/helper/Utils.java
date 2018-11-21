package helper;

import model.City;
import model.Event;

import java.io.IOException;

public class Utils {

    public static void printBreak() {
        System.out.println();
        System.out.println("/////////////////////////////////");
        System.out.println();
    }

    public static void printCities(City[] cityArray) {
        if (cityArray.length > 0) {
            for (int i = 0; i < cityArray.length; i++) {
                System.out.print(i + " - ");
                System.out.println(cityArray[i].getCity());
            }
        } else {
            printBreak();
            System.out.println("No cities for the given country");
        }
    }

    public static void printEvents(Event[] eventArray) {
        if (eventArray.length > 0) {
            for (int i = 0; i < eventArray.length; i++) {
                System.out.println(eventArray[i].toString());
                printBreak();
            }
        } else {
            printBreak();
            System.out.println("No events for the given city");
        }
    }
}
