package lk.jiat.intent.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import lk.jiat.intent.R;

public class HomeActivity extends AppCompatActivity {
    private Button homeBtn;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //layout file configuration and initialization
        setContentView(R.layout.activity_home);
        this.homeBtn = findViewById(R.id.homeBtn);

        //access data
        String username = getIntent().getStringExtra("username");
        Log.i(SettingActivity.class.getSimpleName(), "onCreate: " + username);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //calling listeners
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToSetting();
            }
        });
    }

    private void moveToSetting(){
        Intent intent = new Intent(HomeActivity.this, SettingActivity.class);
        intent.putExtra("username", "kalhara");
        startActivity(intent);
    }
}
