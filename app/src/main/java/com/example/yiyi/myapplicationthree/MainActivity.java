package com.example.yiyi.myapplicationthree;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

// 隐式Intent，不仅可以启动自己程序内部的活动，还可以启动其他程序的活动

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button)findViewById(R.id.button);

        /*
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction("NewActivity");
                startActivity(intent);
                intent.addCategory("android.intent.category.DEFAULT");
            }
        });
        */

        button.setOnClickListener(new View.OnClickListener() {

            // 指定Intent的action是Intent.ACTION_VIEW
            // 这是一个Android系统内置的动作，其常量值为android.intent.action.VIEW.
            // 通过Uri.parse()方法
            //    将一个网址字符串解析成一个Uri对象，再调用Intent的setData()方法将这个Uri对象传递进去

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "跳转至网页", Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(Intent.ACTION_VIEW);

                intent.setData(Uri.parse("http://www.baidu.com"));

                startActivity(intent);
            }
        });

    }
}

// 通过意图启动其他程序:  Uri、setAction、setData、setDataAndType
