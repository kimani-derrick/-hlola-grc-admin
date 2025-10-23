package Y2;

import O3.Z;
import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: Y2.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0150t implements InterfaceC0137f, W {
    public static final O3.U n = O3.E.w(4400000L, 3200000L, 2300000L, 1600000L, 810000L);

    /* renamed from: o  reason: collision with root package name */
    public static final O3.U f4435o = O3.E.w(1400000L, 990000L, 730000L, 510000L, 230000L);

    /* renamed from: p  reason: collision with root package name */
    public static final O3.U f4436p = O3.E.w(2100000L, 1400000L, 1000000L, 890000L, 640000L);

    /* renamed from: q  reason: collision with root package name */
    public static final O3.U f4437q = O3.E.w(2600000L, 1700000L, 1300000L, 1000000L, 700000L);

    /* renamed from: r  reason: collision with root package name */
    public static final O3.U f4438r = O3.E.w(5700000L, 3700000L, 2300000L, 1700000L, 990000L);

    /* renamed from: s  reason: collision with root package name */
    public static final O3.U f4439s = O3.E.w(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    /* renamed from: t  reason: collision with root package name */
    public static C0150t f4440t;

    /* renamed from: a  reason: collision with root package name */
    public final Z f4441a;

    /* renamed from: b  reason: collision with root package name */
    public final T4.c f4442b = new T4.c(26);

    /* renamed from: c  reason: collision with root package name */
    public final U f4443c;
    public final Z2.B d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4444e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public long f4445g;

    /* renamed from: h  reason: collision with root package name */
    public long f4446h;

    /* renamed from: i  reason: collision with root package name */
    public int f4447i;

    /* renamed from: j  reason: collision with root package name */
    public long f4448j;

    /* renamed from: k  reason: collision with root package name */
    public long f4449k;

    /* renamed from: l  reason: collision with root package name */
    public long f4450l;

    /* renamed from: m  reason: collision with root package name */
    public long f4451m;

    public C0150t(Context context, HashMap hashMap, int i7, Z2.B b7, boolean z7) {
        this.f4441a = Z.b(hashMap);
        this.f4443c = new U(i7);
        this.d = b7;
        this.f4444e = z7;
        if (context != null) {
            Z2.x b8 = Z2.x.b(context);
            int c5 = b8.c();
            this.f4447i = c5;
            this.f4450l = b(c5);
            C0149s c0149s = new C0149s(this);
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) b8.f4688s;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            copyOnWriteArrayList.add(new WeakReference(c0149s));
            ((Handler) b8.f4687r).post(new A4.d(b8, 5, c0149s));
            return;
        }
        this.f4447i = 0;
        this.f4450l = b(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:954:0x0cf9, code lost:
        if (r8.equals("AD") == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.C0150t.a(java.lang.String):int[]");
    }

    public final long b(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        Z z7 = this.f4441a;
        Long l7 = (Long) z7.get(valueOf);
        if (l7 == null) {
            l7 = (Long) z7.get(0);
        }
        if (l7 == null) {
            l7 = 1000000L;
        }
        return l7.longValue();
    }

    public final void c(int i7, long j7, long j8) {
        if (i7 == 0 && j7 == 0 && j8 == this.f4451m) {
            return;
        }
        this.f4451m = j8;
        Iterator it = ((CopyOnWriteArrayList) this.f4442b.f3382r).iterator();
        while (it.hasNext()) {
            C0136e c0136e = (C0136e) it.next();
            if (!c0136e.f4391c) {
                c0136e.f4389a.post(new RunnableC0135d(c0136e, i7, j7, j8, 0));
            }
        }
    }
}
