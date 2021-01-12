package cn.edu.hcnu.dao;

import java.util.Set;

public interface IFlightDao {

    void insertFlight(Flight flight);
    Set<Flight> getAllFlights();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getDepartureAirPort(String AirPort);
    Flight getDestinationAirPort(String getDestinationAirPort);

    void updateFlight(Flight flight);




}
