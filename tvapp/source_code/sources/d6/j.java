package d6;

import b6.v;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final String f9316a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f9317b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f9318c;
    public static final int d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f9319e;
    public static final f f;

    /* renamed from: g  reason: collision with root package name */
    public static final B4.b f9320g;

    /* renamed from: h  reason: collision with root package name */
    public static final B4.b f9321h;

    static {
        String str;
        int i7 = v.f7214a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f9316a = str;
        f9317b = b6.a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i8 = v.f7214a;
        if (i8 < 2) {
            i8 = 2;
        }
        f9318c = b6.a.k("kotlinx.coroutines.scheduler.core.pool.size", i8, 1, 0, 8);
        d = b6.a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f9319e = TimeUnit.SECONDS.toNanos(b6.a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = f.f9311a;
        f9320g = new B4.b(0);
        f9321h = new B4.b(1);
    }
}
