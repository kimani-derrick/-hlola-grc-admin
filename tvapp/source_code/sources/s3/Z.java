package s3;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0496u2;
import com.google.android.gms.internal.measurement.C0503w;
import com.google.android.gms.internal.measurement.C0505w1;
import com.google.android.gms.internal.measurement.C0510x1;
import com.google.android.gms.internal.measurement.C0516y2;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k.C0852F;
import o.C1052e;
/* loaded from: classes.dex */
public final class Z extends o1 implements InterfaceC1172f {

    /* renamed from: A  reason: collision with root package name */
    public final C0852F f13941A;

    /* renamed from: B  reason: collision with root package name */
    public final C1052e f13942B;

    /* renamed from: C  reason: collision with root package name */
    public final C1052e f13943C;

    /* renamed from: D  reason: collision with root package name */
    public final C1052e f13944D;

    /* renamed from: t  reason: collision with root package name */
    public final C1052e f13945t;

    /* renamed from: u  reason: collision with root package name */
    public final C1052e f13946u;

    /* renamed from: v  reason: collision with root package name */
    public final C1052e f13947v;

    /* renamed from: w  reason: collision with root package name */
    public final C1052e f13948w;

    /* renamed from: x  reason: collision with root package name */
    public final C1052e f13949x;

    /* renamed from: y  reason: collision with root package name */
    public final C1052e f13950y;

    /* renamed from: z  reason: collision with root package name */
    public final Q0.f f13951z;

