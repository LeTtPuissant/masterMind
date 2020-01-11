package com.example.mastermindgame;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public final class Menu {
    private static final String TAG = Menu.class.getSimpleName();

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        RatePrompt.appLaunched(this);
    }
    public void nouveauJeu(final View view) {
        startActivity(Temps.class);
    }

    public void nouveauJeu(final View view) {
        startActivity(Jeu.class);
    }

    private void startActivity(final Class<Jeu> clazz) {
        startActivity(new Intent(this, clazz));
    }

    public void instruction(final View view) {
        startActivity(Instruction.class);
    }

    public void scores(final View view) {
        startActivity(ScoresActivity.class);
    }

    public void onProClick(final View view) {
        final Intent browserIntent = new Intent(Intent.ACTION_VIEW);
        browserIntent.setData(Uri.parse(MARKET_URI));
        try {
            startActivity(browserIntent);
        } catch (final ActivityNotFoundException e) {
            browserIntent.setData(Uri.parse(WEB_URI));
            try {
                startActivity(browserIntent);
            } catch (final ActivityNotFoundException ee) {
                Log.e(TAG, "Could not open app page");
            }
        }
    }
}
