package com.javagda25.ex5;

import com.google.gson.Gson;

public class Main5 {
    public static void main(String[] args) {
        Zad5 zad5 = new Gson().fromJson("{\n" +
                "  \"response\": [\n" +
                "    {\n" +
                "      \"areaShape\": \"CIRCLE\",\n" +
                "      \"name\": \"PArea-1\",\n" +
                "      \"areaId\": 11,\n" +
                "      \"position\": {\n" +
                "        \"latitude\": 51.271279,\n" +
                "        \"longitude\": 19.337877\n" +
                "      },\n" +
                "      \"radius\": 300\n" +
                "    },\n" +
                "    {\n" +
                "      \"areaShape\": \"POLYGON\",\n" +
                "      \"name\": \"PArea-2\",\n" +
                "      \"areaId\": 13,\n" +
                "      \"positions\": [\n" +
                "        {\n" +
                "          \"latitude\": 51.257448,\n" +
                "          \"longitude\": 19.339216\n" +
                "        },\n" +
                "        {\n" +
                "          \"latitude\": 51.256547,\n" +
                "          \"longitude\": 19.353367\n" +
                "        },\n" +
                "        {\n" +
                "          \"latitude\": 51.269226,\n" +
                "          \"longitude\": 19.359798\n" +
                "        },\n" +
                "        {\n" +
                "          \"latitude\": 51.282019,\n" +
                "          \"longitude\": 19.348628\n" +
                "        },\n" +
                "        {\n" +
                "          \"latitude\": 51.28179,\n" +
                "          \"longitude\": 19.325195\n" +
                "        },\n" +
                "        {\n" +
                "          \"latitude\": 51.254752,\n" +
                "          \"longitude\": 19.322789\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}", Zad5.class);

        System.out.println(zad5);
        if(zad5.getResponse().get(0) instanceof PolygonShape){
            System.out.println(zad5.getResponse());
        }
    }
}
