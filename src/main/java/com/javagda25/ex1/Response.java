package com.javagda25.ex1;

import lombok.Data;

import java.util.List;

@Data
public class Response {
    private String status;
    private int numberOfIncidents;
    private String timeStart;
    private List<String> sensorsThatHaveDetected;
}
