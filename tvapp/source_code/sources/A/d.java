package A;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public abstract class d {
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i7) {
        if ((i7 & 4) != 0 && str == null) {
            String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (android.support.v4.media.session.b.n(context, str2) == 0) {
                return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
            }
            throw new RuntimeException(AbstractC1111a.r("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i7 & 1);
    }

    public static ComponentName b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
