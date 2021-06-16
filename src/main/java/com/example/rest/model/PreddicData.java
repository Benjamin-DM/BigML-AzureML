package com.example.rest.model;

public class PreddicData {

    private String clase;
    private String joined;
    private String age;

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getJoined() {
        return joined;
    }

    public void setJoined(String joined) {
        this.joined = joined;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PrediccionInputData{" +
                "Class=" + clase +
                ", Joined=" + joined +
                ", Age=" + age +
                '}';
    }
}
