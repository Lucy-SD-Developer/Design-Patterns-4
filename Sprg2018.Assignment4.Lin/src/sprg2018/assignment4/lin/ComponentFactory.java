/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprg2018.assignment4.lin;

/**
 *
 * @author Lu Lin
 */
public interface ComponentFactory {
    
    public String createCells(String type);
    
    public String createCasing(String type);
    
    public String createController(String type);
    
    public String createCharger(String type);
    
}
