package computerscienceia;

import java.io.Serializable;

/**
 *
 * @author 567046
 */
public class Client implements Serializable{
    private String name;
    private int age;
    private int ageRetirement; // what age do you want to retire
    private int canadaYears; //how many years in living in Canada
    private String email;
    private int futureRetirementIncome; // how much money do you want to make after retirement based on the lifestyle you want
    
    public Client (String name, int age, int canadaYears, int ageRetirement, String email, int futureRequirementIncome)
    {
        this.name=name;
        this.age=age;
        this.canadaYears=canadaYears;
        this.ageRetirement=ageRetirement;
        this.email=email;
        this.futureRetirementIncome = futureRequirementIncome;
    }
    // Accessors and Modifiers
    public String getName() 
    {
        return name;
    }
    public void changeName(String name) {
        this.name=name;
    }
  
    public int getAge() {
        return age;
    }
    public void changeAge(int age) {
        this.age=age;
    }
    public int getCanadaYears() {
        return canadaYears;
    }
    public void changeCanadaYears(int canadaYears) {
        this.canadaYears=canadaYears;
    }
    public int getAgeRetirement() {
        return ageRetirement;
    }

    public void changeAgeRetirement(int ageRetirement) {
        this.ageRetirement = ageRetirement;
    }

    public String getEmail() {
        return email;
    }

    public void changeEmail(String email) {
        this.email = email;
    }
   
    public int getFutureRetirementIncome() {
        return futureRetirementIncome;
    }

    public void changeFutureRetirementIncome(int futureRetirementIncome) {
        this.futureRetirementIncome = futureRetirementIncome;
    }
    
}       

