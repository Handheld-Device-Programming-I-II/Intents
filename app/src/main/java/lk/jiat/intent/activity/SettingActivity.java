package lk.jiat.intent.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import lk.jiat.intent.R;

public class SettingActivity extends AppCompatActivity {
    private Button settingBtn;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        this.settingBtn=findViewById(R.id.settingBtn);
    }

    @Override
    protected void onResume() {
        super.onResume();
        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            backToHome();
            }
        });
    }

    private void backToHome(){
        Intent intent = new Intent(SettingActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}
