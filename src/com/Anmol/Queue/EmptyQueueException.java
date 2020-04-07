package com.Anmol.Queue;


public class EmptyQueueException extends NullPointerException {
    @Override
    public String getMessage() {
        return "Queue is Empty";
    }
}
