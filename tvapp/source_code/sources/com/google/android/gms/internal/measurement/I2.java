package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class I2 {

    /* renamed from: c  reason: collision with root package name */
    public static final I2 f8358c = new I2();

    /* renamed from: a  reason: collision with root package name */
    public final C0516y2 f8359a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f8360b = new ConcurrentHashMap();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.gms.internal.measurement.y2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.google.android.gms.internal.measurement.y2] */
    public I2() {
        C2[] c2Arr = {C0442j2.f8588b, C0516y2.f8716b};
        ?? obj = new Object();
        obj.f8717a = c2Arr;
        ?? obj2 = new Object();
        Charset charset = AbstractC0467o2.f8631a;
        obj2.f8717a = obj;
        this.f8359a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.google.android.gms.internal.measurement.F2] */
    public final L2 a(Class cls) {
        boolean z7;
        D2 l7;
        Charset charset = AbstractC0467o2.f8631a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f8360b;
            L2 l22 = (L2) concurrentHashMap.get(cls);
            if (l22 == null) {
                C0516y2 c0516y2 = this.f8359a;
                c0516y2.getClass();
                AbstractC0457m2.class.isAssignableFrom(cls);
                J2 b7 = ((C2) c0516y2.f8717a).b(cls);
                if ((b7.d & 2) == 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                C0442j2 c0442j2 = Q.f8396a;
                if (z7) {
                    l7 = new F2(b7.f8362a);
                } else {
                    if (A2.f8225a[s.h.b(b7.b())] == 1) {
                        c0442j2 = null;
                    }
                    l7 = D2.l(b7, c0442j2);
                }
                L2 l23 = (L2) concurrentHashMap.putIfAbsent(cls, l7);
                if (l23 != null) {
                    return l23;
                }
                return l7;
            }
            return l22;
        }
        throw new NullPointerException("messageType");
    }
}
