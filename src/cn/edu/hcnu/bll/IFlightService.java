package cn.edu.hcnu.bll;

import cn.edu.hcnu.bean.Flight;
import java.util.Set;

public interface IFlightService   //创建IFlightService的业务层数据接口
{
    void insertFlight(Flight flight);
    Set<Flight> getAllFlights();    //？
    Flight getFlightByDepartureTime(String departureTime);
    Flight getDepartureAirPort(String departureAirPort);
    Flight getDestinationAirPort(String destinationAirPort);
    void updateFlight(Flight flight);
}
