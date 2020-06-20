package com.example.my1styear;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class welcomeSplash extends AppCompatActivity {

    int sleeptime = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_welcome_splash);
        LogoLauncher logoLauncher = new LogoLauncher();
        logoLauncher.start();

    }

    private class LogoLauncher extends Thread{
        public void run(){
            try{
                sleep(1000 * sleeptime);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            Intent intent = new Intent(welcomeSplash.this, MainActivity.class);
            startActivity(intent);
            welcomeSplash.this.finish();
        }
    }
}
