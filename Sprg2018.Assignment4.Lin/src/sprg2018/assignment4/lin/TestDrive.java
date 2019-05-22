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
public class TestDrive {
    public static void main(String[] args) {
        BattFactory usaFactory = new USABattFactory();
        BattFactory euFactory = new EUBattFactory();
        BattFactory asiaFactory = new AsiaBattFactory();
        
        Battery battery11 = usaFactory.createBattery("Rio");
        Battery battery12 = usaFactory.createBattery("Optima_hybrid");
        Battery battery13 = usaFactory.createBattery("Soul-ev");
        
        Battery battery21 = euFactory.createBattery("Rio");
        Battery battery22 = euFactory.createBattery("Optima_hybrid");
        Battery battery23 = euFactory.createBattery("Soul-ev");
        
        Battery battery31 = asiaFactory.createBattery("Rio");
        Battery battery32 = asiaFactory.createBattery("Optima_hybrid");
        Battery battery33 = asiaFactory.createBattery("Soul-ev");       
    }
}
