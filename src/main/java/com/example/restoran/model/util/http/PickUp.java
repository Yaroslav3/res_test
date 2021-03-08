package com.example.restoran.model.util.http;

import lombok.Builder;

@Builder
public class PickUp {
    private int id;
    private int count;

    public PickUp(int id, int count) {
        this.id = id;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "PickUp{" +
                "id=" + id +
                ", count=" + count +
                '}';
    }
}
