
package br.eti.leticia.airports.entities.controllers;

import br.eti.leticia.airports.entities.Airport;
import br.eti.leticia.airports.entities.service.AirportService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AirportController {


    @Autowired
 
    private AirportService airportService;
    


    @GetMapping("/airport")

    public List<Airport> findAll() {

        List<Airport> result = airportService.findAll();

        return result;
    }
   
    
    @GetMapping("/city/{cityName}")

    public List<Airport> findByCityIgnoreCase(@PathVariable String cityName) {

            List<Airport> result = airportService.findByCity(cityName);

            return result;
 }
}