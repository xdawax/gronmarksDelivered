package gronmarks.gronmarkleverans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public static String companyName;
    public static final String lindab = "Lindab";
    public static final String paroc = "Paroc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void orderStatusView(View view)
    {

        Intent intent = new Intent(this, OrderStatus.class);

        int pushedButton = view.getId();
        String message;
        TextView textView = (TextView) findViewById(R.id.pushedButton);

        if (pushedButton == R.id.lindabButton) {
            companyName = lindab;
            textView.setText(companyName);
        }
        else if (pushedButton == R.id.parocButton) {
            companyName = paroc;
            textView.setText(companyName);
        }

        startActivity(intent);
    }

    public void loadStatusView(int button)
    {
        Toast.makeText(this, "Pushed " + button, Toast.LENGTH_LONG);
    }


}
