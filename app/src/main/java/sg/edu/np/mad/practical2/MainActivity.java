package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    User user = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("debug","create");

        Button followBtn = findViewById(R.id.follow);
        user.followed = false;

        followBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (!user.followed){
                    followBtn.setText("Unfollow");
                    user.followed = true;
                }
                else {
                    followBtn.setText(("Follow"));
                    user.followed = false;
                }
            }
        });
    }
    protected void onStart(){
        super.onStart();
        Log.d("debug","start");
    }
    protected void onResume(){
        super.onResume();
        Log.d("debug","resume");
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("debug","restart");
    }
}