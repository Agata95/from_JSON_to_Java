package com.javagda25.ex5;

import lombok.Data;

import java.util.List;

@Data
public class PolygonShape extends AbstractShape {
    private List<APosition> positions;
}
