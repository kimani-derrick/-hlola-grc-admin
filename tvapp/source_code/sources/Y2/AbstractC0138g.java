package Y2;

import Z2.AbstractC0156a;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* renamed from: Y2.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0138g implements InterfaceC0144m {

    /* renamed from: q  reason: collision with root package name */
    public final boolean f4392q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f4393r = new ArrayList(1);

    /* renamed from: s  reason: collision with root package name */
    public int f4394s;

    /* renamed from: t  reason: collision with root package name */
    public C0148q f4395t;

    public AbstractC0138g(boolean z7) {
        this.f4392q = z7;
    }

    public final void a(int i7) {
        C0148q c0148q = this.f4395t;
        int i8 = Z2.H.f4603a;
        for (int i9 = 0; i9 < this.f4394s; i9++) {
            boolean z7 = this.f4392q;
            C0150t c0150t = (C0150t) ((W) this.f4393r.get(i9));
            synchronized (c0150t) {
                O3.U u7 = C0150t.n;
                if (z7 && (c0148q.f4428i & 8) != 8) {
                    c0150t.f4446h += i7;
                }
            }
        }
    }

    public final void h() {
        boolean z7;
        C0148q c0148q = this.f4395t;
        int i7 = Z2.H.f4603a;
        for (int i8 = 0; i8 < this.f4394s; i8++) {
            boolean z8 = this.f4392q;
            C0150t c0150t = (C0150t) ((W) this.f4393r.get(i8));
            synchronized (c0150t) {
                try {
                    O3.U u7 = C0150t.n;
                    if (z8 && (c0148q.f4428i & 8) != 8) {
                        if (c0150t.f > 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        AbstractC0156a.k(z7);
                        c0150t.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i9 = (int) (elapsedRealtime - c0150t.f4445g);
                        c0150t.f4448j += i9;
                        long j7 = c0150t.f4449k;
                        long j8 = c0150t.f4446h;
                        c0150t.f4449k = j7 + j8;
                        if (i9 > 0) {
                            c0150t.f4443c.a((int) Math.sqrt(j8), (((float) j8) * 8000.0f) / i9);
                            if (c0150t.f4448j < 2000) {
                                if (c0150t.f4449k >= 524288) {
                                }
                                c0150t.c(i9, c0150t.f4446h, c0150t.f4450l);
                                c0150t.f4445g = elapsedRealtime;
                                c0150t.f4446h = 0L;
                            }
                            c0150t.f4450l = c0150t.f4443c.b();
                            c0150t.c(i9, c0150t.f4446h, c0150t.f4450l);
                            c0150t.f4445g = elapsedRealtime;
                            c0150t.f4446h = 0L;
                        }
                        c0150t.f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f4395t = null;
    }

    public final void k() {
        for (int i7 = 0; i7 < this.f4394s; i7++) {
            ((W) this.f4393r.get(i7)).getClass();
        }
    }

    public final void l(C0148q c0148q) {
        this.f4395t = c0148q;
        for (int i7 = 0; i7 < this.f4394s; i7++) {
            boolean z7 = this.f4392q;
            C0150t c0150t = (C0150t) ((W) this.f4393r.get(i7));
            synchronized (c0150t) {
                try {
                    O3.U u7 = C0150t.n;
                    if (z7 && (c0148q.f4428i & 8) != 8) {
                        if (c0150t.f == 0) {
                            c0150t.d.getClass();
                            c0150t.f4445g = SystemClock.elapsedRealtime();
                        }
                        c0150t.f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // Y2.InterfaceC0144m
    public final void m(W w7) {
        w7.getClass();
        ArrayList arrayList = this.f4393r;
        if (!arrayList.contains(w7)) {
            arrayList.add(w7);
            this.f4394s++;
        }
    }

    @Override // Y2.InterfaceC0144m
    public Map n() {
        return Collections.emptyMap();
    }
}
