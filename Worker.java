package com.learningJava;

public class Worker {
    private OnTaskDoneListener callback;
    OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " is failed!");
            }
            callback.onDone("Task " + i + " is done");
        }
    }


}
