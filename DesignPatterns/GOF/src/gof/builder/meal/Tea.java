/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.builder.meal;

/**
 *
 * @author FA20-BSE-037
 */
public class Tea extends HotDrink implements DecBevarages {
//    @Override
//   public float price() {
//      return 30.0f;
//   }
//
//   @Override
//   public String name() {
//      return "Tea";
//   }
   private String sweettype;
    private int sweetnessAmountInSpoons;
    private boolean hasCream;

    public Tea() {
        this.sweettype = "None";
        this.sweetnessAmountInSpoons = 0;
        this.hasCream = false;
    }

    
//    public float price() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public String name() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public void addSweetness(String sweettype, int amountspoons) {
        this.sweettype = sweettype;
        this.sweetnessAmountInSpoons = amountspoons;

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addCream() {
        this.hasCream = true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getDecorationCost() {
        float decorationCost = sweetnessAmountInSpoons * 0.5f;
        if (hasCream) {
            decorationCost += 5.0f;
        }
        return decorationCost;

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public float price() {
        return 15.0f + getDecorationCost(); // Add decoration cost to the base price
    }

    @Override
    public String name() {
        return "Tea";
    }

}
