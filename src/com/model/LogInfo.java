package com.model;

import com.interfaces.Logger;

public class LogInfo implements Logger {
    @Override
    public void log(String message) {
        System.out.println("logger message: " + message);
    }
}
