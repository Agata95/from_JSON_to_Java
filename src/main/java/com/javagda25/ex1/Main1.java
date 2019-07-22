package com.javagda25.ex1;

import com.google.gson.Gson;

public class Main1 {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Zad3 result = gson.fromJson("{\n" +
                "  \"response\": {\n" +
                "    \"status\": \"active\",\n" +
                "    \"numberOfIncidents\": 3,\n" +
                "    \"timeStart\": \"2019-01-01 13:04:23\",\n" +
                "    \"sensorsThatHaveDetected\": [\n" +
                "      \"AcousticSensor - East\",\n" +
                "      \"Radar-1 NorthEast\"\n" +
                "    ]\n" +
                "  }\n" +
                "}", Zad3.class);

        System.out.println(result);
    }
}
