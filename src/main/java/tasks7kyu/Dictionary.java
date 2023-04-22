package main.java.tasks7kyu;

import java.util.HashMap;

/*
In this kata, your job is to create a class Dictionary which you can add words to and their entries. Example:
>>> Dictionary d = new Dictionary();
>>> d.newEntry("Apple", "A fruit that grows on trees");
>>> System.out.println(d.look("Apple"));
A fruit that grows on trees
>>> System.out.println(d.look("Banana"));
Cant find entry for Banana
 */
public class Dictionary {
    HashMap<String, String> dictionary;
    public Dictionary(){
        dictionary = new HashMap<>();
    }

    public void newEntry(String key, String value){
        dictionary.put(key, value);
    }

    public String look(String key){
        if(dictionary.containsKey(key)) {
            return dictionary.get(key);
        }
        return "Cant find entry for " + key;
    }

    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        d.newEntry("Apple", "A fruit that grows on trees");
        System.out.println(d.look("Apple"));
        System.out.println(d.look("Banana"));
    }
}
