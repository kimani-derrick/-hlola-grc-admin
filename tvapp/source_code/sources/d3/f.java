package d3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import k3.C0959b;
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f9228a = false;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f9229b = false;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicBoolean f9230c;

    static {
        new AtomicBoolean();
        f9230c = new AtomicBoolean();
    }

    public static boolean a(Context context) {
        if (!f9229b) {
            try {
                try {
                    PackageInfo c5 = C0959b.a(context).c("com.google.android.gms", 64);
                    g.a(context);
                    if (c5 != null && !g.d(c5, false) && g.d(c5, true)) {
                        f9228a = true;
                    } else {
                        f9228a = false;
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e3);
                }
                f9229b = true;
            } catch (Throwable th) {
                f9229b = true;
                throw th;
            }
        }
        if (!f9228a && "user".equals(Build.TYPE)) {
            return false;
        }
        return true;
    }
}
