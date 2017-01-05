package com.laundary.pick.cart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SADDAM on 1/5/2017.
 */

public class WomensClothe extends Clothe{
    private List<Clothe> list;
    private static  WomensClothe instance;
    private WomensClothe(){
        this.list=new ArrayList<Clothe>();
    }
    public static WomensClothe getInstance(){
        if(instance==null)
            instance=new WomensClothe();
        return instance;
    }
    public void add(Clothe clothe){
        this.list.add(clothe);
    }
    public void remove(Clothe clothe){
        this.list.remove(clothe);
    }
    public Clothe getClotheAtInd(int ind){
        return this.list.get(ind);
    }
    public int getInd(Clothe clothe){
        return this.list.indexOf(clothe);
    }
    public int size(){
        return this.list.size();
    }
}
