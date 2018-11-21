import controller.HttpController;
import controller.impl.HttpControllerImpl;
import helper.Utils;
import model.City;
import model.Event;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to my console app!");
        Utils.printBreak();

        HttpController httpController = new HttpControllerImpl();
        City[] cities = httpController.getCitiesByCountry("rs");

        Utils.printBreak();

        while (true) {
            System.out.print("Pick a city to get it's events: ");
            Scanner in = new Scanner(System.in);
            try {
                int num = in.nextInt();
                String city = cities[num].getCity();
                Event[] events = httpController.getEventsByCity(city);
            } catch (InputMismatchException e) {
                Utils.printBreak();
                System.out.println("You need to insert an integer number");
            } catch (ArrayIndexOutOfBoundsException e) {
                Utils.printBreak();

                System.out.println("You need to insert a number between " + 0 + " and " + (cities.length - 1));
            } finally {
                Utils.printBreak();
            }

        }
    }
}
