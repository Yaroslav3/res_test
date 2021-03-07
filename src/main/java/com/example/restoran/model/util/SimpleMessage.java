package com.example.restoran.model.util;

public class SimpleMessage {
    private String info;
    private String details;

    public SimpleMessage(String info, String details) {
        this.info = info;
        this.details = details;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


    @Override
    public String toString() {
        return "SimpleMessage{" +
                "info='" + info + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
