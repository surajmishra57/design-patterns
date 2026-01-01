package org.example;

public class PlayListIterator implements Iterator<String> {
    final PlayListCollection playListCollection;
    private int index = 0;

    public PlayListIterator(PlayListCollection playListCollection) {
        this.playListCollection = playListCollection;
    }

    @Override
    public String next() {
        return playListCollection.songAtIndex(index++);
    }

    @Override
    public boolean hasNext() {
        return playListCollection.getSize() > index;
    }
}
