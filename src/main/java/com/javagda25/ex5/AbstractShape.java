package com.javagda25.ex5;

import lombok.Data;

import java.util.List;

@Data
public class AbstractShape {
    private String areaShape;
    private String name;
    private Long areaId;

    private APosition position;
    private int radius;
    private List<APosition> positions;
}
