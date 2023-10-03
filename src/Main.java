import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        final int saldo_inicial = 2000;
        int opcion;
        float ingreso,saldoActual,retiro;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("bienvenido al cajero automatico daviplata\n"
       + "1 por favor ingrese en dinero deseado a la cueta\n"
       + "2 por favoir retire el dinero de la cuenta\n"
        + "3 salir"));
    switch (opcion) {
        case 1: ingreso = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad que desea ingresar"));
                saldoActual = saldo_inicial + ingreso;
                JOptionPane.showMessageDialog(null,"por favor retire su dinero: "+saldoActual);
                break;

        case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("digite la cantidad que desea retirar "));

        if (retiro>saldo_inicial) {
            JOptionPane.showMessageDialog(null,"no cuenta con dinero suficiente para retirar");
        }
        else {
            saldoActual = saldo_inicial - retiro;
            JOptionPane.showMessageDialog(null, "dinero en cuenta: " +saldoActual);
        }
        break;

        case 3: break;
        default: JOptionPane.showMessageDialog(null,"se equivoco de opcion de menu"); break;
    }
    }
}