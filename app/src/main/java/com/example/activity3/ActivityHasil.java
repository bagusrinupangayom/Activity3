package com.example.activity3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityHasil extends AppCompatActivity {
    //mendeklrasikan variabel dengan tipe data TextView
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        //menghubungkan var txEmail dengan komponen TextView pada layout
        txEmail = findViewById(R.id.tvEmail);

        //menghubungkan var txPassword dengan komponen TextView pada layout
        txPassword = findViewById(R.id.tvPassword);

        //mendeklarasikan var bundle yang akan digunakan untuk mengambil pesan yang dikirimkan melalui  method intent
        Bundle bundle = getIntent().getExtras();

        //buat var baru untuk menyimpan data yang dikirimkan dari activity sebelumnya dengan kunci "a" dan "b"
        String email    = bundle.getString("a");
        String password = bundle.getString("b");

        //menampilkan value dari var email dan password kedalam txEmail dan txPassword
        txEmail.setText(email);
        txPassword.setText(password);

    }
}
