package com.schrws.kakaotalkbackup.developer;

import java.io.IOException;

import com.schrws.kakaotalkbackup.R;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.content.Intent;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Developer extends Fragment implements OnClickListener{
	private Context mContext;

	public Developer(Context context) {
		mContext = context;
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.backup_layout);
		
		
        
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View V = inflater.inflate(R.layout.developer_layout, container, false);
		//Button btn1 = (Button) V.findViewById(R.id.button1);
		//btn1.setOnClickListener(this);
		return V;
	}
	
	private void setContentView(int backupLayout) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.button1:
			try{
				Runtime.getRuntime().exec("su -c cp /sdcard/KaKaoTalkBackup/KaKaoTalks.db /data/data/com.kakao.talk/databases/KakaoTalk.db");
			}
			catch(IOException e){
				
			}
			break;
			
		
		}
	}
}
