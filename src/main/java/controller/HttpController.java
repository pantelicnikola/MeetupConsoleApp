package controller;

import model.City;
import model.Event;

import java.util.List;

public interface HttpController {
    City[] getCitiesByCountry(String country);
    Event[] getEventsByCity(String city);
}
