/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerscienceia;

import java.io.Serializable;

/**
 *
 * @author 567046
 */
public class Pension  implements Serializable{
    
    private int income; 
    private int yearsofSalary; // years receiving same salary
    private int definedCompanyBenefit; //third pension plan
    private boolean definedContribution; // if true, we will assume the person is recievng 
    private int currentSavings; // how much the client has currently saved for retirement
    
    public Pension (int income, int yearsofSalary, int definedCompanyBenefit, boolean definedContribution, int currentSavings)
    {
        this.income = income;
        this.yearsofSalary = yearsofSalary;
        this.definedCompanyBenefit = definedCompanyBenefit;
        this.definedContribution = definedContribution;
        this.currentSavings = currentSavings;
    }
    //Accessors and Modifiers of each variable
    public int getIncome (){
        return income;
    }
    public void changeIncome(int income) {
        this.income = income;
    }
    public int getYearsOfSalary (){
        return yearsofSalary;
    }
    public void changeYearsofSalary(int yearsofSalary) {
        this.yearsofSalary= yearsofSalary;
    }
    public int getDefinedCompanyBenefit (){
        return definedCompanyBenefit;
    }
    public void changeDefinedCompanyBenefit(int definedCompanyBenefit) {
        this.definedCompanyBenefit = definedCompanyBenefit;
    }
    public boolean getDefinedContribution (){
        return definedContribution;
    }
    public void changeDefinedContribution(boolean definedContribution) {
        this.definedContribution= definedContribution;
    }
    public int getCurrentSavings() {
        return currentSavings;
    }

    public void changeCurrentSavings(int currentSavings) {
        this.currentSavings = currentSavings;
    }
    
    
    //Method to calculate OAS
    public int calculateOAS(int yearsCanada18) {
    int oas; //Old Age Security
        if (yearsCanada18 > 40) {
            oas = 560; //$560
        }
        else if (yearsCanada18 < 20 && yearsCanada18 > 0) {
            oas = 280;//$280
        }
        else if (yearsCanada18 < 40 && yearsCanada18 > 30) {
            oas = 475; //$475
        }
        else if (yearsCanada18 < 30 && yearsCanada18 > 20) {
            oas = 400; //$400
        }
        else {
            oas = 0; //$0
        }
    return oas; // Return value of OAS
    }
    
    //Method to calculate CPP
    public int calculateCPP(int income, int yearsofSalary) {
        int cpp; // Canadian Pension Plan
        if (income >= 54000) {
            if (yearsofSalary >= 28) {
                cpp = 1134; //$
            }
            else if (yearsofSalary < 28 && yearsofSalary > 15) {
                cpp = 950; //$
            }
            else {
                cpp = 641; //$
            }
        }
        else if (income < 54000) {
            cpp = 641; //$
        }
        else {
            cpp = 0; //$
        }
    return cpp; //Return value of cpp
    }
}
