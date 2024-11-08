package com.teachmeskills.c32.hw.lesson_11.operation;

public class DocumentProcessor {

    // 1. Method displays the first two blocks of 4 digits in one line
    public static String first(String document) {

        String firstBlock = document.substring(0, 4);
        String secondBlock = document.substring(9, 13);

        return firstBlock + " " + secondBlock;
    }

    // 2. Method replaces blocks of three letters with "***" (each letter is replaced by *)
    public static String second(String document) {

        return document.replaceAll("[A-Za-z]{3}", "***");
    }

    // 3. Method displays only the letters from the document number in the format yyy/yyy/y/y in lowercase
    public static String third(String document) {

        String lettersOnly = document.replaceAll("[^A-Za-z]", "").toLowerCase();

        String result = lettersOnly.substring(0, 3) + "/" +
                lettersOnly.substring(3, 6) + "/" +
                lettersOnly.charAt(6) + "/" +
                lettersOnly.charAt(7);

        return result;
    }

    // 4. Method displays the letters from the document number in the format "Letters:yyy/yyy/y/y" in uppercase (using StringBuilder)
    public static String fourth(String document) {

        String lettersOnly = document.replaceAll("[^A-Za-z]", "").toUpperCase();

        StringBuilder result = new StringBuilder("Letters:");
        result.append(lettersOnly.substring(0, 3)).append("/")
                .append(lettersOnly.substring(3, 6)).append("/")
                .append(lettersOnly.charAt(6)).append("/")
                .append(lettersOnly.charAt(7));

        return result.toString();
    }

    // 5. Method checks if the document number contains the sequence "abc"
    public static String fifth(String document) {
        if (document.toLowerCase().contains("abc")) {
            return "Document contains the sequence 'abc'";
        } else {
            return "Document does not contain the sequence 'abc'";
        }
    }

    // 6. Method checks if the document number starts with the sequence 555
    public static String sixth(String document) {
        if (document.startsWith("555")) {
            return "Document starts with 555";
        } else {
            return "Document does not start with 555";
        }
    }

    // 7. Method checks if the document number ends with the sequence 1a2b
    public static String seventh(String document) {
        if (document.endsWith("1a2b")) {
            return "Document ends with 1a2b";
        } else {
            return "Document does not end with 1a2b";
        }
    }
}
