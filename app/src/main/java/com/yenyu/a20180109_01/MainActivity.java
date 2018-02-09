package com.yenyu.a20180109_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public  class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    //建立Menu鍵
        //menu.add(0,1,0,"ADD");
        //menu.add(0,2,0,"EDIT");
        //menu.add(int groupId,int itemId,int order,顯示的title)
        getMenuInflater().inflate(R.menu.mymenu,menu);
        //直接從resource的menu新增一個Menuresourcefile 直接拉取item
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //控制menu上的item
        switch(item.getItemId()) //利用switch以itemID的方式分別對item下指令
        {
            case R.id.add:
                Toast.makeText(MainActivity.this,"使用者按下ADD",Toast.LENGTH_SHORT).show();
            case R.id.edit:
                Toast.makeText(MainActivity.this,"使用者按下EDIT",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
