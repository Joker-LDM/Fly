package cn.edu.hcnu.bll.impl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightService;
import java.util.Set;

public class FlightServericeImpl implements IFlightService
    //实现调用IFlightSerice接口
{
    @Override
    public void insertFlight(Flight flight) {

    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Flight getDepartureAirPort(String departureAirPort) {
        return null;
    }

    @Override
    public Flight getDestinationAirPort(String destinationAirPort) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
