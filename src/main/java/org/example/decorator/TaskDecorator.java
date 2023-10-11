package org.example.decorator;


//interface base
public interface TaskDecorator {
    String getDescription();

    boolean isCompleted();
    void markCompleted();

}