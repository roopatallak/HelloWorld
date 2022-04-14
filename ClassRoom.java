public class ClassRoom extends Room {
    private int numStudents;

    public int getNumStudents() {
        return numStudents;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    //part g
    public ClassRoom(double d1, double d2, int floor, int numStudents) {
        super(d1, d2, floor);
        this.numStudents = numStudents;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacity = " + numStudents;

    }

    public static void main(String[] args) {
        ClassRoom cr = new ClassRoom(12,14,3,45);
        System.out.println(cr);
    }
}
