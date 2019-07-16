package olalekan.project.com.myalcproject1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.myProfile);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadProfile();
            }
        });


        Button btn2 = findViewById(R.id.aboutAlc);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadPage();
            }
        });
    }







    public void LoadProfile(){
        Intent intent1 = new Intent(this,MyProfile.class);
        startActivity(intent1);
    }
    public void LoadPage() {
        Intent intent2 = new Intent(this, AlcPage.class);
        startActivity(intent2);
    }

}


