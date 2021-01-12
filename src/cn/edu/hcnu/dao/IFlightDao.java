package cn.edu.hcnu.dao;

import cn.edu.hcnu.bean.Flight;
import java.util.Set;

//创建IFlightDao接口
public interface IFlightDao {

    void insertFlight(Flight flight);
    Set<Flight> getAllFlights();   //？
    Flight getFlightByDepartureTime(String departureTime);
    Flight getDepartureAirPort(String AirPort);
    Flight getDestinationAirPort(String getDestinationAirPort);
    void updateFlight(Flight flight);

}
