package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void given_message_When_Sad_Should_Return_Sad() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assertions.assertEquals("Sad",mood);
    }

    @Test
    public void given_message_When_Happy_Should_Return_Happy() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = moodAnalyser.analyseMood("I am in Happy Mood");
        Assertions.assertEquals("Happy",mood);
    }

    @Test
    public void Given_Null_Mood_Should_Return_Happy() {
        MoodAnalyzer moodAnalyser= new MoodAnalyzer();
        String mood = moodAnalyser.analyseMood(null);
        Assertions.assertEquals("Happy", mood);
    }
}
