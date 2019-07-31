package br.sp.senac.appestrela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirJanela(View view) {
        Intent intent=new Intent(getApplicationContext(),Splash_Activity.class);
        startActivity(intent);
    }
}
