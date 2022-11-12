import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creat the obj of conversion class  it is user defined class

        Conversion obj = new Conversion();
        int key;
        //parsing
        Scanner sc = new Scanner(System.in);
        //show the menu
        System.out.println("1: For Binary to other\t 2: For Dec to other");
        System.out.println("3: For Hexa to other  \t 3: For Octal to other");
        System.out.print("select the menu : ");
        //input the selection
        key = sc.nextInt();
        //perform selected function from menu
        switch (key)
        {
            case 1:
                obj.bin_convert(); // it is the method of Conversion class
                break;
            case 2:
                obj.dec_convert(); // it is the method of Conversion class
                break;
            case 3:
                obj.hex_convert(); // it is the method of Conversion class
                break;
            case 4:
                obj.oct_convert(); // it is the method of Conversion class
                break;
            default:
                System.out.println("Invalid Selection."); //it shows when user enter the invalid selection

        }
    }
}