package traversoft.com.customuicomponentsdemo;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface customTypeface = Typeface.createFromAsset(getAssets(), "fonts/Gotham-Bold.otf");

        TextView mTextView;
        mTextView = (TextView) findViewById(R.id.myTextView);
        mTextView.setTypeface(customTypeface);

        EditText mEditTextView;
        mEditTextView = (EditText) findViewById(R.id.myEditTextView);
        mEditTextView.setTypeface(customTypeface);

        setupCustomActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupCustomActionBar() {

        SpannableStringBuilder spannedTitle = new SpannableStringBuilder(this.getTitle());
        spannedTitle.setSpan (new CustomTypefaceSpan(getApplicationContext(), ""), 0, spannedTitle.length(), Spanned.SPAN_EXCLUSIVE_INCLUSIVE);

        ActionBar actionBar = this.getActionBar();
        if (actionBar != null) {
            actionBar.setTitle(spannedTitle);
        }
    }
}
