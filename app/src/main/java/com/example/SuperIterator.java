package com.example;

import java.util.Collection;

public class SuperIterator implements Iterator {

    public SuperIterator(Collection<Iterator> iterators){
        throw new RuntimeException("Not implemented yet");
    }

    @Override
    public boolean hasNext() {
        throw new RuntimeException("Not implemented yet");
    }

    @Override
    public int next() {
        throw new RuntimeException("Not implemented yet");
    }
}
