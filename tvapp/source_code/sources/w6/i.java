package w6;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import u4.C1288l;
import v6.C1344i;
import v6.w;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final C1344i f16124a;

    /* renamed from: b  reason: collision with root package name */
    public static final C1344i f16125b;

    /* renamed from: c  reason: collision with root package name */
    public static final C1344i f16126c;
    public static final C1344i d;

    /* renamed from: e  reason: collision with root package name */
    public static final C1344i f16127e;

    static {
        C1344i c1344i = C1344i.f15389t;
        f16124a = C1288l.e("/");
        f16125b = C1288l.e("\\");
        f16126c = C1288l.e("/\\");
        d = C1288l.e(".");
        f16127e = C1288l.e("..");
    }

    public static final int a(w wVar) {
        if (wVar.f15417q.d() == 0) {
            return -1;
        }
        C1344i c1344i = wVar.f15417q;
        if (c1344i.i(0) != 47) {
            if (c1344i.i(0) == 92) {
                if (c1344i.d() > 2 && c1344i.i(1) == 92) {
                    C1344i c1344i2 = f16125b;
                    M5.g.f(c1344i2, "other");
                    int f = c1344i.f(2, c1344i2.f15390q);
                    if (f == -1) {
                        return c1344i.d();
                    }
                    return f;
                }
            } else if (c1344i.d() <= 2 || c1344i.i(1) != 58 || c1344i.i(2) != 92) {
                return -1;
            } else {
                char i7 = (char) c1344i.i(0);
                if (('a' > i7 || i7 >= '{') && ('A' > i7 || i7 >= '[')) {
                    return -1;
                }
                return 3;
            }
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, v6.f] */
    public static final w b(w wVar, w wVar2, boolean z7) {
        M5.g.f(wVar, "<this>");
        M5.g.f(wVar2, "child");
        if (a(wVar2) != -1 || wVar2.f() != null) {
            return wVar2;
        }
        C1344i c5 = c(wVar);
        if (c5 == null && (c5 = c(wVar2)) == null) {
            c5 = f(w.f15416r);
        }
        ?? obj = new Object();
        obj.f0(wVar.f15417q);
        if (obj.f15388r > 0) {
            obj.f0(c5);
        }
        obj.f0(wVar2.f15417q);
        return d(obj, z7);
    }

    public static final C1344i c(w wVar) {
        C1344i c1344i = wVar.f15417q;
        C1344i c1344i2 = f16124a;
        if (C1344i.g(c1344i, c1344i2) == -1) {
            C1344i c1344i3 = f16125b;
            if (C1344i.g(wVar.f15417q, c1344i3) == -1) {
                return null;
            }
            return c1344i3;
        }
        return c1344i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0115 A[EDGE_INSN: B:104:0x0115->B:87:0x0115 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0135  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, v6.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final v6.w d(v6.C1341f r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.i.d(v6.f, boolean):v6.w");
    }

    public static final C1344i e(byte b7) {
        if (b7 != 47) {
            if (b7 == 92) {
                return f16125b;
            }
            throw new IllegalArgumentException(AbstractC0515y1.l("not a directory separator: ", b7));
        }
        return f16124a;
    }

    public static final C1344i f(String str) {
        if (M5.g.a(str, "/")) {
            return f16124a;
        }
        if (M5.g.a(str, "\\")) {
            return f16125b;
        }
        throw new IllegalArgumentException(AbstractC0515y1.x("not a directory separator: ", str));
    }
}
