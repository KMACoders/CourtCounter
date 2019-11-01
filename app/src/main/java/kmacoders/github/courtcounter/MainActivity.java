package kmacoders.github.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Anh xa den diem so cua 2 ben
    public void displayScoreA(String text){
        TextView txt = findViewById(R.id.txtScoreA);
        txt.setText(text);
    }
    public void displayScoreB(String text){
        TextView txt = findViewById(R.id.txtScoreB);
        txt.setText(text);
    }
    //Viet cac button cho ben A
    // 3 diem
    public void btnA3Points(View view) {
        scoreA = scoreA + 3;
        String textScoreA = String.valueOf(scoreA);
        displayScoreA(textScoreA);
    }
    // 2 diem
    public void btnA2Points(View view) {
        scoreA = scoreA + 2;
        String textScoreA = String.valueOf(scoreA);
        displayScoreA(textScoreA);
    }
    // 1 diem
    public void btnA1Point(View view) {
        scoreA = scoreA + 1;
        String textScoreA = String.valueOf(scoreA);
        displayScoreA(textScoreA);
    }

    //Viet cac button cho ben B
    public void btnB3Points(View view) {
        scoreB = scoreB + 3;
        String textScoreB = String.valueOf(scoreB);
        displayScoreB(textScoreB);
    }
    // 2 diem
    public void btnB2Points(View view) {
        scoreB = scoreB + 2;
        String textScoreB = String.valueOf(scoreB);
        displayScoreB(textScoreB);
    }
    // 1 diem
    public void btnB1Point(View view) {
        scoreB = scoreB + 1;
        String textScoreB = String.valueOf(scoreB);
        displayScoreB(textScoreB);
    }

    // Nut reset diem ve 0
    public void btnReset(View view){
        scoreA = 0;
        scoreB = 0;
        String textScoreA = String.valueOf(scoreA);
        String textScoreB = String.valueOf(scoreB);
        displayScoreA(textScoreA);
        displayScoreB(textScoreB);


    }

}
