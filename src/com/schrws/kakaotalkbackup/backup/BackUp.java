package com.schrws.kakaotalkbackup.backup;

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

public class BackUp extends Fragment implements OnClickListener{
	private Context mContext;

	public BackUp(Context context) {
		mContext = context;
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.backup_layout);
		
		
        
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View V = inflater.inflate(R.layout.backup_layout, container, false);
		Button btn1 = (Button) V.findViewById(R.id.button1);
		Button btn2 = (Button) V.findViewById(R.id.button2);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		return V;
	}
	
	private void setContentView(int backupLayout) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.button2:
			try{
				Runtime.getRuntime().exec("su -c mkdir /sdcard/KaKaoTalkBackUp");
			}
			catch(IOException e){
			}
			break;
		case R.id.button1:
			try{
				Runtime.getRuntime().exec("su -c cp /data/data/com.kakao.talk/databases/KakaoTalk.db /sdcard/KaKaoTalkBackup/KaKaoTalks.db");
			}
			catch(IOException e){
				
			}
			break;
			
		
		}
	}
}
