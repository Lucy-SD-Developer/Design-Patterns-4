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
public class USABattFactory extends BattFactory {
    @Override
    protected void preparing(String type) {
        ComponentFactory componentFactory = new USABatteryComponentFactory();
        this.cells = componentFactory.createCells(type);
        this.casing = componentFactory.createCasing(type);
        this.charger = componentFactory.createCharger(type);
        this.controller = componentFactory.createController(type);
    }

    @Override
    protected void assembling() {
        this.battery = new Battery(this.cells, this.casing, this.controller, this.charger);
    }

    @Override
    protected void testing() {
        System.out.println("USA battery cells for " + this.cells);
        System.out.println("USA battery casing for " + this.casing);
        System.out.println("USA battery controller for " + this.controller);
        System.out.println("USA battery charger for " + this.charger);
    }
    
    @Override
    protected Battery createBattery(String type) {
        this.preparing(type);
        this.assembling();
        this.testing();
        return this.shipping();
    }
    
}
