/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author Aliza Putri Utami S
 */
public class Programmer extends Orang {
    private String ProId;
    
    public Programmer(String ProId){
        this.ProId = ProId;
    }
    
    /** 
     * @return ProId
     */
    public String getProId(){
        return ProId;
    }
    
    /**
     * @param ProId the ProId to set
     */
    public void setProId(String ProId){
        this.ProId = ProId;
    }
    
    private static class ProId{
        
        public ProId(){
        }
    }
}
