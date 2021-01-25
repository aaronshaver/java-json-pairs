package com.company;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main {

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

        

    }
}
