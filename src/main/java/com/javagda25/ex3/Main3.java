package com.javagda25.ex3;

import com.google.gson.Gson;

public class Main3 {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Zad3 result = gson.fromJson("{\n" +
                "  \"areaShape\": \"CIRCLE\",\n" +
                "  \"name\": \"PArea-1\",\n" +
                "  \"position\": {\n" +
                "    \"latitude\": 51.271279,\n" +
                "    \"longitude\": 19.337877\n" +
                "  },\n" +
                "  \"radius\": 300\n" +
                "}", Zad3.class);

        System.out.println(result);
    }
}
