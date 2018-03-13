package uiwigettest.wenhaha.cn.uiwigettest;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    private EditText editText;
    private ImageView imagView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.edit_text);
        imagView=(ImageView)findViewById(R.id.image_view);
        progressBar=(ProgressBar)findViewById(R.id.progress_bar);
        //方式一
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
        //方式二
        button.setOnClickListener(this);
        Button alertDialog = (Button) findViewById(R.id.alertDialog);
        alertDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                imagView.setImageResource(R.drawable.one);
                if(progressBar.getVisibility()==View.GONE){
                    progressBar.setVisibility(View.VISIBLE);
                }else{
                    progressBar.setVisibility(View.GONE);
                }
                Toast.makeText(this, editText.getText().toString(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.alertDialog:
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("Something important");
                dialog.setCancelable(true);
                dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.setNegativeButton("Celare", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show();
                break;
            case R.id.progressDialog:
                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("This is PorgressDialog");
                progressDialog.setMessage("Loading.....");
                progressDialog.setCancelable(true);
                progressDialog.show();
                break;
            default:
                break;
        }
    }
}
