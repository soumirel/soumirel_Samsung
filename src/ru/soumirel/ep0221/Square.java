package ru.soumirel.ep0221;

public class Square extends Rectangle{
    public Square(int size) {
        super(size, size);
    }
    public void setSize(int size){
        setWidth(size);
        setHeight(size);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setWidth(width);
    }
}
