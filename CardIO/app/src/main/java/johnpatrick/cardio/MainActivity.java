package johnpatrick.cardio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;
import io.card.payment.DataEntryActivity;

public class MainActivity extends AppCompatActivity {

    private int MY_SCAN_REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onScanPress(View pressed) {
        Intent scanIntent = new Intent(this, DataEntryActivity.class);
        // customize these values to suit your needs.
        scanIntent.putExtra(CardIOActivity.EXTRA_REQUIRE_EXPIRY, true); // default: false
        scanIntent.putExtra(CardIOActivity.EXTRA_REQUIRE_CVV, true); // default: false
        scanIntent.putExtra(CardIOActivity.EXTRA_REQUIRE_POSTAL_CODE, false); // default: false
        scanIntent.putExtra(CardIOActivity.EXTRA_HIDE_CARDIO_LOGO, true);
        scanIntent.putExtra(CardIOActivity.EXTRA_KEEP_APPLICATION_THEME, true);
        scanIntent.putExtra(CardIOActivity.EXTRA_LANGUAGE_OR_LOCALE, true);
        // MY_SCAN_REQUEST_CODE is arbitrary and is only used within this activity.
        startActivityForResult(scanIntent, MY_SCAN_REQUEST_CODE);
    }

}
