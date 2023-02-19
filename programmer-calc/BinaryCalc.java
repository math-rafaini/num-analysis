// For now this program only can do decimal to binary convertions (integer numbers)

import java.util.Scanner;

public class BinaryCalc
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        long result;
        int baseTenNum, rest;
        String binDigit, aux;

        baseTenNum = in.nextInt();
        rest = 0;
        result = 0;
        aux = "";
        binDigit = "";

        if(baseTenNum != 1)
        {
            while(baseTenNum / 2 != 0)
            {
                rest = baseTenNum % 2;
            
                binDigit = Integer.toString(rest);
                aux = binDigit + aux;
                baseTenNum = baseTenNum / 2;
            }
        }
        
        if(baseTenNum == 1)
        {
            aux = "1" + aux;
        }

        result = Long.parseLong(aux);
        System.out.println(result);
    }
}

// for baseTenNum = 8:
//
// first iteration:
// rest = 0
// binDigit = "0"
// aux = "0" + "" = 0
// baseTenNum = 4
//
// scnd iteration:
// rest = 0
// binDigit = "0"
// aux = "0" + "0" = "00"
// baseTenNum = 2
//
// third iteration:
// rest = 0
// binDigit = 0
// aux = "0" + "00" = "000"
// baseTenNum = 1
//
// fourth iteration:
// aux = "1" + "000"
//
// result = 1000
