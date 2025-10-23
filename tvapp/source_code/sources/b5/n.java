package b5;

import V.InterfaceC0090i;
import W5.AbstractC0117y;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: c  reason: collision with root package name */
    public static final Y.d f7171c = new Y.d("firebase_sessions_enabled");
    public static final Y.d d = new Y.d("firebase_sessions_sampling_rate");

    /* renamed from: e  reason: collision with root package name */
    public static final Y.d f7172e = new Y.d("firebase_sessions_restart_timeout");
    public static final Y.d f = new Y.d("firebase_sessions_cache_duration");

    /* renamed from: g  reason: collision with root package name */
    public static final Y.d f7173g = new Y.d("firebase_sessions_cache_updated_time");

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0090i f7174a;

    /* renamed from: b  reason: collision with root package name */
    public C0381f f7175b;

    public n(InterfaceC0090i interfaceC0090i) {
        M5.g.f(interfaceC0090i, "dataStore");
        this.f7174a = interfaceC0090i;
        AbstractC0117y.t(new k(this, null));
    }

    public static final void a(n nVar, Y.b bVar) {
        nVar.getClass();
        nVar.f7175b = new C0381f((Boolean) bVar.b(f7171c), (Double) bVar.b(d), (Integer) bVar.b(f7172e), (Integer) bVar.b(f), (Long) bVar.b(f7173g));
    }

    public final boolean b() {
        Integer num;
        C0381f c0381f = this.f7175b;
        if (c0381f != null) {
            if (c0381f != null) {
                Long l7 = c0381f.f7151e;
                if (l7 != null && (num = c0381f.d) != null && (System.currentTimeMillis() - l7.longValue()) / 1000 < num.intValue()) {
                    return false;
                }
                return true;
            }
            M5.g.l("sessionConfigs");
            throw null;
        }
        M5.g.l("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(Y.d r6, java.lang.Object r7, D5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof b5.l
            if (r0 == 0) goto L13
            r0 = r8
            b5.l r0 = (b5.l) r0
            int r1 = r0.f7166v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7166v = r1
            goto L18
        L13:
            b5.l r0 = new b5.l
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f7164t
            E5.a r1 = E5.a.f612q
            int r2 = r0.f7166v
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            k3.AbstractC0958a.H(r8)     // Catch: java.io.IOException -> L27
            goto L5d
        L27:
            r6 = move-exception
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            k3.AbstractC0958a.H(r8)
            V.i r8 = r5.f7174a     // Catch: java.io.IOException -> L27
            b5.m r2 = new b5.m     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L27
            r0.f7166v = r3     // Catch: java.io.IOException -> L27
            Y.f r6 = new Y.f     // Catch: java.io.IOException -> L27
            r6.<init>(r2, r4)     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = r8.F(r6, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L5d
            return r1
        L4a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to update cache config value: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5d:
            z5.l r6 = z5.C1530l.f16479a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.n.c(Y.d, java.lang.Object, D5.d):java.lang.Object");
    }
}
