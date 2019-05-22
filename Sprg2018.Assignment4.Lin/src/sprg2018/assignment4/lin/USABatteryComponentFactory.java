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
public class USABatteryComponentFactory implements ComponentFactory {
    public String createCells(String type) {
        if (type.equalsIgnoreCase("Soul-ev")) {
            return "Soul-ev: Lithium";
        } else if (type.equalsIgnoreCase("Optima_hybrid")) {
            return "Optima_hybrid: Dual Carbon";
        } else if (type.equalsIgnoreCase("Rio")) {
            return "Rio: Lead";
        } else {
            System.out.println("Error: invalid type of battery.");
            return null;
        }
    }
    
    public String createCasing(String type) {
        if (type.equalsIgnoreCase("Soul-ev")) {
            return "Soul-ev: Aluminium";
        } else if (type.equalsIgnoreCase("Optima_hybrid")) {
            return "Optima_hybrid: Kevlar";
        } else if (type.equalsIgnoreCase("Rio")) {
            return "Rio: Particleboard";
        } else {
            System.out.println("Error: invalid type of battery.");
            return null;
        }
    }
    
    public String createController(String type) {
        if (type.equalsIgnoreCase("Soul-ev")) {
            return "Soul-ev: Arduino";
        } else if (type.equalsIgnoreCase("Optima_hybrid")) {
            return "Optima_hybrid: Arduino V2";
        } else if (type.equalsIgnoreCase("Rio")) {
            return "Rio: Raspberry Pi";
        } else {
            System.out.println("Error: invalid type of battery.");
            return null;
        }
    }
    
    public String createCharger(String type) {
        if (type.equalsIgnoreCase("Soul-ev")) {
            return "Soul-ev: 110 Volts";
        } else if (type.equalsIgnoreCase("Optima_hybrid")) {
            return "Optima_hybrid: 110 Volts";
        } else if (type.equalsIgnoreCase("Rio")) {
            return "Rio: 220 Volts";
        } else {
            System.out.println("Error: invalid type of battery.");
            return null;
        }
    }

}
