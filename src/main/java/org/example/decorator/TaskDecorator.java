package org.example.decorator;


//interface base
public interface TaskDecorator {
    String getDescription();
    // posso ultilizar outros decorators no futuro alem deo TagDecorator
}