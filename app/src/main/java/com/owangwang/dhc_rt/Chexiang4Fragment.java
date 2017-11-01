package com.owangwang.dhc_rt;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangchao on 2017/11/1.
 */

public class Chexiang4Fragment extends Fragment{
    RecyclerView recyclerView;
    private List<Door> doorList=new ArrayList<>();
    Door door=new Door();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.chexiang_gride4,container,false);
        GridView gridView=view.findViewById(R.id.gride_4);
        for(int i=0;i<10;i++){
            door=new Door();
            door.setState(false);
            doorList.add(door);
        }
        MyAdapter adapter=new MyAdapter(doorList,getContext());
        gridView.setAdapter(adapter);
        return  view;
    }

}
