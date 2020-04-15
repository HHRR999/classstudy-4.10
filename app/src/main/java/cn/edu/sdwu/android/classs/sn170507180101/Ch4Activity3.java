package cn.edu.sdwu.android.classs.sn170507180101;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class Ch4Activity3 extends AppCompatActivity {
    private ArrayList list;
    private TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch4_3);
        list =new ArrayList();
        textView=(TextView)findViewById(R.id.ch4_3_tv);

        //通过界面的容器，找到它所包含的所有子元素，再来注册监听器
        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.ch4_3_11);
        int count=linearLayout.getChildCount();
        for(int i=0;i<count;i++){
            View view=LinearLayout.getChildAt(i);
            if(view instanceof CheckBox){
                CheckBox checkBox=(CheckBox)view;
                checkBox.setOnCheckedChangeListener((compoundButton, b) → {
                    //参数b代表是否选中，第一个参数代表事件源
                    if(b){
                        list.add(compoundButton);

                    }else{
                        list.remove(compoundButton);

                    }
                    String content="you select:"
                            for(int t=0;t<list .size();t++){
                                CheckBox checkBoxl=(CheckBox) list.get(t);
                                String sel=checkBoxl.getText().toString();
                                content+=sel+",";

                            }
                            textView.setText(content);

                });

            }

        }
    }
}
