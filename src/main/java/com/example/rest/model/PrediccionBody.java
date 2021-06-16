package com.example.rest.model;

public class PrediccionBody {
    private String model;
    private PreddicData input_data;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public PreddicData getInput_data() {
        return input_data;
    }

    public void setInput_data(PreddicData input_data) {
        this.input_data = input_data;
    }
}
