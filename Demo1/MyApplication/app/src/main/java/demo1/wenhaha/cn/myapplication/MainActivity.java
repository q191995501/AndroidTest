package demo1.wenhaha.cn.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    private static final String TAG = "TaskID";

    //创建菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    
    //监听菜单点击事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"You clicked Add item",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"You clicked Remove item",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

    //上层Activity传来的数据
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if(resultCode==RESULT_OK){
                    Log.d("from Second Msg",data.getStringExtra("data_return"));
                }
                break;
            default:
        }
    }

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Task id is"+getTaskId());

        setContentView(R.layout.activity_main);
        Button button1=(Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this,"You clicked Button 1",Toast.LENGTH_SHORT).show();
//                finish();
             //显示Intent
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(intent);
                //隐示 Intent
               /* Intent intent = new Intent("cn.wenhaha.demo1.action_start");
                intent.addCategory("android.intent.category.LAUNCHER");
                startActivity(intent);*/
                //Intent传数据
                /*String data="Hello SecondActivity";
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("extra_data",data);
                startActivity(intent);*/


                //数据向上
        /*        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intent,1);*/

                //启动模式  standard singleTop singleTask singleInstance
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });
    }
}
