package demo1.wenhaha.cn.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ThirActivity extends BaseActivity {

    private static final String TAG = "TaskID";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Task id is"+getTaskId());
        setContentView(R.layout.activity_thir);
    }
}
