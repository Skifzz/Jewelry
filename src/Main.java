import Jewcalc.*;

public class Main {
    public static void main(String[] args) {

        Iface iface = new Calc();

        if (iface.result() > 0) {
            System.out.println(iface.result());
        }
        else
            System.out.println(iface.result()*(-1));


        Graf app = new Graf();
        app.setVisible(true);

    }
}