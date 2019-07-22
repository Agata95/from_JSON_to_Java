package com.javagda25.ex2;

import lombok.Data;

import java.util.List;

@Data
public class Tracks {
    private int identifier;
    private String type;
    private String time;
    private double flightLength;
    private int flightTime;
    private Location location;
    private boolean incidentOccured;
}
