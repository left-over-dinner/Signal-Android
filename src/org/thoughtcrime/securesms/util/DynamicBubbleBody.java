package org.thoughtcrime.securesms.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class DynamicBubbleBody {
    private String currentBubbleColor;

    public void onCreate(Context context) {
        currentBubbleColor = getSelectedBubbleColor(context);
    }

    /*public void onResume(Activity activity) {
        if (currentBubbleColor != getSelectedBubbleColor(activity)) {
            Intent intent = activity.getIntent();
            activity.finish();
            DynamicBubbleBody.OverridePendingTransition.invoke(activity);
            activity.startActivity(intent);
            DynamicBubbleBody.OverridePendingTransition.invoke(activity);
        }
    }*/

    public String getSelectedBubbleColor(Context context) {
        return TextSecurePreferences.getBubble(context);
    }

    /*private static final class OverridePendingTransition {
        static void invoke(Context context) {
            context.overridePendingTransition(0, 0);
        }
    }*/
}

