package com.han.ngoc.test_app;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by NGOC on 10/29/2016.
 */
public class ViewHolder {
    private TextView mTense;
    private ImageView mImage;
    private View mView;
    private Context mContext;
    public ViewHolder(View view, Context context) {
        mTense = (TextView) view.findViewById(R.id.tense);
        mImage = (ImageView) view.findViewById(R.id.image);
        mView = view;
        mContext = context;
    }
    public void setData(Object Tense)
    {
        Tense_E tense = ((Tense_E) Tense);
        mTense.setText( tense.getmTense());
        mImage.setImageResource(getID(tense.getmImage()));
    }
    public int getID(String name){
        return mContext.getResources().getIdentifier(name, "drawable", mContext.getPackageName());
    }
}
