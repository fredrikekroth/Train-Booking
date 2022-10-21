public class Train {

    private String location;
    private String destination;

    public String getLocation() {
        return location;
    }

    public boolean setLocation(String location) {
        if (location != null && !location.isEmpty()) {
            this.location = location;
            return true;
        }
        return false;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String newDestination) {
        if (newDestination != null && !newDestination.isEmpty()) {
            destination = newDestination;
        }
    }

    public Train(String location, String destination) {
        this.location = location;
        this.destination = destination;
    }

    public Train(String destination) {
        this.location = destination;
        this.destination = "";
    }

    public Train() {

    }


}
