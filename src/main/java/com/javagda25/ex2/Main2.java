package com.javagda25.ex2;

import com.google.gson.Gson;

public class Main2 {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Zad2 result = gson.fromJson("{\n" +
                        "  \"tracks\": [\n" +
                        "    {\n" +
                        "      \"identifier\": 172,\n" +
                        "      \"type\": \"TRACK\",\n" +
                        "      \"time\": \"2018-12-31 23:03:25\",\n" +
                        "      \"flightLength\": 235.2,\n" +
                        "      \"flightTime\": 361,\n" +
                        "      \"location\": {\n" +
                        "        \"latitude\": 51.273818,\n" +
                        "        \"longitude\": 19.34769\n" +
                        "      },\n" +
                        "      \"incidentOccured\": true\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"identifier\": 264,\n" +
                        "      \"type\": \"TRACK\",\n" +
                        "      \"time\": \"2019-01-03 07:15:55\",\n" +
                        "      \"flightLength\": 110.3,\n" +
                        "      \"flightTime\": 145,\n" +
                        "      \"location\": {\n" +
                        "        \"latitude\": 51.253543,\n" +
                        "        \"longitude\": 19.361782\n" +
                        "      },\n" +
                        "      \"incidentOccured\": false\n" +
                        "    }\n" +
                        "  ]\n" +
                        "}"
                , Zad2.class);

        System.out.println(result);
    }
}
