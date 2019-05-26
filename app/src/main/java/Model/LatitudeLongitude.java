package Model;

import java.io.StringReader;

public class LatitudeLongitude {

    private double lat;
    private double lon;
    private String marker;

    public LatitudeLongitude(double lat, double lon, String marker)
    {
        this.lat = lat;
        this.lon = lon;
        this.marker = marker;

    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getMarker() {
        return marker;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }
}
