/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap.swap_solver_v1;

import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class ERList {
     private ArrayList<ExchangeRequest> exchangeRequests;
    private int minDate;
    private ExchangeRequest minExchangeRequest ;
    public ERList() {
        exchangeRequests = new ArrayList<>();
        minDate = Integer.MAX_VALUE;
        minExchangeRequest = null;
    }
    
    @Override
    public String toString(){
        String ret="[";
        for(ExchangeRequest p : exchangeRequests){
            ret += p.toString();
        }
        ret+="]";
        return ret;
    }
    
    public void addExchangeRequest(ExchangeRequest p){
        exchangeRequests.add(p);
        if(p.getCreated_at() < minDate){
            minDate = p.getCreated_at();
            minExchangeRequest = p;
        }
    }
    
    public int getMinDate(){
        return minDate;
    }
    
    public ExchangeRequest getMinExchangeRequest(){
        return minExchangeRequest;
    } 
}
