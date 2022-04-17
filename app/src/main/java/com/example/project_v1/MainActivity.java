package com.example.project_v1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToCurrency(View view) {
        Intent intent = new Intent(MainActivity.this, CurrencyConverterActivity.class);
        startActivity(intent);
    }

    public void goToTimeZone(View view) {
        Intent intent = new Intent(MainActivity.this, TimeConverterActivity.class);
        startActivity(intent);
    }

    public void goToNearby(View view) {
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(intent);
    }

    public void goToScanner(View view) {
        Intent intent = new Intent(MainActivity.this, QRScannerActivity.class);
        startActivity(intent);
    }

    public void goToExpense(View view) {
        Intent intent = new Intent(MainActivity.this, ExpenseTrackerActivity.class);
        startActivity(intent);
    }

    public void goToUber(View view) {
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.ubercab");
        if (intent != null) {
            // We found the activity now start the activity
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } else {
            // Bring user to the market or let them choose an app?
            intent = new Intent(Intent.ACTION_VIEW);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setData(Uri.parse("market://details?id=" + "com.ubercab"));
            startActivity(intent);
        }
    }
}