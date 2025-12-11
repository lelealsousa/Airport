
package br.eti.leticia.airports.entities.service;

import br.eti.leticia.airports.entities.Airport;
import br.eti.leticia.airports.entities.DTO.AirportMinDTO;
import br.eti.leticia.airports.entities.DTO.AirportNearMeDTO;
import br.eti.leticia.airports.entities.projections.AirportNearMeProjection;
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
    
    public List<AirportNearMeDTO> FindNearMe(double latitude, double longitude) {
       List<AirportNearMeProjection> resultNearAirports = airportRepository.findNearMe(latitude, longitude);
       List<AirportNearMeDTO> resultDTO = resultNearAirports.stream()
                .map(x -> new AirportNearMeDTO(x)).toList();
        return resultDTO;
    }
}


