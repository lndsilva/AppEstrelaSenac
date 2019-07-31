package br.sp.senac.appestrela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
    }

    public void abrirJanela(View view) {
        Intent intent = new Intent(getApplicationContext(),Cadastro_Activity.class);
        startActivity(intent);
    }
}
