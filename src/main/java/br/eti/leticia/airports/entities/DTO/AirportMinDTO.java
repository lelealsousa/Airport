
package br.eti.leticia.airports.entities.DTO;

import br.eti.leticia.airports.entities.Airport;

public class AirportMinDTO {
    private long id;

    private String name;

    private String city;

    private String iataCode;

    public AirportMinDTO() {
    }


    public AirportMinDTO (Airport airport) {

        this.id = airport.getId();

        this.name = airport.getName();

        this.city = airport.getCity();

        this.iataCode = airport.getIataCode();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }
    
    
}
    

