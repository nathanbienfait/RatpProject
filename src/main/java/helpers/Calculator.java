package helpers;

import graph.Node;
import graph.Station;

import static java.lang.Math.abs;

public class Calculator {

    public static double distanceBetweenStations(Station a, Station b){
        double lat1 = Double.parseDouble(a.getLat());
        double lat2 = Double.parseDouble(b.getLat());
        double lon1 = Double.parseDouble(a.getLng());
        double lon2 = Double.parseDouble(b.getLng());

        return distance(lat1,lat2,lon1,lon2);
    }

    public static double distance(double lat1, double lat2, double lon1, double lon2) {

        final int R = 6371; // Radius of the earth
        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c * 1000; // convert to meters
    }
}
