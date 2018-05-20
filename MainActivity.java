package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	private EditText ET1,ET2,ET3;
	private Button BT1,BT2,BT3,BT4;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButtonListener();
    }
    
    public void addButtonListener()
    {
    	ET1=(EditText)findViewById(R.id.edittext1);
    	ET2=(EditText)findViewById(R.id.edittext2);
    	ET3=(EditText)findViewById(R.id.sumtext);
    	BT1=(Button)findViewById(R.id.Button1);
    	BT1.setOnClickListener(this);
    	BT2=(Button)findViewById(R.id.Button2);
    	BT2.setOnClickListener(this);
    	BT3=(Button)findViewById(R.id.Button3);
    	BT3.setOnClickListener(this);
    	BT4=(Button)findViewById(R.id.Button4);
    	BT4.setOnClickListener(this);
    }
    
    public void onClick(View v)
    {
    	String V1=ET1.getText().toString();
    	String V2=ET2.getText().toString();
    	int a=Integer.parseInt(V1);
    	int b=Integer.parseInt(V2);
    	switch(v.getId())
    	{
    	case R.id.Button1:
    	{
    		int sum=a+b;
        	Log.i("Sum","a="+a+"b="+b+"Sum="+sum);
        	ET3.setText(String.valueOf(sum));
        	Toast.makeText(getApplicationContext(),String.valueOf(sum) ,Toast.LENGTH_LONG).show();
    	}
    	break;
    	case R.id.Button2:
    	{
    		int dif=a-b;
        	Log.i("Dif","a="+a+"b="+b+"Dif="+dif);
        	ET3.setText(String.valueOf(dif));
        	Toast.makeText(getApplicationContext(),String.valueOf(dif) ,Toast.LENGTH_LONG).show();
    	}
    	break;
    	case R.id.Button3:
    	{
    		int mul=a*b;
        	Log.i("Mul","a="+a+"b="+b+"Mul="+mul);
        	ET3.setText(String.valueOf(mul));
        	Toast.makeText(getApplicationContext(),String.valueOf(mul) ,Toast.LENGTH_LONG).show();
    	}
    	break;
    	case R.id.Button4:
    	{
    		int div=a/b;
        	Log.i("Div","a="+a+"b="+b+"Div="+div);
        	ET3.setText(String.valueOf(div));
        	Toast.makeText(getApplicationContext(),String.valueOf(div) ,Toast.LENGTH_LONG).show();
    	}
    	break;
    	
    	}
    	
    	
    }
    

    
    
}
