package s3;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class N0 extends AbstractC1157L {

    /* renamed from: A  reason: collision with root package name */
    public boolean f13836A;

    /* renamed from: B  reason: collision with root package name */
    public final Object f13837B;

    /* renamed from: s  reason: collision with root package name */
    public volatile O0 f13838s;

    /* renamed from: t  reason: collision with root package name */
    public volatile O0 f13839t;

    /* renamed from: u  reason: collision with root package name */
    public O0 f13840u;

    /* renamed from: v  reason: collision with root package name */
    public final ConcurrentHashMap f13841v;

    /* renamed from: w  reason: collision with root package name */
    public Activity f13842w;

    /* renamed from: x  reason: collision with root package name */
    public volatile boolean f13843x;

    /* renamed from: y  reason: collision with root package name */
    public volatile O0 f13844y;

    /* renamed from: z  reason: collision with root package name */
    public O0 f13845z;

    public N0(C1175g0 c1175g0) {
        super(c1175g0);
        this.f13837B = new Object();
        this.f13841v = new ConcurrentHashMap();
    }

    @Override // s3.AbstractC1157L
    public final boolean J() {
        return false;
    }

    public final String K(Class cls) {
        String str;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        if (split.length > 0) {
            str = split[split.length - 1];
        } else {
            str = "";
        }
        int length = str.length();
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        if (length > c1175g0.f14062w.F(null, false)) {
            return str.substring(0, c1175g0.f14062w.F(null, false));
        }
        return str;
    }

    public final O0 L(boolean z7) {
        H();
        D();
        if (!z7) {
            return this.f13840u;
        }
        O0 o02 = this.f13840u;
        if (o02 != null) {
            return o02;
        }
        return this.f13845z;
    }

    public final void M(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!((C1175g0) this.f2765q).f14062w.R() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f13841v.put(activity, new O0(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    public final void N(Activity activity, O0 o02, boolean z7) {
        O0 o03;
        O0 o04;
        String str;
        if (this.f13838s == null) {
            o03 = this.f13839t;
        } else {
            o03 = this.f13838s;
        }
        O0 o05 = o03;
        if (o02.f13848b == null) {
            if (activity != null) {
                str = K(activity.getClass());
            } else {
                str = null;
            }
            o04 = new O0(o02.f13847a, str, o02.f13849c, o02.f13850e, o02.f);
        } else {
            o04 = o02;
        }
        this.f13839t = this.f13838s;
        this.f13838s = o04;
        ((C1175g0) this.f2765q).f14037D.getClass();
        d().M(new J0(this, o04, o05, SystemClock.elapsedRealtime(), z7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(s3.O0 r18, s3.O0 r19, long r20, boolean r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.N0.O(s3.O0, s3.O0, long, boolean, android.os.Bundle):void");
    }

    public final void P(O0 o02, boolean z7, long j7) {
        boolean z8;
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        C1164b m7 = c1175g0.m();
        c1175g0.f14037D.getClass();
        m7.H(SystemClock.elapsedRealtime());
        if (o02 != null && o02.d) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (G().f14019v.a(j7, z8, z7) && o02 != null) {
            o02.d = false;
        }
    }

    public final O0 Q(Activity activity) {
        g3.n.g(activity);
        O0 o02 = (O0) this.f13841v.get(activity);
        if (o02 == null) {
            O0 o03 = new O0(C().P0(), null, K(activity.getClass()));
            this.f13841v.put(activity, o03);
            o02 = o03;
        }
        if (this.f13844y != null) {
            return this.f13844y;
        }
        return o02;
    }
}
