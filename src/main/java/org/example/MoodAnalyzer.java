package org.example;

public class MoodAnalyzer {

    public String message;

    public MoodAnalyzer() {

    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalyzerException {
        try {
            if (message.contains("Sad")) {
                return "Sad";
            } else
                return "Happy";

        } catch (Exception e) {
            if(message == null){
                throw new MoodAnalyzerException(MoodAnalyzerException.Exception_Type.Null, "Invalid Mood");
            }else {
                throw new MoodAnalyzerException(MoodAnalyzerException.Exception_Type.Empty, "Invalid Mood");
            }

        }
    }
}
