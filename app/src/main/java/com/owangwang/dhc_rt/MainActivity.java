package com.owangwang.dhc_rt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private List<Carriage> list=new ArrayList<>();
    List<Door> doorList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        initCarriage();
//        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.door_recycleview);
//        StaggeredGridLayoutManager staggeredGridLayoutManager=
//                new StaggeredGridLayoutManager(5,StaggeredGridLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(staggeredGridLayoutManager);

    }

    private void initCarriage() {
     for (int j=0;j<6;j++){
         Carriage carriage=new Carriage();
         for(int i=0;i<10;i++){
             Door door=new Door();
             if(i>6){
                 door.setState(true);
             }else {
                 door.setState(false);
             }
             doorList.add(door);
         }
         carriage.setDoorList(doorList);
         carriage.setName(j+"");
         list.add(carriage);
     }
    }

}
