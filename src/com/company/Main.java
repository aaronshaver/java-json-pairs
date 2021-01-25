package com.company;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Main {

    static final int KEYS_LENGTH = 6;

    public static void main(String[] args) {

        final String boardGames = """
                {
                    "keys": [
                        "title",
                        "genre",
                        "price",
                        "max_players",
                        "published",
                        "quantity"
                    ],
                    "values": [
                        ["Irish Gauge", "strategy", 3499, 4, true, 20],
                        ["Black Orchestra", "co-op", 4499, 5, true, 5],
                        ["Three Times the Clever!", "dice", 2499, 99, false, 0]
                    ]
                }
                """;

        JSONObject jsonObject = new JSONObject(boardGames);
        JSONArray keys = jsonObject.getJSONArray("keys");
        JSONArray values = jsonObject.getJSONArray("values");

        for (int i = 0; i < values.length(); i++) {

            JSONArray currentGame = (JSONArray) values.get(i);

            for (int j = 0; j < KEYS_LENGTH; j++) {
                System.out.printf("%s: %s%n", keys.get(j), currentGame.get(j));
            }
            System.out.printf("%n");
        }

    }
}
