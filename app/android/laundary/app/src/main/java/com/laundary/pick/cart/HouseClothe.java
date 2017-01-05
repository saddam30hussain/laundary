package com.laundary.pick.cart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SADDAM on 1/5/2017.
 */

public class HouseClothe extends Clothe{
    private List<Clothe> list;
    private static  HouseClothe instance;
    private HouseClothe(){
        this.list=new ArrayList<Clothe>();
    }
    public static HouseClothe getInstance(){
        if(instance==null)
            instance=new HouseClothe();
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
