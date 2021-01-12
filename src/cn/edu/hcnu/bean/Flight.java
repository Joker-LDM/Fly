package cn.edu.hcnu.bean;

public class Flight {
        private String id; //作为数据库中的主键,UUID
        private String flightid;   //航班型号id
        private String planeType;  //飞机型号
        private String departureAirPort;  //起始地
        private String destinationAirPort;  //终点
        private String departureTime;    //离行时间
        private String updateFlight;     //到达时间

    public Flight(String id, String flightid, String planeType, String departureAirPort, String departureTime) { //创建构造方法
    {
        this.id=id;     //将id的值赋给成员变量id，下同理
        this.flightid=flightid;
        this.departureAirPort=departureAirPort;
        this.destinationAirPort=departureAirPort;
        this.departureTime=departureTime;

    }



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
    /*增加flight的属性
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
    } */




