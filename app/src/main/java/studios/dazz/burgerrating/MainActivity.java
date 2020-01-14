package studios.dazz.burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar = findViewById(R.id.ratingBar2);
        textView = findViewById(R.id.textView);
    }

    public void submit(View view) {
        float ratingvalue = ratingBar.getRating();

        if(ratingvalue < 2) {
            textView.setText("We will try better next time!");
        }

        else  if(ratingvalue <=3 && ratingvalue >= 2){
            textView.setText("We are constantly improving!");
        }

        else  if(ratingvalue <=4 && ratingvalue > 3){
            textView.setText("We are delighted & we are improving constantly!");
        }

        else  if(ratingvalue > 4) {
            textView.setText("Thanks for your support!");
        }

    }
}
