/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

/**
 *
 * @author FA
 */
public class OperatingSystem extends ComputerRequirement{
    private String brandName;
    private double installationCost;
    
    
    public void orderOperatingSystem(){
        System.out.println("You picked "+ brandName+". Installation cost is $"+(String.format("%.2f", installationCost)));
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getInstallationCost() {
        return installationCost ;
    }

    public void setInstallationCost(double installationCost) {
        this.installationCost = installationCost;
    }

   
    
    

   
    
    
    
}
