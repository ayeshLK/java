package vendingmachine.java.sampleExtended;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]){
        VendingMachineSmplExt machine = new VendingMachineSmplExt();

        while (true){
            if(machine.getCurrentState() == State.VENDING){
                machine.goNext(0);
                continue;
            }else {
                String input = getLine();
                if(input.equals("") || input.equals(null)){
                    machine.goNext(0);
                }else {
                    machine.goNext(Integer.parseInt(input));
                }
            }
        }
    }

    static String getLine() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            System.out.print("Please Enter the amount : ");
            line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }
}
