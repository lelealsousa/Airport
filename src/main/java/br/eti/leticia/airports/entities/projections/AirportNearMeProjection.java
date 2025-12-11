
package br.eti.leticia.airports.entities.projections;


public interface AirportNearMeProjection {
    long getId();
    String getName();
    String getCity();
    String getIataCode();
    double getLatitude ();
    double getLongitude();
    double getAltitude();
    double getDistanciaKM();
    
}
