package Z4;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: Z4.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0187y {

    /* renamed from: a  reason: collision with root package name */
    public static final Y.d f4874a = new Y.d("session_id");

    public static ArrayList a(Context context) {
        ActivityManager activityManager;
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
            list = A5.t.f135q;
        }
        ArrayList U6 = A5.k.U(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = U6.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i7) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(A5.m.P(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            String str2 = runningAppProcessInfo.processName;
            M5.g.e(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new C0181s(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, M5.g.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }
}
