package com.example.zein.zeinyt7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.aromajoin.actionsheet.ActionSheet;
import com.aromajoin.actionsheet.OnActionListener;

public class MainActivity extends AppCompatActivity implements OnActionListener {

    Button btnSheet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSheet = (Button)findViewById(R.id.btnSheet);
        btnSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showActionSheet(v);
            }
        });
    }

    private void showActionSheet(View v) {
        ActionSheet actionSheet = new ActionSheet(getBaseContext());
        actionSheet.setTitle("My Action Sheet");
        actionSheet.setSourceView(v);

        actionSheet.addAction("Click Me1!",ActionSheet.Style.DEFAULT,this);
        actionSheet.addAction("Click Me2!",ActionSheet.Style.DEFAULT,this);
        actionSheet.addAction("Click Me3!",ActionSheet.Style.DEFAULT,this);
        actionSheet.addAction("Click Me4!",ActionSheet.Style.DEFAULT,this);
        actionSheet.addAction("Click Me5!",ActionSheet.Style.DEFAULT,this);

        actionSheet.show();
    }

    @Override
    public void onSelected(ActionSheet actionSheet, String title) {
        Toast.makeText(getApplicationContext(), ""+title, Toast.LENGTH_SHORT).show();
        actionSheet.dismiss();
    }
}
