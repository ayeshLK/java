package vendingmachine.java.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]){
        VendingMachine machine = new VendingMachine();

        while (true){
            if(machine.getMoneyAmount() >= 10){
                machine.doVending(0);
            }else {
                String input = getLine();
                if(input.equals("") || input.equals(null)){
                    machine.doVending(0);
                }else {
                    machine.doVending(Integer.parseInt(input));
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
