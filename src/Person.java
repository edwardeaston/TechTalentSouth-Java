public class Person {

    private String firstName;
    private String lastName;
    private String location;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    Person(int age, String firstName, String lastName, String location) {
        this.setAge(age);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setLocation(location);

        System.out.println("Hey " + getFirstName() + " " + getLastName() + " I heard it was your birthday and you're " + getAge() + " years old today! Have fun celebrating in " + getLocation() + "!");

    }

    public static void main(String[] args) {

        Person Eddie = new Person(23, "Eddie", "Easton", "Phoenix");
    }
}
