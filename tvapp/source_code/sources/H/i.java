package H;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final o.i f790a = new o.i(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f791b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f792c;
    public static final o.j d;

    /* JADX WARN: Type inference failed for: r9v0, types: [H.m, java.lang.Object, java.util.concurrent.ThreadFactory] */
    static {
        ?? obj = new Object();
        obj.f800a = "fonts-androidx";
        obj.f801b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) obj);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f791b = threadPoolExecutor;
        f792c = new Object();
        d = new o.j(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static H.h a(java.lang.String r6, android.content.Context r7, H.e r8, int r9) {
        /*
            o.i r0 = H.i.f790a
            java.lang.Object r1 = r0.h(r6)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            H.h r6 = new H.h
            r6.<init>(r1)
            return r6
        L10:
            H.j r8 = H.d.a(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            r1 = 1
            r2 = -3
            java.lang.Object r3 = r8.f794r
            H.k[] r3 = (H.k[]) r3
            int r8 = r8.f793q
            if (r8 == 0) goto L24
            if (r8 == r1) goto L22
        L20:
            r1 = r2
            goto L3d
        L22:
            r1 = -2
            goto L3d
        L24:
            if (r3 == 0) goto L3d
            int r8 = r3.length
            if (r8 != 0) goto L2a
            goto L3d
        L2a:
            int r8 = r3.length
            r1 = 0
            r4 = r1
        L2d:
            if (r4 >= r8) goto L3d
            r5 = r3[r4]
            int r5 = r5.f798e
            if (r5 == 0) goto L3a
            if (r5 >= 0) goto L38
            goto L20
        L38:
            r1 = r5
            goto L3d
        L3a:
            int r4 = r4 + 1
            goto L2d
        L3d:
            if (r1 == 0) goto L45
            H.h r6 = new H.h
            r6.<init>(r1)
            return r6
        L45:
            h4.b r8 = D.h.f435a
            android.graphics.Typeface r7 = r8.l(r7, r3, r9)
            if (r7 == 0) goto L56
            r0.m(r6, r7)
            H.h r6 = new H.h
            r6.<init>(r7)
            return r6
        L56:
            H.h r6 = new H.h
            r6.<init>(r2)
            return r6
        L5c:
            H.h r6 = new H.h
            r7 = -1
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: H.i.a(java.lang.String, android.content.Context, H.e, int):H.h");
    }
}
