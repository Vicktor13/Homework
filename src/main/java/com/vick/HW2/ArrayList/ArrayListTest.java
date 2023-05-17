package com.vick.HW2.ArrayList;

import java.util.Arrays;

public class ArrayListTest<E> {
    private final int INIT_SIZE = 10;
    private Object[] list = new Object[INIT_SIZE];
    private int counter = 0;

    public void increaseList(int newSize){
        Object[] newList = new Object[newSize];
        System.arraycopy(list, 0, newList, 0,counter);
        list = newList;
    }

    public void add(E data){
        if (counter == list.length - 1){
            increaseList(list.length * 2);
        }
        list[counter++] = data;
    }

    public E getByIndex(int index) {
        return (E) list[index];
    }

    public String getByValue(E value){
        int[] array = new int[list.length];
        int k = 0;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] == value){
                array[k++] = i;
            }
        }
        int[] arr = new int[k];
        System.arraycopy(array, 0, arr, 0,k);
        return Arrays.toString(arr);


    }

    public void remove(int index){
        for (int i = index; i < counter; i++) {
            list[i] = list[++i];
        }
        list[counter--] = null;
    }

    @Override
    public String toString() {
        Object[] notNullList = new Object[counter];
        for (int i = 0; i < counter; i++) {
            notNullList[i] = list[i];
        }
        return Arrays.toString(notNullList);
    }

}
