package com.google.android.gms.measurement.internal;

import R3.a;
import X2.RunnableC0120b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.fragment.app.D;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.C0405c0;
import com.google.android.gms.internal.measurement.InterfaceC0395a0;
import com.google.android.gms.internal.measurement.U;
import com.google.android.gms.internal.measurement.W;
import com.google.android.gms.internal.measurement.Z;
import com.google.android.gms.internal.measurement.j4;
import g3.n;
import j.d;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import l3.BinderC0971b;
import l3.InterfaceC0970a;
import l6.b;
import o.C1052e;
import o.j;
import s3.A0;
import s3.AbstractC1203v;
import s3.AbstractC1204v0;
import s3.B0;
import s3.C0;
import s3.C1154I;
import s3.C1161a;
import s3.C1169d0;
import s3.C1170e;
import s3.C1175g0;
import s3.C1201u;
import s3.C1212z0;
import s3.F0;
import s3.I0;
import s3.InterfaceC1206w0;
import s3.N0;
import s3.O0;
import s3.RunnableC1162a0;
import s3.RunnableC1189n0;
import s3.r;
import s3.x1;
@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends U {
    public C1175g0 d;

    /* renamed from: e  reason: collision with root package name */
    public final C1052e f8730e;

    /* JADX WARN: Type inference failed for: r0v2, types: [o.e, o.j] */
    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.d = null;
        this.f8730e = new j(0);
    }

    public final void A(String str, W w7) {
        z();
        x1 x1Var = this.d.f14035B;
        C1175g0.h(x1Var);
        x1Var.d0(str, w7);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void beginAdUnitExposure(String str, long j7) {
        z();
        this.d.m().I(j7, str);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        c1212z0.P(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void clearMeasurementEnabled(long j7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        c1212z0.H();
        c1212z0.d().M(new a(c1212z0, null, 19, false));
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void endAdUnitExposure(String str, long j7) {
        z();
        this.d.m().M(j7, str);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void generateEventId(W w7) {
        z();
        x1 x1Var = this.d.f14035B;
        C1175g0.h(x1Var);
        long P02 = x1Var.P0();
        z();
        x1 x1Var2 = this.d.f14035B;
        C1175g0.h(x1Var2);
        x1Var2.Y(w7, P02);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void getAppInstanceId(W w7) {
        z();
        C1169d0 c1169d0 = this.d.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.M(new RunnableC1162a0(this, w7, 0));
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void getCachedAppInstanceId(W w7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        A((String) c1212z0.f14412w.get(), w7);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void getConditionalUserProperties(String str, String str2, W w7) {
        z();
        C1169d0 c1169d0 = this.d.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.M(new d(this, w7, str, str2, 3));
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void getCurrentScreenClass(W w7) {
        String str;
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        N0 n02 = ((C1175g0) c1212z0.f2765q).f14038E;
        C1175g0.g(n02);
        O0 o02 = n02.f13838s;
        if (o02 != null) {
            str = o02.f13848b;
        } else {
            str = null;
        }
        A(str, w7);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void getCurrentScreenName(W w7) {
        String str;
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        N0 n02 = ((C1175g0) c1212z0.f2765q).f14038E;
        C1175g0.g(n02);
        O0 o02 = n02.f13838s;
        if (o02 != null) {
            str = o02.f13847a;
        } else {
            str = null;
        }
        A(str, w7);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void getGmpAppId(W w7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        C1175g0 c1175g0 = (C1175g0) c1212z0.f2765q;
        String str = c1175g0.f14057r;
        if (str == null) {
            str = null;
            try {
                Context context = c1175g0.f14056q;
                String str2 = c1175g0.f14041I;
                n.g(context);
                Resources resources = context.getResources();
                if (TextUtils.isEmpty(str2)) {
                    str2 = AbstractC1204v0.b(context);
                }
                int identifier = resources.getIdentifier("google_app_id", "string", str2);
                if (identifier != 0) {
                    try {
                        str = resources.getString(identifier);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            } catch (IllegalStateException e3) {
                C1154I c1154i = c1175g0.f14064y;
                C1175g0.i(c1154i);
                c1154i.f13807v.c(e3, "getGoogleAppId failed with exception");
            }
        }
        A(str, w7);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void getMaxUserProperties(String str, W w7) {
        z();
        C1175g0.g(this.d.F);
        n.c(str);
        z();
        x1 x1Var = this.d.f14035B;
        C1175g0.h(x1Var);
        x1Var.X(w7, 25);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void getSessionId(W w7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        c1212z0.d().M(new a(c1212z0, w7, 18, false));
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void getTestFlag(W w7, int i7) {
        z();
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 == 4) {
                            x1 x1Var = this.d.f14035B;
                            C1175g0.h(x1Var);
                            C1212z0 c1212z0 = this.d.F;
                            C1175g0.g(c1212z0);
                            AtomicReference atomicReference = new AtomicReference();
                            x1Var.b0(w7, ((Boolean) c1212z0.d().H(atomicReference, 15000L, "boolean test flag value", new A0(c1212z0, atomicReference, 1))).booleanValue());
                            return;
                        }
                        return;
                    }
                    x1 x1Var2 = this.d.f14035B;
                    C1175g0.h(x1Var2);
                    C1212z0 c1212z02 = this.d.F;
                    C1175g0.g(c1212z02);
                    AtomicReference atomicReference2 = new AtomicReference();
                    x1Var2.X(w7, ((Integer) c1212z02.d().H(atomicReference2, 15000L, "int test flag value", new A0(c1212z02, atomicReference2, 3))).intValue());
                    return;
                }
                x1 x1Var3 = this.d.f14035B;
                C1175g0.h(x1Var3);
                C1212z0 c1212z03 = this.d.F;
                C1175g0.g(c1212z03);
                AtomicReference atomicReference3 = new AtomicReference();
                double doubleValue = ((Double) c1212z03.d().H(atomicReference3, 15000L, "double test flag value", new A0(c1212z03, atomicReference3, 5))).doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", doubleValue);
                try {
                    w7.d(bundle);
                    return;
                } catch (RemoteException e3) {
                    C1154I c1154i = ((C1175g0) x1Var3.f2765q).f14064y;
                    C1175g0.i(c1154i);
                    c1154i.f13810y.c(e3, "Error returning double value to wrapper");
                    return;
                }
            }
            x1 x1Var4 = this.d.f14035B;
            C1175g0.h(x1Var4);
            C1212z0 c1212z04 = this.d.F;
            C1175g0.g(c1212z04);
            AtomicReference atomicReference4 = new AtomicReference();
            x1Var4.Y(w7, ((Long) c1212z04.d().H(atomicReference4, 15000L, "long test flag value", new A0(c1212z04, atomicReference4, 4))).longValue());
            return;
        }
        x1 x1Var5 = this.d.f14035B;
        C1175g0.h(x1Var5);
        C1212z0 c1212z05 = this.d.F;
        C1175g0.g(c1212z05);
        AtomicReference atomicReference5 = new AtomicReference();
        x1Var5.d0((String) c1212z05.d().H(atomicReference5, 15000L, "String test flag value", new A0(c1212z05, atomicReference5, 2)), w7);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void getUserProperties(String str, String str2, boolean z7, W w7) {
        z();
        C1169d0 c1169d0 = this.d.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.M(new RunnableC1189n0(this, w7, str, str2, z7, 0));
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void initForTests(Map map) {
        z();
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void initialize(InterfaceC0970a interfaceC0970a, C0405c0 c0405c0, long j7) {
        C1175g0 c1175g0 = this.d;
        if (c1175g0 == null) {
            Context context = (Context) BinderC0971b.A(interfaceC0970a);
            n.g(context);
            this.d = C1175g0.e(context, c0405c0, Long.valueOf(j7));
            return;
        }
        C1154I c1154i = c1175g0.f14064y;
        C1175g0.i(c1154i);
        c1154i.f13810y.d("Attempting to initialize multiple times");
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void isDataCollectionEnabled(W w7) {
        z();
        C1169d0 c1169d0 = this.d.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.M(new RunnableC1162a0(this, w7, 1));
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        c1212z0.Q(str, str2, bundle, z7, z8, j7);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void logEventAndBundle(String str, String str2, Bundle bundle, W w7, long j7) {
        Bundle bundle2;
        z();
        n.c(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        C1201u c1201u = new C1201u(str2, new r(bundle), "app", j7);
        C1169d0 c1169d0 = this.d.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.M(new d(this, w7, c1201u, str, 1));
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void logHealthData(int i7, String str, InterfaceC0970a interfaceC0970a, InterfaceC0970a interfaceC0970a2, InterfaceC0970a interfaceC0970a3) {
        Object A6;
        Object A7;
        z();
        Object obj = null;
        if (interfaceC0970a == null) {
            A6 = null;
        } else {
            A6 = BinderC0971b.A(interfaceC0970a);
        }
        if (interfaceC0970a2 == null) {
            A7 = null;
        } else {
            A7 = BinderC0971b.A(interfaceC0970a2);
        }
        if (interfaceC0970a3 != null) {
            obj = BinderC0971b.A(interfaceC0970a3);
        }
        Object obj2 = obj;
        C1154I c1154i = this.d.f14064y;
        C1175g0.i(c1154i);
        c1154i.K(i7, true, false, str, A6, A7, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void onActivityCreated(InterfaceC0970a interfaceC0970a, Bundle bundle, long j7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        I0 i02 = c1212z0.f14408s;
        if (i02 != null) {
            C1212z0 c1212z02 = this.d.F;
            C1175g0.g(c1212z02);
            c1212z02.b0();
            i02.onActivityCreated((Activity) BinderC0971b.A(interfaceC0970a), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void onActivityDestroyed(InterfaceC0970a interfaceC0970a, long j7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        I0 i02 = c1212z0.f14408s;
        if (i02 != null) {
            C1212z0 c1212z02 = this.d.F;
            C1175g0.g(c1212z02);
            c1212z02.b0();
            i02.onActivityDestroyed((Activity) BinderC0971b.A(interfaceC0970a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void onActivityPaused(InterfaceC0970a interfaceC0970a, long j7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        I0 i02 = c1212z0.f14408s;
        if (i02 != null) {
            C1212z0 c1212z02 = this.d.F;
            C1175g0.g(c1212z02);
            c1212z02.b0();
            i02.onActivityPaused((Activity) BinderC0971b.A(interfaceC0970a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void onActivityResumed(InterfaceC0970a interfaceC0970a, long j7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        I0 i02 = c1212z0.f14408s;
        if (i02 != null) {
            C1212z0 c1212z02 = this.d.F;
            C1175g0.g(c1212z02);
            c1212z02.b0();
            i02.onActivityResumed((Activity) BinderC0971b.A(interfaceC0970a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void onActivitySaveInstanceState(InterfaceC0970a interfaceC0970a, W w7, long j7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        I0 i02 = c1212z0.f14408s;
        Bundle bundle = new Bundle();
        if (i02 != null) {
            C1212z0 c1212z02 = this.d.F;
            C1175g0.g(c1212z02);
            c1212z02.b0();
            i02.onActivitySaveInstanceState((Activity) BinderC0971b.A(interfaceC0970a), bundle);
        }
        try {
            w7.d(bundle);
        } catch (RemoteException e3) {
            C1154I c1154i = this.d.f14064y;
            C1175g0.i(c1154i);
            c1154i.f13810y.c(e3, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void onActivityStarted(InterfaceC0970a interfaceC0970a, long j7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        if (c1212z0.f14408s != null) {
            C1212z0 c1212z02 = this.d.F;
            C1175g0.g(c1212z02);
            c1212z02.b0();
            Activity activity = (Activity) BinderC0971b.A(interfaceC0970a);
        }
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void onActivityStopped(InterfaceC0970a interfaceC0970a, long j7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        if (c1212z0.f14408s != null) {
            C1212z0 c1212z02 = this.d.F;
            C1175g0.g(c1212z02);
            c1212z02.b0();
            Activity activity = (Activity) BinderC0971b.A(interfaceC0970a);
        }
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void performAction(Bundle bundle, W w7, long j7) {
        z();
        w7.d(null);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void registerOnMeasurementEventListener(Z z7) {
        Object obj;
        z();
        synchronized (this.f8730e) {
            try {
                obj = (InterfaceC1206w0) this.f8730e.get(Integer.valueOf(z7.a()));
                if (obj == null) {
                    obj = new C1161a(this, z7);
                    this.f8730e.put(Integer.valueOf(z7.a()), obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        c1212z0.H();
        if (!c1212z0.f14410u.add(obj)) {
            c1212z0.b().f13810y.d("OnEventListener already registered");
        }
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void resetAnalyticsData(long j7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        c1212z0.h0(null);
        c1212z0.d().M(new F0(c1212z0, j7, 1));
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void setConditionalUserProperty(Bundle bundle, long j7) {
        z();
        if (bundle == null) {
            C1154I c1154i = this.d.f14064y;
            C1175g0.i(c1154i);
            c1154i.f13807v.d("Conditional user property must not be null");
            return;
        }
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        c1212z0.g0(bundle, j7);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void setConsent(Bundle bundle, long j7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        C1169d0 d = c1212z0.d();
        C0 c02 = new C0();
        c02.f13760s = c1212z0;
        c02.f13761t = bundle;
        c02.f13759r = j7;
        d.N(c02);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void setConsentThirdParty(Bundle bundle, long j7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        c1212z0.M(bundle, -20, j7);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void setCurrentScreen(InterfaceC0970a interfaceC0970a, String str, String str2, long j7) {
        String str3;
        b bVar;
        Integer valueOf;
        String str4;
        b bVar2;
        String str5;
        z();
        N0 n02 = this.d.f14038E;
        C1175g0.g(n02);
        Activity activity = (Activity) BinderC0971b.A(interfaceC0970a);
        if (!((C1175g0) n02.f2765q).f14062w.R()) {
            bVar2 = n02.b().f13800A;
            str5 = "setCurrentScreen cannot be called while screen reporting is disabled.";
        } else {
            O0 o02 = n02.f13838s;
            if (o02 == null) {
                bVar2 = n02.b().f13800A;
                str5 = "setCurrentScreen cannot be called while no activity active";
            } else if (n02.f13841v.get(activity) == null) {
                bVar2 = n02.b().f13800A;
                str5 = "setCurrentScreen must be called with an activity in the activity lifecycle";
            } else {
                if (str2 == null) {
                    str2 = n02.K(activity.getClass());
                }
                boolean equals = Objects.equals(o02.f13848b, str2);
                boolean equals2 = Objects.equals(o02.f13847a, str);
                if (equals && equals2) {
                    bVar2 = n02.b().f13800A;
                    str5 = "setCurrentScreen cannot be called with the same class and name";
                } else {
                    if (str != null && (str.length() <= 0 || str.length() > ((C1175g0) n02.f2765q).f14062w.F(null, false))) {
                        bVar = n02.b().f13800A;
                        valueOf = Integer.valueOf(str.length());
                        str4 = "Invalid screen name length in setCurrentScreen. Length";
                    } else if (str2 != null && (str2.length() <= 0 || str2.length() > ((C1175g0) n02.f2765q).f14062w.F(null, false))) {
                        bVar = n02.b().f13800A;
                        valueOf = Integer.valueOf(str2.length());
                        str4 = "Invalid class name length in setCurrentScreen. Length";
                    } else {
                        b bVar3 = n02.b().f13803D;
                        if (str == null) {
                            str3 = "null";
                        } else {
                            str3 = str;
                        }
                        bVar3.b(str3, str2, "Setting current screen to name, class");
                        O0 o03 = new O0(n02.C().P0(), str, str2);
                        n02.f13841v.put(activity, o03);
                        n02.N(activity, o03, true);
                        return;
                    }
                    bVar.c(valueOf, str4);
                    return;
                }
            }
        }
        bVar2.d(str5);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void setDataCollectionEnabled(boolean z7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        c1212z0.H();
        c1212z0.d().M(new RunnableC0120b(c1212z0, z7, 3));
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        C1169d0 d = c1212z0.d();
        B0 b02 = new B0();
        b02.f13753s = c1212z0;
        b02.f13752r = bundle2;
        d.M(b02);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void setEventInterceptor(Z z7) {
        boolean z8;
        z();
        D d = new D(this, 26, z7);
        C1169d0 c1169d0 = this.d.f14065z;
        C1175g0.i(c1169d0);
        if (c1169d0.O()) {
            C1212z0 c1212z0 = this.d.F;
            C1175g0.g(c1212z0);
            c1212z0.D();
            c1212z0.H();
            D d7 = c1212z0.f14409t;
            if (d != d7) {
                if (d7 == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                n.i("EventInterceptor already set.", z8);
            }
            c1212z0.f14409t = d;
            return;
        }
        C1169d0 c1169d02 = this.d.f14065z;
        C1175g0.i(c1169d02);
        c1169d02.M(new a(this, d, 21, false));
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void setInstanceIdProvider(InterfaceC0395a0 interfaceC0395a0) {
        z();
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void setMeasurementEnabled(boolean z7, long j7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        Boolean valueOf = Boolean.valueOf(z7);
        c1212z0.H();
        c1212z0.d().M(new a(c1212z0, valueOf, 19, false));
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void setMinimumSessionDuration(long j7) {
        z();
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void setSessionTimeoutDuration(long j7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        c1212z0.d().M(new F0(c1212z0, j7, 0));
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void setSgtmDebugInfo(Intent intent) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        j4.a();
        C1175g0 c1175g0 = (C1175g0) c1212z0.f2765q;
        if (c1175g0.f14062w.O(null, AbstractC1203v.f14351v0)) {
            Uri data = intent.getData();
            if (data == null) {
                c1212z0.b().f13801B.d("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            C1170e c1170e = c1175g0.f14062w;
            if (queryParameter != null && queryParameter.equals("1")) {
                String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    c1212z0.b().f13801B.c(queryParameter2, "Preview Mode was enabled. Using the sgtmPreviewKey: ");
                    c1170e.f14004s = queryParameter2;
                    return;
                }
                return;
            }
            c1212z0.b().f13801B.d("Preview Mode was not enabled.");
            c1170e.f14004s = null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void setUserId(String str, long j7) {
        z();
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        if (str != null && TextUtils.isEmpty(str)) {
            C1154I c1154i = ((C1175g0) c1212z0.f2765q).f14064y;
            C1175g0.i(c1154i);
            c1154i.f13810y.d("User ID must be non-empty or null");
            return;
        }
        C1169d0 d = c1212z0.d();
        a aVar = new a(17);
        aVar.f2919r = c1212z0;
        aVar.f2920s = str;
        d.M(aVar);
        c1212z0.R(null, "_id", str, true, j7);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void setUserProperty(String str, String str2, InterfaceC0970a interfaceC0970a, boolean z7, long j7) {
        z();
        Object A6 = BinderC0971b.A(interfaceC0970a);
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        c1212z0.R(str, str2, A6, z7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public void unregisterOnMeasurementEventListener(Z z7) {
        Object obj;
        z();
        synchronized (this.f8730e) {
            obj = (InterfaceC1206w0) this.f8730e.remove(Integer.valueOf(z7.a()));
        }
        if (obj == null) {
            obj = new C1161a(this, z7);
        }
        C1212z0 c1212z0 = this.d.F;
        C1175g0.g(c1212z0);
        c1212z0.H();
        if (!c1212z0.f14410u.remove(obj)) {
            c1212z0.b().f13810y.d("OnEventListener had not been registered");
        }
    }

    public final void z() {
        if (this.d == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }
}
