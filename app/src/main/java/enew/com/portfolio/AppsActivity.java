package enew.com.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AppsActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSpotify, btnScores, btnLibrary, btnBuilIt, btnXYZReader, btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps);
        initializeUI();
    }

    private void initializeUI() {
        btnSpotify = (Button) findViewById(R.id.btnSpotify);
        btnScores = (Button) findViewById(R.id.btnScores);
        btnLibrary = (Button) findViewById(R.id.btnLibrary);
        btnBuilIt = (Button) findViewById(R.id.btnBuildIt);
        btnXYZReader = (Button) findViewById(R.id.btnXYZReader);
        btnCapstone = (Button) findViewById(R.id.btnCapstone);

        btnSpotify.setOnClickListener(this);
        btnScores.setOnClickListener(this);
        btnLibrary.setOnClickListener(this);
        btnBuilIt.setOnClickListener(this);
        btnXYZReader.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String appName = "";
        switch (v.getId()) {
            case R.id.btnSpotify:
                appName = getString(R.string.spotify);
                break;
            case R.id.btnScores:
                appName = getString(R.string.scores);
                break;
            case R.id.btnLibrary:
                appName = getString(R.string.library_app);
                break;
            case R.id.btnBuildIt:
                appName = getString(R.string.build_it);
                break;
            case R.id.btnXYZReader:
                appName = getString(R.string.xyz_reader);
                break;
            case R.id.btnCapstone:
                appName = getString(R.string.capstone);
                break;
        }
        Toast.makeText(this, "This button will launch my " + appName + "!", Toast.LENGTH_LONG).show();
    }
}
