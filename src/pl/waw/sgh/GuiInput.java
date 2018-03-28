package pl.waw.sgh;

import javax.swing.*;

public class GuiInput {
    public static void main (String[] args){

        JOptionPane.showMessageDialog(null, "Hello!");
      //  String myText = JOptionPane.showInputDialog("What is your name:");
        // JOptionPane.showMessageDialog(null, "Hello!" +myText + "!!!");
      //  String sHeight = JOptionPane.showInputDialog("What is your height in cm");
        Double height = null;

        while (height==null){
            try{
                String sHeight = JOptionPane.showInputDialog("What is your height in cm");
                height = Double.parseDouble(sHeight);
            } catch (NumberFormatException ne) {
                JOptionPane.showMessageDialog(null, ne.getMessage()) ;
            } catch (NullPointerException nee){

            }

        }
        //Double height = Double.parseDouble(sHeight);
        //Integer.parseInt(sHeight);
        //Long.parseLong(sHeight);
        JOptionPane.showMessageDialog(null, "Your height in cm: " + height/100);

int res = -1;
while (res!=0) {
    res = JOptionPane.showConfirmDialog(null, "Are you sure?");
    JOptionPane.showMessageDialog(null, "Result: " + res);
                }
        }
    }
