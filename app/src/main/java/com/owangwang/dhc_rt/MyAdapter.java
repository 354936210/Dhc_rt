package com.owangwang.dhc_rt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangchao on 2017/11/1.
 */

public class MyAdapter extends BaseAdapter {
    private Context context;

    private List<Door> doorList=new ArrayList<Door>();

   public MyAdapter(List<Door> doorList,Context context){
       super();
       this.doorList=doorList;
       this.context=context;
   }
    @Override
    public int getCount() {
        if(doorList!=null){
            return doorList.size();
        }else {
            return 0;
        }
    }

    @Override
    public Object getItem(int i) {
        return doorList.get(i);

    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder=null;
        if(convertView==null){
            viewHolder=new ViewHolder();
            //获得容器
            convertView= LayoutInflater.from(this.context).inflate(R.layout.door_layout,null);
            viewHolder.image=convertView.findViewById(R.id.imageView_door);
            // 给converHolder附加一个对象
            convertView.setTag(viewHolder);
        }
        else {
            // 取得converHolder附加的对象
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // 给组件设置资源
        Door door = doorList.get(position);
        if (door.getState()){
//            viewHolder.image.setImageResource(R.mipmap.icon_closed_locked);
            viewHolder.image.setBackgroundResource(R.mipmap.icon_closed_locked);
        }else if(!door.getState()){
//            viewHolder.image.setImageResource(R.mipmap.icon_door_notok);
            viewHolder.image.setBackgroundResource(R.mipmap.icon_door_notok);

        }

        return convertView;
    }
    class ViewHolder {
        public ImageView image;
    }
}
