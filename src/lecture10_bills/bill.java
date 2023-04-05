
package lecture10_bills;


public class bill {
    public String  strCustomer;
    public double dblMinutes, dblCost;
    
    //constuctor receiving variables
    public bill (String strName, double dblCostPerMinute, double dblMinutesTalked ){
        strCustomer = strName;
    dblMinutes = dblMinutesTalked;
    dblCost = dblCostPerMinute;
    
                
    }
            
    public String getName(){
        return strCustomer;
        
    }
    public double getTotalBills(){
        return (dblMinutes * dblCost);
    }
}
