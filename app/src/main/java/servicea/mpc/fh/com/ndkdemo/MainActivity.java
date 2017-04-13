package servicea.mpc.fh.com.ndkdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // Example of a call to a native method
    TextView tv = (TextView) findViewById(R.id.sample_text);
       tv.setText(stringFromJNI());
        Log.i("hihai","ihai");
       int a = maxFromJNI(50,60);
        Log.i("a",a+"");
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
    public native int maxFromJNI(int a, int b);
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-app");
    }
}
