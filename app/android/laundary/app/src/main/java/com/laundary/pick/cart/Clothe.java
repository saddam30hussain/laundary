package com.laundary.pick.cart;

/**
 * Created by SADDAM on 1/5/2017.
 */

public  class Clothe {
    protected String CID;
    protected String name;
    protected double price;
    protected int count;
    protected Clothe(){
        this.count=0;
    }
    public Clothe(String CID,String name){
        this.CID=CID;
        this.name=name;
        this.count=0;
    }
    public void setCID(String cid){
        this.CID=cid;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public  void setCount(int count){
        this.count=count;
    }
    public void increaseCount(int count){
        this.count=this.count+count;
    }
    public void decreaseCount(int count){
        this.count=this.count-count;
    }
    public String getCID(){
        return this.CID;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getCount(){
        return this.count;
    }

}
