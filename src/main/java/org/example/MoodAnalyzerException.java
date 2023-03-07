package org.example;

public class MoodAnalyzerException extends Exception {
    public enum Exception_Type{
        Null, Empty;
    }
    Exception_Type type;
    public MoodAnalyzerException( Exception_Type type,String message){
        super(message);
        this.type = type;
    }
}
