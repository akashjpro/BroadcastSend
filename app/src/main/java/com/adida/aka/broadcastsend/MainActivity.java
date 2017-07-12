package com.adida.aka.broadcastsend;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String ACTION_ADD = "com.adida.aka.broadcastsend.addSum";
    private static final String KEY_A = "keyA";
    private static final String KEY_B = "keyB";
    private EditText mEdtNumA, mEdtNumB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intView();
    }

    private void intView() {
        mEdtNumA = (EditText) findViewById(R.id.edt_num_a);
        mEdtNumB = (EditText) findViewById(R.id.edt_num_b);
    }

    public void sum(View view) {
        Intent intent = new Intent();
        intent.setAction(ACTION_ADD);
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_A, Integer.parseInt(mEdtNumA.getText().toString().trim()));
        bundle.putInt(KEY_B, Integer.parseInt(mEdtNumB.getText().toString().trim()));
        intent.putExtras(bundle);
        sendBroadcast(intent);
    }
}
