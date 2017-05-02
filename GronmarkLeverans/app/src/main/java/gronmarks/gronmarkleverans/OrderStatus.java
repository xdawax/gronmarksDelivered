package gronmarks.gronmarkleverans;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class OrderStatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_status);

        Intent intent = getIntent();
        String companyName = MainActivity.companyName;

        EditText orderNumber = (EditText) findViewById(R.id.orderNummer);
        orderNumber.requestFocus();

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);

    }

    public void sendToMail() {
/*
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, "dawa1980@gmail.com");
        emailIntent.putExtra(Intent.EXTRA_CC, "");
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "test from app");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "");

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
*/
        Intent sendintent = new Intent(Intent.ACTION_SEND);
        sendintent.setAction(Intent.ACTION_SEND);
        sendintent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
        sendintent.setType("text/plain");
        startActivity(sendintent);

    }
}
