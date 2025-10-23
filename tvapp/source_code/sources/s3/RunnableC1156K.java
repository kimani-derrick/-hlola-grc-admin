package s3;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import j3.AbstractC0838b;
import java.io.IOException;
import java.util.Map;
import r0.AbstractC1111a;
/* renamed from: s3.K  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1156K implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13819q = 1;

    /* renamed from: r  reason: collision with root package name */
    public final int f13820r;

    /* renamed from: s  reason: collision with root package name */
    public final String f13821s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f13822t;

    /* renamed from: u  reason: collision with root package name */
    public final Object f13823u;

    /* renamed from: v  reason: collision with root package name */
    public final Object f13824v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f13825w;

    public RunnableC1156K(String str, s1 s1Var, int i7, IOException iOException, byte[] bArr, Map map) {
        g3.n.g(s1Var);
        this.f13822t = s1Var;
        this.f13820r = i7;
        this.f13823u = iOException;
        this.f13824v = bArr;
        this.f13821s = str;
        this.f13825w = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences.Editor edit;
        C1154I c1154i;
        char c5;
        boolean z7;
        switch (this.f13819q) {
            case 0:
                T t5 = ((C1175g0) ((C1154I) this.f13825w).f2765q).f14063x;
                C1175g0.h(t5);
                if (!t5.f14182r) {
                    Log.println(6, ((C1154I) this.f13825w).R(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                C1154I c1154i2 = (C1154I) this.f13825w;
                boolean z8 = false;
                if (c1154i2.f13804s == 0) {
                    C1170e c1170e = ((C1175g0) c1154i2.f2765q).f14062w;
                    if (c1170e.f14006u == null) {
                        synchronized (c1170e) {
                            try {
                                if (c1170e.f14006u == null) {
                                    ApplicationInfo applicationInfo = ((C1175g0) c1170e.f2765q).f14056q.getApplicationInfo();
                                    String b7 = AbstractC0838b.b();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        if (str != null && str.equals(b7)) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        c1170e.f14006u = Boolean.valueOf(z7);
                                    }
                                    if (c1170e.f14006u == null) {
                                        c1170e.f14006u = Boolean.TRUE;
                                        c1170e.b().f13807v.d("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (c1170e.f14006u.booleanValue()) {
                        c1154i = (C1154I) this.f13825w;
                        c5 = 'C';
                    } else {
                        c1154i = (C1154I) this.f13825w;
                        c5 = 'c';
                    }
                    c1154i.f13804s = c5;
                }
                C1154I c1154i3 = (C1154I) this.f13825w;
                if (c1154i3.f13805t < 0) {
                    c1154i3.f13805t = 95001L;
                }
                char charAt = "01VDIWEA?".charAt(this.f13820r);
                C1154I c1154i4 = (C1154I) this.f13825w;
                char c6 = c1154i4.f13804s;
                long j7 = c1154i4.f13805t;
                String I6 = C1154I.I(true, this.f13821s, this.f13822t, this.f13823u, this.f13824v);
                StringBuilder sb = new StringBuilder("2");
                sb.append(charAt);
                sb.append(c6);
                sb.append(j7);
                String t7 = AbstractC1111a.t(sb, ":", I6);
                if (t7.length() > 1024) {
                    t7 = this.f13821s.substring(0, 1024);
                }
                U u7 = t5.f13896v;
                if (u7 != null) {
                    T t8 = (T) u7.f13910e;
                    t8.D();
                    if (((T) u7.f13910e).N().getLong((String) u7.f13908b, 0L) == 0) {
                        u7.c();
                    }
                    if (t7 == null) {
                        t7 = "";
                    }
                    SharedPreferences N6 = t8.N();
                    String str2 = (String) u7.f13909c;
                    long j8 = N6.getLong(str2, 0L);
                    int i7 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
                    String str3 = (String) u7.d;
                    if (i7 <= 0) {
                        edit = t8.N().edit();
                        edit.putString(str3, t7);
                        edit.putLong(str2, 1L);
                    } else {
                        long j9 = j8 + 1;
                        if ((t8.C().T0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j9) {
                            z8 = true;
                        }
                        edit = t8.N().edit();
                        if (z8) {
                            edit.putString(str3, t7);
                        }
                        edit.putLong(str2, j9);
                    }
                    edit.apply();
                    return;
                }
                return;
            default:
                ((s1) this.f13822t).a(this.f13821s, this.f13820r, (Throwable) this.f13823u, (byte[]) this.f13824v, (Map) this.f13825w);
                return;
        }
    }

    public RunnableC1156K(C1154I c1154i, int i7, String str, Object obj, Object obj2, Object obj3) {
        this.f13820r = i7;
        this.f13821s = str;
        this.f13822t = obj;
        this.f13823u = obj2;
        this.f13824v = obj3;
        this.f13825w = c1154i;
    }
}
