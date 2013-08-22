package com.drako.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

// константы, используемые при сохранении\восстановлении состояния
private static final String BILL_TOTAL = "BILL_TOTAL";
private static final String CUSTOM_PERCENT = "CUSTOM_PERCENT";

private double currentBillTotal; // счет, вводимы пользователем
private int currentCustomPercent; // % чаевых, выбранный SeekBar


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
