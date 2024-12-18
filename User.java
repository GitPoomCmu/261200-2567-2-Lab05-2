import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;

    public User(){
        this.name = null;
        this.dob = LocalDate.now();
    }
    public User(String name, int year, int month, int day){
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    public void displayInfo(){
        System.out.println("[Name]: " + name + " [Birthdate]: " + dob );
    }

    protected boolean isBirthday(){
        LocalDate current = LocalDate.now();
        if(this.dob.getMonth() == current.getMonth() && this.dob.getDayOfMonth() == current.getDayOfMonth()){
            return true;
        }
        else return false;
    }

    public void displayHappyBirthday() {
        if(isBirthday()){
          System.out.println("[*] Happy birthday " + this.name + "!");
        }
    }
}
