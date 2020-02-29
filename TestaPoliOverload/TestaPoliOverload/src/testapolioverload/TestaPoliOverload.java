package testapolioverload;
import javax.swing.JOptionPane;
/**
 *
 * @author Victor Manuel - 1302
 */
public class TestaPoliOverload {
    public static void main(String[] args) {
        DemoOverload som = new DemoOverload();
        JOptionPane.showMessageDialog(null,"A soma de X + Y: "+som.soma(2,3)+"\nA soma de X + Y + Z: "+som.soma(2,3,4)+
                "\nA soma de X + Y: "+som.soma(2,3.4)+"\nA soma de X + Y: "+som.soma(2.5,3));
    }
    
}
