package t;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.HashSet;
import java.util.Iterator;
import s.h;
import s.i;
/* renamed from: t.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1217c {

    /* renamed from: b  reason: collision with root package name */
    public final C1218d f14442b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14443c;
    public C1217c d;

    /* renamed from: g  reason: collision with root package name */
    public i f14445g;

    /* renamed from: a  reason: collision with root package name */
    public HashSet f14441a = null;

    /* renamed from: e  reason: collision with root package name */
    public int f14444e = 0;
    public int f = -1;

    public C1217c(C1218d c1218d, int i7) {
        this.f14442b = c1218d;
        this.f14443c = i7;
    }

    public final void a(C1217c c1217c, int i7, int i8) {
        if (c1217c == null) {
            e();
            return;
        }
        this.d = c1217c;
        if (c1217c.f14441a == null) {
            c1217c.f14441a = new HashSet();
        }
        this.d.f14441a.add(this);
        if (i7 > 0) {
            this.f14444e = i7;
        } else {
            this.f14444e = 0;
        }
        this.f = i8;
    }

    public final int b() {
        C1217c c1217c;
        if (this.f14442b.f14466V == 8) {
            return 0;
        }
        int i7 = this.f;
        if (i7 > -1 && (c1217c = this.d) != null && c1217c.f14442b.f14466V == 8) {
            return i7;
        }
        return this.f14444e;
    }

    public final boolean c() {
        C1217c c1217c;
        HashSet hashSet = this.f14441a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C1217c c1217c2 = (C1217c) it.next();
            int i7 = c1217c2.f14443c;
            int b7 = h.b(i7);
            C1218d c1218d = c1217c2.f14442b;
            switch (b7) {
                case 0:
                case 5:
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                case 8:
                    c1217c = null;
                    break;
                case 1:
                    c1217c = c1218d.f14495z;
                    break;
                case 2:
                    c1217c = c1218d.f14446A;
                    break;
                case 3:
                    c1217c = c1218d.f14493x;
                    break;
                case 4:
                    c1217c = c1218d.f14494y;
                    break;
                default:
                    throw new AssertionError(AbstractC0515y1.y(i7));
            }
            if (c1217c.d()) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        if (this.d != null) {
            return true;
        }
        return false;
    }

    public final void e() {
        HashSet hashSet;
        C1217c c1217c = this.d;
        if (c1217c != null && (hashSet = c1217c.f14441a) != null) {
            hashSet.remove(this);
        }
        this.d = null;
        this.f14444e = 0;
        this.f = -1;
    }

    public final void f() {
        i iVar = this.f14445g;
        if (iVar == null) {
            this.f14445g = new i(1);
        } else {
            iVar.c();
        }
    }

    public final String toString() {
        return this.f14442b.W + ":" + AbstractC0515y1.y(this.f14443c);
    }
}
