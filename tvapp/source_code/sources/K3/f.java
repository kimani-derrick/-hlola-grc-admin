package K3;

import L.i;
import L.j;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeInfo;
/* loaded from: classes.dex */
public class f {

    /* renamed from: b  reason: collision with root package name */
    public static f f1835b;

    /* renamed from: a  reason: collision with root package name */
    public final Object f1836a;

    public f(int i7) {
        switch (i7) {
            case 2:
                this.f1836a = Build.VERSION.SDK_INT >= 26 ? new j(this) : new j(this);
                return;
            default:
                this.f1836a = new Object();
                new Handler(Looper.getMainLooper(), new e(0, this));
                return;
        }
    }

    public static f c(int i7, int i8, int i9) {
        return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i7, i8, false, i9));
    }

    public i a(int i7) {
        return null;
    }

    public i b(int i7) {
        return null;
    }

    public void d() {
        synchronized (this.f1836a) {
        }
    }

    public boolean e(int i7, int i8, Bundle bundle) {
        return false;
    }

    public /* synthetic */ f(Object obj) {
        this.f1836a = obj;
    }
}
