package com.laundary.pick.cart;


import java.util.List;
import java.util.ArrayList;
/**
 * Created by SADDAM on 1/5/2017.
 */

public class MensClothe extends Clothe{
    private List<Clothe> list;
    private static  MensClothe instance;
    private MensClothe(){
       this.list=new ArrayList<Clothe>();
    }
    public static MensClothe getInstance(){
        if(instance==null)
            instance=new MensClothe();
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
