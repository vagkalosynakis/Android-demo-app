package com.example.vkal.demoapp;



public class Graph {

    private String graphType;
    private String graphText;

    private int graphImageID;

    public Graph(String type, String text, int imageId) {
        super();
        this.graphType = type;
        this.graphText = text;
        this.graphImageID = imageId;
    }

    public String getGraphType() {
        return graphType;
    }

    public void setGraphType(String graphType) {
        this.graphType = graphType;
    }

    public String getGraphText() {
        return graphText;
    }

    public void setGraphText(String graphText) {
        this.graphText = graphText;
    }

    public int getGraphImageID() {
        return graphImageID;
    }

    public void setGraphImageID(int graphImageID) {
        this.graphImageID = graphImageID;
    }

}
