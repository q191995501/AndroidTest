package demo2.wenhaha.cn.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String tempData="Something you just typed";
        outState.putString("data_key",tempData);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        if (savedInstanceState!=null){
            String data = savedInstanceState.getString("data_key");
            Log.d(TAG, "onCreate: "+data);
        }
        setContentView(R.layout.activity_main);
        Button normal = (Button) findViewById(R.id.start_normal_activity);
        Button dialog = (Button) findViewById(R.id.start_Dialog_activity);
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });

        dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });

    }

    //可见调用
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    //可见一直会在这个方法
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    //跳转时触发
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }


    //完全不可见时执行
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    //销毁之前
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    //从停止状态变成活动调用
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }
}
