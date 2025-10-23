package v6;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class w implements Comparable {

    /* renamed from: r  reason: collision with root package name */
    public static final String f15416r;

    /* renamed from: q  reason: collision with root package name */
    public final C1344i f15417q;

    static {
        String str = File.separator;
        M5.g.e(str, "separator");
        f15416r = str;
    }

    public w(C1344i c1344i) {
        M5.g.f(c1344i, "bytes");
        this.f15417q = c1344i;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a7 = w6.i.a(this);
        C1344i c1344i = this.f15417q;
        if (a7 == -1) {
            a7 = 0;
        } else if (a7 < c1344i.d() && c1344i.i(a7) == 92) {
            a7++;
        }
        int d = c1344i.d();
        int i7 = a7;
        while (a7 < d) {
            if (c1344i.i(a7) == 47 || c1344i.i(a7) == 92) {
                arrayList.add(c1344i.n(i7, a7));
                i7 = a7 + 1;
            }
            a7++;
        }
        if (i7 < c1344i.d()) {
            arrayList.add(c1344i.n(i7, c1344i.d()));
        }
        return arrayList;
    }

    public final w b() {
        C1344i c1344i = w6.i.d;
        C1344i c1344i2 = this.f15417q;
        if (M5.g.a(c1344i2, c1344i)) {
            return null;
        }
        C1344i c1344i3 = w6.i.f16124a;
        if (M5.g.a(c1344i2, c1344i3)) {
            return null;
        }
        C1344i c1344i4 = w6.i.f16125b;
        if (M5.g.a(c1344i2, c1344i4)) {
            return null;
        }
        C1344i c1344i5 = w6.i.f16127e;
        c1344i2.getClass();
        M5.g.f(c1344i5, "suffix");
        int d = c1344i2.d();
        byte[] bArr = c1344i5.f15390q;
        if (c1344i2.m(d - bArr.length, c1344i5, bArr.length) && (c1344i2.d() == 2 || c1344i2.m(c1344i2.d() - 3, c1344i3, 1) || c1344i2.m(c1344i2.d() - 3, c1344i4, 1))) {
            return null;
        }
        int k5 = C1344i.k(c1344i2, c1344i3);
        if (k5 == -1) {
            k5 = C1344i.k(c1344i2, c1344i4);
        }
        if (k5 == 2 && f() != null) {
            if (c1344i2.d() == 3) {
                return null;
            }
            return new w(C1344i.o(c1344i2, 0, 3, 1));
        }
        if (k5 == 1) {
            M5.g.f(c1344i4, "prefix");
            if (c1344i2.m(0, c1344i4, c1344i4.d())) {
                return null;
            }
        }
        if (k5 == -1 && f() != null) {
            if (c1344i2.d() == 2) {
                return null;
            }
            return new w(C1344i.o(c1344i2, 0, 2, 1));
        } else if (k5 == -1) {
            return new w(c1344i);
        } else {
            if (k5 == 0) {
                return new w(C1344i.o(c1344i2, 0, 1, 1));
            }
            return new w(C1344i.o(c1344i2, 0, k5, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, v6.f] */
    public final w c(String str) {
        M5.g.f(str, "child");
        ?? obj = new Object();
        obj.o0(str);
        return w6.i.b(this, w6.i.d(obj, false), false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        w wVar = (w) obj;
        M5.g.f(wVar, "other");
        return this.f15417q.compareTo(wVar.f15417q);
    }

    public final File d() {
        return new File(this.f15417q.q());
    }

    public final Path e() {
        Path path;
        path = Paths.get(this.f15417q.q(), new String[0]);
        M5.g.e(path, "get(toString())");
        return path;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof w) && M5.g.a(((w) obj).f15417q, this.f15417q)) {
            return true;
        }
        return false;
    }

    public final Character f() {
        C1344i c1344i = w6.i.f16124a;
        C1344i c1344i2 = this.f15417q;
        if (C1344i.g(c1344i2, c1344i) != -1 || c1344i2.d() < 2 || c1344i2.i(1) != 58) {
            return null;
        }
        char i7 = (char) c1344i2.i(0);
        if (('a' > i7 || i7 >= '{') && ('A' > i7 || i7 >= '[')) {
            return null;
        }
        return Character.valueOf(i7);
    }

    public final int hashCode() {
        return this.f15417q.hashCode();
    }

    public final String toString() {
        return this.f15417q.q();
    }
}
