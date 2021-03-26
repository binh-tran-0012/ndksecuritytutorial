package com.binhdrm.ndksecuritytutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private static final String AUTH_TOKEN = "BINH59b76e4362d1128f317271d1606d164a5f147db3bbf1d4aa42f319bDRM";

    static {
        System.loadLibrary("native-lib");
    }

    private native String invokeNativeFunction();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "key: " + AUTH_TOKEN);

        TextView tvData = findViewById(R.id.text_view_data);
        tvData.setText(invokeNativeFunction());
    }
}