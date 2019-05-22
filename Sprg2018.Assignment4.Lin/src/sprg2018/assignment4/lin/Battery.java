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
public class Battery {
    public String type;
    String cells;
    String casing;
    String controller;
    String charger;
    
    public Battery(String cells, String casing, String controller, String charger) {
        this.cells = cells;
        this.casing = casing;
        this.controller = controller;
        this.charger = charger;
    }
}
