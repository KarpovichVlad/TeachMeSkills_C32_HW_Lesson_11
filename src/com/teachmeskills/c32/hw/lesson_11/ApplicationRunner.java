package com.teachmeskills.c32.hw.lesson_11;

import com.teachmeskills.c32.hw.lesson_11.operation.DocumentProcessor;

public class ApplicationRunner {
    /**
     * Program for processing a document number with the following functionality:
     * 1. Displays the first two blocks of 4 digits.
     * 2. Replaces blocks of three letters with "***".
     * 3. Displays only letters from the document number in the format yyy/yyy/y/y in lowercase.
     * 4. Displays letters in the format "Letters:yyy/yyy/y/y" in uppercase using StringBuilder.
     * 5. Checks if the document contains the sequence "abc".
     * 6. Checks if the document starts with "555".
     * 7. Checks if the document ends with "1a2b".
     */

    public static void main(String[] args) {
        String documentNumber = "1234-XYZ-5678-Qwe-9b7k";

        System.out.println(DocumentProcessor.first(documentNumber));
        System.out.println(DocumentProcessor.second(documentNumber));
        System.out.println(DocumentProcessor.third(documentNumber));
        System.out.println(DocumentProcessor.fourth(documentNumber));
        System.out.println(DocumentProcessor.fifth(documentNumber));
        System.out.println(DocumentProcessor.sixth(documentNumber));
        System.out.println(DocumentProcessor.seventh(documentNumber));
    }
}


