package com.example.mastermindgame;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class FruitType extends ImageView {
     public FruitType (final Context context, final AttributeSet attrs) {
            super(context, attrs);
            setBackgroundResource(R.drawable.fruittype);
        }
}
