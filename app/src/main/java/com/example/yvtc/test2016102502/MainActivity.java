package com.example.yvtc.test2016102502;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    CheckBox chk;
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk = (CheckBox)findViewById(R.id.checkBox);
        rg=(RadioGroup)findViewById(R.id.radioGroup);
        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Log.d("MyLog","有勾");
                }
                else
                {
                    Log.d("MyLog","沒勾");
                }
            }
        });
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButton)
                {
                    Log.d("MyLog","第一個");
                }
                if(checkedId == R.id.radioButton2)
                {
                    Log.d("MyLog","第二個");
                }
                if(checkedId == R.id.radioButton3)
                {
                    Log.d("MyLog","第三個");
                }
            }
        });
    }
}
