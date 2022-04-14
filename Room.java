public class Room  {
    private double width;
    private double length;
    private int floor;

    //part a
    public Room() {
        width = 10.0;
        length = 12.5;
        floor = 1;
    }

    //part c
    public Room(double d1, double d2, int floor) {
        if (d1 > d2) {
            setLength(d1);
            setWidth(d2);
        }
        else {
            setLength(d2);
            setWidth(d1);
        }
        setFloor(floor);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double d) {
        if (d > 0)
            this.width = d;

    }

    public double getLength() {
        return length;
    }

    //part b
    public void setLength(double d2) {
        if (d2 > 0)
            this.length = d2;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    //part d
    @Override
    public String toString() {
        return "Room " + length +
                " X " + width +
                ", floor " + floor;
    }
    
}
