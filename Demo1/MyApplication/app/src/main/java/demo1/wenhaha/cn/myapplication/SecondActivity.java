package demo1.wenhaha.cn.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {
    private static final String TAG = "TaskID";
    //给上级发消息
    @Override
    public void onBackPressed() {
        Intent intent1 = new Intent();
        intent1.putExtra("data_return","Hello MainActivity");
        setResult(RESULT_OK,intent1);
        finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Intent intent = getIntent();
//        Log.d("SecondActivity",intent.getStringExtra("extra_data"));


        setContentView(R.layout.second_layout);
        Log.d(TAG, "Task id is"+getTaskId());
        Button button =(Button) findViewById(R.id.button_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.baidu.com"));
                startActivity(intent);*/
//                Intent intent1 = new Intent();
//                intent1.putExtra("data_return","Hello MainActivity");
//                setResult(RESULT_OK,intent1);
//                finish();
                Intent intent = new Intent(SecondActivity.this, ThirActivity.class);
                startActivity(intent);
            }
        });


    }
}
