package cn.edu.hcnu.bean;

public class Flight {
        private String id; //作为数据库中的主键,UUID
        private String flightid;   //航班型号id
        private String planeType;
        private String departureAirPort;
        private String destinationAirPort;
        private String departureTime;
        private String updateFlight;

    public Flight(String id,String flightid,String planeType,String departureAirPort
        ,String departureTime,String updateFlight) //创建构造方法
    {
        this.id=id;     //将id的值赋给成员变量id
        this.flightid=flightid;
        this.departureAirPort=departureAirPort;    //?
        this.destinationAirPort=departureAirPort;
        this.departureTime=departureTime;

    }
    //增加flight的属性
    public String getUpdateFlight() {
        return updateFlight;
    }

    public void setUpdateFlight(String updateFlight) {
        this.updateFlight = updateFlight;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getDepartureAirPort() {
        return departureAirPort;
    }

    public void setDepartureAirPort(String departureAirPort) {
        this.departureAirPort = departureAirPort;
    }

    public String getDestinationAirPort() {
        return destinationAirPort;
    }

    public void setDestinationAirPort(String destinationAirPort) {
        this.destinationAirPort = destinationAirPort;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    public String getFlightid() {
        return flightid;
    }

    public void setFlightid(String flightid) {
        this.flightid = flightid;
    }

    @Override  //增加toString方法，便于MainUI调用
    public String toString() {
        return "Flight{" +
                "flightid='" + flightid + '\'' +
                ", planeType='" + planeType + '\'' +
                ", departureAirPort='" + departureAirPort + '\'' +
                ", destinationAirPort='" + destinationAirPort + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", updateFlight='" + updateFlight + '\'' +
                '}';
    }

}

