package com.example.cs125final;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWallPaper(1);
            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWallPaper(2);
            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWallPaper(3);
            }
        });
        Button button4 = (Button) findViewById(R.id.button4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWallPaper(4);
            }
        });
    }
    private void setWallPaper(int a) {
        Date currentDate = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        String time = timeFormat.format(currentDate);
        String hour = time.substring(1, 2);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.redsky);
        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.worldend);
        WallpaperManager manager = WallpaperManager.getInstance(getApplicationContext());
        try {
            if (hour.equals("0") || hour.equals("2") || hour.equals("4") || hour.equals("6") || hour.equals("8")) {
                if (a == 1) {
                    manager.setBitmap(bitmap);
                    Toast.makeText(this, "Wall paper set to red sky", Toast.LENGTH_SHORT).show();
                } else {
                    manager.setBitmap(bitmap1);
                    Toast.makeText(this, "Wall paper set to world's end", Toast.LENGTH_SHORT).show();
                }
            } else {
                if (a == 2) {
                    manager.setBitmap(bitmap);
                    Toast.makeText(this, "Wall paper set to red sky", Toast.LENGTH_SHORT).show();
                } else {
                    manager.setBitmap(bitmap1);
                    Toast.makeText(this, "Wall paper set to world's end", Toast.LENGTH_SHORT).show();
                }
            }

        } catch (IOException e) {
            Toast.makeText(this, "System failed", Toast.LENGTH_SHORT).show();
        }
    }
}
