package helper;

public class URLHelper {

    public static String buildURLCities(String URL1, String country) {
        if (country != null && country != "") {
            return URL1 + country;
        } else {
            throw new IllegalArgumentException("Wrong input parameter");
        }
    }

    public static String buildURLEvents(String URL1, String URL2, String APIKey, String city) {
        if (city != null && city != "") {
            if (city.contains(" ")) {
                city = city.replace(" ", "%20");
            }
            return URL1 + APIKey + URL2 + city;
        } else {
            throw new IllegalArgumentException("Wrong input parameter");
        }
    }
}
