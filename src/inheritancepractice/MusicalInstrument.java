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
public class MusicalInstrument {

    private String brand;
    private double cleaningCost;

    public void cleanUpInstrument() {
        System.out.println("Brand :"+brand+". Cleaning Cost: $"+(String.format("%.2f", cleaningCost)));
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCleaningCost() {
        return cleaningCost;
    }

    public void setCleaningCost(double cleaningCost) {
        this.cleaningCost = cleaningCost;
    }

    

}
