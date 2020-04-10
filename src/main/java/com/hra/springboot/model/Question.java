package com.hra.springboot.model;

import java.util.List;
import java.util.Objects;

public class Question {
    private String id;
    private String description;
    private String correctAnswer;
    private List<String> options;

    // Needed by Caused by: com.fasterxml.jackson.databind.JsonMappingException:
    // Can not construct instance of com.in28minutes.springboot.model.Question:
    // no suitable constructor found, can not deserialize from Object value
    // (missing default constructor or creator, or perhaps need to add/enable
    // type information?)
    public Question() {

    }

    public Question(String id, String description, String correctAnswer,
                    List<String> options) {
        super();
        this.id = id;
        this.description = description;
        this.correctAnswer = correctAnswer;
        this.options = options;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public List<String> getOptions() {
        return options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals(id, question.id) &&
                Objects.equals(description, question.description) &&
                Objects.equals(correctAnswer, question.correctAnswer) &&
                Objects.equals(options, question.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
