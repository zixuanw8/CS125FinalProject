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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWallPaper();
            }
        });
    }
    private void setWallPaper() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.redsky);
        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.worldend);
        WallpaperManager manager = WallpaperManager.getInstance(getApplicationContext());
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
//        String time = dtf.format(now);
//        String hour = time.substring(11, 13);
//        int currentHour = Integer.getInteger(hour);
        try {
            manager.setBitmap(bitmap);
            Toast.makeText(this, "Wall paper set to red sky", Toast.LENGTH_SHORT).show();
//            if (currentHour > 12) {
//                manager.setBitmap(bitmap);
//                Toast.makeText(this, "Wall paper set to red sky", Toast.LENGTH_SHORT).show();
//            } else {
//                manager.setBitmap(bitmap1);
//                Toast.makeText(this, "Wall paper set to end of the world", Toast.LENGTH_SHORT).show();
//            }
        } catch (IOException e) {
            Toast.makeText(this, "System failed", Toast.LENGTH_SHORT).show();
        }
    }
}
