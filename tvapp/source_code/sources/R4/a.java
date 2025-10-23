package R4;

import A.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2921a;

    public a(Context context, String str) {
        boolean z7;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 24) {
            if (i7 >= 24) {
                context = c.a(context);
            } else {
                context = null;
            }
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        boolean z8 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z7 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z8 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z7 = z8;
        }
        this.f2921a = z7;
    }
}
