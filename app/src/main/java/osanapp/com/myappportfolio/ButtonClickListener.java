package osanapp.com.myappportfolio;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by JMan on 5/29/2015.
 */
class ButtonClickListener implements View.OnClickListener{
    private UIManager uiManager;
    private String appName;
  private   Activity activity;
    public ButtonClickListener(Activity act, String appName){
        this.uiManager = uiManager;
        this.appName = appName;
        activity = act;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(activity.getApplicationContext(), "This button launches " + appName, Toast.LENGTH_SHORT).show();

    }

    }
