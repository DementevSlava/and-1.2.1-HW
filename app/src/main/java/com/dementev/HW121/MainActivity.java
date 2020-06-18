package com.dementev.HW121;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView viewName;
    private TextView viewEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add();
        viewName = findViewById(R.id.personName);
        viewEmail = findViewById(R.id.emailAddress);
        textView = findViewById(R.id.resultWindow);

    }

    private void add() {
        Button buttonOk = findViewById(R.id.buttonOK);

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Подписка успешно оформлена для пользователя " + viewName.getText().toString()
                        + " , почта: " + viewEmail.getText().toString());
            }
        });
    }

    public void clear(View view) {
        textView.setText("Данные удалены");
        viewName.setText("");
        viewEmail.setText("");
    }
}