    /* JADX WARN: Type inference failed for: r2v1, types: [o.e, o.j] */
    /* JADX WARN: Type inference failed for: r2v2, types: [o.e, o.j] */
    /* JADX WARN: Type inference failed for: r2v3, types: [o.e, o.j] */
    /* JADX WARN: Type inference failed for: r2v4, types: [o.e, o.j] */
    /* JADX WARN: Type inference failed for: r2v5, types: [o.e, o.j] */
    /* JADX WARN: Type inference failed for: r2v6, types: [o.e, o.j] */
    /* JADX WARN: Type inference failed for: r2v7, types: [o.e, o.j] */
    /* JADX WARN: Type inference failed for: r2v8, types: [o.e, o.j] */
    /* JADX WARN: Type inference failed for: r2v9, types: [o.e, o.j] */
    public Z(q1 q1Var) {
        super(q1Var);
        this.f13945t = new o.j(0);
        this.f13946u = new o.j(0);
        this.f13947v = new o.j(0);
        this.f13948w = new o.j(0);
        this.f13949x = new o.j(0);
        this.f13942B = new o.j(0);
        this.f13943C = new o.j(0);
        this.f13944D = new o.j(0);
        this.f13950y = new o.j(0);
        this.f13951z = new Q0.f(this);
        this.f13941A = new C0852F(15, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.e, o.j] */
    public static C1052e M(com.google.android.gms.internal.measurement.Q0 q02) {
        ?? jVar = new o.j(0);
        for (com.google.android.gms.internal.measurement.T0 t02 : q02.G()) {
            jVar.put(t02.r(), t02.s());
        }
        return jVar;
    }

    public static EnumC1196r0 N(int i7) {
        int i8 = AbstractC1167c0.f13978b[s.h.b(i7)];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        return null;
                    }
                    return EnumC1196r0.f14219u;
                }
                return EnumC1196r0.f14218t;
            }
            return EnumC1196r0.f14217s;
        }
        return EnumC1196r0.f14216r;
    }

    @Override // s3.o1
    public final boolean J() {
        return false;
    }

    public final long K(String str) {
        String e3 = e(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(e3)) {
            try {
                return Long.parseLong(e3);
            } catch (NumberFormatException e7) {
                C1154I b7 = b();
                b7.f13810y.b(C1154I.J(str), e7, "Unable to parse timezone offset. appId");
                return 0L;
            }
        }
        return 0L;
    }

    public final com.google.android.gms.internal.measurement.Q0 L(String str, byte[] bArr) {
        Long l7;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.Q0.z();
        }
        try {
            com.google.android.gms.internal.measurement.Q0 q02 = (com.google.android.gms.internal.measurement.Q0) ((com.google.android.gms.internal.measurement.P0) C1160O.Q(com.google.android.gms.internal.measurement.Q0.y(), bArr)).c();
            l6.b bVar = b().f13803D;
            String str2 = null;
            if (q02.L()) {
                l7 = Long.valueOf(q02.w());
            } else {
                l7 = null;
            }
            if (q02.J()) {
                str2 = q02.B();
            }
            bVar.b(l7, str2, "Parsed config. version, gmp_app_id");
            return q02;
        } catch (C0496u2 e3) {
            e = e3;
            b().f13810y.b(C1154I.J(str), e, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.Q0.z();
        } catch (RuntimeException e7) {
            e = e7;
            b().f13810y.b(C1154I.J(str), e, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.Q0.z();
        }
    }

    public final EnumC1202u0 O(String str, EnumC1196r0 enumC1196r0) {
        D();
        b0(str);
        com.google.android.gms.internal.measurement.L0 T6 = T(str);
        EnumC1202u0 enumC1202u0 = EnumC1202u0.f14248q;
        if (T6 == null) {
            return enumC1202u0;
        }
        for (com.google.android.gms.internal.measurement.I0 i02 : T6.v()) {
            if (N(i02.s()) == enumC1196r0) {
                int i7 = AbstractC1167c0.f13979c[s.h.b(i02.r())];
                if (i7 != 1) {
                    if (i7 != 2) {
                        return enumC1202u0;
                    }
                    return EnumC1202u0.f14251t;
                }
                return EnumC1202u0.f14250s;
            }
        }
        return enumC1202u0;
    }

    public final void P(String str, com.google.android.gms.internal.measurement.P0 p02) {
        HashSet hashSet = new HashSet();
        o.j jVar = new o.j(0);
        o.j jVar2 = new o.j(0);
        o.j jVar3 = new o.j(0);
        for (com.google.android.gms.internal.measurement.M0 m02 : Collections.unmodifiableList(((com.google.android.gms.internal.measurement.Q0) p02.f8609r).E())) {
            hashSet.add(m02.r());
        }
        for (int i7 = 0; i7 < ((com.google.android.gms.internal.measurement.Q0) p02.f8609r).v(); i7++) {
            com.google.android.gms.internal.measurement.N0 n02 = (com.google.android.gms.internal.measurement.N0) ((com.google.android.gms.internal.measurement.Q0) p02.f8609r).s(i7).n();
            if (n02.i().isEmpty()) {
                b().f13810y.d("EventConfig contained null event name");
            } else {
                String i8 = n02.i();
                String c5 = AbstractC1204v0.c(n02.i(), AbstractC1204v0.f14359a, AbstractC1204v0.f14361c);
                if (!TextUtils.isEmpty(c5)) {
                    n02.e();
                    com.google.android.gms.internal.measurement.O0.s((com.google.android.gms.internal.measurement.O0) n02.f8609r, c5);
                    p02.e();
                    com.google.android.gms.internal.measurement.Q0.u((com.google.android.gms.internal.measurement.Q0) p02.f8609r, i7, (com.google.android.gms.internal.measurement.O0) n02.c());
                }
                if (((com.google.android.gms.internal.measurement.O0) n02.f8609r).w() && ((com.google.android.gms.internal.measurement.O0) n02.f8609r).u()) {
                    jVar.put(i8, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.O0) n02.f8609r).x() && ((com.google.android.gms.internal.measurement.O0) n02.f8609r).v()) {
                    jVar2.put(n02.i(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.O0) n02.f8609r).y()) {
                    if (((com.google.android.gms.internal.measurement.O0) n02.f8609r).r() >= 2 && ((com.google.android.gms.internal.measurement.O0) n02.f8609r).r() <= 65535) {
                        jVar3.put(n02.i(), Integer.valueOf(((com.google.android.gms.internal.measurement.O0) n02.f8609r).r()));
                    } else {
                        C1154I b7 = b();
                        b7.f13810y.b(n02.i(), Integer.valueOf(((com.google.android.gms.internal.measurement.O0) n02.f8609r).r()), "Invalid sampling rate. Event name, sample rate");
                    }
                }
            }
        }
        this.f13946u.put(str, hashSet);
        this.f13947v.put(str, jVar);
        this.f13948w.put(str, jVar2);
        this.f13950y.put(str, jVar3);
    }

    public final void Q(String str, com.google.android.gms.internal.measurement.Q0 q02) {
        int r3 = q02.r();
        Q0.f fVar = this.f13951z;
        if (r3 == 0) {
            fVar.n(str);
            return;
        }
        C1154I b7 = b();
        b7.f13803D.c(Integer.valueOf(q02.r()), "EES programs found");
        C0510x1 c0510x1 = (C0510x1) q02.F().get(0);
        try {
            C0503w c0503w = new C0503w();
            C4.b bVar = c0503w.f8706a;
            Y y3 = new Y(2);
            y3.f13932b = this;
            y3.f13933c = str;
            ((HashMap) ((C0516y2) bVar.f424u).f8717a).put("internal.remoteConfig", y3);
            Y y4 = new Y(1);
            y4.f13932b = this;
            y4.f13933c = str;
            ((HashMap) ((C0516y2) bVar.f424u).f8717a).put("internal.appMetadata", y4);
            CallableC1165b0 callableC1165b0 = new CallableC1165b0();
            callableC1165b0.f13966b = this;
            ((HashMap) ((C0516y2) bVar.f424u).f8717a).put("internal.logger", callableC1165b0);
            c0503w.a(c0510x1);
            fVar.m(str, c0503w);
            b().f13803D.b(str, Integer.valueOf(c0510x1.r().r()), "EES program loaded for appId, activities");
            for (C0505w1 c0505w1 : c0510x1.r().t()) {
                b().f13803D.c(c0505w1.r(), "EES program activity");
            }
        } catch (com.google.android.gms.internal.measurement.L unused) {
            b().f13807v.c(str, "Failed to load EES program. appId");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0393 A[Catch: SQLiteException -> 0x03a3, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x03a3, blocks: (B:95:0x037c, B:97:0x0393), top: B:105:0x037c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(java.lang.String r22, java.lang.String r23, java.lang.String r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.Z.R(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public final int S(String str, String str2) {
        Integer num;
        D();
        b0(str);
        Map map = (Map) this.f13950y.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final com.google.android.gms.internal.measurement.L0 T(String str) {
        D();
        b0(str);
        com.google.android.gms.internal.measurement.Q0 V6 = V(str);
        if (V6 != null && V6.I()) {
            return V6.x();
        }
        return null;
    }

    public final EnumC1196r0 U(String str) {
        EnumC1196r0 enumC1196r0 = EnumC1196r0.f14218t;
        D();
        b0(str);
        com.google.android.gms.internal.measurement.L0 T6 = T(str);
        if (T6 == null) {
            return null;
        }
        for (com.google.android.gms.internal.measurement.J0 j02 : T6.u()) {
            if (enumC1196r0 == N(j02.s())) {
                return N(j02.r());
            }
        }
        return null;
    }

    public final com.google.android.gms.internal.measurement.Q0 V(String str) {
        H();
        D();
        g3.n.c(str);
        b0(str);
        return (com.google.android.gms.internal.measurement.Q0) this.f13949x.get(str);
    }

    public final boolean W(String str, String str2) {
        Boolean bool;
        D();
        b0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f13948w.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean X(String str, EnumC1196r0 enumC1196r0) {
        D();
        b0(str);
        com.google.android.gms.internal.measurement.L0 T6 = T(str);
        if (T6 == null) {
            return false;
        }
        Iterator it = T6.t().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.I0 i02 = (com.google.android.gms.internal.measurement.I0) it.next();
            if (enumC1196r0 == N(i02.s())) {
                if (i02.r() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean Y(String str, String str2) {
        Boolean bool;
        D();
        b0(str);
        if ("1".equals(e(str, "measurement.upload.blacklist_internal")) && x1.K0(str2)) {
            return true;
        }
        if ("1".equals(e(str, "measurement.upload.blacklist_public")) && x1.M0(str2)) {
            return true;
        }
        Map map = (Map) this.f13947v.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean Z(String str) {
        D();
        b0(str);
        C1052e c1052e = this.f13946u;
        if (c1052e.get(str) != null && ((Set) c1052e.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    public final boolean a0(String str) {
        D();
        b0(str);
        C1052e c1052e = this.f13946u;
        if (c1052e.get(str) != null) {
            if (((Set) c1052e.get(str)).contains("os_version") || ((Set) c1052e.get(str)).contains("device_info")) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
        if (r3 == null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.Z.b0(java.lang.String):void");
    }

    @Override // s3.InterfaceC1172f
    public final String e(String str, String str2) {
        D();
        b0(str);
        Map map = (Map) this.f13945t.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }
}
