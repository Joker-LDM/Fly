package cn.edu.hcnu.bean;
public class Flight {
        private String id;
        private String planeType;
        private String departureAirPort;
        private String destinationAirPort;
        private String departureTime;
        private String updateFlight;

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
    }

