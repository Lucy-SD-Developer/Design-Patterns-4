package sprg2018.assignment4.lin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lu Lin
 */
public abstract class BattFactory {
    protected String casing;
    protected String cells;
    protected String controller;
    protected String charger;
    protected Battery battery;
    
    protected abstract Battery createBattery(String type);
    protected abstract void preparing(String type);
    protected abstract void assembling();
    protected abstract void testing();
    protected Battery shipping() {
        System.out.println("Shipping battery.\n");
        return this.battery;
    }
}
