package org.example;

import java.util.ArrayList;
import java.util.List;

public class PlayListCollection implements IteratorCollection<String> {
    private List<String> songs;

    public PlayListCollection() {
        this.songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public String songAtIndex(int index) {
        return songs.get(index);
    }

    public int getSize() {
        return songs.size();
    }

    @Override
    public Iterator<String> createIterator() {
        return new PlayListIterator(this);
    }
}
