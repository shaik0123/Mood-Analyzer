package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void given_message_When_Sad_Should_Return_Sad() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assertions.assertEquals("Sad",mood);
    }

    @Test
    public void given_message_When_Happy_Should_Return_Happy() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = moodAnalyser.analyseMood("I am in Happy Mood");
        Assertions.assertEquals("Happy",mood);
    }

    @Test
    public void Given_Null_Mood_Should_Return_Message() {
        MoodAnalyzer moodAnalyser= new MoodAnalyzer();
        try {
            String mood = moodAnalyser.analyseMood("Null");
        }catch (MoodAnalyzerException e){
            Assertions.assertEquals(MoodAnalyzerException.Exception_Type.Null, e.type);
        }
    }

    @Test
    public void Given_Empty_Mood_Should_Return_Message() {
        MoodAnalyzer moodAnalyser= new MoodAnalyzer();
        try {
            String mood = moodAnalyser.analyseMood("");
        }catch (MoodAnalyzerException e){
            Assertions.assertEquals(MoodAnalyzerException.Exception_Type.Empty, e.type);
        }
    }

}
