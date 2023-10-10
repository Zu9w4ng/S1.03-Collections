package n1ex3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input extends InputMismatchException {
    
    public static byte readByte(String missatge){

        Scanner sc = new Scanner(System.in);
        boolean correctInput = false;
        byte num = 0;
        System.out.println(missatge);

        do {
            try {
                num = sc.nextByte();
                correctInput = true;
            }
            catch(InputMismatchException e) {
                System.out.println("Error de format");
            }
            finally {
                sc.nextLine();
            }

        } while (!correctInput);
        return num;
    }

    public static int readInt(String missatge){

        Scanner sc = new Scanner(System.in);
        boolean correctInput = false;
        int num = 0;
        System.out.println(missatge);

        do {
            try {
                num = sc.nextInt();
                correctInput = true;
            }
            catch(InputMismatchException e) {
                System.out.println("Error de format");
            }
            finally {
                sc.nextLine();
            }

        } while (!correctInput);
        return num;
    }

    public static float readFloat(String missatge){

        Scanner sc = new Scanner(System.in);
        boolean correctInput = false;
        float num = 0;
        System.out.println(missatge);

        do {
            try {
                num = sc.nextFloat();
                correctInput = true;
            }
            catch(InputMismatchException e) {
                System.out.println("Error de format");
            }
            finally {
                sc.nextLine();
            }

        } while (!correctInput);
        return num;
    }

    public static double readDouble(String missatge){

        Scanner sc = new Scanner(System.in);
        boolean correctInput = false;
        double num = 0;
        System.out.println(missatge);

        do {
            try {
                num = sc.nextDouble();
                correctInput = true;
            }
            catch(InputMismatchException e) {
                System.out.println("Error de format");
            }
            finally {
                sc.nextLine();
            }

        } while (!correctInput);
        return num;
    }

    public static char readChar(String missatge) {

        Scanner sc = new Scanner(System.in);
        boolean correctInput = false;
        String caracter;
        System.out.println(missatge);

        do {
            caracter = sc.nextLine();
            if (caracter.length()!=1) {
                try {
                    throw new Exception("Error de format");
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else {
                correctInput = true;
            }

        } while (!correctInput);

        return caracter.charAt(0);

    }

    public static String readString(String missatge) {

        Scanner sc = new Scanner(System.in);
        boolean correctInput = false;
        String str="";
        System.out.println(missatge);

        do {
            
            try {
                str = sc.nextLine(); 
                correctInput = true;    
            } 
            catch (Exception e) {
                System.out.println("Error de format");
            }
            

        } while (!correctInput);
        return str;

    }

    public static boolean readYesNo(String missatge) {

        Scanner sc = new Scanner(System.in);
        boolean correctInput = false;
        boolean sn = false;
        String str="";
        System.out.println(missatge);

        do {
            str = sc.nextLine();
            if (str.toLowerCase().equals("y")) {
                sn = true;
                correctInput = true;
            }
            else if (str.toLowerCase().equals("n")) {
                sn = false;
                correctInput = true;
            }
            else {
                try {
                    throw new Exception("error de format");
                } catch (Exception e) { 
                    e.printStackTrace();
                }
            }

        } while (!correctInput);
        return sn;
    }


}

