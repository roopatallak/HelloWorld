
public class HolidayMain {
    public static void main(String[] args) {
        Holiday hol1 = new Holiday("Independence Day", 4, "July");
        Holiday hol2 = new Holiday("another day", 8, "july");

        Holiday hol3 = new Holiday("test day", 17, "october");
        boolean isSame = isSameMonth(hol1, hol2);

        System.out.println("Holi1 is in: "+hol1.getMonth() + " Hol2 is in : " + hol2.getMonth() + " Are they same? :" + isSame);
        isSame = isSameMonth(hol1, hol3);
        System.out.println("Holi1 is in: "+hol1.getMonth() + " Hol2 is in : " + hol3.getMonth() + " Are they same? :" + isSame);

        Holiday[] hols = {hol1, hol2, hol3};
        double avg = avgDate(hols);
        System.out.println("The dates are : ");
        for (Holiday hol : hols) {
            System.out.println(hol.getDay());
        }

        System.out.println("Average is: " + avg);

    }


    public static boolean isSameMonth(Holiday h1, Holiday h2) {
        return h1.getMonth().equalsIgnoreCase(h2.getMonth());

    }

    public static double avgDate(Holiday[] hols) {

        if (hols == null) return 0.0;

        double total = 0.0;
        //double avg = 0.0;
        for (Holiday hol : hols) {
            total += (float) hol.getDay();
        }
        return total / hols.length;


    }
}