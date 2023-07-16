package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {

        ArrayList<String> duplicatedWords = new ArrayList<>();

        int index = 1;
        for (String word : sourceList) {
            if (index % 3 == 0) {
                duplicatedWords.add(word);
                duplicatedWords.add(word);
            }
            index++;
        }

        return duplicatedWords;
    }
}
