import java.util.*;
public class Conversion {
    //variables which store the numbers , binary , decimal, hexa, and octal
    int binary, oct, Hex, Dec;
    //parsing and used to input
    Scanner sc = new Scanner(System.in);
    //user defined method to convert the binary numbers
    void bin_convert() {
        System.out.println("Please enter the binary numbers : ");
        binary = Integer.parseInt(sc.nextLine(), 2);
         String decimal, octal, hex;
        decimal = Integer.toString(binary);
        octal = Integer.toOctalString(binary);
        hex = Integer.toHexString(binary);
        System.out.println("Decimal is : " + decimal);
        System.out.println("Octal is : " + octal);
        System.out.println("Hexa_Decimal is : " + hex);
    }
    //user defined method to convert the decimal numbers
    void dec_convert()
    {
        System.out.println("Please enter the Decimal number : ");
        Dec = Integer.parseInt(sc.nextLine());
        String hex, octal, binary;
        hex = Integer.toHexString(Dec);
        octal = Integer.toOctalString(Dec);
        binary = Integer.toBinaryString(Dec);
        System.out.println("Binary is : " + binary);
        System.out.println("Octal is : " + octal);
        System.out.println("Hexa_Decimal is : " + hex);
    }
    //user defined method to convert the Hexa decimal numbers
    void hex_convert()
    {
        System.out.println("Please enter the Hexa Decimal number : ");
        Hex = Integer.parseInt(sc.nextLine(), 16);
        String dec, octal, binary;
        binary = Integer.toBinaryString(Hex);
        octal = Integer.toOctalString(Hex);
        dec = Integer.toString(Hex);
        System.out.println("Binary is : " + binary);
        System.out.println("Octal is : " + octal);
        System.out.println("Decimal is : " + dec);
    }
    //user defined method to convert the Octal numbers
    void oct_convert()
    {
        System.out.println("Please enter the octal number : ");
        oct = Integer.parseInt(sc.nextLine(), 8);
        String dec, hex, binary;
        binary = Integer.toBinaryString(oct);
        hex = Integer.toHexString(oct);
        dec = Integer.toString(oct);
        System.out.println("Binary is : " + binary);
        System.out.println("Hexa Decimal is : " + hex);
        System.out.println("Decimal is : " + dec);
    }
}
