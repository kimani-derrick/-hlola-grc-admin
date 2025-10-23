package J3;

import V.C0082a;
import V.InterfaceC0083b;
import Y2.O;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.wifi.WifiManager;
import android.os.Looper;
import com.boxhdo.android.data.model.response.trakt.TraktIds;
import com.boxhdo.android.data.model.response.trakt.TraktMovie;
import com.boxhdo.android.data.model.response.trakt.TraktResponseItem;
import com.boxhdo.android.data.model.response.trakt.TraktShow;
import com.google.firebase.components.ComponentRegistrar;
import e2.K;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import javax.crypto.KeyAgreement;
import k2.C0945j;
import k2.InterfaceC0948m;
import k2.InterfaceC0955t;
import k2.w;
import o4.C1069a;
import org.json.JSONObject;
import u4.C1288l;
/* loaded from: classes.dex */
public class e implements B4.e, J1.l, J2.c, L2.p, InterfaceC0083b, f4.j, j2.q, j.o, InterfaceC0948m, m3.c {

    /* renamed from: r  reason: collision with root package name */
    public static e f1329r;

    /* renamed from: s  reason: collision with root package name */
    public static e f1330s;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f1331q;

    public /* synthetic */ e(int i7) {
        this.f1331q = i7;
    }

    public static B4.c v(C1288l c1288l) {
        B4.b bVar = new B4.b(8);
        B4.a aVar = new B4.a(true, false, false);
        c1288l.getClass();
        return new B4.c(System.currentTimeMillis() + 3600000, bVar, aVar, 10.0d, 1.2d, 60);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0079, code lost:
        if (r11 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean y(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.e.y(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public List A(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C1069a c1069a : componentRegistrar.getComponents()) {
            String str = c1069a.f12917a;
            if (str != null) {
                T4.d dVar = new T4.d(str, 9, c1069a);
                c1069a = new C1069a(str, c1069a.f12918b, c1069a.f12919c, c1069a.d, c1069a.f12920e, dVar, c1069a.f12921g);
            }
            arrayList.add(c1069a);
        }
        return arrayList;
    }

    @Override // j2.q
    public /* synthetic */ void a() {
    }

    @Override // j.o
    public boolean c(j.j jVar) {
        return false;
    }

    @Override // J2.c
    public long d() {
        throw new NoSuchElementException();
    }

    @Override // m3.c
    public int e(Context context, String str) {
        return m3.e.a(context, str);
    }

    @Override // J2.c
    public long f() {
        throw new NoSuchElementException();
    }

    @Override // L2.p
    public O g(L2.l lVar, L2.i iVar) {
        return new L2.o(lVar, iVar);
    }

    @Override // L2.p
    public O i() {
        return new L2.o(L2.l.f1993l, null);
    }

    @Override // f4.j
    public Object j(String str, Provider provider) {
        switch (this.f1331q) {
            case 21:
                if (provider == null) {
                    return KeyAgreement.getInstance(str);
                }
                return KeyAgreement.getInstance(str, provider);
            case 22:
                if (provider == null) {
                    return KeyPairGenerator.getInstance(str);
                }
                return KeyPairGenerator.getInstance(str, provider);
            default:
                if (provider == null) {
                    return MessageDigest.getInstance(str);
                }
                return MessageDigest.getInstance(str, provider);
        }
    }

    @Override // j2.q
    public /* synthetic */ j2.p k(j2.n nVar, K k5) {
        return j2.p.n;
    }

    @Override // j2.q
    public /* synthetic */ void m() {
    }

    @Override // m3.c
    public int n(Context context, String str, boolean z7) {
        return m3.e.d(context, str, z7);
    }

    @Override // J2.c
    public boolean next() {
        return false;
    }

    @Override // j2.q
    public int o(K k5) {
        if (k5.f9658E != null) {
            return 1;
        }
        return 0;
    }

    @Override // k2.InterfaceC0948m
    public w q(int i7, int i8) {
        return new C0945j();
    }

    @Override // B4.e
    public B4.c r(C1288l c1288l, JSONObject jSONObject) {
        return v(c1288l);
    }

    @Override // J1.l
    public Object s(Object obj) {
        Long l7;
        long j7;
        TraktIds traktIds;
        TraktIds traktIds2;
        Long l8;
        TraktResponseItem traktResponseItem = (TraktResponseItem) obj;
        M5.g.f(traktResponseItem, "dto");
        TraktMovie traktMovie = traktResponseItem.f7750c;
        if (traktMovie != null && (traktIds2 = traktMovie.f7735a) != null && (l8 = traktIds2.f7724c) != null) {
            j7 = l8.longValue();
        } else {
            TraktShow traktShow = traktResponseItem.f;
            if (traktShow != null && (traktIds = traktShow.f7763a) != null) {
                l7 = traktIds.f7724c;
            } else {
                l7 = null;
            }
            if (l7 != null) {
                j7 = l7.longValue();
            } else {
                j7 = -1;
            }
        }
        return Long.valueOf(j7);
    }

    @Override // j2.q
    public j2.k u(j2.n nVar, K k5) {
        if (k5.f9658E == null) {
            return null;
        }
        return new j2.u(new j2.j(6001, new Exception()));
    }

    public Signature[] w(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public int x(Object obj) {
        return ((H.k) obj).f797c;
    }

    public boolean z(Object obj) {
        return ((H.k) obj).d;
    }

    public e(Context context) {
        this.f1331q = 20;
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    @Override // k2.InterfaceC0948m
    public void l() {
    }

    @Override // V.InterfaceC0083b
    public Object p(C0082a c0082a) {
        throw c0082a;
    }

    @Override // k2.InterfaceC0948m
    public void t(InterfaceC0955t interfaceC0955t) {
    }

    @Override // j.o
    public void b(j.j jVar, boolean z7) {
    }

    @Override // j2.q
    public void h(Looper looper, f2.m mVar) {
    }
}
