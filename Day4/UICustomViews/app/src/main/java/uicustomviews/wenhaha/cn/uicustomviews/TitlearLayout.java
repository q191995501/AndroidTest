package uicustomviews.wenhaha.cn.uicustomviews;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/2/22 0022.
 */

public class TitlearLayout extends LinearLayout {
    public TitlearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.titie,this);
        Button back = (Button) findViewById(R.id.back);
        Button edit = (Button) findViewById(R.id.edit);
       back.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View view) {
               ((Activity)getContext()).finish();
           }
       });
        edit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "点击了Edit", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
