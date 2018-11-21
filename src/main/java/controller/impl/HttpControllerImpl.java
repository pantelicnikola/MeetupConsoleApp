package controller.impl;

import controller.HttpController;
import helper.GsonHelper;
import helper.URLHelper;
import helper.Utils;
import model.City;
import model.Event;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HttpControllerImpl implements HttpController {
    public City[] getCitiesByCountry(String country) {

        City[] cityArray = {};

        final String URL1 = "https://api.meetup.com/2/cities?country=";
        String URL = URLHelper.buildURLCities(URL1, country);

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(URL);

        try {
            HttpResponse response = httpClient.execute(request);
            String responseBody = new BasicResponseHandler().handleResponse(response);
            cityArray = GsonHelper.fromJson(responseBody, City[].class);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            Utils.printCities(cityArray);
            return cityArray;
        }
    }

    public Event[] getEventsByCity(String city) {

        Event[] eventArray = {};

        final String URL1 = "https://api.meetup.com/2/open_events??&key=";
        final String URL2 = "&sign=true&photo-host=public&country=rs&city=";
        final String APIKey = "1d213d78285f1b503739f7b3e463034";
        String URL = URLHelper.buildURLEvents(URL1, URL2, APIKey, city);

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(URL);

        try {
            HttpResponse response = httpClient.execute(request);
            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String responseBody = rd.readLine();

            eventArray = GsonHelper.fromJson(responseBody, Event[].class);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            Utils.printEvents(eventArray);
            return eventArray;
        }
    }
}
