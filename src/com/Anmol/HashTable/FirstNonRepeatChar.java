package com.Anmol.HashTable;

public class FirstNonRepeatChar {
    char findNonRepeatChar(String line) {
        int count;
        int i;
        char[] lineChars = line.toCharArray();
        for (i = 0; i < lineChars.length; i++) {
            count = 0;
            for (char lineChar : lineChars)
                if (lineChars[i] == lineChar)
                    count++;
            if (count == 1)
                break;
        }
        return lineChars[i];
    }
}
