package com.han.ngoc.test_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by NGOC on 10/29/2016.
 */
public class Custom_Adapter extends BaseAdapter{
    private List<?> mListData;
    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private int mResID = 0;
    public Custom_Adapter(Context context, int resID, List<?> list)
    {
        this.mListData = list;
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(context);
        mResID = resID;
    }
    @Override
    public int getCount(){ return mListData.size();}//Dòng này cho adapter nó biết là list e bao nhiêu phần tử

    @Override
    public long getItemId(int position){ return position;} //Hàm này cho adapter nó biết trường nào của list e là khóa chính.mặc định
    //chính là vị trí (position) vì số thứ tự ko thể trùng nhau đc

    @Override
    public Object getItem(int position) {
        return ((Tense_E) mListData.get(position)).getmTense();

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder viewHolder;
        if(convertView == null)
        {
            convertView = mLayoutInflater.inflate(mResID,parent,false);
            viewHolder = new ViewHolder(convertView, mContext);
            convertView.setTag(viewHolder);
        }
        else
            viewHolder = (ViewHolder) convertView.getTag();
        viewHolder.setData(mListData.get(position));
        return  convertView;
    }
}
