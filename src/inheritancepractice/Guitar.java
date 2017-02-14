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
public class Guitar extends StringedInstrument{
    private String weight;
    private String color;

   public void playInstrument(){
       System.out.println("Your are playing "+color+", "+weight+" guitar");
   }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String Guitar(){
        return weight + " "+ color;
    
    }
    
    
    
    


    
    
    
}
