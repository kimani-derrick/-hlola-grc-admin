package Y2;

import android.os.SystemClock;
/* renamed from: Y2.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0149s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0150t f4434a;

    public final void a(int i7) {
        int i8;
        C0150t c0150t = this.f4434a;
        synchronized (c0150t) {
            int i9 = c0150t.f4447i;
            if ((i9 == 0 || c0150t.f4444e) && i9 != i7) {
                c0150t.f4447i = i7;
                if (i7 != 1 && i7 != 0 && i7 != 8) {
                    c0150t.f4450l = c0150t.b(i7);
                    c0150t.d.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (c0150t.f > 0) {
                        i8 = (int) (elapsedRealtime - c0150t.f4445g);
                    } else {
                        i8 = 0;
                    }
                    c0150t.c(i8, c0150t.f4446h, c0150t.f4450l);
                    c0150t.f4445g = elapsedRealtime;
                    c0150t.f4446h = 0L;
                    c0150t.f4449k = 0L;
                    c0150t.f4448j = 0L;
                    U u7 = c0150t.f4443c;
                    u7.f4361b.clear();
                    u7.d = -1;
                    u7.f4363e = 0;
                    u7.f = 0;
                }
            }
        }
    }
}
