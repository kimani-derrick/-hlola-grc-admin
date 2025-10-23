package s3;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.C0408c3;
import com.google.android.gms.internal.measurement.F3;
import com.google.android.gms.internal.measurement.W2;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import j3.AbstractC0839c;
import j3.C0837a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import k.C0852F;
import s0.C1125d;
/* renamed from: s3.z0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1212z0 extends AbstractC1157L {

    /* renamed from: A  reason: collision with root package name */
    public E0 f14398A;

    /* renamed from: B  reason: collision with root package name */
    public PriorityQueue f14399B;

    /* renamed from: C  reason: collision with root package name */
    public C1198s0 f14400C;

    /* renamed from: D  reason: collision with root package name */
    public final AtomicLong f14401D;

    /* renamed from: E  reason: collision with root package name */
    public long f14402E;
    public final V F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f14403G;

    /* renamed from: H  reason: collision with root package name */
    public E0 f14404H;

    /* renamed from: I  reason: collision with root package name */
    public D0 f14405I;

    /* renamed from: J  reason: collision with root package name */
    public E0 f14406J;

    /* renamed from: K  reason: collision with root package name */
    public final C0852F f14407K;

    /* renamed from: s  reason: collision with root package name */
    public I0 f14408s;

    /* renamed from: t  reason: collision with root package name */
    public androidx.fragment.app.D f14409t;

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArraySet f14410u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f14411v;

    /* renamed from: w  reason: collision with root package name */
    public final AtomicReference f14412w;

    /* renamed from: x  reason: collision with root package name */
    public final Object f14413x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f14414y;

    /* renamed from: z  reason: collision with root package name */
    public int f14415z;

    public C1212z0(C1175g0 c1175g0) {
        super(c1175g0);
        this.f14410u = new CopyOnWriteArraySet();
        this.f14413x = new Object();
        this.f14414y = false;
        this.f14415z = 1;
        this.f14403G = true;
        this.f14407K = new C0852F(16, this);
        this.f14412w = new AtomicReference();
        this.f14400C = C1198s0.f14233c;
        this.f14402E = -1L;
        this.f14401D = new AtomicLong(0L);
        this.F = new V(c1175g0, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void W(s3.C1212z0 r4, s3.C1198s0 r5, long r6, boolean r8, boolean r9) {
        /*
            r4.D()
            r4.H()
            s3.T r0 = r4.B()
            s3.s0 r0 = r0.P()
            long r1 = r4.f14402E
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 > 0) goto L2a
            int r1 = r5.f14235b
            int r0 = r0.f14235b
            boolean r0 = s3.C1198s0.h(r0, r1)
            if (r0 == 0) goto L2a
            s3.I r4 = r4.b()
            java.lang.String r6 = "Dropped out-of-date consent setting, proposed settings"
            l6.b r4 = r4.f13801B
            r4.c(r5, r6)
            return
        L2a:
            s3.T r0 = r4.B()
            r0.D()
            int r1 = r5.f14235b
            boolean r2 = r0.I(r1)
            if (r2 == 0) goto Ld2
            android.content.SharedPreferences r0 = r0.N()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "consent_settings"
            java.lang.String r3 = r5.p()
            r0.putString(r2, r3)
            java.lang.String r2 = "consent_source"
            r0.putInt(r2, r1)
            r0.apply()
            s3.I r0 = r4.b()
            java.lang.String r1 = "Setting storage consent. consent"
            l6.b r0 = r0.f13803D
            r0.c(r5, r1)
            r4.f14402E = r6
            java.lang.Object r4 = r4.f2765q
            s3.g0 r4 = (s3.C1175g0) r4
            s3.e r5 = r4.f14062w
            s3.C r6 = s3.AbstractC1203v.f14281L0
            r7 = 0
            boolean r5 = r5.O(r7, r6)
            if (r5 == 0) goto Lbc
            s3.R0 r5 = r4.r()
            r5.D()
            r5.H()
            boolean r6 = r5.T()
            if (r6 != 0) goto L7f
            goto L8c
        L7f:
            s3.x1 r5 = r5.C()
            int r5 = r5.J0()
            r6 = 241200(0x3ae30, float:3.37993E-40)
            if (r5 < r6) goto Lbc
        L8c:
            s3.R0 r5 = r4.r()
            r5.D()
            r5.H()
            com.google.android.gms.internal.measurement.C0408c3.a()
            java.lang.Object r6 = r5.f2765q
            s3.g0 r6 = (s3.C1175g0) r6
            s3.e r0 = r6.f14062w
            s3.C r1 = s3.AbstractC1203v.f14310a1
            boolean r7 = r0.O(r7, r1)
            if (r7 != 0) goto Lb0
            if (r8 == 0) goto Lb0
            s3.G r6 = r6.p()
            r6.M()
        Lb0:
            s3.Q0 r6 = new s3.Q0
            r7 = 0
            r6.<init>(r7)
            r6.f13864r = r5
            r5.K(r6)
            goto Lc3
        Lbc:
            s3.R0 r5 = r4.r()
            r5.O(r8)
        Lc3:
            if (r9 == 0) goto Le3
            s3.R0 r4 = r4.r()
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference
            r5.<init>()
            r4.L(r5)
            return
        Ld2:
            s3.I r4 = r4.b()
            int r5 = r5.f14235b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            l6.b r4 = r4.f13801B
            java.lang.String r6 = "Lower precedence consent source ignored, proposed source"
            r4.c(r5, r6)
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1212z0.W(s3.z0, s3.s0, long, boolean, boolean):void");
    }

    public static void X(C1212z0 c1212z0, C1198s0 c1198s0, C1198s0 c1198s02) {
        boolean z7;
        C0408c3.a();
        if (!((C1175g0) c1212z0.f2765q).f14062w.O(null, AbstractC1203v.f14310a1)) {
            EnumC1196r0 enumC1196r0 = EnumC1196r0.f14217s;
            EnumC1196r0 enumC1196r02 = EnumC1196r0.f14216r;
            EnumC1196r0[] enumC1196r0Arr = {enumC1196r0, enumC1196r02};
            c1198s0.getClass();
            int i7 = 0;
            while (true) {
                if (i7 < 2) {
                    EnumC1196r0 enumC1196r03 = enumC1196r0Arr[i7];
                    if (!c1198s02.i(enumC1196r03) && c1198s0.i(enumC1196r03)) {
                        z7 = true;
                        break;
                    }
                    i7++;
                } else {
                    z7 = false;
                    break;
                }
            }
            boolean k5 = c1198s0.k(c1198s02, enumC1196r0, enumC1196r02);
            if (z7 || k5) {
                ((C1175g0) c1212z0.f2765q).o().M();
            }
        }
    }

    @Override // s3.AbstractC1157L
    public final boolean J() {
        return false;
    }

    public final void K(long j7, Bundle bundle, String str, String str2) {
        boolean z7;
        D();
        if (this.f14409t != null && !x1.K0(str2)) {
            z7 = false;
        } else {
            z7 = true;
        }
        O(str, str2, j7, bundle, true, z7, true, null);
    }

    public final void L(long j7, Object obj, String str, String str2) {
        long j8;
        g3.n.c(str);
        g3.n.c(str2);
        D();
        H();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    String str4 = "false";
                    if ("false".equals(str3.toLowerCase(Locale.ENGLISH))) {
                        j8 = 1;
                    } else {
                        j8 = 0;
                    }
                    obj = Long.valueOf(j8);
                    T B6 = B();
                    if (j8 == 1) {
                        str4 = "true";
                    }
                    B6.f13881D.j(str4);
                    str2 = "_npa";
                    b().f13803D.b(obj, str, "Setting _npa user property (which is the inverse of AD_PERSONALIZATION consent or allow_personalized_ads user property)");
                }
            }
            if (obj == null) {
                B().f13881D.j("unset");
                str2 = "_npa";
            }
            b().f13803D.b(obj, str, "Setting _npa user property (which is the inverse of AD_PERSONALIZATION consent or allow_personalized_ads user property)");
        }
        Object obj2 = obj;
        String str5 = str2;
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        if (!c1175g0.j()) {
            b().f13803D.d("User property not set since app measurement is disabled");
        } else if (!c1175g0.k()) {
        } else {
            u1 u1Var = new u1(j7, obj2, str5, str);
            R0 r3 = c1175g0.r();
            r3.D();
            r3.H();
            C1152G p3 = ((C1175g0) r3.f2765q).p();
            p3.getClass();
            Parcel obtain = Parcel.obtain();
            boolean z7 = false;
            u1Var.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                p3.b().f13808w.d("User property too long for local database. Sending directly to service");
            } else {
                z7 = p3.L(1, marshall);
            }
            r3.K(new U0(r3, r3.W(true), z7, u1Var));
        }
    }

    public final void M(Bundle bundle, int i7, long j7) {
        String str;
        String str2;
        Boolean bool;
        boolean z7 = true;
        H();
        C1198s0 c1198s0 = C1198s0.f14233c;
        EnumC1196r0[] enumC1196r0Arr = EnumC1200t0.STORAGE.f14242q;
        int length = enumC1196r0Arr.length;
        int i8 = 0;
        while (true) {
            if (i8 < length) {
                EnumC1196r0 enumC1196r0 = enumC1196r0Arr[i8];
                if (bundle.containsKey(enumC1196r0.f14221q) && (str = bundle.getString(enumC1196r0.f14221q)) != null) {
                    if (str.equals("granted")) {
                        bool = Boolean.TRUE;
                    } else if (str.equals("denied")) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = null;
                    }
                    if (bool == null) {
                        break;
                    }
                }
                i8++;
            } else {
                str = null;
                break;
            }
        }
        if (str != null) {
            b().f13800A.c(str, "Ignoring invalid consent setting");
            b().f13800A.d("Valid consent values are 'granted', 'denied'");
        }
        if (!((C1175g0) this.f2765q).f14062w.O(null, AbstractC1203v.f14283M0) || !d().O()) {
            z7 = false;
        }
        C1198s0 c5 = C1198s0.c(i7, bundle);
        if (c5.r()) {
            V(c5, j7, z7);
        }
        C1188n b7 = C1188n.b(i7, bundle);
        Iterator it = b7.f14156e.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((EnumC1202u0) it.next()) != EnumC1202u0.f14248q) {
                T(b7, z7);
                break;
            }
        }
        Boolean a7 = C1188n.a(bundle);
        if (a7 != null) {
            if (i7 == -30) {
                str2 = "tcf";
            } else {
                str2 = "app";
            }
            S(str2, "allow_personalized_ads", a7.toString(), false);
        }
    }

    public final void N(Boolean bool, boolean z7) {
        D();
        H();
        b().f13802C.c(bool, "Setting app measurement enabled (FE)");
        T B6 = B();
        B6.D();
        SharedPreferences.Editor edit = B6.N().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z7) {
            T B7 = B();
            B7.D();
            SharedPreferences.Editor edit2 = B7.N().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        C1169d0 c1169d0 = c1175g0.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        if (c1175g0.f14052T || (bool != null && !bool.booleanValue())) {
            f0();
        }
    }

    public final void O(String str, String str2, long j7, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) {
        C0837a c0837a;
        C1170e c1170e;
        C1175g0 c1175g0;
        boolean b7;
        ArrayList arrayList;
        C1175g0 c1175g02;
        String str4;
        Bundle[] bundleArr;
        boolean z10;
        long j8;
        C1175g0 c1175g03;
        int i7;
        boolean L6;
        boolean z11;
        Bundle[] bundleArr2;
        Object[] array;
        String str5;
        g3.n.c(str);
        g3.n.g(bundle);
        D();
        H();
        C1175g0 c1175g04 = (C1175g0) this.f2765q;
        if (!c1175g04.j()) {
            b().f13802C.d("Event not sent since app measurement is disabled");
            return;
        }
        List list = c1175g04.o().f13774y;
        if (list != null && !list.contains(str2)) {
            b().f13802C.b(str2, str, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (!this.f14411v) {
            this.f14411v = true;
            try {
                boolean z12 = c1175g04.f14060u;
                Context context = c1175g04.f14056q;
                try {
                    (!z12 ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e3) {
                    b().f13810y.c(e3, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                b().f13801B.d("Tag Manager is not found and thus will not be used");
            }
        }
        boolean equals = "_cmp".equals(str2);
        C1170e c1170e2 = c1175g04.f14062w;
        C0837a c0837a2 = c1175g04.f14037D;
        if (equals) {
            if (bundle.containsKey("gclid")) {
                String string = bundle.getString("gclid");
                c0837a2.getClass();
                c0837a = c0837a2;
                c1170e = c1170e2;
                str5 = null;
                c1175g0 = c1175g04;
                L(System.currentTimeMillis(), string, "auto", "_lgclid");
                if (c1170e.O(null, AbstractC1203v.f14332l0)) {
                    String string2 = bundle.getString("gclid");
                    c0837a.getClass();
                    L(System.currentTimeMillis(), string2, "auto", "_dl_gclid");
                }
            } else {
                c0837a = c0837a2;
                c1170e = c1170e2;
                str5 = null;
                c1175g0 = c1175g04;
            }
            F3.a();
            if (c1170e.O(str5, AbstractC1203v.f14287O0) && bundle.containsKey("gbraid")) {
                String str6 = c1170e.O(str5, AbstractC1203v.f14289P0) ? "_dl_gbraid" : "_gbraid";
                String string3 = bundle.getString("gbraid");
                c0837a.getClass();
                L(System.currentTimeMillis(), string3, "auto", str6);
            }
        } else {
            c0837a = c0837a2;
            c1170e = c1170e2;
            c1175g0 = c1175g04;
        }
        if (z7 && (!x1.f14382z[0].equals(str2))) {
            C().V(bundle, B().f13892P.a0());
        }
        C1175g0 c1175g05 = c1175g0;
        C1153H c1153h = c1175g05.f14036C;
        C0852F c0852f = this.f14407K;
        if (!z9 && !"_iap".equals(str2)) {
            x1 x1Var = c1175g05.f14035B;
            C1175g0.h(x1Var);
            int i8 = 2;
            if (x1Var.F0("event", str2)) {
                if (!x1Var.s0("event", AbstractC1204v0.f14359a, AbstractC1204v0.f14360b, str2)) {
                    i8 = 13;
                } else if (x1Var.j0(40, "event", str2)) {
                    i8 = 0;
                }
            }
            if (i8 != 0) {
                b().f13809x.c(c1153h.b(str2), "Invalid public event name. Event will not be logged (FE)");
                c1175g05.s();
                String R6 = x1.R(40, str2, true);
                int length = str2 != null ? str2.length() : 0;
                c1175g05.s();
                x1.h0(c0852f, null, i8, "_ev", R6, length);
                return;
            }
        }
        O0 L7 = F().L(false);
        if (L7 != null && !bundle.containsKey("_sc")) {
            L7.d = true;
        }
        x1.g0(L7, bundle, z7 && !z9);
        boolean equals2 = "am".equals(str);
        boolean K02 = x1.K0(str2);
        if (z7 && this.f14409t != null && !K02 && !equals2) {
            b().f13802C.b(c1153h.b(str2), c1153h.a(bundle), "Passing event to registered event handler (FE)");
            g3.n.g(this.f14409t);
            androidx.fragment.app.D d = this.f14409t;
            d.getClass();
            try {
                ((com.google.android.gms.internal.measurement.Z) d.f5883r).x(j7, bundle, str, str2);
            } catch (RemoteException e7) {
                C1175g0 c1175g06 = ((AppMeasurementDynamiteService) d.f5884s).d;
                if (c1175g06 != null) {
                    C1154I c1154i = c1175g06.f14064y;
                    C1175g0.i(c1154i);
                    c1154i.f13810y.c(e7, "Event interceptor threw exception");
                }
            }
        } else if (c1175g05.k()) {
            int I6 = C().I(str2);
            if (I6 != 0) {
                b().f13809x.c(c1153h.b(str2), "Invalid event name. Event will not be logged (FE)");
                C();
                String R7 = x1.R(40, str2, true);
                int length2 = str2 != null ? str2.length() : 0;
                c1175g05.s();
                x1.h0(c0852f, str3, I6, "_ev", R7, length2);
                return;
            }
            String str7 = "_o";
            Bundle O5 = C().O(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z9);
            g3.n.g(O5);
            if (F().L(false) != null && "_ae".equals(str2)) {
                H2.X x7 = G().f14019v;
                ((C1175g0) ((f1) x7.f1000t).f2765q).f14037D.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j9 = elapsedRealtime - x7.f998r;
                x7.f998r = elapsedRealtime;
                if (j9 > 0) {
                    C().U(O5, j9);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                x1 C3 = C();
                String string4 = O5.getString("_ffr");
                int i9 = AbstractC0839c.f11853a;
                if (string4 == null || string4.trim().isEmpty()) {
                    string4 = null;
                } else if (string4 != null) {
                    string4 = string4.trim();
                }
                if (Objects.equals(string4, C3.B().f13889M.i())) {
                    C3.b().f13802C.d("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                C3.B().f13889M.j(string4);
            } else if ("_ae".equals(str2)) {
                String i10 = C().B().f13889M.i();
                if (!TextUtils.isEmpty(i10)) {
                    O5.putString("_ffr", i10);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(O5);
            if (c1170e.O(null, AbstractC1203v.f14273H0)) {
                f1 G6 = G();
                G6.D();
                b7 = G6.f14017t;
            } else {
                b7 = B().f13886J.b();
            }
            if (B().f13883G.f() > 0 && B().J(j7) && b7) {
                b().f13803D.d("Current session is expired, remove the session number, ID, and engagement time");
                c0837a.getClass();
                str4 = "_ae";
                bundleArr = null;
                z10 = equals2;
                j8 = 0;
                arrayList = arrayList2;
                c1175g02 = c1175g05;
                L(System.currentTimeMillis(), null, "auto", "_sid");
                c0837a.getClass();
                L(System.currentTimeMillis(), null, "auto", "_sno");
                c0837a.getClass();
                L(System.currentTimeMillis(), null, "auto", "_se");
                B().f13884H.g(0L);
            } else {
                arrayList = arrayList2;
                c1175g02 = c1175g05;
                str4 = "_ae";
                bundleArr = null;
                z10 = equals2;
                j8 = 0;
            }
            if (O5.getLong("extend_session", j8) == 1) {
                b().f13803D.d("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                c1175g03 = c1175g02;
                f1 f1Var = c1175g03.f14034A;
                C1175g0.g(f1Var);
                i7 = 1;
                f1Var.f14018u.N(true, j7);
            } else {
                c1175g03 = c1175g02;
                i7 = 1;
            }
            ArrayList arrayList3 = new ArrayList(O5.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11 += i7;
                String str8 = (String) obj;
                if (str8 != null) {
                    C();
                    Object obj2 = O5.get(str8);
                    if (obj2 instanceof Bundle) {
                        Bundle[] bundleArr3 = new Bundle[i7];
                        bundleArr3[0] = (Bundle) obj2;
                        bundleArr2 = bundleArr3;
                    } else {
                        if (obj2 instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj2;
                            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj2 instanceof ArrayList) {
                            ArrayList arrayList4 = (ArrayList) obj2;
                            array = arrayList4.toArray(new Bundle[arrayList4.size()]);
                        } else {
                            bundleArr2 = bundleArr;
                        }
                        bundleArr2 = (Bundle[]) array;
                    }
                    if (bundleArr2 != null) {
                        O5.putParcelableArray(str8, bundleArr2);
                    }
                }
                i7 = 1;
            }
            int i12 = 0;
            while (i12 < arrayList.size()) {
                ArrayList arrayList5 = arrayList;
                Bundle bundle2 = (Bundle) arrayList5.get(i12);
                String str9 = i12 != 0 ? "_ep" : str2;
                bundle2.putString(str7, str);
                if (z8) {
                    bundle2 = C().N(bundle2);
                }
                Bundle bundle3 = bundle2;
                String str10 = str7;
                C1201u c1201u = new C1201u(str9, new r(bundle3), str, j7);
                R0 r3 = c1175g03.r();
                r3.getClass();
                r3.D();
                r3.H();
                C1152G p3 = ((C1175g0) r3.f2765q).p();
                p3.getClass();
                Parcel obtain = Parcel.obtain();
                c1201u.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                if (marshall.length > 131072) {
                    p3.b().f13808w.d("Event is too long for local database. Sending event directly to service");
                    z11 = true;
                    L6 = false;
                } else {
                    L6 = p3.L(0, marshall);
                    z11 = true;
                }
                r3.K(new U0(r3, r3.W(z11), L6, c1201u, str3, 2));
                if (!z10) {
                    Iterator it = this.f14410u.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1206w0) it.next()).a(j7, new Bundle(bundle3), str, str2);
                    }
                }
                i12++;
                str7 = str10;
                arrayList = arrayList5;
            }
            if (F().L(false) == null || !str4.equals(str2)) {
                return;
            }
            f1 G7 = G();
            c0837a.getClass();
            G7.f14019v.a(SystemClock.elapsedRealtime(), true, true);
        }
    }

    public final void P(String str, String str2, Bundle bundle) {
        ((C1175g0) this.f2765q).f14037D.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        g3.n.c(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        d().M(new B0(this, bundle2, 1));
    }

    public final void Q(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j7) {
        String str3;
        Bundle bundle2;
        boolean z9;
        String str4;
        String str5;
        String str6;
        O0 o02;
        String str7;
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (Objects.equals(str2, "screen_view")) {
            N0 F = F();
            synchronized (F.f13837B) {
                try {
                    if (!F.f13836A) {
                        F.b().f13800A.d("Cannot log screen view event when the app is in the background.");
                    } else {
                        String string = bundle2.getString("screen_name");
                        if (string != null && (string.length() <= 0 || string.length() > ((C1175g0) F.f2765q).f14062w.F(null, false))) {
                            F.b().f13800A.c(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                        } else {
                            String string2 = bundle2.getString("screen_class");
                            if (string2 != null && (string2.length() <= 0 || string2.length() > ((C1175g0) F.f2765q).f14062w.F(null, false))) {
                                F.b().f13800A.c(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                            } else {
                                if (string2 == null) {
                                    Activity activity = F.f13842w;
                                    if (activity != null) {
                                        str7 = F.K(activity.getClass());
                                    } else {
                                        str7 = "Activity";
                                    }
                                    str4 = str7;
                                } else {
                                    str4 = string2;
                                }
                                O0 o03 = F.f13838s;
                                if (F.f13843x && o03 != null) {
                                    F.f13843x = false;
                                    boolean equals = Objects.equals(o03.f13848b, str4);
                                    boolean equals2 = Objects.equals(o03.f13847a, string);
                                    if (equals && equals2) {
                                        F.b().f13800A.d("Ignoring call to log screen view event with duplicate parameters.");
                                    }
                                }
                                l6.b bVar = F.b().f13803D;
                                if (string == null) {
                                    str5 = "null";
                                } else {
                                    str5 = string;
                                }
                                if (str4 == null) {
                                    str6 = "null";
                                } else {
                                    str6 = str4;
                                }
                                bVar.b(str5, str6, "Logging screen view with name, class");
                                if (F.f13838s == null) {
                                    o02 = F.f13839t;
                                } else {
                                    o02 = F.f13838s;
                                }
                                O0 o04 = new O0(string, str4, F.C().P0(), true, j7);
                                F.f13838s = o04;
                                F.f13839t = o02;
                                F.f13844y = o04;
                                ((C1175g0) F.f2765q).f14037D.getClass();
                                F.d().M(new RunnableC1185l0(F, bundle2, o04, o02, SystemClock.elapsedRealtime(), 2));
                                return;
                            }
                        }
                    }
                    return;
                } finally {
                }
            }
        }
        if (z8 && this.f14409t != null && !x1.K0(str2)) {
            z9 = false;
        } else {
            z9 = true;
        }
        Bundle bundle3 = new Bundle(bundle2);
        for (String str8 : bundle3.keySet()) {
            Object obj = bundle3.get(str8);
            if (obj instanceof Bundle) {
                bundle3.putBundle(str8, new Bundle((Bundle) obj));
            } else if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr = (Parcelable[]) obj;
                for (int i7 = 0; i7 < parcelableArr.length; i7++) {
                    if (parcelableArr[i7] instanceof Bundle) {
                        parcelableArr[i7] = new Bundle((Bundle) parcelableArr[i7]);
                    }
                }
            } else if (obj instanceof List) {
                List list = (List) obj;
                for (int i8 = 0; i8 < list.size(); i8++) {
                    Object obj2 = list.get(i8);
                    if (obj2 instanceof Bundle) {
                        list.set(i8, new Bundle((Bundle) obj2));
                    }
                }
            }
        }
        d().M(new G0(this, str3, str2, j7, bundle3, z8, z9, z7));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15, long r16) {
        /*
            r11 = this;
            r8 = r11
            r3 = r13
            r0 = r14
            if (r12 != 0) goto L9
            java.lang.String r1 = "app"
            r2 = r1
            goto La
        L9:
            r2 = r12
        La:
            r1 = 0
            r4 = 24
            s3.x1 r5 = r11.C()
            if (r15 == 0) goto L19
            int r5 = r5.x0(r13)
        L17:
            r9 = r5
            goto L37
        L19:
            java.lang.String r6 = "user property"
            boolean r7 = r5.F0(r6, r13)
            r9 = 6
            if (r7 != 0) goto L23
            goto L37
        L23:
            java.lang.String[] r7 = s3.AbstractC1204v0.f14362e
            r10 = 0
            boolean r7 = r5.s0(r6, r7, r10, r13)
            if (r7 != 0) goto L2f
            r5 = 15
            goto L17
        L2f:
            boolean r5 = r5.j0(r4, r6, r13)
            if (r5 != 0) goto L36
            goto L37
        L36:
            r9 = r1
        L37:
            k.F r5 = r8.f14407K
            java.lang.Object r6 = r8.f2765q
            s3.g0 r6 = (s3.C1175g0) r6
            r7 = 1
            if (r9 == 0) goto L5f
            r11.C()
            java.lang.String r0 = s3.x1.R(r4, r13, r7)
            if (r3 == 0) goto L4d
            int r1 = r13.length()
        L4d:
            r6.s()
            r2 = 0
            java.lang.String r3 = "_ev"
            r12 = r5
            r13 = r2
            r14 = r9
            r15 = r3
            r16 = r0
            r17 = r1
            s3.x1.h0(r12, r13, r14, r15, r16, r17)
            return
        L5f:
            if (r0 == 0) goto Lb1
            s3.x1 r9 = r11.C()
            int r9 = r9.H(r14, r13)
            if (r9 == 0) goto L94
            r11.C()
            java.lang.String r2 = s3.x1.R(r4, r13, r7)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 != 0) goto L7a
            boolean r3 = r0 instanceof java.lang.CharSequence
            if (r3 == 0) goto L82
        L7a:
            java.lang.String r0 = java.lang.String.valueOf(r14)
            int r1 = r0.length()
        L82:
            r6.s()
            r0 = 0
            java.lang.String r3 = "_ev"
            r12 = r5
            r13 = r0
            r14 = r9
            r15 = r3
            r16 = r2
            r17 = r1
            s3.x1.h0(r12, r13, r14, r15, r16, r17)
            return
        L94:
            s3.x1 r1 = r11.C()
            java.lang.Object r4 = r1.D0(r14, r13)
            if (r4 == 0) goto Lb0
            s3.d0 r9 = r11.d()
            s3.l0 r10 = new s3.l0
            r7 = 1
            r0 = r10
            r1 = r11
            r3 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r9.M(r10)
        Lb0:
            return
        Lb1:
            s3.d0 r9 = r11.d()
            s3.l0 r10 = new s3.l0
            r4 = 0
            r7 = 1
            r0 = r10
            r1 = r11
            r3 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r9.M(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1212z0.R(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    public final void S(String str, String str2, String str3, boolean z7) {
        ((C1175g0) this.f2765q).f14037D.getClass();
        R(str, str2, str3, z7, System.currentTimeMillis());
    }

    public final void T(C1188n c1188n, boolean z7) {
        R3.a aVar = new R3.a(this, c1188n, 20, false);
        if (z7) {
            D();
            aVar.run();
            return;
        }
        d().M(aVar);
    }

    public final void U(C1198s0 c1198s0) {
        boolean z7;
        Boolean bool;
        D();
        if ((c1198s0.i(EnumC1196r0.f14217s) && c1198s0.i(EnumC1196r0.f14216r)) || ((C1175g0) this.f2765q).r().S()) {
            z7 = true;
        } else {
            z7 = false;
        }
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        C1169d0 c1169d0 = c1175g0.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        if (z7 != c1175g0.f14052T) {
            C1175g0 c1175g02 = (C1175g0) this.f2765q;
            C1169d0 c1169d02 = c1175g02.f14065z;
            C1175g0.i(c1169d02);
            c1169d02.D();
            c1175g02.f14052T = z7;
            T B6 = B();
            B6.D();
            if (B6.N().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(B6.N().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z7 || bool == null || bool.booleanValue()) {
                N(Boolean.valueOf(z7), false);
            }
        }
    }

    public final void V(C1198s0 c1198s0, long j7, boolean z7) {
        C1198s0 c1198s02;
        boolean z8;
        boolean z9;
        boolean z10;
        C1198s0 c1198s03 = c1198s0;
        H();
        int i7 = c1198s03.f14235b;
        W2.a();
        if (((C1175g0) this.f2765q).f14062w.O(null, AbstractC1203v.f14301W0)) {
            if (i7 != -10) {
                EnumC1202u0 enumC1202u0 = (EnumC1202u0) c1198s03.f14234a.get(EnumC1196r0.f14216r);
                if (enumC1202u0 == null) {
                    enumC1202u0 = EnumC1202u0.f14248q;
                }
                EnumC1202u0 enumC1202u02 = EnumC1202u0.f14248q;
                if (enumC1202u0 == enumC1202u02) {
                    EnumC1202u0 enumC1202u03 = (EnumC1202u0) c1198s03.f14234a.get(EnumC1196r0.f14217s);
                    if (enumC1202u03 == null) {
                        enumC1202u03 = enumC1202u02;
                    }
                    if (enumC1202u03 == enumC1202u02) {
                        b().f13800A.d("Ignoring empty consent settings");
                        return;
                    }
                }
            }
        } else if (i7 != -10 && c1198s0.m() == null && c1198s0.n() == null) {
            b().f13800A.d("Discarding empty consent settings");
            return;
        }
        synchronized (this.f14413x) {
            try {
                c1198s02 = this.f14400C;
                z8 = false;
                if (C1198s0.h(i7, c1198s02.f14235b)) {
                    z9 = c1198s0.l(this.f14400C);
                    EnumC1196r0 enumC1196r0 = EnumC1196r0.f14217s;
                    if (c1198s0.i(enumC1196r0) && !this.f14400C.i(enumC1196r0)) {
                        z8 = true;
                    }
                    c1198s03 = c1198s0.j(this.f14400C);
                    this.f14400C = c1198s03;
                    z10 = z8;
                    z8 = true;
                } else {
                    z9 = false;
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z8) {
            b().f13801B.c(c1198s03, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f14401D.getAndIncrement();
        if (z9) {
            h0(null);
            H0 h02 = new H0(this, c1198s03, j7, andIncrement, z10, c1198s02);
            if (z7) {
                D();
                h02.run();
                return;
            }
            d().N(h02);
            return;
        }
        J0 j02 = new J0(this, c1198s03, andIncrement, z10, c1198s02);
        if (z7) {
            D();
            j02.run();
        } else if (i7 != 30 && i7 != -10) {
            d().M(j02);
        } else {
            d().N(j02);
        }
    }

    public final void Y(boolean z7, long j7) {
        D();
        H();
        b().f13802C.d("Resetting analytics data (FE)");
        f1 G6 = G();
        G6.D();
        H2.X x7 = G6.f14019v;
        ((h1) x7.f999s).a();
        f1 f1Var = (f1) x7.f1000t;
        if (((C1175g0) f1Var.f2765q).f14062w.O(null, AbstractC1203v.d1)) {
            ((C1175g0) f1Var.f2765q).f14037D.getClass();
            x7.f997q = SystemClock.elapsedRealtime();
        } else {
            x7.f997q = 0L;
        }
        x7.f998r = x7.f997q;
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        c1175g0.o().M();
        boolean j8 = c1175g0.j();
        T B6 = B();
        B6.f13897w.g(j7);
        if (!TextUtils.isEmpty(B6.B().f13889M.i())) {
            B6.f13889M.j(null);
        }
        B6.f13883G.g(0L);
        B6.f13884H.g(0L);
        Boolean N6 = ((C1175g0) B6.f2765q).f14062w.N("firebase_analytics_collection_deactivated");
        if (N6 == null || !N6.booleanValue()) {
            B6.L(!j8);
        }
        B6.f13890N.j(null);
        B6.f13891O.g(0L);
        B6.f13892P.f0(null);
        if (z7) {
            R0 r3 = c1175g0.r();
            r3.D();
            r3.H();
            m1 W = r3.W(false);
            ((C1175g0) r3.f2765q).p().M();
            r3.K(new V0(r3, W, 0));
        }
        G().f14018u.J();
        this.f14403G = !j8;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [s3.y0, java.lang.Object] */
    public final PriorityQueue Z() {
        Comparator comparing;
        if (this.f14399B == null) {
            comparing = Comparator.comparing(new Object(), new n5.r(2));
            this.f14399B = B3.a.q(comparing);
        }
        return this.f14399B;
    }

    public final void a0() {
        D();
        H();
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        if (!c1175g0.k()) {
            return;
        }
        Boolean N6 = c1175g0.f14062w.N("google_analytics_deferred_deep_link_enabled");
        if (N6 != null && N6.booleanValue()) {
            b().f13802C.d("Deferred Deep Link feature enabled.");
            C1169d0 d = d();
            RunnableC1179i0 runnableC1179i0 = new RunnableC1179i0(1);
            runnableC1179i0.f14088r = this;
            d.M(runnableC1179i0);
        }
        R0 r3 = c1175g0.r();
        r3.D();
        r3.H();
        m1 W = r3.W(true);
        ((C1175g0) r3.f2765q).p().L(3, new byte[0]);
        r3.K(new V0(r3, W, 1));
        this.f14403G = false;
        T B6 = B();
        B6.D();
        String string = B6.N().getString("previous_os_version", null);
        ((C1175g0) B6.f2765q).n().E();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = B6.N().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        if (!TextUtils.isEmpty(string)) {
            c1175g0.n().E();
            if (!string.equals(str)) {
                Bundle bundle = new Bundle();
                bundle.putString("_po", string);
                i0("auto", "_ou", bundle);
            }
        }
    }

    public final void b0() {
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        if ((c1175g0.f14056q.getApplicationContext() instanceof Application) && this.f14408s != null) {
            ((Application) c1175g0.f14056q.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f14408s);
        }
    }

    public final void c0() {
        C1154I b7;
        String str;
        Y3.a();
        if (!((C1175g0) this.f2765q).f14062w.O(null, AbstractC1203v.f14265C0)) {
            return;
        }
        if (d().O()) {
            b7 = b();
            str = "Cannot get trigger URIs from analytics worker thread";
        } else if (m3.i.f()) {
            b7 = b();
            str = "Cannot get trigger URIs from main thread";
        } else {
            H();
            b().f13803D.d("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            C1169d0 d = d();
            A0 a02 = new A0();
            a02.f13748s = this;
            a02.f13747r = atomicReference;
            d.H(atomicReference, 5000L, "get trigger URIs", a02);
            List list = (List) atomicReference.get();
            if (list == null) {
                b7 = b();
                str = "Timed out waiting for get trigger URIs";
            } else {
                C1169d0 d7 = d();
                R3.a aVar = new R3.a(16);
                aVar.f2919r = this;
                aVar.f2920s = list;
                d7.M(aVar);
                return;
            }
        }
        b7.f13807v.d(str);
    }

    public final void d0() {
        String str;
        int i7;
        int i8;
        int i9;
        String str2;
        int i10;
        int i11;
        Bundle bundle;
        int i12;
        int i13;
        String str3;
        String str4;
        D();
        b().f13802C.d("Handle tcf update.");
        SharedPreferences M6 = B().M();
        HashMap hashMap = new HashMap();
        try {
            str = M6.getString("IABTCF_VendorConsents", "\u0000");
        } catch (ClassCastException unused) {
            str = "\u0000";
        }
        if (!"\u0000".equals(str) && str.length() > 754) {
            hashMap.put("GoogleConsent", String.valueOf(str.charAt(754)));
        }
        try {
            i7 = M6.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused2) {
            i7 = -1;
        }
        if (i7 != -1) {
            hashMap.put("gdprApplies", String.valueOf(i7));
        }
        try {
            i8 = M6.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException unused3) {
            i8 = -1;
        }
        if (i8 != -1) {
            hashMap.put("EnableAdvertiserConsentMode", String.valueOf(i8));
        }
        try {
            i9 = M6.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused4) {
            i9 = -1;
        }
        if (i9 != -1) {
            hashMap.put("PolicyVersion", String.valueOf(i9));
        }
        try {
            str2 = M6.getString("IABTCF_PurposeConsents", "\u0000");
        } catch (ClassCastException unused5) {
            str2 = "\u0000";
        }
        if (!"\u0000".equals(str2)) {
            hashMap.put("PurposeConsents", str2);
        }
        try {
            i10 = M6.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused6) {
            i10 = -1;
        }
        if (i10 != -1) {
            hashMap.put("CmpSdkID", String.valueOf(i10));
        }
        i1 i1Var = new i1(hashMap);
        b().f13803D.c(i1Var, "Tcf preferences read");
        T B6 = B();
        B6.D();
        String string = B6.N().getString("stored_tcf_param", "");
        String a7 = i1Var.a();
        if (!a7.equals(string)) {
            SharedPreferences.Editor edit = B6.N().edit();
            edit.putString("stored_tcf_param", a7);
            edit.apply();
            HashMap hashMap2 = i1Var.f14090a;
            int i14 = 2;
            if ("1".equals(hashMap2.get("GoogleConsent")) && "1".equals(hashMap2.get("gdprApplies")) && "1".equals(hashMap2.get("EnableAdvertiserConsentMode"))) {
                int b7 = i1Var.b();
                if (b7 >= 0) {
                    String str5 = (String) hashMap2.get("PurposeConsents");
                    if (!TextUtils.isEmpty(str5)) {
                        Bundle bundle2 = new Bundle();
                        String str6 = "denied";
                        if (str5.length() > 0) {
                            if (str5.charAt(0) != '1') {
                                str4 = "denied";
                            } else {
                                str4 = "granted";
                            }
                            bundle2.putString("ad_storage", str4);
                        }
                        if (str5.length() > 3) {
                            if (str5.charAt(2) != '1' || str5.charAt(3) != '1') {
                                str3 = "denied";
                            } else {
                                str3 = "granted";
                            }
                            bundle2.putString("ad_personalization", str3);
                        }
                        if (str5.length() > 6 && b7 >= 4) {
                            i11 = 0;
                            if (str5.charAt(0) == '1' && str5.charAt(6) == '1') {
                                str6 = "granted";
                            }
                            bundle2.putString("ad_user_data", str6);
                        } else {
                            i11 = 0;
                        }
                        bundle = bundle2;
                    }
                }
                bundle = Bundle.EMPTY;
                i11 = 0;
            } else {
                i11 = 0;
                bundle = Bundle.EMPTY;
            }
            b().f13803D.c(bundle, "Consent generated from Tcf");
            if (bundle != Bundle.EMPTY) {
                ((C1175g0) this.f2765q).f14037D.getClass();
                M(bundle, -30, System.currentTimeMillis());
            }
            Bundle bundle3 = new Bundle();
            StringBuilder sb = new StringBuilder("1");
            try {
                String str7 = (String) hashMap2.get("CmpSdkID");
                if (!TextUtils.isEmpty(str7)) {
                    i13 = Integer.parseInt(str7);
                } else {
                    i13 = -1;
                }
                i12 = i13;
            } catch (NumberFormatException unused7) {
                i12 = -1;
            }
            if (i12 >= 0 && i12 <= 4095) {
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((i12 >> 6) & 63));
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i12 & 63));
            } else {
                sb.append("00");
            }
            int b8 = i1Var.b();
            if (b8 >= 0 && b8 <= 63) {
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(b8));
            } else {
                sb.append("0");
            }
            if (!"1".equals(hashMap2.get("gdprApplies"))) {
                i14 = i11;
            }
            int i15 = i14 | 4;
            if ("1".equals(hashMap2.get("EnableAdvertiserConsentMode"))) {
                i15 = i14 | 12;
            }
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i15));
            bundle3.putString("_tcfd", sb.toString());
            i0("auto", "_tcf", bundle3);
        }
    }

    public final void e0() {
        j1 j1Var;
        C1125d Q02;
        D();
        if (Z().isEmpty() || this.f14414y || (j1Var = (j1) Z().poll()) == null || (Q02 = C().Q0()) == null) {
            return;
        }
        this.f14414y = true;
        l6.b bVar = b().f13803D;
        String str = j1Var.f14096q;
        bVar.c(str, "Registering trigger URI");
        R3.b d = Q02.d(Uri.parse(str));
        if (d == null) {
            this.f14414y = false;
            Z().add(j1Var);
            return;
        }
        if (!((C1175g0) this.f2765q).f14062w.O(null, AbstractC1203v.G0)) {
            SparseArray O5 = B().O();
            O5.put(j1Var.f14098s, Long.valueOf(j1Var.f14097r));
            B().H(O5);
        }
        d.a(new R3.a(d, 0, new androidx.fragment.app.D(this, 28, j1Var)), new T1.r(1, this));
    }

    public final void f0() {
        long j7;
        D();
        String i7 = B().f13881D.i();
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        if (i7 != null) {
            if ("unset".equals(i7)) {
                c1175g0.f14037D.getClass();
                L(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                if ("true".equals(i7)) {
                    j7 = 1;
                } else {
                    j7 = 0;
                }
                Long valueOf = Long.valueOf(j7);
                c1175g0.f14037D.getClass();
                L(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        if (c1175g0.j() && this.f14403G) {
            b().f13802C.d("Recording app launch after enabling measurement for the first time (FE)");
            a0();
            G().f14018u.J();
            d().M(new RunnableC1179i0(this));
            return;
        }
        b().f13802C.d("Updating Scion state (FE)");
        R0 r3 = c1175g0.r();
        r3.D();
        r3.H();
        r3.K(new V0(r3, r3.W(true), 3));
    }

    public final void g0(Bundle bundle, long j7) {
        g3.n.g(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            b().f13810y.d("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        AbstractC1204v0.a(bundle2, "app_id", String.class, null);
        AbstractC1204v0.a(bundle2, "origin", String.class, null);
        AbstractC1204v0.a(bundle2, "name", String.class, null);
        AbstractC1204v0.a(bundle2, "value", Object.class, null);
        AbstractC1204v0.a(bundle2, "trigger_event_name", String.class, null);
        AbstractC1204v0.a(bundle2, "trigger_timeout", Long.class, 0L);
        AbstractC1204v0.a(bundle2, "timed_out_event_name", String.class, null);
        AbstractC1204v0.a(bundle2, "timed_out_event_params", Bundle.class, null);
        AbstractC1204v0.a(bundle2, "triggered_event_name", String.class, null);
        AbstractC1204v0.a(bundle2, "triggered_event_params", Bundle.class, null);
        AbstractC1204v0.a(bundle2, "time_to_live", Long.class, 0L);
        AbstractC1204v0.a(bundle2, "expired_event_name", String.class, null);
        AbstractC1204v0.a(bundle2, "expired_event_params", Bundle.class, null);
        g3.n.c(bundle2.getString("name"));
        g3.n.c(bundle2.getString("origin"));
        g3.n.g(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j7);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        int x02 = C().x0(string);
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        if (x02 != 0) {
            C1154I b7 = b();
            b7.f13807v.c(c1175g0.f14036C.g(string), "Invalid conditional user property name");
        } else if (C().H(obj, string) != 0) {
            C1154I b8 = b();
            b8.f13807v.b(c1175g0.f14036C.g(string), obj, "Invalid conditional user property value");
        } else {
            Object D02 = C().D0(obj, string);
            if (D02 == null) {
                C1154I b9 = b();
                b9.f13807v.b(c1175g0.f14036C.g(string), obj, "Unable to normalize conditional user property value");
                return;
            }
            AbstractC1204v0.e(bundle2, D02);
            long j8 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j8 > 15552000000L || j8 < 1)) {
                C1154I b10 = b();
                b10.f13807v.b(c1175g0.f14036C.g(string), Long.valueOf(j8), "Invalid conditional user property timeout");
                return;
            }
            long j9 = bundle2.getLong("time_to_live");
            if (j9 <= 15552000000L && j9 >= 1) {
                d().M(new B0(this, bundle2, 2));
                return;
            }
            C1154I b11 = b();
            b11.f13807v.b(c1175g0.f14036C.g(string), Long.valueOf(j9), "Invalid conditional user property time to live");
        }
    }

    public final void h0(String str) {
        this.f14412w.set(str);
    }

    public final void i0(String str, String str2, Bundle bundle) {
        D();
        ((C1175g0) this.f2765q).f14037D.getClass();
        K(System.currentTimeMillis(), bundle, str, str2);
    }
}
