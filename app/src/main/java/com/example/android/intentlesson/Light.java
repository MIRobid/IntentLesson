package com.example.android.intentlesson;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;

import static android.content.Context.MODE_PRIVATE;
import android.view.View;
import android.widget.Button;

public class Light {
        Button btn = findViewById(R.id.ButtonMaterialLight);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAppTheme(0);
                recreate();
            }
        });

    private int getAppTheme(int codeStyle) {
        return codeStyleToStyleId(getCodeStyle(codeStyle));
    }

    private int getCodeStyle(int codeStyle){
        SharedPreferences sharedPref = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);
        return sharedPref.getInt(theme, codeStyle);
    }

    private void setAppTheme(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(theme, codeStyle);
        editor.apply();
    }

    private int codeStyleToStyleId(int codeStyle){
        switch(codeStyle){
            case 0:
                return R.style.CalcTheme;
            default:
                return R.style.CalcTheme;
        }
    }
}
