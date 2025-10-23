package Y3;

import H2.C0002c;
import S3.f;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import k.V0;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f4482b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final f f4483a;

    public a(V0 v02) {
        SharedPreferences sharedPreferences;
        Context context = (Context) v02.f11960a;
        String str = (String) v02.f11961b;
        String str2 = (String) v02.f11962c;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
            } else {
                sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
            }
            sharedPreferences.edit();
            this.f4483a = (f) v02.f11964g;
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    public final synchronized C0002c a() {
        return this.f4483a.c();
    }
}
