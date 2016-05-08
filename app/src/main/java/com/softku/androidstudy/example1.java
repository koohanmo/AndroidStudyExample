package com.softku.androidstudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by 구한모 on 2016-05-09.
 */
public class example1 extends AppCompatActivity {

    EditText edit;
    TextView msg;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example1);

        init();
    }

    private void init()
    {
        edit = (EditText)findViewById(R.id.editText);
        btn = (Button)findViewById(R.id.button);
        msg = (TextView)findViewById(R.id.msg);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edit.getText().toString();
                if(s.length()==0)
                {
                    msg.setText("디진다 말해라");
                }
                else
                {
                    msg.setText(s+"라고????\n 응 꺼져~");
                }
                edit.setText("");
            }
        });

    }
}
