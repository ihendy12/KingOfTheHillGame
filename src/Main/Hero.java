package Main;

public class Hero {

    //attributes
    private String firstName;
    private String lastName;
    private int healthPoints = 200;

//Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    //Setters


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    //Constructors


    public Hero(String firstName, String lastName, int healthPoints) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.healthPoints = healthPoints;
    }
}
