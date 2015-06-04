package com.hitechren.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public void appClick (View v){
        String toastMsg = "This button will launch ";
        switch (v.getId()){
            case R.id.btn_spotify:
                toastMsg = toastMsg + getString(R.string.app_spotify);
                break;
            case R.id.btn_scores:
                toastMsg = toastMsg + getString(R.string.app_scores);
                break;
            case R.id.btn_library:
                toastMsg = toastMsg + getString(R.string.app_library);
                break;
            case R.id.btn_bib:
                toastMsg = toastMsg + getString(R.string.app_bib);
                break;
            case R.id.btn_xyzreader:
                toastMsg = toastMsg + getString(R.string.app_xyzreader);
                break;
            case R.id.btn_capstone:
                toastMsg = toastMsg + getString(R.string.app_capstone);
                break;
        }
        toastMsg = toastMsg + "!";
        Toast toast = Toast.makeText(getApplicationContext(),toastMsg, Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
