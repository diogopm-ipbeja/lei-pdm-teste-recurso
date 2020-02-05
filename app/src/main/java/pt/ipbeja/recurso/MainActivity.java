package pt.ipbeja.recurso;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupToolbar();

        // Código a partir daqui


    }




    private void setupToolbar() {
        // Não mexer
        ActionBar bar = getSupportActionBar();
        if(bar != null) {
            bar.setDisplayShowHomeEnabled(true);
            Drawable icon = getDrawable(R.drawable.ic_movie_filter_black_24dp);
            Objects.requireNonNull(icon).setTint(Color.WHITE);
            bar.setIcon(icon);
        }
    }
}
