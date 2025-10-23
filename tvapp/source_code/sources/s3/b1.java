package s3;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
/* loaded from: classes.dex */
public final class b1 extends o1 {

    /* renamed from: t  reason: collision with root package name */
    public final HashMap f13967t;

    /* renamed from: u  reason: collision with root package name */
    public final Z2.A f13968u;

    /* renamed from: v  reason: collision with root package name */
    public final Z2.A f13969v;

    /* renamed from: w  reason: collision with root package name */
    public final Z2.A f13970w;

    /* renamed from: x  reason: collision with root package name */
    public final Z2.A f13971x;

    /* renamed from: y  reason: collision with root package name */
    public final Z2.A f13972y;

    public b1(q1 q1Var) {
        super(q1Var);
        this.f13967t = new HashMap();
        this.f13968u = new Z2.A(B(), "last_delete_stale", 0L);
        this.f13969v = new Z2.A(B(), "backoff", 0L);
        this.f13970w = new Z2.A(B(), "last_upload", 0L);
        this.f13971x = new Z2.A(B(), "last_upload_attempt", 0L);
        this.f13972y = new Z2.A(B(), "midnight_offset", 0L);
    }

    @Override // s3.o1
    public final boolean J() {
        return false;
    }

    public final String K(String str, boolean z7) {
        String str2;
        D();
        if (z7) {
            str2 = (String) L(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest S02 = x1.S0();
        if (S02 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, S02.digest(str2.getBytes())));
    }

    public final Pair L(String str) {
        c1 c1Var;
        c3.a aVar;
        D();
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        c1175g0.f14037D.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.f13967t;
        c1 c1Var2 = (c1) hashMap.get(str);
        if (c1Var2 != null && elapsedRealtime < c1Var2.f13982c) {
            return new Pair(c1Var2.f13980a, Boolean.valueOf(c1Var2.f13981b));
        }
        C1170e c1170e = c1175g0.f14062w;
        c1170e.getClass();
        long J6 = c1170e.J(str, AbstractC1203v.f14311b) + elapsedRealtime;
        try {
            try {
                aVar = c3.b.a(c1175g0.f14056q);
            } catch (PackageManager.NameNotFoundException unused) {
                if (c1Var2 != null && elapsedRealtime < c1Var2.f13982c + c1170e.J(str, AbstractC1203v.f14314c)) {
                    return new Pair(c1Var2.f13980a, Boolean.valueOf(c1Var2.f13981b));
                }
                aVar = null;
            }
        } catch (Exception e3) {
            b().f13802C.c(e3, "Unable to get advertising id");
            c1Var = new c1(J6, "", false);
        }
        if (aVar == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = aVar.f7257c;
        boolean z7 = aVar.f7256b;
        if (str2 != null) {
            c1Var = new c1(J6, str2, z7);
        } else {
            c1Var = new c1(J6, "", z7);
        }
        hashMap.put(str, c1Var);
        return new Pair(c1Var.f13980a, Boolean.valueOf(c1Var.f13981b));
    }
}
