package osanapp.com.myappportfolio;

import android.app.Activity;
import android.widget.Button;

/**
 * Created by JMan on 5/28/2015.
 */
public class UIManager {
    private Button spotifyButton;
    private Button libraryButton;
    private Button scoresButton;
    private Button buildButton;
    private Button xyzButton;
    private Button capStoneButton;
private Activity activity;
    public UIManager(Activity activity) {
        this.activity = activity;
        spotifyButton = (Button) activity.findViewById(R.id.spotify_button);
        spotifyButton.setOnClickListener(new ButtonClickListener(activity, activity.getString(R.string.spotify_streamer) ));
        libraryButton = (Button) activity.findViewById(R.id.library_button);
        libraryButton.setOnClickListener(new ButtonClickListener(activity, activity.getString(R.string.library_app) ));
        scoresButton = (Button) activity.findViewById(R.id.scores_button);
        scoresButton.setOnClickListener(new ButtonClickListener(activity, activity.getString(R.string.scores_app) ));
        buildButton = (Button) activity.findViewById(R.id.build_button);
        buildButton.setOnClickListener(new ButtonClickListener(activity, activity.getString(R.string.build_it_bigger) ));
        xyzButton = (Button) activity.findViewById(R.id.xyz_button);
        xyzButton.setOnClickListener(new ButtonClickListener(activity, activity.getString(R.string.xyz_reader) ));
        capStoneButton = (Button) activity.findViewById(R.id.capstone_button);
        capStoneButton.setOnClickListener(new ButtonClickListener(activity, activity.getString(R.string.capstone) ));
    }
}
