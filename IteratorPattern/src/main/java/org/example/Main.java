package org.example;


/**
 * Iterator is behavior design pattern that let access the element of collection sequentially without exposing
 * collection internal structure
 */

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PlayListCollection playListCollection = new PlayListCollection();
        playListCollection.addSong("Main Hoon Na");
        playListCollection.addSong("Bole Bole");
        playListCollection.addSong("Tera Mera Ris");
        playListCollection.addSong("Mare Brother ki");

        Iterator<String> iterator = playListCollection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " : song is playing");
        }
    }
}