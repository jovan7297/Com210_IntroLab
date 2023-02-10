//Jovanni Lozzi
//Lab Problem 3
package labproblem3;

import javax.swing.JOptionPane;

public class LabProblem3 {//Class Begins

    public static void main(String[] args) {//Main Method Begins

        String s1 = JOptionPane.showInputDialog("How many items are you going to input?");
        int numItems = Integer.parseInt(s1);

        Double ItemPrices[] = new Double[numItems];
        String ItemNames[] = new String[numItems];

        for (int x = 0; x < numItems; x++) {// start for
            ItemNames[x] = JOptionPane.showInputDialog("What is the name of item number: " + (x + 1));
            String s2 = JOptionPane.showInputDialog("What is the price of item number: " + (x + 1));
            ItemPrices[x] = Double.parseDouble(s2);
        }// end for

        for (int i = numItems; i > 0; i--) {// start for
            System.out.print(ItemNames[(i - 1)] + ": ");
            System.out.println(ItemPrices[(i - 1)]);
        }// end for

        String peas = ("peas");
        int j = 0;

        Double totalPrice = 0.0;

        for (int x = 0; x < numItems; x++) {// Start for
            if (ItemNames[x].toLowerCase().equals(peas)) {//Start If
                j++;
            }//End If
            totalPrice = ItemPrices[x] + totalPrice;
        }// End for

        Double averagePrice = totalPrice / numItems;

        if (j > 0) {
            System.out.println("The average cost of the price is " + averagePrice);
        } else {
            System.out.println("no average output");
        }
    }//Main Method Ends
}//Class Ends
