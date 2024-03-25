package com.example.candystore;

import android.widget.Button;
import android.content.Context;

public class CandyButton extends Button {
    private Candy candy;

    public CandyButton (Context context, Candy newCandy){
        super(context);
        candy = newCandy;
    }
    public double getPrice(){
        return candy.getPrice();
    }
}
