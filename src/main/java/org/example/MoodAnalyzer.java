package org.example;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer() {

    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood(String message) {
        try {
            if (message.contains("Sad")) {
                return "Sad";
            } else
                return "Happy";

        } catch (NullPointerException e) {
            return "happy";

        }
    }
}
