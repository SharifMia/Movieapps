package dev.sharifmia.movieapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {
    private ImageView imageView,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,
            imageView9,imageView10,imageView11,imageView12,imageView13,imageView14,imageView15,imageView16,imageView17,imageView18,
            imageView19,imageView20,coverMovie;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton = findViewById(R.id.floatingActionButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent coverMovie = new Intent(MainActivity.this,CoverMovie.class);
                startActivity(coverMovie);
            }
        });



        imageView = findViewById(R.id.Movie_1);
        imageView2 = findViewById(R.id.Movie_2);
        imageView3 = findViewById(R.id.Movie_3);
        imageView4 = findViewById(R.id.Movie_4);
        imageView5 = findViewById(R.id.Movie_5);
        imageView6 = findViewById(R.id.Movie_6);
        imageView7 = findViewById(R.id.Movie_7);
        imageView8 = findViewById(R.id.Movie_8);
        imageView9 = findViewById(R.id.Movie_9);
        imageView10 = findViewById(R.id.Movie_10);
        imageView11 = findViewById(R.id.Movie_11);
        imageView12 = findViewById(R.id.Movie_12);
        imageView13 = findViewById(R.id.Movie_13);
        imageView14 = findViewById(R.id.Movie_14);
        imageView15 = findViewById(R.id.Movie_15);
        imageView16 = findViewById(R.id.Movie_16);
        imageView17 = findViewById(R.id.Movie_17);
        imageView18 = findViewById(R.id.Movie_18);
        imageView19 = findViewById(R.id.Movie_19);
        imageView20 = findViewById(R.id.Movie_20);
        coverMovie = findViewById(R.id.CoverMovie);

        String url = "https://sharifmia.com/mPic/2.jpg";
        String url2 = "https://sharifmia.com/mPic/2.jpg";
        String url3 = "https://sharifmia.com/mPic/3.jpg";
        String url4 = "https://sharifmia.com/mPic/4.jpg";
        String url5 = "https://sharifmia.com/mPic/5.jpg";
        String url6 = "https://sharifmia.com/mPic/6.jpg";
        String url7 = "https://sharifmia.com/mPic/7.jpg";
        String url8 = "https://sharifmia.com/mPic/8.jpg";
        String url9 = "https://sharifmia.com/mPic/9.jpg";
        String url10 = "https://sharifmia.com/mPic/10.jpg";
        String url11 = "https://sharifmia.com/mPic/11.jpg";
        String url12 = "https://sharifmia.com/mPic/12.jpg";
        String url13 = "https://sharifmia.com/mPic/13.jpg";
        String url14 = "https://sharifmia.com/mPic/14.jpg";
        String url15 = "https://sharifmia.com/mPic/15.jpg";
        String url16 = "https://sharifmia.com/mPic/16.jpg";
        String url17 = "https://sharifmia.com/mPic/17.jpg";
        String url18 = "https://sharifmia.com/mPic/18.jpg";
        String url19 = "https://sharifmia.com/mPic/19.jpg";
        String url20 = "https://sharifmia.com/mPic/20.jpg";
        String CoverMovie = "https://sharifmia.com/mPic/20.jpg";

        Picasso.get().load(url).into(imageView);
        Picasso.get().load(url2).into(imageView2);
        Picasso.get().load(url3).into(imageView3);
        Picasso.get().load(url4).into(imageView4);
        Picasso.get().load(url5).into(imageView5);
        Picasso.get().load(url6).into(imageView6);
        Picasso.get().load(url7).into(imageView7);
        Picasso.get().load(url8).into(imageView8);
        Picasso.get().load(url9).into(imageView9);
        Picasso.get().load(url10).into(imageView10);
        Picasso.get().load(url11).into(imageView11);
        Picasso.get().load(url12).into(imageView12);
        Picasso.get().load(url13).into(imageView13);
        Picasso.get().load(url14).into(imageView14);
        Picasso.get().load(url15).into(imageView15);
        Picasso.get().load(url16).into(imageView16);
        Picasso.get().load(url17).into(imageView17);
        Picasso.get().load(url18).into(imageView18);
        Picasso.get().load(url19).into(imageView19);
        Picasso.get().load(url20).into(imageView20);
        Picasso.get().load(CoverMovie).into(coverMovie);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_1.class);
                startActivity(intent);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_2.class);
                startActivity(intent);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_3.class);
                startActivity(intent);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_4.class);
                startActivity(intent);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_5.class);
                startActivity(intent);
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_6.class);
                startActivity(intent);
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_7.class);
                startActivity(intent);
            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_8.class);
                startActivity(intent);
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_9.class);
                startActivity(intent);
            }
        });
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_10.class);
                startActivity(intent);
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_11.class);
                startActivity(intent);
            }
        });
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_12.class);
                startActivity(intent);
            }
        });
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_13.class);
                startActivity(intent);
            }
        });
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_14.class);
                startActivity(intent);
            }
        });
        imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_15.class);
                startActivity(intent);
            }
        });
        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_16.class);
                startActivity(intent);
            }
        });
        imageView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_17.class);
                startActivity(intent);
            }
        });
        imageView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_18.class);
                startActivity(intent);
            }
        });
        imageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_19.class);
                startActivity(intent);
            }
        });

        imageView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Movie_20.class);
                startActivity(intent);
            }
        });

    }
}
