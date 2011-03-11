package hu.project3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class VoiceAnalyzer extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Een tekstje");
        setContentView(tv);
//      setContentView(R.layout.main);
    }
}