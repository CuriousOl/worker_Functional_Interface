package com.learningJava;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String err);
}
