import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Calculator extends JFrame {
    int x,y,z;
    String op;

    public void plus() {
        if(op.equals("+")) {
            z = x + y;
        }
    }
    public void minus() {
        if(op.equals("-")){
            z = x-y;
        }
        System.out.println(z);
    }
    public void multiple() {
        if(op.equals("*")){
            z = x*y;
        }
        System.out.println(z);
    }
    public void divide() {
        if(op.equals("/")){
            z = x/y;
        }
        System.out.println(z);
    }



}
