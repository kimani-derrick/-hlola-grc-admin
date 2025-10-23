package s3;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import b1.CallableC0357d;
import j3.AbstractC0838b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: s3.j0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1181j0 extends com.google.android.gms.internal.measurement.I implements InterfaceC1149D {
    public final q1 d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f14095e;
    public String f;

    public BinderC1181j0(q1 q1Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        g3.n.g(q1Var);
        this.d = q1Var;
        this.f = null;
    }

    public final void A(String str, boolean z7) {
        boolean z8;
        boolean isEmpty = TextUtils.isEmpty(str);
        q1 q1Var = this.d;
        if (!isEmpty) {
            if (z7) {
                try {
                    if (this.f14095e == null) {
                        if (!"com.google.android.gms".equals(this.f) && !AbstractC0838b.d(q1Var.f14185B.f14056q, Binder.getCallingUid()) && !d3.g.a(q1Var.f14185B.f14056q).b(Binder.getCallingUid())) {
                            z8 = false;
                            this.f14095e = Boolean.valueOf(z8);
                        }
                        z8 = true;
                        this.f14095e = Boolean.valueOf(z8);
                    }
                    if (this.f14095e.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e3) {
                    C1154I b7 = q1Var.b();
                    b7.f13807v.c(C1154I.J(str), "Measurement Service called with invalid calling package. appId");
                    throw e3;
                }
            }
            if (this.f == null) {
                Context context = q1Var.f14185B.f14056q;
                int callingUid = Binder.getCallingUid();
                boolean z9 = d3.f.f9228a;
                if (AbstractC0838b.e(callingUid, context, str)) {
                    this.f = str;
                }
            }
            if (str.equals(this.f)) {
                return;
            }
            throw new SecurityException("Unknown calling package name '" + str + "'.");
        }
        q1Var.b().f13807v.d("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public final void B(C1201u c1201u, String str, String str2) {
        g3.n.g(c1201u);
        g3.n.c(str);
        A(str, true);
        C(new A4.e(this, c1201u, str, 5));
    }

    public final void C(Runnable runnable) {
        q1 q1Var = this.d;
        if (q1Var.d().O()) {
            runnable.run();
        } else {
            q1Var.d().M(runnable);
        }
    }

    public final void D(m1 m1Var) {
        g3.n.g(m1Var);
        String str = m1Var.f14143q;
        g3.n.c(str);
        A(str, false);
        this.d.Z().o0(m1Var.f14144r, m1Var.f14127G);
    }

    public final void E(C1201u c1201u, m1 m1Var) {
        q1 q1Var = this.d;
        q1Var.a0();
        q1Var.y(c1201u, m1Var);
    }

    @Override // s3.InterfaceC1149D
    public final List b(Bundle bundle, m1 m1Var) {
        D(m1Var);
        String str = m1Var.f14143q;
        g3.n.g(str);
        q1 q1Var = this.d;
        try {
            return (List) q1Var.d().I(new CallableC1191o0(this, m1Var, bundle)).get();
        } catch (InterruptedException | ExecutionException e3) {
            C1154I b7 = q1Var.b();
            b7.f13807v.b(C1154I.J(str), e3, "Failed to get trigger URIs. appId");
            return Collections.emptyList();
        }
    }

    @Override // s3.InterfaceC1149D
    public final void e(m1 m1Var) {
        D(m1Var);
        C(new RunnableC1183k0(this, m1Var, 2));
    }

    @Override // s3.InterfaceC1149D
    public final byte[] f(C1201u c1201u, String str) {
        g3.n.c(str);
        g3.n.g(c1201u);
        A(str, true);
        q1 q1Var = this.d;
        C1154I b7 = q1Var.b();
        C1175g0 c1175g0 = q1Var.f14185B;
        C1153H c1153h = c1175g0.f14036C;
        String str2 = c1201u.f14244q;
        b7.f13802C.c(c1153h.b(str2), "Log and bundle. event");
        q1Var.f().getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) q1Var.d().L(new CallableC1165b0(this, c1201u, str)).get();
            if (bArr == null) {
                q1Var.b().f13807v.c(C1154I.J(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            q1Var.f().getClass();
            q1Var.b().f13802C.e("Log and bundle processed. event, size, time_ms", c1175g0.f14036C.b(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e3) {
            e = e3;
            C1154I b8 = q1Var.b();
            b8.f13807v.e("Failed to log and bundle. appId, event, error", C1154I.J(str), c1175g0.f14036C.b(str2), e);
            return null;
        } catch (ExecutionException e7) {
            e = e7;
            C1154I b82 = q1Var.b();
            b82.f13807v.e("Failed to log and bundle. appId, event, error", C1154I.J(str), c1175g0.f14036C.b(str2), e);
            return null;
        }
    }

    @Override // s3.InterfaceC1149D
    public final void g(m1 m1Var) {
        g3.n.c(m1Var.f14143q);
        g3.n.g(m1Var.f14132L);
        z(new RunnableC1183k0(this, m1Var, 4));
    }

    @Override // s3.InterfaceC1149D
    public final void h(m1 m1Var) {
        D(m1Var);
        C(new RunnableC1183k0(this, m1Var, 3));
    }

    @Override // s3.InterfaceC1149D
    public final C1176h i(m1 m1Var) {
        D(m1Var);
        String str = m1Var.f14143q;
        g3.n.c(str);
        q1 q1Var = this.d;
        try {
            return (C1176h) q1Var.d().L(new CallableC0357d(this, 2, m1Var)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            C1154I b7 = q1Var.b();
            b7.f13807v.b(C1154I.J(str), e3, "Failed to get consent. appId");
            return new C1176h(null);
        }
    }

    @Override // s3.InterfaceC1149D
    public final void j(C1201u c1201u, m1 m1Var) {
        g3.n.g(c1201u);
        D(m1Var);
        C(new A4.e(this, c1201u, m1Var, 4));
    }

    @Override // s3.InterfaceC1149D
    public final void k(u1 u1Var, m1 m1Var) {
        g3.n.g(u1Var);
        D(m1Var);
        C(new A4.e(this, u1Var, m1Var, 6));
    }

    @Override // s3.InterfaceC1149D
    public final List m(String str, String str2, boolean z7, m1 m1Var) {
        D(m1Var);
        String str3 = m1Var.f14143q;
        g3.n.g(str3);
        q1 q1Var = this.d;
        try {
            List<v1> list = (List) q1Var.d().I(new CallableC1187m0(this, str3, str, str2, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (v1 v1Var : list) {
                if (!z7 && x1.K0(v1Var.f14370c)) {
                }
                arrayList.add(new u1(v1Var));
            }
            return arrayList;
        } catch (InterruptedException e3) {
            e = e3;
            C1154I b7 = q1Var.b();
            b7.f13807v.b(C1154I.J(str3), e, "Failed to query user properties. appId");
            return Collections.emptyList();
        } catch (ExecutionException e7) {
            e = e7;
            C1154I b72 = q1Var.b();
            b72.f13807v.b(C1154I.J(str3), e, "Failed to query user properties. appId");
            return Collections.emptyList();
        }
    }

    @Override // s3.InterfaceC1149D
    public final void n(m1 m1Var) {
        g3.n.c(m1Var.f14143q);
        g3.n.g(m1Var.f14132L);
        RunnableC1183k0 runnableC1183k0 = new RunnableC1183k0(1);
        runnableC1183k0.f14102r = this;
        runnableC1183k0.f14103s = m1Var;
        z(runnableC1183k0);
    }

    @Override // s3.InterfaceC1149D
    public final void o(m1 m1Var) {
        g3.n.c(m1Var.f14143q);
        g3.n.g(m1Var.f14132L);
        RunnableC1183k0 runnableC1183k0 = new RunnableC1183k0(0);
        runnableC1183k0.f14102r = this;
        runnableC1183k0.f14103s = m1Var;
        z(runnableC1183k0);
    }

    @Override // s3.InterfaceC1149D
    public final void p(long j7, String str, String str2, String str3) {
        C(new RunnableC1185l0(this, str2, str3, str, j7, 0));
    }

    @Override // s3.InterfaceC1149D
    public final List q(String str, String str2, String str3, boolean z7) {
        A(str, true);
        q1 q1Var = this.d;
        try {
            List<v1> list = (List) q1Var.d().I(new CallableC1187m0(this, str, str2, str3, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (v1 v1Var : list) {
                if (!z7 && x1.K0(v1Var.f14370c)) {
                }
                arrayList.add(new u1(v1Var));
            }
            return arrayList;
        } catch (InterruptedException e3) {
            e = e3;
            C1154I b7 = q1Var.b();
            b7.f13807v.b(C1154I.J(str), e, "Failed to get user properties as. appId");
            return Collections.emptyList();
        } catch (ExecutionException e7) {
            e = e7;
            C1154I b72 = q1Var.b();
            b72.f13807v.b(C1154I.J(str), e, "Failed to get user properties as. appId");
            return Collections.emptyList();
        }
    }

    @Override // s3.InterfaceC1149D
    public final List s(String str, String str2, String str3) {
        A(str, true);
        q1 q1Var = this.d;
        try {
            return (List) q1Var.d().I(new CallableC1187m0(this, str, str2, str3, 2)).get();
        } catch (InterruptedException | ExecutionException e3) {
            q1Var.b().f13807v.c(e3, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    @Override // s3.InterfaceC1149D
    public final void t(m1 m1Var) {
        g3.n.c(m1Var.f14143q);
        A(m1Var.f14143q, false);
        C(new RunnableC1183k0(this, m1Var, 5));
    }

    @Override // s3.InterfaceC1149D
    public final void u(C1168d c1168d, m1 m1Var) {
        g3.n.g(c1168d);
        g3.n.g(c1168d.f13986s);
        D(m1Var);
        C1168d c1168d2 = new C1168d(c1168d);
        c1168d2.f13984q = m1Var.f14143q;
        C(new A4.e(this, c1168d2, m1Var, 3));
    }

    @Override // s3.InterfaceC1149D
    public final String v(m1 m1Var) {
        D(m1Var);
        q1 q1Var = this.d;
        try {
            return (String) q1Var.d().I(new CallableC0357d(q1Var, 4, m1Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            C1154I b7 = q1Var.b();
            b7.f13807v.b(C1154I.J(m1Var.f14143q), e3, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // s3.InterfaceC1149D
    public final List w(String str, String str2, m1 m1Var) {
        D(m1Var);
        String str3 = m1Var.f14143q;
        g3.n.g(str3);
        q1 q1Var = this.d;
        try {
            return (List) q1Var.d().I(new CallableC1187m0(this, str3, str, str2, 3)).get();
        } catch (InterruptedException | ExecutionException e3) {
            q1Var.b().f13807v.c(e3, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.internal.measurement.I
    public final boolean y(int i7, Parcel parcel, Parcel parcel2) {
        ArrayList arrayList;
        List m7;
        boolean z7 = false;
        switch (i7) {
            case 1:
                com.google.android.gms.internal.measurement.H.d(parcel);
                j((C1201u) com.google.android.gms.internal.measurement.H.a(parcel, C1201u.CREATOR), (m1) com.google.android.gms.internal.measurement.H.a(parcel, m1.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                com.google.android.gms.internal.measurement.H.d(parcel);
                k((u1) com.google.android.gms.internal.measurement.H.a(parcel, u1.CREATOR), (m1) com.google.android.gms.internal.measurement.H.a(parcel, m1.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                com.google.android.gms.internal.measurement.H.d(parcel);
                h((m1) com.google.android.gms.internal.measurement.H.a(parcel, m1.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                com.google.android.gms.internal.measurement.H.d(parcel);
                B((C1201u) com.google.android.gms.internal.measurement.H.a(parcel, C1201u.CREATOR), readString, readString2);
                parcel2.writeNoException();
                break;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.android.gms.internal.measurement.H.d(parcel);
                e((m1) com.google.android.gms.internal.measurement.H.a(parcel, m1.CREATOR));
                parcel2.writeNoException();
                break;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                m1 m1Var = (m1) com.google.android.gms.internal.measurement.H.a(parcel, m1.CREATOR);
                if (parcel.readInt() != 0) {
                    z7 = true;
                }
                com.google.android.gms.internal.measurement.H.d(parcel);
                D(m1Var);
                String str = m1Var.f14143q;
                g3.n.g(str);
                q1 q1Var = this.d;
                try {
                    List<v1> list = (List) q1Var.d().I(new CallableC0357d(this, 3, str)).get();
                    arrayList = new ArrayList(list.size());
                    for (v1 v1Var : list) {
                        if (!z7 && x1.K0(v1Var.f14370c)) {
                        }
                        arrayList.add(new u1(v1Var));
                    }
                } catch (InterruptedException e3) {
                    e = e3;
                    q1Var.b().f13807v.b(C1154I.J(str), e, "Failed to get user properties. appId");
                    arrayList = null;
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e7) {
                    e = e7;
                    q1Var.b().f13807v.b(C1154I.J(str), e, "Failed to get user properties. appId");
                    arrayList = null;
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                break;
            case 9:
                String readString3 = parcel.readString();
                com.google.android.gms.internal.measurement.H.d(parcel);
                byte[] f = f((C1201u) com.google.android.gms.internal.measurement.H.a(parcel, C1201u.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(f);
                break;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                com.google.android.gms.internal.measurement.H.d(parcel);
                p(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                break;
            case 11:
                com.google.android.gms.internal.measurement.H.d(parcel);
                String v5 = v((m1) com.google.android.gms.internal.measurement.H.a(parcel, m1.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(v5);
                break;
            case 12:
                com.google.android.gms.internal.measurement.H.d(parcel);
                u((C1168d) com.google.android.gms.internal.measurement.H.a(parcel, C1168d.CREATOR), (m1) com.google.android.gms.internal.measurement.H.a(parcel, m1.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                C1168d c1168d = (C1168d) com.google.android.gms.internal.measurement.H.a(parcel, C1168d.CREATOR);
                com.google.android.gms.internal.measurement.H.d(parcel);
                g3.n.g(c1168d);
                g3.n.g(c1168d.f13986s);
                g3.n.c(c1168d.f13984q);
                A(c1168d.f13984q, true);
                C(new R3.a(this, new C1168d(c1168d), 15, false));
                parcel2.writeNoException();
                break;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                ClassLoader classLoader = com.google.android.gms.internal.measurement.H.f8350a;
                if (parcel.readInt() != 0) {
                    z7 = true;
                }
                com.google.android.gms.internal.measurement.H.d(parcel);
                m7 = m(readString7, readString8, z7, (m1) com.google.android.gms.internal.measurement.H.a(parcel, m1.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(m7);
                break;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                ClassLoader classLoader2 = com.google.android.gms.internal.measurement.H.f8350a;
                if (parcel.readInt() != 0) {
                    z7 = true;
                }
                com.google.android.gms.internal.measurement.H.d(parcel);
                m7 = q(readString9, readString10, readString11, z7);
                parcel2.writeNoException();
                parcel2.writeTypedList(m7);
                break;
            case 16:
                com.google.android.gms.internal.measurement.H.d(parcel);
                m7 = w(parcel.readString(), parcel.readString(), (m1) com.google.android.gms.internal.measurement.H.a(parcel, m1.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(m7);
                break;
            case 17:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                com.google.android.gms.internal.measurement.H.d(parcel);
                m7 = s(readString12, readString13, readString14);
                parcel2.writeNoException();
                parcel2.writeTypedList(m7);
                break;
            case 18:
                com.google.android.gms.internal.measurement.H.d(parcel);
                t((m1) com.google.android.gms.internal.measurement.H.a(parcel, m1.CREATOR));
                parcel2.writeNoException();
                break;
            case 19:
                com.google.android.gms.internal.measurement.H.d(parcel);
                mo1b((Bundle) com.google.android.gms.internal.measurement.H.a(parcel, Bundle.CREATOR), (m1) com.google.android.gms.internal.measurement.H.a(parcel, m1.CREATOR));
                parcel2.writeNoException();
                break;
            case 20:
                com.google.android.gms.internal.measurement.H.d(parcel);
                g((m1) com.google.android.gms.internal.measurement.H.a(parcel, m1.CREATOR));
                parcel2.writeNoException();
                break;
            case 21:
                com.google.android.gms.internal.measurement.H.d(parcel);
                C1176h i8 = i((m1) com.google.android.gms.internal.measurement.H.a(parcel, m1.CREATOR));
                parcel2.writeNoException();
                if (i8 == null) {
                    parcel2.writeInt(0);
                    break;
                } else {
                    parcel2.writeInt(1);
                    i8.writeToParcel(parcel2, 1);
                    break;
                }
            case 24:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.H.a(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.measurement.H.d(parcel);
                m7 = b(bundle, (m1) com.google.android.gms.internal.measurement.H.a(parcel, m1.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(m7);
                break;
            case 25:
                com.google.android.gms.internal.measurement.H.d(parcel);
                n((m1) com.google.android.gms.internal.measurement.H.a(parcel, m1.CREATOR));
                parcel2.writeNoException();
                break;
            case 26:
                com.google.android.gms.internal.measurement.H.d(parcel);
                o((m1) com.google.android.gms.internal.measurement.H.a(parcel, m1.CREATOR));
                parcel2.writeNoException();
                break;
        }
        return true;
    }

    public final void z(Runnable runnable) {
        q1 q1Var = this.d;
        if (q1Var.d().O()) {
            runnable.run();
        } else {
            q1Var.d().N(runnable);
        }
    }

    @Override // s3.InterfaceC1149D
    /* renamed from: b */
    public final void mo1b(Bundle bundle, m1 m1Var) {
        D(m1Var);
        String str = m1Var.f14143q;
        g3.n.g(str);
        A4.e eVar = new A4.e(2);
        eVar.f105r = this;
        eVar.f106s = str;
        eVar.f107t = bundle;
        C(eVar);
    }
}
