package cn.edu.hcnu.dao.impl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.dao.IFlightDao;

import java.util.Set;


//调用IFlightDao接口
public class FlightDaoIml implements IFlightDao {
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
    public Flight getDepartureAirPort(String AirPort) {
        return null;
    }

    @Override
    public Flight getDestinationAirPort(String getDestinationAirPort) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
