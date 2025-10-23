package Z2;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
/* loaded from: classes.dex */
public final class v extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a  reason: collision with root package name */
    public final x f4682a;

    public v(x xVar) {
        this.f4682a = xVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        boolean z7;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i7 = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z7 = false;
        } else {
            z7 = true;
        }
        x xVar = this.f4682a;
        if (z7) {
            i7 = 10;
        }
        x.a(xVar, i7);
    }
}
