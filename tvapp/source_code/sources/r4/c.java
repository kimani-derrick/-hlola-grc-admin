package r4;

import A5.k;
import A5.m;
import A5.t;
import M5.g;
import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w4.U;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f13480a = new Object();

    public static U a(String str, int i7, int i8, int i9) {
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        C4.b bVar = new C4.b(23, false);
        bVar.f421r = str;
        bVar.f422s = Integer.valueOf(i7);
        bVar.f423t = Integer.valueOf(i8);
        bVar.f424u = false;
        return bVar.h();
    }

    public static ArrayList d(Context context) {
        ActivityManager activityManager;
        g.f(context, "context");
        int i7 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = t.f135q;
        }
        ArrayList U6 = k.U(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = U6.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i7) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(m.P(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            C4.b bVar = new C4.b(23, false);
            String str2 = runningAppProcessInfo.processName;
            if (str2 != null) {
                bVar.f421r = str2;
                bVar.f422s = Integer.valueOf(runningAppProcessInfo.pid);
                bVar.f423t = Integer.valueOf(runningAppProcessInfo.importance);
                bVar.f424u = Boolean.valueOf(g.a(runningAppProcessInfo.processName, str));
                arrayList2.add(bVar.h());
            } else {
                throw new NullPointerException("Null processName");
            }
        }
        return arrayList2;
    }

    public boolean b(int i7) {
        if (4 > i7 && !Log.isLoggable("FirebaseCrashlytics", i7)) {
            return false;
        }
        return true;
    }

    public void c(String str) {
        if (b(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public void e(String str) {
        if (b(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void f(String str, Exception exc) {
        if (b(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }
}
