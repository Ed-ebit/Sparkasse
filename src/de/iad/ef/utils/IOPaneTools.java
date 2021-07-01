package utils;

public abstract class IOPaneTools {
    public static String readLine(String info){
        return javax.swing.JOptionPane.showInputDialog(info);
    }
    public static int readInteger(String info){
        String input = javax.swing.JOptionPane.showInputDialog(info);
        return java.lang.Integer.parseInt(input);
    }
    public static double readDouble(String info){
        String input = javax.swing.JOptionPane.showInputDialog(info);
        return java.lang.Double.parseDouble(input);
    }
}
