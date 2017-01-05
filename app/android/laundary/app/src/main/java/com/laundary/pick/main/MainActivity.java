package com.laundary.pick.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.laundary.pick.cart.Clothe;
import com.laundary.pick.cart.HouseClothe;
import com.laundary.pick.cart.MensClothe;
import com.laundary.pick.cart.WomensClothe;

public class MainActivity extends AppCompatActivity {
MensClothe mensClothe;
WomensClothe womensClothe;
HouseClothe houseClothe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mensClothe=MensClothe.getInstance();
        womensClothe=WomensClothe.getInstance();
        houseClothe=HouseClothe.getInstance();
        mensClothe.add(new Clothe("M1","Tshirt/Pajam"));
        mensClothe.add(new Clothe("M2","Jeans"));
        mensClothe.add(new Clothe("M3","Jacket"));
        womensClothe.add(new Clothe("W1","Saree"));
        womensClothe.add(new Clothe("W2","suite"));

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,print(),Toast.LENGTH_LONG).show();
    }

    String print(){
   String message="";
    MensClothe ins=MensClothe.getInstance();
    int size=ins.size();
    for(int i=0;i<size;i++){
        Clothe clothe=ins.getClotheAtInd(i);
        message=message+clothe.getCID()+clothe.getName()+clothe.getCount()+clothe.getPrice();
    }
    WomensClothe ins1=WomensClothe.getInstance();
    size=ins1.size();
        message=message+"\n";
    for(int i=0;i<size;i++){
        Clothe clothe=ins1.getClotheAtInd(i);
        message=message+clothe.getCID()+clothe.getName()+clothe.getCount()+clothe.getPrice();
    }
    return  message;
}
}
