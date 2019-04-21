package ac.id.unud.ti.anjingrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class ItemDetail extends AppCompatActivity {
    //private static final String TAG = "ItemDetail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("dog_name") && getIntent().hasExtra("dog_desc")) {
            String imageUrl = getIntent().getStringExtra("image_url");
            String dogName = getIntent().getStringExtra("dog_name");
            String dogDesc = getIntent().getStringExtra("dog_desc");

            setImage(imageUrl, dogName, dogDesc);
        }
    }

    private void setImage(String imageUrl, String dogName, String dogDesc) {
        TextView name = findViewById(R.id.tv_item_name);
        name.setText(dogName);
        TextView desc = findViewById(R.id.tv_item_desc);
        desc.setText(dogDesc);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }
}
