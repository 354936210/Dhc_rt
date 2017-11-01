package com.owangwang.dhc_rt;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by wangchao on 2017/10/31.
 */

public class TrainAdapter extends RecyclerView.Adapter<TrainAdapter.ViewHolder>{

    private List<Door> doorList;

    static class ViewHolder extends  RecyclerView.ViewHolder{
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView= itemView.findViewById(R.id.imageView_door);
        }
    }

    public TrainAdapter(List<Door> list){
        this.doorList=list;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
       View view= LayoutInflater.from(viewGroup.getContext())
               .inflate(R.layout.door_layout,viewGroup,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TrainAdapter.ViewHolder viewHolder, int i) {




        Door door=doorList.get(i);
        if (door.getState()){
            viewHolder.imageView.setImageResource(R.mipmap.icon_closed_locked);
        }else if (!door.getState()){
            viewHolder.imageView.setImageResource(R.mipmap.icon_door_notok);
        }


    }
    @Override
    public int getItemCount() {
        return doorList.size();
    }
}
