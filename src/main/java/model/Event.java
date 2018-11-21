package model;

import com.google.gson.annotations.SerializedName;

import java.sql.Date;
import java.sql.Timestamp;

public class Event {

    @SerializedName("name")
    private String name;
    @SerializedName("time")
    private String time;
    @SerializedName("duration")
    private String duration;
    @SerializedName("address")
    private String address;
    @SerializedName("status")
    private String status;
    @SerializedName("description")
    private String description;

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getDuration() {
        return duration;
    }

    public String getAddress() {
        return address;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", time='" + new Timestamp(Long.parseLong(time)).toString() + '\'' +
                ", duration='" + Integer.parseInt(duration) / 3600000 + "h" + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
