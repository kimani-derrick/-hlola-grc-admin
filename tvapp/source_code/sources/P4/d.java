package P4;

import J3.e;
import N4.k;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    public static final long f2809e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    public final k f2810a;

    /* renamed from: b  reason: collision with root package name */
    public long f2811b;

    /* renamed from: c  reason: collision with root package name */
    public int f2812c;

    public d() {
        if (e.f1329r == null) {
            Pattern pattern = k.f2541c;
            e.f1329r = new e(8);
        }
        e eVar = e.f1329r;
        if (k.d == null) {
            k.d = new k(eVar);
        }
        this.f2810a = k.d;
    }

    public final synchronized long a(int i7) {
        if (i7 != 429 && (i7 < 500 || i7 >= 600)) {
            return d;
        }
        double pow = Math.pow(2.0d, this.f2812c);
        this.f2810a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f2809e);
    }

    public final synchronized boolean b() {
        boolean z7;
        if (this.f2812c != 0) {
            this.f2810a.f2542a.getClass();
            if (System.currentTimeMillis() <= this.f2811b) {
                z7 = false;
            }
        }
        z7 = true;
        return z7;
    }

    public final synchronized void c() {
        this.f2812c = 0;
    }

    public final synchronized void d(int i7) {
        if ((i7 < 200 || i7 >= 300) && i7 != 401 && i7 != 404) {
            this.f2812c++;
            long a7 = a(i7);
            this.f2810a.f2542a.getClass();
            this.f2811b = System.currentTimeMillis() + a7;
            return;
        }
        c();
    }
}
