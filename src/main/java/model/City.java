package model;

import com.google.gson.annotations.SerializedName;

public class City {

    @SerializedName("zip")
    private String zip;
    @SerializedName("country")
    private String country;
    @SerializedName("localized_country_name")
    private String localizeCountryName;
    @SerializedName("distance")
    private double distance;
    @SerializedName("city")
    private String city;
    @SerializedName("lon")
    private double lon;
    @SerializedName("ranking")
    private int ranking;
    @SerializedName("id")
    private int id;
    @SerializedName("member_count")
    private int memberCount;
    @SerializedName("lat")
    private double lat;

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    public String getLocalizeCountryName() {
        return localizeCountryName;
    }

    public double getDistance() {
        return distance;
    }

    public String getCity() {
        return city;
    }

    public double getLon() {
        return lon;
    }

    public int getRanking() {
        return ranking;
    }

    public int getId() {
        return id;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public double getLat() {
        return lat;
    }

    @Override
    public String toString() {
        return "City{" +
                "zip='" + zip + '\'' +
                ", country='" + country + '\'' +
                ", localizeCountryName='" + localizeCountryName + '\'' +
                ", distance=" + distance +
                ", city='" + city + '\'' +
                ", lon=" + lon +
                ", ranking=" + ranking +
                ", id=" + id +
                ", memberCount=" + memberCount +
                ", lat=" + lat +
                '}';
    }
}
