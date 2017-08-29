package com.example.user.smiteanalyzer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by proteozym on 29/08/2017.
 */

public class SquareImgView extends android.support.v7.widget.AppCompatImageView {
    public SquareImgView(Context context) {
        super(context);
    }

    public SquareImgView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareImgView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth()); //Snap to width
    }
}