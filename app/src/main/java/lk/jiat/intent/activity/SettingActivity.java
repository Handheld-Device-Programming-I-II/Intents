package lk.jiat.intent.activity;

import android.os.Bundle;
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
}
