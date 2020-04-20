package com.example.myapplication;

public class TestClass {
    private int image;
    private String text;

    public TestClass(int i, String t) {
        image = i;
        text = t;
    }

    public TestClass(String t) {
        text = t;
    }

    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }
}
