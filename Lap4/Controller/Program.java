package Lap4.Controller;


import Common.Algorithm;
import Common.Library;
import Lap4.Model.Element;
import lap1.view.Menu;


public class Program extends Menu<String> {

    protected Library libraby;
    protected Algorithm algorithm;
    protected String s;
    static String[] opList = {"Convert From Binary", "Convert From Decimal", "Convert From Hexadecimal", "Exit"};

    public Program(Element element) {
        super("Search Menu", opList);
        libraby = new Library();
        algorithm = new Algorithm();
        s = element.getS();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                binary();
                break;
            }
            case 2: {
                decimal();
                break;
            }
            case 3: {
                hexa();
                break;
            }
            case 4:
                System.exit(0);
            default:
                System.out.println("Please, enter again!");
        }
    }

    public void binary() {
        final String[] binaryList = {"Decimal", "Hexadecimal", "Exit"};
        class BinaryMenu extends Menu<String> {

            public BinaryMenu() {
                super("Binary option", binaryList);
            }

            @Override
            public void execute(int n) {
                switch (n) {
                    case 1:
                        s = libraby.checkInputBinary();
                        System.out.println(algorithm.convertBinaryToDecimal(s));
                        break;
                    case 2:
                        s = libraby.checkInputBinary();
                        System.out.println(algorithm.convertBinaryToHexa(s));
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Please, enter again!");
                }
            }

        }
        BinaryMenu sm = new BinaryMenu();
        sm.run();
    }

    public void decimal() {
        final String[] decimalList = {"Binary", "Hexadecimal", "Exit"};
        class decimalMenu extends Menu<String> {

            public decimalMenu() {
                super("Decimal option", decimalList);
            }

            @Override
            public void execute(int n) {
                switch (n) {
                    case 1: {
                        s = libraby.checkInputDecimal();
                        System.out.println(algorithm.convertDecimalToBinary(s));
                        break;
                    }

                    case 2: {
                        s = libraby.checkInputDecimal();
                        System.out.println(algorithm.convertDecimalToHexa(s));
                        break;
                    }
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Please, enter again!");
                }
            }
        }
        decimalMenu sm = new decimalMenu();
        sm.run();
    }

    public void hexa() {
        final String[] hexaList = {"Binary", "Decimal", "Exit"};
        class hexaMenu extends Menu<String> {

            public hexaMenu() {
                super("Hexa option", hexaList);
            }

            @Override
            public void execute(int n) {
                switch (n) {
                    case 1: {
                        s = libraby.checkInputHexaDecimal();
                        System.out.println(algorithm.convertHexaToBinary(s));
                        break;
                    }
                    case 2: {
                        s = libraby.checkInputHexaDecimal();
                        System.out.println(algorithm.convertHexaToDecimal(s));
                        break;
                    }
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Please, enter again!");
                }
            }
        }
        hexaMenu sm = new hexaMenu();
        sm.run();
    }
}
