
package br.eti.leticia.airports.entities.service;

import br.eti.leticia.airports.entities.Airport;
import br.eti.leticia.airports.entities.DTO.AirportMinDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.eti.leticia.airports.repositories.AirportRepository;

@Service

public class AirportService {
 
    @Autowired

    private AirportRepository airportRepository;

    public List<Airport> findAll() {
        

        List<Airport> result = airportRepository.findAll();

        return result;
    }
    public List<Airport> findByCity(String city) {
        List<Airport> result = airportRepository.findByCityIgnoreCase(city);
        return result;
                
    }
    /**
 * Retorna DTO AirportsMinDTO filtrado por country (pais).
 *
 * @param country
 * @return
 */
 public List<AirportMinDTO> findByCountry(String country) {
    List<Airport> resultAirport = airportRepository.findByCountryIgnoreCase(country);

    List<AirportMinDTO> resultDTO = resultAirport.stream()
            .map(x -> new AirportMinDTO(x)).toList();
    return resultDTO;
    

    }
    public Airport findByIataCode(String iataCode) {
        Airport result = airportRepository.findByIataCode(iataCode);
        return result;
    }
}


