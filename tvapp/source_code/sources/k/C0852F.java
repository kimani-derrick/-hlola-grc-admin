package k;

import K.InterfaceC0041q;
import Z2.AbstractC0156a;
import a3.C0202b;
import android.app.ActivityManager;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.internal.measurement.BinderC0425g0;
import com.google.android.gms.internal.measurement.C0430h0;
import com.google.android.gms.internal.measurement.C0450l0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.EOFException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k2.C0943h;
import k2.C0950o;
import k2.C0957v;
import l4.C0975c;
import l4.InterfaceC0974b;
import org.json.JSONException;
import org.json.JSONObject;
import p.AbstractC1078a;
import q2.C1107c;
import q2.C1108d;
import s3.AbstractC1167c0;
import s3.C1154I;
import s3.C1175g0;
import s3.C1198s0;
import s3.C1212z0;
import s3.EnumC1174g;
import s3.EnumC1196r0;
import s3.EnumC1202u0;
import s3.f1;
import s3.w1;
import s4.InterfaceC1213a;
import t3.C1251o;
import t3.InterfaceC1237a;
import t4.InterfaceC1252a;
import u4.AbstractC1276D;
import u4.C1292p;
import u4.CallableC1289m;
import u4.CallableC1290n;
import w0.AbstractC1348b;
import w0.RunnableC1349c;
import x.C1441d;
import x2.C1461c;
import x6.InterfaceC1480m;
/* renamed from: k.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0852F implements InterfaceC0850E, w1, s4.b, InterfaceC1252a, InterfaceC1213a, InterfaceC1237a, u0.b, w0.F, InterfaceC0041q, L.s, InterfaceC1480m {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f11873q;

    /* renamed from: r  reason: collision with root package name */
    public Object f11874r;

    public C0852F(int i7) {
        this.f11873q = i7;
        switch (i7) {
            case 4:
                this.f11874r = new o.k(0);
                return;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f11874r = new LinkedHashSet();
                return;
            case 12:
                this.f11874r = new EnumMap(EnumC1196r0.class);
                return;
            default:
                this.f11874r = new Z2.y(10);
                return;
        }
    }

    public static String D(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public static C0852F I(String str) {
        EnumC1174g enumC1174g;
        EnumMap enumMap = new EnumMap(EnumC1196r0.class);
        if (str.length() >= EnumC1196r0.values().length && str.charAt(0) == '1') {
            EnumC1196r0[] values = EnumC1196r0.values();
            int length = values.length;
            int i7 = 1;
            int i8 = 0;
            while (i8 < length) {
                EnumC1196r0 enumC1196r0 = values[i8];
                int i9 = i7 + 1;
                char charAt = str.charAt(i7);
                EnumC1174g[] values2 = EnumC1174g.values();
                int length2 = values2.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        enumC1174g = values2[i10];
                        if (enumC1174g.f14032q == charAt) {
                            break;
                        }
                        i10++;
                    } else {
                        enumC1174g = EnumC1174g.UNSET;
                        break;
                    }
                }
                enumMap.put((EnumMap) enumC1196r0, (EnumC1196r0) enumC1174g);
                i8++;
                i7 = i9;
            }
            return new C0852F(enumMap);
        }
        return new C0852F(12);
    }

    public static C0852F O(String str) {
        EnumC1202u0 enumC1202u0;
        if (!TextUtils.isEmpty(str) && str.length() <= 1) {
            enumC1202u0 = C1198s0.f(str.charAt(0));
        } else {
            enumC1202u0 = EnumC1202u0.f14248q;
        }
        return new C0852F(13, enumC1202u0);
    }

    public void A(B4.d dVar, Thread thread, Throwable th) {
        C1292p c1292p = (C1292p) this.f11874r;
        synchronized (c1292p) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    AbstractC1276D.a(c1292p.f15024e.Y(new CallableC1289m(c1292p, System.currentTimeMillis(), th, thread, dVar)));
                } catch (Exception e3) {
                    Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e3);
                }
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            }
        }
    }

    public C1461c B(C0943h c0943h, C2.g gVar) {
        Z2.y yVar = (Z2.y) this.f11874r;
        C1461c c1461c = null;
        int i7 = 0;
        while (true) {
            try {
                c0943h.i(yVar.f4691a, 0, 10, false);
                yVar.F(0);
                if (yVar.w() != 4801587) {
                    break;
                }
                yVar.G(3);
                int t5 = yVar.t();
                int i8 = t5 + 10;
                if (c1461c == null) {
                    byte[] bArr = new byte[i8];
                    System.arraycopy(yVar.f4691a, 0, bArr, 0, 10);
                    c0943h.i(bArr, 10, t5, false);
                    c1461c = new C2.i(gVar).J(i8, bArr);
                } else {
                    c0943h.a(t5, false);
                }
                i7 += i8;
            } catch (EOFException unused) {
            }
        }
        c0943h.f12168v = 0;
        c0943h.a(i7, false);
        return c1461c;
    }

    public void C(m4.c cVar) {
        C0430h0 c0430h0 = (C0430h0) this.f11874r;
        c0430h0.getClass();
        synchronized (c0430h0.f8569e) {
            for (int i7 = 0; i7 < c0430h0.f8569e.size(); i7++) {
                try {
                    if (cVar.equals(((Pair) c0430h0.f8569e.get(i7)).first)) {
                        Log.w(c0430h0.f8566a, "OnEventListener already registered.");
                        return;
                    }
                } finally {
                }
            }
            BinderC0425g0 binderC0425g0 = new BinderC0425g0(cVar);
            c0430h0.f8569e.add(new Pair(cVar, binderC0425g0));
            if (c0430h0.f8571h != null) {
                try {
                    c0430h0.f8571h.registerOnMeasurementEventListener(binderC0425g0);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(c0430h0.f8566a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            c0430h0.e(new C0450l0(c0430h0, binderC0425g0, 1));
        }
    }

    public void E(h5.e eVar) {
        M5.g.f(eVar, "layoutRequest");
        w0.k0 u7 = u(eVar);
        if (u7 == null) {
            eVar.f11029e = -1;
        } else {
            eVar.f11029e = u7.f();
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [q2.c, java.lang.Object] */
    public void F(int i7, long j7, long j8) {
        C1108d c1108d = (C1108d) this.f11874r;
        AbstractC0156a.l(c1108d.f13363b0);
        if (i7 != 160) {
            if (i7 != 174) {
                if (i7 != 187) {
                    if (i7 != 19899) {
                        if (i7 != 20533) {
                            if (i7 != 21968) {
                                if (i7 != 408125543) {
                                    if (i7 != 475249515) {
                                        if (i7 == 524531317 && !c1108d.f13380v) {
                                            if (c1108d.d && c1108d.f13384z != -1) {
                                                c1108d.f13383y = true;
                                                return;
                                            }
                                            c1108d.f13363b0.t(new C0950o(c1108d.f13378t));
                                            c1108d.f13380v = true;
                                            return;
                                        }
                                        return;
                                    }
                                    c1108d.f13338C = new H.j(4);
                                    c1108d.f13339D = new H.j(4);
                                    return;
                                }
                                long j9 = c1108d.f13375q;
                                if (j9 != -1 && j9 != j7) {
                                    throw e2.m0.a("Multiple Segment elements not supported", null);
                                }
                                c1108d.f13375q = j7;
                                c1108d.f13374p = j8;
                                return;
                            }
                            c1108d.c(i7);
                            c1108d.f13379u.f13327x = true;
                            return;
                        }
                        c1108d.c(i7);
                        c1108d.f13379u.f13312h = true;
                        return;
                    }
                    c1108d.f13381w = -1;
                    c1108d.f13382x = -1L;
                    return;
                }
                c1108d.f13340E = false;
                return;
            }
            ?? obj = new Object();
            obj.f13317m = -1;
            obj.n = -1;
            obj.f13318o = -1;
            obj.f13319p = -1;
            obj.f13320q = 0;
            obj.f13321r = -1;
            obj.f13322s = 0.0f;
            obj.f13323t = 0.0f;
            obj.f13324u = 0.0f;
            obj.f13325v = null;
            obj.f13326w = -1;
            obj.f13327x = false;
            obj.f13328y = -1;
            obj.f13329z = -1;
            obj.f13284A = -1;
            obj.f13285B = 1000;
            obj.f13286C = 200;
            obj.f13287D = -1.0f;
            obj.f13288E = -1.0f;
            obj.F = -1.0f;
            obj.f13289G = -1.0f;
            obj.f13290H = -1.0f;
            obj.f13291I = -1.0f;
            obj.f13292J = -1.0f;
            obj.f13293K = -1.0f;
            obj.f13294L = -1.0f;
            obj.f13295M = -1.0f;
            obj.f13297O = 1;
            obj.f13298P = -1;
            obj.f13299Q = 8000;
            obj.f13300R = 0L;
            obj.f13301S = 0L;
            obj.f13304V = true;
            obj.W = "eng";
            c1108d.f13379u = obj;
            return;
        }
        c1108d.f13351Q = false;
        c1108d.f13352R = 0L;
    }

    public void G(String str, int i7) {
        C1108d c1108d = (C1108d) this.f11874r;
        c1108d.getClass();
        if (i7 != 134) {
            if (i7 != 17026) {
                if (i7 != 21358) {
                    if (i7 == 2274716) {
                        c1108d.c(i7);
                        c1108d.f13379u.W = str;
                        return;
                    }
                    return;
                }
                c1108d.c(i7);
                c1108d.f13379u.f13307a = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw e2.m0.a("DocType " + str + " not supported", null);
            } else {
                return;
            }
        }
        c1108d.c(i7);
        c1108d.f13379u.f13308b = str;
    }

    public void H(List list) {
        o.k kVar = (o.k) this.f11874r;
        int i7 = kVar.f12813t;
        Object[] objArr = kVar.f12812s;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        kVar.f12813t = 0;
        kVar.f12810q = false;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                w0.k0 k0Var = (w0.k0) it.next();
                ViewGroup.LayoutParams layoutParams = k0Var.f15576a.getLayoutParams();
                M5.g.d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                if (!((w0.V) layoutParams).f15490a.m()) {
                    kVar.i(k0Var.f(), k0Var);
                }
            }
        }
    }

    public void J() {
        f1 f1Var = (f1) this.f11874r;
        f1Var.D();
        s3.T B6 = f1Var.B();
        C1175g0 c1175g0 = (C1175g0) f1Var.f2765q;
        c1175g0.f14037D.getClass();
        if (B6.J(System.currentTimeMillis())) {
            f1Var.B().f13880C.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                f1Var.b().f13803D.d("Detected application was in foreground");
                c1175g0.f14037D.getClass();
                P(System.currentTimeMillis());
            }
        }
    }

    public void K(int i7, String str, List list, boolean z7, boolean z8) {
        l6.b bVar;
        int i8 = AbstractC1167c0.f13977a[s.h.b(i7)];
        s3.Z z9 = (s3.Z) this.f11874r;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        bVar = z9.b().f13801B;
                    } else {
                        bVar = z9.b().f13803D;
                    }
                } else {
                    C1154I b7 = z9.b();
                    if (z7) {
                        bVar = b7.f13811z;
                    } else if (!z8) {
                        bVar = b7.f13800A;
                    } else {
                        bVar = b7.f13810y;
                    }
                }
            } else {
                C1154I b8 = z9.b();
                if (z7) {
                    bVar = b8.f13808w;
                } else if (!z8) {
                    bVar = b8.f13809x;
                } else {
                    bVar = b8.f13807v;
                }
            }
        } else {
            bVar = z9.b().f13802C;
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    bVar.d(str);
                    return;
                } else {
                    bVar.e(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            bVar.b(list.get(0), list.get(1), str);
            return;
        }
        bVar.c(list.get(0), str);
    }

    public void L(EnumC1196r0 enumC1196r0, int i7) {
        EnumC1174g enumC1174g = EnumC1174g.UNSET;
        if (i7 != -30) {
            if (i7 != -20) {
                if (i7 != -10) {
                    if (i7 != 0) {
                        if (i7 == 30) {
                            enumC1174g = EnumC1174g.INITIALIZATION;
                        }
                    }
                } else {
                    enumC1174g = EnumC1174g.MANIFEST;
                }
            }
            enumC1174g = EnumC1174g.API;
        } else {
            enumC1174g = EnumC1174g.TCF;
        }
        ((EnumMap) this.f11874r).put((EnumMap) enumC1196r0, (EnumC1196r0) enumC1174g);
    }

    public void M(EnumC1196r0 enumC1196r0, EnumC1174g enumC1174g) {
        ((EnumMap) this.f11874r).put((EnumMap) enumC1196r0, (EnumC1196r0) enumC1174g);
    }

    public void N(boolean z7, long j7) {
        f1 f1Var = (f1) this.f11874r;
        f1Var.D();
        f1Var.K();
        if (f1Var.B().J(j7)) {
            f1Var.B().f13880C.a(true);
            ((C1175g0) f1Var.f2765q).o().M();
        }
        f1Var.B().f13883G.g(j7);
        if (f1Var.B().f13880C.b()) {
            P(j7);
        }
    }

    public void P(long j7) {
        f1 f1Var = (f1) this.f11874r;
        f1Var.D();
        C1175g0 c1175g0 = (C1175g0) f1Var.f2765q;
        if (!c1175g0.j()) {
            return;
        }
        f1Var.B().f13883G.g(j7);
        c1175g0.f14037D.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C1154I b7 = f1Var.b();
        b7.f13803D.c(Long.valueOf(elapsedRealtime), "Session started, time");
        long j8 = j7 / 1000;
        f1Var.E().L(j7, Long.valueOf(j8), "auto", "_sid");
        f1Var.B().f13884H.g(j8);
        f1Var.B().f13880C.a(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", j8);
        f1Var.E().K(j7, bundle, "auto", "_s");
        String i7 = f1Var.B().f13889M.i();
        if (!TextUtils.isEmpty(i7)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", i7);
            f1Var.E().K(j7, bundle2, "auto", "_ssr");
        }
    }

    @Override // t4.InterfaceC1252a
    public void a(u4.q qVar) {
        this.f11874r = qVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // L.s
    public boolean b(View view) {
        int width;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f11874r;
        boolean z7 = false;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        Field field = K.O.f1447a;
        if (view.getLayoutDirection() == 1) {
            z7 = true;
        }
        int i7 = swipeDismissBehavior.f8743c;
        if ((i7 == 0 && z7) || (i7 == 1 && !z7)) {
            width = -view.getWidth();
        } else {
            width = view.getWidth();
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // s3.w1
    public void c(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        C1212z0 c1212z0 = (C1212z0) this.f11874r;
        if (isEmpty) {
            ((C1175g0) c1212z0.f2765q).f14037D.getClass();
            c1212z0.Q("auto", "_err", bundle, true, true, System.currentTimeMillis());
            return;
        }
        ((C1175g0) c1212z0.f2765q).getClass();
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Override // t3.InterfaceC1237a
    public Object d(C1251o c1251o) {
        switch (this.f11873q) {
            case 20:
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((Collection) this.f11874r);
                return m3.g.m(arrayList);
            default:
                return ((Callable) this.f11874r).call();
        }
    }

    @Override // K.InterfaceC0041q
    public K.i0 e(View view, K.i0 i0Var) {
        boolean z7;
        boolean z8;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f11874r;
        if (!Objects.equals(coordinatorLayout.f5595D, i0Var)) {
            coordinatorLayout.f5595D = i0Var;
            if (i0Var.a() > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            coordinatorLayout.f5596E = z7;
            if (!z7 && coordinatorLayout.getBackground() == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            coordinatorLayout.setWillNotDraw(z8);
            K.h0 h0Var = i0Var.f1495a;
            if (!h0Var.j()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = coordinatorLayout.getChildAt(i7);
                    Field field = K.O.f1447a;
                    if (childAt.getFitsSystemWindows() && ((C1441d) childAt.getLayoutParams()).f16129a != null && h0Var.j()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return i0Var;
    }

    @Override // u0.b
    public void f() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // u0.b
    public void g(int i7, Object obj) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 != 6 && i7 != 7 && i7 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f11874r).setResultCode(i7);
    }

    @Override // w0.F
    public void h(int i7, int i8) {
        ((w0.L) this.f11874r).f15466a.g(i7, i8);
    }

    @Override // w0.F
    public void i(int i7, int i8) {
        ((w0.L) this.f11874r).f15466a.f(i7, i8);
    }

    @Override // w0.F
    public void j(int i7, int i8) {
        ((w0.L) this.f11874r).f15466a.c(i7, i8);
    }

    @Override // w0.F
    public void m(int i7, int i8, Object obj) {
        ((w0.L) this.f11874r).f15466a.e(i7, i8, obj);
    }

    @Override // s4.InterfaceC1213a
    public void n(Bundle bundle) {
        ((C0975c) ((InterfaceC0974b) this.f11874r)).a("clx", "_ae", bundle);
    }

    @Override // x6.InterfaceC1480m
    public Object o(Object obj) {
        Optional ofNullable;
        ofNullable = Optional.ofNullable(((InterfaceC1480m) this.f11874r).o((h6.I) obj));
        return ofNullable;
    }

    public boolean p(int i7, int i8) {
        RunnableC1349c runnableC1349c = (RunnableC1349c) this.f11874r;
        Object obj = runnableC1349c.f15511q.get(i7);
        Object obj2 = runnableC1349c.f15512r.get(i8);
        if (obj != null && obj2 != null) {
            return ((AbstractC1348b) runnableC1349c.f15515u.f15522b.f14557s).a(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public boolean q(int i7, int i8) {
        RunnableC1349c runnableC1349c = (RunnableC1349c) this.f11874r;
        Object obj = runnableC1349c.f15511q.get(i7);
        Object obj2 = runnableC1349c.f15512r.get(i8);
        if (obj != null && obj2 != null) {
            return ((AbstractC1348b) runnableC1349c.f15515u.f15522b.f14557s).b(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        return false;
    }

    public void r(int i7, int i8, C0943h c0943h) {
        C1107c c1107c;
        C1107c c1107c2;
        C1107c c1107c3;
        long j7;
        int i9;
        int i10;
        int i11;
        int i12;
        C1108d c1108d = (C1108d) this.f11874r;
        SparseArray sparseArray = c1108d.f13364c;
        int i13 = 4;
        int i14 = 0;
        int i15 = 1;
        if (i7 != 161 && i7 != 163) {
            if (i7 != 165) {
                if (i7 != 16877) {
                    if (i7 != 16981) {
                        if (i7 != 18402) {
                            if (i7 != 21419) {
                                if (i7 != 25506) {
                                    if (i7 == 30322) {
                                        c1108d.c(i7);
                                        C1107c c1107c4 = c1108d.f13379u;
                                        byte[] bArr = new byte[i8];
                                        c1107c4.f13325v = bArr;
                                        c0943h.e(bArr, 0, i8, false);
                                        return;
                                    }
                                    throw e2.m0.a("Unexpected id: " + i7, null);
                                }
                                c1108d.c(i7);
                                C1107c c1107c5 = c1108d.f13379u;
                                byte[] bArr2 = new byte[i8];
                                c1107c5.f13315k = bArr2;
                                c0943h.e(bArr2, 0, i8, false);
                                return;
                            }
                            Z2.y yVar = c1108d.f13368i;
                            Arrays.fill(yVar.f4691a, (byte) 0);
                            c0943h.e(yVar.f4691a, 4 - i8, i8, false);
                            yVar.F(0);
                            c1108d.f13381w = (int) yVar.v();
                            return;
                        }
                        byte[] bArr3 = new byte[i8];
                        c0943h.e(bArr3, 0, i8, false);
                        c1108d.c(i7);
                        c1108d.f13379u.f13314j = new C0957v(1, 0, 0, bArr3);
                        return;
                    }
                    c1108d.c(i7);
                    C1107c c1107c6 = c1108d.f13379u;
                    byte[] bArr4 = new byte[i8];
                    c1107c6.f13313i = bArr4;
                    c0943h.e(bArr4, 0, i8, false);
                    return;
                }
                c1108d.c(i7);
                C1107c c1107c7 = c1108d.f13379u;
                int i16 = c1107c7.f13311g;
                if (i16 != 1685485123 && i16 != 1685480259) {
                    c0943h.d(i8);
                    return;
                }
                byte[] bArr5 = new byte[i8];
                c1107c7.f13296N = bArr5;
                c0943h.e(bArr5, 0, i8, false);
                return;
            } else if (c1108d.f13341G == 2) {
                C1107c c1107c8 = (C1107c) sparseArray.get(c1108d.f13347M);
                if (c1108d.f13350P == 4 && "V_VP9".equals(c1107c8.f13308b)) {
                    Z2.y yVar2 = c1108d.n;
                    yVar2.C(i8);
                    c0943h.e(yVar2.f4691a, 0, i8, false);
                    return;
                }
                c0943h.d(i8);
                return;
            } else {
                return;
            }
        }
        int i17 = c1108d.f13341G;
        Z2.y yVar3 = c1108d.f13366g;
        if (i17 == 0) {
            q2.e eVar = c1108d.f13362b;
            c1108d.f13347M = (int) eVar.c(c0943h, false, true, 8);
            c1108d.f13348N = eVar.f13387c;
            c1108d.f13343I = -9223372036854775807L;
            c1108d.f13341G = 1;
            yVar3.C(0);
        }
        C1107c c1107c9 = (C1107c) sparseArray.get(c1108d.f13347M);
        if (c1107c9 == null) {
            c0943h.d(i8 - c1108d.f13348N);
            c1108d.f13341G = 0;
            return;
        }
        c1107c9.f13305X.getClass();
        if (c1108d.f13341G == 1) {
            c1108d.i(c0943h, 3);
            int i18 = (yVar3.f4691a[2] & 6) >> 1;
            byte b7 = 255;
            if (i18 == 0) {
                c1108d.f13345K = 1;
                int[] iArr = c1108d.f13346L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                c1108d.f13346L = iArr;
                iArr[0] = (i8 - c1108d.f13348N) - 3;
            } else {
                c1108d.i(c0943h, 4);
                int i19 = (yVar3.f4691a[3] & 255) + 1;
                c1108d.f13345K = i19;
                int[] iArr2 = c1108d.f13346L;
                if (iArr2 == null) {
                    iArr2 = new int[i19];
                } else if (iArr2.length < i19) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i19)];
                }
                c1108d.f13346L = iArr2;
                if (i18 == 2) {
                    int i20 = c1108d.f13345K;
                    Arrays.fill(iArr2, 0, i20, ((i8 - c1108d.f13348N) - 4) / i20);
                } else if (i18 == 1) {
                    int i21 = 0;
                    int i22 = 0;
                    while (true) {
                        i9 = c1108d.f13345K - 1;
                        if (i21 >= i9) {
                            break;
                        }
                        c1108d.f13346L[i21] = 0;
                        while (true) {
                            i10 = i13 + 1;
                            c1108d.i(c0943h, i10);
                            int i23 = yVar3.f4691a[i13] & 255;
                            int[] iArr3 = c1108d.f13346L;
                            i11 = iArr3[i21] + i23;
                            iArr3[i21] = i11;
                            if (i23 != 255) {
                                break;
                            }
                            i13 = i10;
                        }
                        i22 += i11;
                        i21++;
                        i13 = i10;
                    }
                    c1108d.f13346L[i9] = ((i8 - c1108d.f13348N) - i13) - i22;
                } else if (i18 == 3) {
                    int i24 = 0;
                    int i25 = 0;
                    while (true) {
                        int i26 = c1108d.f13345K - i15;
                        if (i24 < i26) {
                            c1108d.f13346L[i24] = i14;
                            int i27 = i13 + 1;
                            c1108d.i(c0943h, i27);
                            if (yVar3.f4691a[i13] != 0) {
                                int i28 = i14;
                                while (true) {
                                    if (i28 < 8) {
                                        int i29 = i15 << (7 - i28);
                                        if ((yVar3.f4691a[i13] & i29) != 0) {
                                            int i30 = i27 + i28;
                                            c1108d.i(c0943h, i30);
                                            C1107c c1107c10 = c1107c9;
                                            j7 = yVar3.f4691a[i13] & b7 & (~i29);
                                            while (i27 < i30) {
                                                j7 = (j7 << 8) | (yVar3.f4691a[i27] & 255);
                                                i27++;
                                                c1107c10 = c1107c10;
                                            }
                                            c1107c3 = c1107c10;
                                            if (i24 > 0) {
                                                j7 -= (1 << ((i28 * 7) + 6)) - 1;
                                            }
                                            i13 = i30;
                                        } else {
                                            i28++;
                                            b7 = 255;
                                            i15 = 1;
                                        }
                                    } else {
                                        c1107c3 = c1107c9;
                                        j7 = 0;
                                        i13 = i27;
                                        break;
                                    }
                                }
                                if (j7 < -2147483648L || j7 > 2147483647L) {
                                    break;
                                }
                                int i31 = (int) j7;
                                int[] iArr4 = c1108d.f13346L;
                                if (i24 != 0) {
                                    i31 += iArr4[i24 - 1];
                                }
                                iArr4[i24] = i31;
                                i25 += i31;
                                i24++;
                                c1107c9 = c1107c3;
                                b7 = 255;
                                i14 = 0;
                                i15 = 1;
                            } else {
                                throw e2.m0.a("No valid varint length mask found", null);
                            }
                        } else {
                            c1107c2 = c1107c9;
                            c1108d.f13346L[i26] = ((i8 - c1108d.f13348N) - i13) - i25;
                            break;
                        }
                    }
                    throw e2.m0.a("EBML lacing sample size out of range.", null);
                } else {
                    throw e2.m0.a("Unexpected lacing value: " + i18, null);
                }
            }
            c1107c2 = c1107c9;
            byte[] bArr6 = yVar3.f4691a;
            c1108d.f13342H = c1108d.l((bArr6[1] & 255) | (bArr6[0] << 8)) + c1108d.f13337B;
            c1107c = c1107c2;
            if (c1107c.d != 2 && (i7 != 163 || (yVar3.f4691a[2] & 128) != 128)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            c1108d.f13349O = i12;
            c1108d.f13341G = 2;
            c1108d.f13344J = 0;
        } else {
            c1107c = c1107c9;
        }
        if (i7 == 163) {
            while (true) {
                int i32 = c1108d.f13344J;
                if (i32 < c1108d.f13345K) {
                    c1108d.f(c1107c, ((c1108d.f13344J * c1107c.f13310e) / 1000) + c1108d.f13342H, c1108d.f13349O, c1108d.m(c0943h, c1107c, c1108d.f13346L[i32], false), 0);
                    c1108d.f13344J++;
                    c1107c = c1107c;
                } else {
                    c1108d.f13341G = 0;
                    return;
                }
            }
        } else {
            C1107c c1107c11 = c1107c;
            while (true) {
                int i33 = c1108d.f13344J;
                if (i33 < c1108d.f13345K) {
                    int[] iArr5 = c1108d.f13346L;
                    iArr5[i33] = c1108d.m(c0943h, c1107c11, iArr5[i33], true);
                    c1108d.f13344J++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // s4.b
    public void s(String str, Bundle bundle) {
        u4.q qVar = (u4.q) this.f11874r;
        if (qVar != null) {
            try {
                String str2 = "$A$:" + D(str, bundle);
                u4.s sVar = qVar.f15035a;
                sVar.getClass();
                C1292p c1292p = sVar.f15042g;
                c1292p.getClass();
                c1292p.f15024e.X(new CallableC1290n(c1292p, System.currentTimeMillis() - sVar.d, str2));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    public synchronized void t(h6.J j7) {
        M5.g.f(j7, "route");
        ((LinkedHashSet) this.f11874r).remove(j7);
    }

    public String toString() {
        switch (this.f11873q) {
            case 12:
                StringBuilder sb = new StringBuilder("1");
                for (EnumC1196r0 enumC1196r0 : EnumC1196r0.values()) {
                    EnumC1174g enumC1174g = (EnumC1174g) ((EnumMap) this.f11874r).get(enumC1196r0);
                    if (enumC1174g == null) {
                        enumC1174g = EnumC1174g.UNSET;
                    }
                    sb.append(enumC1174g.f14032q);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public w0.k0 u(h5.e eVar) {
        int i7 = eVar.f11029e;
        o.k kVar = (o.k) this.f11874r;
        w0.k0 k0Var = (w0.k0) kVar.e(i7);
        if (k0Var != null) {
            return k0Var;
        }
        int k5 = kVar.k();
        w0.k0 k0Var2 = null;
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < k5; i9++) {
            int g7 = kVar.g(i9);
            w0.k0 k0Var3 = (w0.k0) kVar.l(i9);
            int i10 = (g7 - eVar.f11029e) * eVar.f11028c.f11013q;
            if (i10 >= 0 && i10 < i8) {
                i8 = i10;
                k0Var2 = k0Var3;
            }
        }
        return k0Var2;
    }

    public void v(int i7, double d) {
        C1108d c1108d = (C1108d) this.f11874r;
        if (i7 != 181) {
            if (i7 != 17545) {
                switch (i7) {
                    case 21969:
                        c1108d.c(i7);
                        c1108d.f13379u.f13287D = (float) d;
                        return;
                    case 21970:
                        c1108d.c(i7);
                        c1108d.f13379u.f13288E = (float) d;
                        return;
                    case 21971:
                        c1108d.c(i7);
                        c1108d.f13379u.F = (float) d;
                        return;
                    case 21972:
                        c1108d.c(i7);
                        c1108d.f13379u.f13289G = (float) d;
                        return;
                    case 21973:
                        c1108d.c(i7);
                        c1108d.f13379u.f13290H = (float) d;
                        return;
                    case 21974:
                        c1108d.c(i7);
                        c1108d.f13379u.f13291I = (float) d;
                        return;
                    case 21975:
                        c1108d.c(i7);
                        c1108d.f13379u.f13292J = (float) d;
                        return;
                    case 21976:
                        c1108d.c(i7);
                        c1108d.f13379u.f13293K = (float) d;
                        return;
                    case 21977:
                        c1108d.c(i7);
                        c1108d.f13379u.f13294L = (float) d;
                        return;
                    case 21978:
                        c1108d.c(i7);
                        c1108d.f13379u.f13295M = (float) d;
                        return;
                    default:
                        switch (i7) {
                            case 30323:
                                c1108d.c(i7);
                                c1108d.f13379u.f13322s = (float) d;
                                return;
                            case 30324:
                                c1108d.c(i7);
                                c1108d.f13379u.f13323t = (float) d;
                                return;
                            case 30325:
                                c1108d.c(i7);
                                c1108d.f13379u.f13324u = (float) d;
                                return;
                            default:
                                c1108d.getClass();
                                return;
                        }
                }
            }
            c1108d.f13377s = (long) d;
            return;
        }
        c1108d.c(i7);
        c1108d.f13379u.f13299Q = (int) d;
    }

    public void w(int i7, int i8) {
        RunnableC1349c runnableC1349c = (RunnableC1349c) this.f11874r;
        Object obj = runnableC1349c.f15511q.get(i7);
        Object obj2 = runnableC1349c.f15512r.get(i8);
        if (obj != null && obj2 != null) {
            ((AbstractC1348b) runnableC1349c.f15515u.f15522b.f14557s).getClass();
            return;
        }
        throw new AssertionError();
    }

    public boolean x(h5.e eVar, w0.g0 g0Var) {
        int i7;
        boolean z7;
        w0.k0 u7;
        switch (this.f11873q) {
            case 3:
                M5.g.f(eVar, "layoutRequest");
                M5.g.f(g0Var, "state");
                if (((w0.a0) this.f11874r) == null || (i7 = eVar.f11029e) < 0 || i7 >= g0Var.b()) {
                    return false;
                }
                return true;
            default:
                M5.g.f(eVar, "layoutRequest");
                M5.g.f(g0Var, "state");
                o.k kVar = (o.k) this.f11874r;
                if (kVar.k() == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7 || (u7 = u(eVar)) == null) {
                    return false;
                }
                int a7 = AbstractC1078a.a(kVar.f12813t, u7.f(), kVar.f12811r);
                if (a7 >= 0) {
                    Object[] objArr = kVar.f12812s;
                    Object obj = objArr[a7];
                    Object obj2 = o.h.f12801b;
                    if (obj != obj2) {
                        objArr[a7] = obj2;
                        kVar.f12810q = true;
                    }
                }
                kVar.i(eVar.f11029e, u7);
                return true;
        }
    }

    public void y(long j7, int i7) {
        C1108d c1108d = (C1108d) this.f11874r;
        c1108d.getClass();
        if (i7 != 20529) {
            if (i7 != 20530) {
                boolean z7 = false;
                switch (i7) {
                    case 131:
                        c1108d.c(i7);
                        c1108d.f13379u.d = (int) j7;
                        return;
                    case 136:
                        c1108d.c(i7);
                        C1107c c1107c = c1108d.f13379u;
                        if (j7 == 1) {
                            z7 = true;
                        }
                        c1107c.f13304V = z7;
                        return;
                    case 155:
                        c1108d.f13343I = c1108d.l(j7);
                        return;
                    case 159:
                        c1108d.c(i7);
                        c1108d.f13379u.f13297O = (int) j7;
                        return;
                    case 176:
                        c1108d.c(i7);
                        c1108d.f13379u.f13317m = (int) j7;
                        return;
                    case 179:
                        c1108d.b(i7);
                        c1108d.f13338C.i(c1108d.l(j7));
                        return;
                    case 186:
                        c1108d.c(i7);
                        c1108d.f13379u.n = (int) j7;
                        return;
                    case 215:
                        c1108d.c(i7);
                        c1108d.f13379u.f13309c = (int) j7;
                        return;
                    case 231:
                        c1108d.f13337B = c1108d.l(j7);
                        return;
                    case 238:
                        c1108d.f13350P = (int) j7;
                        return;
                    case 241:
                        if (!c1108d.f13340E) {
                            c1108d.b(i7);
                            c1108d.f13339D.i(j7);
                            c1108d.f13340E = true;
                            return;
                        }
                        return;
                    case 251:
                        c1108d.f13351Q = true;
                        return;
                    case 16871:
                        c1108d.c(i7);
                        c1108d.f13379u.f13311g = (int) j7;
                        return;
                    case 16980:
                        if (j7 != 3) {
                            throw e2.m0.a("ContentCompAlgo " + j7 + " not supported", null);
                        }
                        return;
                    case 17029:
                        if (j7 < 1 || j7 > 2) {
                            throw e2.m0.a("DocTypeReadVersion " + j7 + " not supported", null);
                        }
                        return;
                    case 17143:
                        if (j7 != 1) {
                            throw e2.m0.a("EBMLReadVersion " + j7 + " not supported", null);
                        }
                        return;
                    case 18401:
                        if (j7 != 5) {
                            throw e2.m0.a("ContentEncAlgo " + j7 + " not supported", null);
                        }
                        return;
                    case 18408:
                        if (j7 != 1) {
                            throw e2.m0.a("AESSettingsCipherMode " + j7 + " not supported", null);
                        }
                        return;
                    case 21420:
                        c1108d.f13382x = j7 + c1108d.f13375q;
                        return;
                    case 21432:
                        int i8 = (int) j7;
                        c1108d.c(i7);
                        if (i8 != 0) {
                            if (i8 != 1) {
                                if (i8 != 3) {
                                    if (i8 == 15) {
                                        c1108d.f13379u.f13326w = 3;
                                        return;
                                    }
                                    return;
                                }
                                c1108d.f13379u.f13326w = 1;
                                return;
                            }
                            c1108d.f13379u.f13326w = 2;
                            return;
                        }
                        c1108d.f13379u.f13326w = 0;
                        return;
                    case 21680:
                        c1108d.c(i7);
                        c1108d.f13379u.f13318o = (int) j7;
                        return;
                    case 21682:
                        c1108d.c(i7);
                        c1108d.f13379u.f13320q = (int) j7;
                        return;
                    case 21690:
                        c1108d.c(i7);
                        c1108d.f13379u.f13319p = (int) j7;
                        return;
                    case 21930:
                        c1108d.c(i7);
                        C1107c c1107c2 = c1108d.f13379u;
                        if (j7 == 1) {
                            z7 = true;
                        }
                        c1107c2.f13303U = z7;
                        return;
                    case 21998:
                        c1108d.c(i7);
                        c1108d.f13379u.f = (int) j7;
                        return;
                    case 22186:
                        c1108d.c(i7);
                        c1108d.f13379u.f13300R = j7;
                        return;
                    case 22203:
                        c1108d.c(i7);
                        c1108d.f13379u.f13301S = j7;
                        return;
                    case 25188:
                        c1108d.c(i7);
                        c1108d.f13379u.f13298P = (int) j7;
                        return;
                    case 30114:
                        c1108d.f13352R = j7;
                        return;
                    case 30321:
                        c1108d.c(i7);
                        int i9 = (int) j7;
                        if (i9 != 0) {
                            if (i9 != 1) {
                                if (i9 != 2) {
                                    if (i9 == 3) {
                                        c1108d.f13379u.f13321r = 3;
                                        return;
                                    }
                                    return;
                                }
                                c1108d.f13379u.f13321r = 2;
                                return;
                            }
                            c1108d.f13379u.f13321r = 1;
                            return;
                        }
                        c1108d.f13379u.f13321r = 0;
                        return;
                    case 2352003:
                        c1108d.c(i7);
                        c1108d.f13379u.f13310e = (int) j7;
                        return;
                    case 2807729:
                        c1108d.f13376r = j7;
                        return;
                    default:
                        switch (i7) {
                            case 21945:
                                c1108d.c(i7);
                                int i10 = (int) j7;
                                if (i10 != 1) {
                                    if (i10 == 2) {
                                        c1108d.f13379u.f13284A = 1;
                                        return;
                                    }
                                    return;
                                }
                                c1108d.f13379u.f13284A = 2;
                                return;
                            case 21946:
                                c1108d.c(i7);
                                int c5 = C0202b.c((int) j7);
                                if (c5 != -1) {
                                    c1108d.f13379u.f13329z = c5;
                                    return;
                                }
                                return;
                            case 21947:
                                c1108d.c(i7);
                                c1108d.f13379u.f13327x = true;
                                int b7 = C0202b.b((int) j7);
                                if (b7 != -1) {
                                    c1108d.f13379u.f13328y = b7;
                                    return;
                                }
                                return;
                            case 21948:
                                c1108d.c(i7);
                                c1108d.f13379u.f13285B = (int) j7;
                                return;
                            case 21949:
                                c1108d.c(i7);
                                c1108d.f13379u.f13286C = (int) j7;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j7 != 1) {
                throw e2.m0.a("ContentEncodingScope " + j7 + " not supported", null);
            }
        } else if (j7 == 0) {
        } else {
            throw e2.m0.a("ContentEncodingOrder " + j7 + " not supported", null);
        }
    }

    public View z(h5.e eVar, w0.g0 g0Var) {
        switch (this.f11873q) {
            case 3:
                M5.g.f(eVar, "layoutRequest");
                M5.g.f(g0Var, "state");
                w0.a0 a0Var = (w0.a0) this.f11874r;
                if (a0Var != null) {
                    View d = a0Var.d(eVar.f11029e);
                    M5.g.e(d, "getViewForPosition(...)");
                    eVar.c();
                    return d;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            default:
                M5.g.f(eVar, "layoutRequest");
                M5.g.f(g0Var, "state");
                w0.k0 u7 = u(eVar);
                if (u7 != null) {
                    int i7 = eVar.f11029e;
                    o.k kVar = (o.k) this.f11874r;
                    int a7 = AbstractC1078a.a(kVar.f12813t, i7, kVar.f12811r);
                    if (a7 >= 0) {
                        Object[] objArr = kVar.f12812s;
                        Object obj = objArr[a7];
                        Object obj2 = o.h.f12801b;
                        if (obj != obj2) {
                            objArr[a7] = obj2;
                            kVar.f12810q = true;
                        }
                    }
                    E(eVar);
                    View view = u7.f15576a;
                    M5.g.e(view, "itemView");
                    return view;
                }
                throw new IllegalStateException();
        }
    }

    public /* synthetic */ C0852F(int i7, Object obj) {
        this.f11873q = i7;
        this.f11874r = obj;
    }

    public /* synthetic */ C0852F(int i7, boolean z7) {
        this.f11873q = i7;
    }

    public C0852F(i6.a aVar) {
        this.f11873q = 5;
        this.f11874r = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }

    public C0852F(EnumMap enumMap) {
        this.f11873q = 12;
        EnumMap enumMap2 = new EnumMap(EnumC1196r0.class);
        this.f11874r = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public C0852F(s3.X x7) {
        this.f11873q = 14;
        g3.n.g(x7);
        this.f11874r = x7;
    }

    @Override // k.InterfaceC0850E
    public void k(int i7) {
    }

    @Override // k.InterfaceC0850E
    public void l(int i7) {
    }
}
