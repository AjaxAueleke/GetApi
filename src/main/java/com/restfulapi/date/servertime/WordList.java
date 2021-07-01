package com.restfulapi.date.servertime;

public class WordList {
    private static String[] wordlist = {"POST", "GET", "DELETE", "PUT"};

    public static boolean  isInList(String s) {
        for (String word : wordlist) {
            if (word.equals(s)) {
                return true;
            }
        }
        return false;
    }

}
