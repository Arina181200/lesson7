package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    protected int number;
    protected String name;
    protected int cost;
    private int height;
    private int width;
    private int length;

    public Shop(int number, String name, int cost, int height, int width, int length) {
        this.number = number;
        this.name = name;
        this.cost = cost;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    ArrayList<Shop> list = new ArrayList<Shop>();

    void addCar(Shop shop) throws TooBigCarException {
        if (height > 7000 || width > 3000 || length > 3000) {
            throw new TooBigCarException();
        }
        list.add(shop);
    }

    void showAllCars() {
        System.out.println(list);
    }

    void countOfCar(Shop shop)
    {
        if (list.size() > 2) {
            throw new OutOfFreeCarException();
        }
        list.add(shop);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", list=" + list +
                '}';
    }
}


