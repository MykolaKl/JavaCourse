package com.softserve;

public class Block {
    private int width;
    private int length;
    private int height;

    public Block(){}

    public Block(int[] dims){

        this.width = dims[0];
        this.length = dims[1];
        this.height = dims[2];


    }

    public int getWidth(){
        return this.width;
    }

    public int getLength() {
        return this.length;
    }

    public int getHeight() {
        return this.height;
    }

    public int getVolume() {
        return this.width * this.length * this.height;
    }

    public int getSurfaceArea() {
        return 2 * (this.width * this.length + this.width * this.height + this.length * this.height);
    }

    public static void main(String[] args) {
        Block block = new Block(new int[]{2,2,2});
        System.out.println(block.getSurfaceArea());
    }
}