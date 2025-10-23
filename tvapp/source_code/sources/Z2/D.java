package Z2;

import android.os.Handler;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class D implements j {

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList f4596b = new ArrayList(50);

    /* renamed from: a  reason: collision with root package name */
    public final Handler f4597a;

    public D(Handler handler) {
        this.f4597a = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C b() {
        C c5;
        ArrayList arrayList = f4596b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    c5 = new Object();
                } else {
                    c5 = (C) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5;
    }

    public final C a(int i7, Object obj) {
        C b7 = b();
        b7.f4595a = this.f4597a.obtainMessage(i7, obj);
        return b7;
    }

    public final boolean c(Runnable runnable) {
        return this.f4597a.post(runnable);
    }

    public final boolean d(int i7) {
        return this.f4597a.sendEmptyMessage(i7);
    }
}
