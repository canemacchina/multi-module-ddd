package org.example.todo;

import spark.Request;
import spark.Response;

import static spark.Spark.get;

public class Main {

    public static void main(String[] args) {
        get("/", Boh::handle);
    }


    private static class Boh {
        public static String handle(Request request, Response response) {
            return "Hello World!";
        }
    }
}
