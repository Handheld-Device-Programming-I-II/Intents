package lk.jiat.intent.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import lk.jiat.intent.R;

public class HomeActivity extends AppCompatActivity {
    private Button homeBtn;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState);
        //layout file configuration and initialization
        setContentView(R.layout.activity_home);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
