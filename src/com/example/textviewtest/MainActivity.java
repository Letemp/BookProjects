package com.example.textviewtest;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//����id��ȡ�ı��ؼ�
		TextView html=(TextView)findViewById(R.id.html);
		//�����ı��ؼ�����ʾ�ı�
		html.setText(Html.fromHtml("��ӭ�μ�<font color=red>"+"�ֻ������ƴ���</font>"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
