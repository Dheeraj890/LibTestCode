package com.as.as_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.intsig.ccrengine.ISCardScanActivity;
import com.lib.astpl.scannertest.R;

public class ScannerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(ScannerActivity.this,ISCardScanActivity.class);
                intent.putExtra(ISCardScanActivity.EXTRA_KEY_COLOR_MATCH, 0xffff0000);
                intent.putExtra(ISCardScanActivity.EXTRA_KEY_COLOR_NORMAL, 0xff00ff00);
                intent.putExtra(ISCardScanActivity.EXTRA_KEY_TIPS, " Please put the bankcard in the frame");
                // intent.putExtra(ISCardScanActivity.EXTRA_KEY_APP_KEY, "3963757fa5888e520e642c1330-nfgrpuabyhgvbaf");//8hS3MTC7X1bC4RAXQN6dYM4T
                intent.putExtra(ISCardScanActivity.EXTRA_KEY_APP_KEY, "E68JUeBYW394048frBdeLJ0F");//ac3e92952a4d16e07ea42c1910-Nfgrpu
                intent.putExtra(ISCardScanActivity.EXTRA_KEY_GET_NUMBER_IMG, false);
                intent.putExtra(ISCardScanActivity.EXTRA_KEY_ORIENTATION, ISCardScanActivity.ORIENTATION_HORIZONTAL);
                intent.putExtra(ISCardScanActivity.EXTRA_KEY_SHOW_CLOSE, true);
                //intent.putExtra(ISCardScanActivity.EXTRA_KEY,"");
                startActivityForResult(intent, 100);


            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        Toast.makeText(this,requestCode+"",Toast.LENGTH_SHORT).show();

    }
}
