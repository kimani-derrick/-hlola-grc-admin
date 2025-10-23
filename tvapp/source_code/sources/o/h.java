package o;

import java.util.ConcurrentModificationException;
import p.AbstractC1078a;
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f12800a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f12801b = new Object();

    public static final void a(k kVar) {
        int i7 = kVar.f12813t;
        int[] iArr = kVar.f12811r;
        Object[] objArr = kVar.f12812s;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f12801b) {
                if (i9 != i8) {
                    iArr[i8] = iArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        kVar.f12810q = false;
        kVar.f12813t = i8;
    }

    public static final int b(C1053f c1053f, Object obj, int i7) {
        M5.g.f(c1053f, "<this>");
        int i8 = c1053f.f12795s;
        if (i8 == 0) {
            return -1;
        }
        try {
            int a7 = AbstractC1078a.a(c1053f.f12795s, i7, c1053f.f12793q);
            if (a7 < 0) {
                return a7;
            }
            if (M5.g.a(obj, c1053f.f12794r[a7])) {
                return a7;
            }
            int i9 = a7 + 1;
            while (i9 < i8 && c1053f.f12793q[i9] == i7) {
                if (M5.g.a(obj, c1053f.f12794r[i9])) {
                    return i9;
                }
                i9++;
            }
            for (int i10 = a7 - 1; i10 >= 0 && c1053f.f12793q[i10] == i7; i10--) {
                if (M5.g.a(obj, c1053f.f12794r[i10])) {
                    return i10;
                }
            }
            return ~i9;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final A5.b c(k kVar) {
        M5.g.f(kVar, "<this>");
        return new A5.b(4, kVar);
    }
}
