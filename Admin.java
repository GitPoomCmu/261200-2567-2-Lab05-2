import java.time.LocalDate;

class Admin extends User{
    public Admin(){
        this.name = null;
        this.dob = LocalDate.now();
    }
    public Admin(String name, int year, int month, int day){
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    public void displayInfo(){
        System.out.println("[!] User type: Admin.");
    }
    public void displayInfo(Boolean full){
        if(full == true){
            System.out.println("[Name]: " + name + " [Birthdate]: " + dob);
        }
        else{
            System.out.println("[Name]: " + name);
        }
    }

    public void displayHappyBirthday() {
        LocalDate current = LocalDate.now();
        if(isBirthday()){
          System.out.println("Happy birthday " + this.name + "! You're " + (current.getYear() - this.dob.getYear()) + "!");
        }
    }
}
