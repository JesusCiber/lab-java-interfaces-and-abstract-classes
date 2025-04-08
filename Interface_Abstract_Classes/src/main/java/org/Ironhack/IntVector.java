package org.Ironhack;

public class IntVector implements IntList {
    private int[] data;
    private int size;

    public IntVector() {
        data = new int[10];
        size = 0;
    }

    public void add(int number) {
        if (size == data.length) {
            int newLength = data.length * 2;
            int[] newData = new int[newLength];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[size++] = number;
    }

    @Override
    public int get(int id) {
        return data[id];
    }
}
