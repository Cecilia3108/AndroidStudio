package com.example.a05032022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private static ImageView imageView;
    private static Button button;
    private int currentImageIndex;
    int[] images={R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setButtonClick(){
        imageView=(ImageView) findViewById(R.id.imageView);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentImageIndex++;
                currentImageIndex=currentImageIndex%images.length;
                imageView.setImageResource(images[currentImageIndex]);
            }
        });
    }
}