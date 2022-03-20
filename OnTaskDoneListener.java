package com.learningJava;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
