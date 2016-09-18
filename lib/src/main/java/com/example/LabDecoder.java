package com.example;

public class LabDecoder
{
    public static void main(String[] args)
    {
        String myMessage = "Godzilla is destroying Tokyo" + "\u0021" + "\u0021"; //Original message
        System.out.println(myMessage);

        char[] theMessage = myMessage.toCharArray(); //changes the string to a character array

        // Secret message decoder
        theMessage[0] = '\u0045';
        theMessage[1] = '\u0076';
        theMessage[2] = '\u0065';
        theMessage[3] = '\u0072';
        theMessage[4] = '\u0079';
        theMessage[5] = '\u0074';
        theMessage[6] = '\u0068';
        theMessage[7] = '\u0069';
        theMessage[8] = '\u006e';
        theMessage[9] = '\u0067';
        theMessage[10] = '\u0020';
        theMessage[11] = '\u0069';
        theMessage[12] = '\u0073';
        theMessage[13] = '\u0020';
        theMessage[14] = '\u0066';
        theMessage[15] = '\u0069';
        theMessage[16] = '\u006e';
        theMessage[17] = '\u0065';
        theMessage[18] = '\u002e';
        theMessage[19] = '\u0020';
        theMessage[20] = '\u263a';
        theMessage[21] = '\u0020';
        theMessage[22] = '\u0020';
        theMessage[23] = '\u0020';
        theMessage[24] = '\u0020';
        theMessage[25] = '\u0020';
        theMessage[26] = '\u0020';
        theMessage[27] = '\u0020';
        theMessage[28] = '\u0020';
        theMessage[29] = '\u0020';






        System.out.println(theMessage); //Outputs coded message

    }
}
