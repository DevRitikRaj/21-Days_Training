
public class LeapYear {

    public static int year(int y) {
        if ((y % 2000 != 0 && y % 400 == 0) || (y % 100 != 0 && y % 4 == 0)) {
            System.out.println("It is Leap year");

        } else {
            System.out.println("Not a Leap year");
        }
        return y;
    }

    

    public static void main(String[] args) {
        year(2000);

    }

}
