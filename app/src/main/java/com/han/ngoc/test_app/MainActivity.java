package com.han.ngoc.test_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_en);
        List<Tense_E> list = getData();
//       ối
    }
    private List<Tense_E> getData(){
        List<Tense_E> list = new ArrayList<Tense_E>();
        Tense_E tense_e = new Tense_E("dongnhi","Thì Hiện tại đơn");
        Tense_E tense_e1 = new Tense_E("khoimy","Thì Qúa khứ đơn");
        Tense_E tense_e2 = new Tense_E("issac","Thì Hiện tài khoàn thành");
        Tense_E tense_e3 = new Tense_E("mytam","Thì Hiện tại tiếp diễn");
        list.add(tense_e);
        list.add(tense_e1);
        list.add(tense_e2);
        list.add(tense_e3);
        return list;
    }
}
