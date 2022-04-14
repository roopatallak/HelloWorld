import java.util.*;

public class Room  implements Comparable<Room> {
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

    //part e
    @Override
    public int compareTo(Room o) {
        return Comparator.comparing(Room::getFloor).thenComparing(Room::getLength).thenComparing(Room::getWidth).compare(this, o);
    }

    //part d
    @Override
    public String toString() {
        return "Room " + length + " X " + width + ", floor " + floor;
    }

    public static void main(String[] args) {
        List<Room> rooms = new ArrayList<Room>();
        rooms.add(new Room (10,30,2));
        rooms.add(new Room(15,20,1));
        rooms.add(new Room(5, 4, 13));
        Collections.sort(rooms);
        System.out.println("After Sorting " + rooms);


        }
    }


