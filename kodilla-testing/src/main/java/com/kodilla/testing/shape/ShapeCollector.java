package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> collection = new ArrayList<Shape>();

    public List<Shape> getCollection() {
        return collection;
    }

    public void addFigure(Shape shape){
        collection.add(shape);
    }

    public boolean removeFigure(Shape shape){
        return collection.remove(shape);
    }

    public Shape getFigure(int n){
        if(n<collection.size() && n>=0){
            return collection.get(n);
        } else {
            return null;
        }

    }

    public void showFigures(){
        System.out.println(collection.toString());
    }
}