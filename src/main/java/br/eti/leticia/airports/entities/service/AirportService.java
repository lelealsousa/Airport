
package br.eti.leticia.airports.entities.service;

import br.eti.leticia.airports.entities.Airport;
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
    
}
