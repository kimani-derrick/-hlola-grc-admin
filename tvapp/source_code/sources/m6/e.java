package m6;

import M5.g;
import f5.C0700a;
import h6.B;
import h6.G;
import h6.u;
import java.util.List;
import l6.i;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final i f12447a;

    /* renamed from: b  reason: collision with root package name */
    public final List f12448b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12449c;
    public final C0700a d;

    /* renamed from: e  reason: collision with root package name */
    public final B f12450e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12451g;

    /* renamed from: h  reason: collision with root package name */
    public final int f12452h;

    /* renamed from: i  reason: collision with root package name */
    public int f12453i;

    public e(i iVar, List list, int i7, C0700a c0700a, B b7, int i8, int i9, int i10) {
        g.f(iVar, "call");
        g.f(list, "interceptors");
        g.f(b7, "request");
        this.f12447a = iVar;
        this.f12448b = list;
        this.f12449c = i7;
        this.d = c0700a;
        this.f12450e = b7;
        this.f = i8;
        this.f12451g = i9;
        this.f12452h = i10;
    }

    public static e a(e eVar, int i7, C0700a c0700a, B b7, int i8) {
        if ((i8 & 1) != 0) {
            i7 = eVar.f12449c;
        }
        int i9 = i7;
        if ((i8 & 2) != 0) {
            c0700a = eVar.d;
        }
        C0700a c0700a2 = c0700a;
        if ((i8 & 4) != 0) {
            b7 = eVar.f12450e;
        }
        B b8 = b7;
        int i10 = eVar.f;
        int i11 = eVar.f12451g;
        int i12 = eVar.f12452h;
        eVar.getClass();
        g.f(b8, "request");
        return new e(eVar.f12447a, eVar.f12448b, i9, c0700a2, b8, i10, i11, i12);
    }

    public final G b(B b7) {
        g.f(b7, "request");
        List list = this.f12448b;
        int size = list.size();
        int i7 = this.f12449c;
        if (i7 < size) {
            this.f12453i++;
            C0700a c0700a = this.d;
            if (c0700a != null) {
                if (((l6.e) c0700a.f10432e).b(b7.f11070a)) {
                    if (this.f12453i != 1) {
                        throw new IllegalStateException(("network interceptor " + list.get(i7 - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + list.get(i7 - 1) + " must retain the same host and port").toString());
                }
            }
            int i8 = i7 + 1;
            e a7 = a(this, i8, null, b7, 58);
            u uVar = (u) list.get(i7);
            G a8 = uVar.a(a7);
            if (a8 != null) {
                if (c0700a != null && i8 < list.size() && a7.f12453i != 1) {
                    throw new IllegalStateException(("network interceptor " + uVar + " must call proceed() exactly once").toString());
                } else if (a8.f11101w != null) {
                    return a8;
                } else {
                    throw new IllegalStateException(("interceptor " + uVar + " returned a response with no body").toString());
                }
            }
            throw new NullPointerException("interceptor " + uVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
