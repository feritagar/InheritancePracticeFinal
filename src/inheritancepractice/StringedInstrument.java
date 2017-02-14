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
public class StringedInstrument extends MusicalInstrument{

   private int numberOfString;
   private String madeItem;

    public void repairInstrument(){
        System.out.println("Your "+numberOfString+" string,"+madeItem+" musical instrument repaired");
    }

    public int getNumberOfString() {
        return numberOfString;
    }

    public void setNumberOfString(int numberOfString) {
        this.numberOfString = numberOfString;
    }

    public String getMadeItem() {
        return madeItem;
    }

    public void setMadeItem(String madeItem) {
        this.madeItem = madeItem;
    }
   
   
}
