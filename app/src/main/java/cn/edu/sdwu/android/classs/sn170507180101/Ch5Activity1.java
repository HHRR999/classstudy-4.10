package cn.edu.sdwu.android.classs.sn170507180101;

import android.app.Notification;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Ch5Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch5_1);
    }
    public  void toastl(View view){
        Toast.makeText(this, "toast1", Toast.LENGTH_SHORT).show();
    }
    public  void toast2(View view){
        Toast toast=Toast.makeText(this,"toast2",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

    }
    public  void  toast3(View view){
        //加载自定义的布局文件，将其转化为一个View类的实例
        LayoutInflater layoutInflater =getLayoutInflater();
        View viewl=layoutInflater.inflate(R.layout.layout_toast,null);
        //设置显示的文本
        TextView textView=(TextView) viewl.findViewById(R.id.toast_tv);
        textView.setText("toast3");

        Toast toast=new Toast(this);
        toast.setView(viewl);//设置界面
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.getGravity(Gravity.CENTER,0,0);
        toast.show();


    }
    public void notification(View view){
        Notification.Builder builder=new Notification.Builder(this);
        //在构造器中，完成通知各种属性的设置
        builder.setContentTitle("title");
        builder.setContentText("message");
        builder.setSmallIcon(android.R.drawable.ic_input_delete);//引用系统的资源
        builder.build();
    }

}
