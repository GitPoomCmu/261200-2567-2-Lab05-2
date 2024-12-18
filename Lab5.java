import java.time.LocalDate;

public class Lab5 {
    public static void main(String[] args) {
        LocalDate current = LocalDate.now();

        User john = new User("John", current.getYear(), current.getMonthValue(), current.getDayOfMonth());
        john.displayInfo();
        john.displayHappyBirthday();

        System.out.println();

        Admin nicolas = new Admin("Nicolas", 1990, current.getMonthValue(), current.getDayOfMonth());
        nicolas.displayInfo();
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);
        nicolas.displayHappyBirthday();
    }
}