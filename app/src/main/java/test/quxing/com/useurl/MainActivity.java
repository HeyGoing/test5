package test.quxing.com.useurl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity
{
	private EditText edt;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button bn = (Button) findViewById(R.id.bn);
		edt = (EditText)findViewById(R.id.editText);
		String str = edt.getText().toString();
		// 为bn按钮添加一个监听器
		bn.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				/*String pckName = "test.quxing.com.mywebview";
				String clsName = "test.quxing.com.mywebview.MainActivity";
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.addCategory(Intent.CATEGORY_LAUNCHER);
				ComponentName cn = new ComponentName(pckName,clsName);
				intent.setComponent(cn);
				intent.putExtra("url", edt.getText().toString());
				startActivity(intent);*/


				Intent intent = new Intent();
				// 只设置Intent的Data属性

				intent.setData(Uri.parse("lee://www.fkjava.org:1234/mypath"));
				startActivity(intent);




			}
		});


	}
}

