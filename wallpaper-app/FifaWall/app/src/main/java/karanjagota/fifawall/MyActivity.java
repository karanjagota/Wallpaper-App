package karanjagota.fifawall;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class MyActivity extends Activity {
        ImageView a;
        int toPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        toPhone = R.drawable.van_persie;

         a = (ImageView)findViewById(R.id.imageView);

        ImageView b = (ImageView)findViewById(R.id.imageView1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.setImageResource(R.drawable.img1);
                toPhone = R.drawable.img1;
            }
        });

        ImageView d = (ImageView)findViewById(R.id.imageView4);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.setImageResource(R.drawable.img3);
                toPhone = R.drawable.img3;
            }
        });
        ImageView e = (ImageView)findViewById(R.id.imageView5);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.setImageResource(R.drawable.img4);
                toPhone = R.drawable.img4;
            }
        });
        ImageView f = (ImageView)findViewById(R.id.imageView6);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.setImageResource(R.drawable.img5);
                toPhone = R.drawable.img5;
            }


        });
         ImageView g = (ImageView)findViewById(R.id.imageView7);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.setImageResource(R.drawable.van_persie);
                toPhone = R.drawable.van_persie;
            }
        });

       Button but =(Button)findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputStream inputStream  = getResources().openRawResource(toPhone);
                Bitmap bitmap =  BitmapFactory.decodeStream(inputStream);
                try {


                    getApplicationContext().setWallpaper(bitmap);
                }catch (IOException e){
                e.printStackTrace();}

                Toast.makeText(getApplicationContext(),"wallpaper set",Toast.LENGTH_SHORT).show();


            }
        });

    }


}
