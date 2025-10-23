package W2;

import H2.m0;
import H2.n0;
import O3.C0076u;
import O3.E;
import O3.T;
import O3.U;
import Z2.AbstractC0156a;
import Z2.H;
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import e2.B0;
import e2.C0591H;
import e2.K;
import g2.C0713d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class o extends t implements B0 {

    /* renamed from: j  reason: collision with root package name */
    public static final T f3864j;

    /* renamed from: k  reason: collision with root package name */
    public static final T f3865k;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3866c;
    public final Context d;

    /* renamed from: e  reason: collision with root package name */
    public final L4.f f3867e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public h f3868g;

    /* renamed from: h  reason: collision with root package name */
    public final L0.b f3869h;

    /* renamed from: i  reason: collision with root package name */
    public C0713d f3870i;

    static {
        T c0076u;
        T c0076u2;
        H.b bVar = new H.b(5);
        if (bVar instanceof T) {
            c0076u = (T) bVar;
        } else {
            c0076u = new C0076u(bVar);
        }
        f3864j = c0076u;
        H.b bVar2 = new H.b(6);
        if (bVar2 instanceof T) {
            c0076u2 = (T) bVar2;
        } else {
            c0076u2 = new C0076u(bVar2);
        }
        f3865k = c0076u2;
    }

    public o(Context context) {
        Context context2;
        boolean z7;
        Spatializer spatializer;
        L4.f fVar = new L4.f(11);
        int i7 = h.f3821g0;
        h hVar = new h(new g(context));
        this.f3866c = new Object();
        L0.b bVar = null;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.d = context2;
        this.f3867e = fVar;
        this.f3868g = hVar;
        this.f3870i = C0713d.f10677w;
        if (context != null && H.I(context)) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f = z7;
        if (!z7 && context != null && H.f4603a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                spatializer = audioManager.getSpatializer();
                bVar = new L0.b(spatializer);
            }
            this.f3869h = bVar;
        }
        if (this.f3868g.f3830Z && context == null) {
            AbstractC0156a.K("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int b(int i7, int i8) {
        if (i7 != 0 && i7 == i8) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(i7 & i8);
    }

    public static int c(String str) {
        if (str == null) {
            return 0;
        }
        char c5 = 65535;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c5 = 0;
                    break;
                }
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c5 = 1;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c5 = 2;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c5 = 3;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c5 = 4;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return 0;
        }
    }

    public static void d(n0 n0Var, h hVar, HashMap hashMap) {
        for (int i7 = 0; i7 < n0Var.f1146q; i7++) {
            u uVar = (u) hVar.f3920O.get(n0Var.a(i7));
            if (uVar != null) {
                m0 m0Var = uVar.f3882q;
                u uVar2 = (u) hashMap.get(Integer.valueOf(m0Var.f1135s));
                if (uVar2 == null || (uVar2.f3883r.isEmpty() && !uVar.f3883r.isEmpty())) {
                    hashMap.put(Integer.valueOf(m0Var.f1135s), uVar);
                }
            }
        }
    }

    public static int e(K k5, String str, boolean z7) {
        if (!TextUtils.isEmpty(str) && str.equals(k5.f9678s)) {
            return 4;
        }
        String i7 = i(str);
        String i8 = i(k5.f9678s);
        if (i8 != null && i7 != null) {
            if (!i8.startsWith(i7) && !i7.startsWith(i8)) {
                int i9 = H.f4603a;
                if (!i8.split("-", 2)[0].equals(i7.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z7 || i8 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean g(int i7, boolean z7) {
        int i8 = i7 & 7;
        return i8 == 4 || (z7 && i8 == 3);
    }

    public static String i(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair k(int i7, s sVar, int[][][] iArr, l lVar, Comparator comparator) {
        RandomAccess randomAccess;
        boolean z7;
        s sVar2 = sVar;
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 < sVar2.f3874a) {
            if (i7 == sVar2.f3875b[i8]) {
                n0 n0Var = sVar2.f3876c[i8];
                for (int i9 = 0; i9 < n0Var.f1146q; i9++) {
                    m0 a7 = n0Var.a(i9);
                    U a8 = lVar.a(i8, a7, iArr[i8][i9]);
                    int i10 = a7.f1133q;
                    boolean[] zArr = new boolean[i10];
                    for (int i11 = 0; i11 < i10; i11++) {
                        m mVar = (m) a8.get(i11);
                        int a9 = mVar.a();
                        if (!zArr[i11] && a9 != 0) {
                            if (a9 == 1) {
                                randomAccess = E.x(mVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(mVar);
                                for (int i12 = i11 + 1; i12 < i10; i12++) {
                                    m mVar2 = (m) a8.get(i12);
                                    if (mVar2.a() == 2 && mVar.b(mVar2)) {
                                        arrayList2.add(mVar2);
                                        z7 = true;
                                        zArr[i12] = true;
                                    } else {
                                        z7 = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                    }
                }
            }
            i8++;
            sVar2 = sVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i13 = 0; i13 < list.size(); i13++) {
            iArr2[i13] = ((m) list.get(i13)).f3849s;
        }
        m mVar3 = (m) list.get(0);
        return Pair.create(new p(0, mVar3.f3848r, iArr2), Integer.valueOf(mVar3.f3847q));
    }

    @Override // W2.t
    public final void a() {
        L0.b bVar;
        j jVar;
        synchronized (this.f3866c) {
            try {
                if (H.f4603a >= 32 && (bVar = this.f3869h) != null && (jVar = (j) bVar.d) != null && ((Handler) bVar.f1864c) != null) {
                    ((Spatializer) bVar.f1863b).removeOnSpatializerStateChangedListener(jVar);
                    ((Handler) bVar.f1864c).removeCallbacksAndMessages(null);
                    bVar.f1864c = null;
                    bVar.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3878a = null;
        this.f3879b = null;
    }

    public final h f() {
        h hVar;
        synchronized (this.f3866c) {
            hVar = this.f3868g;
        }
        return hVar;
    }

    public final void h() {
        boolean z7;
        C0591H c0591h;
        L0.b bVar;
        synchronized (this.f3866c) {
            try {
                if (this.f3868g.f3830Z && !this.f && H.f4603a >= 32 && (bVar = this.f3869h) != null && bVar.f1862a) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7 && (c0591h = this.f3878a) != null) {
            c0591h.f9544x.d(10);
        }
    }

    public final void j() {
        boolean z7;
        C0591H c0591h;
        synchronized (this.f3866c) {
            z7 = this.f3868g.f3834d0;
        }
        if (z7 && (c0591h = this.f3878a) != null) {
            c0591h.f9544x.d(26);
        }
    }

    public final void l(h hVar) {
        boolean z7;
        hVar.getClass();
        synchronized (this.f3866c) {
            z7 = !this.f3868g.equals(hVar);
            this.f3868g = hVar;
        }
        if (z7) {
            if (hVar.f3830Z && this.d == null) {
                AbstractC0156a.K("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            C0591H c0591h = this.f3878a;
            if (c0591h != null) {
                c0591h.f9544x.d(10);
            }
        }
    }
}
