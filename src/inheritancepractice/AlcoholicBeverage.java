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
public class AlcoholicBeverage extends Drink {

    private String alcoholType;
    private double percentageOfAlcohol;

    public void displayAlcoholicBeverageInfo() {
        System.out.println(alcoholType + "  %" + percentageOfAlcohol);
    }

    public String getAlcoholType() {
        return alcoholType;
    }

    public void setAlcoholType(String alcoholType) {
        this.alcoholType = alcoholType;
    }

    public double getPercentageOfAlcohol() {
        return percentageOfAlcohol;
    }

    public void setPercentageOfAlcohol(double percentageOfAlcohol) {
        this.percentageOfAlcohol = percentageOfAlcohol;
    }

}
