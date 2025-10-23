package g2;

import android.media.AudioAttributes;
import e2.InterfaceC0604f;
/* renamed from: g2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713d implements InterfaceC0604f {

    /* renamed from: w  reason: collision with root package name */
    public static final C0713d f10677w = new C0713d(0, 0, 1, 1, 0);

    /* renamed from: q  reason: collision with root package name */
    public final int f10678q;

    /* renamed from: r  reason: collision with root package name */
    public final int f10679r;

    /* renamed from: s  reason: collision with root package name */
    public final int f10680s;

    /* renamed from: t  reason: collision with root package name */
    public final int f10681t;

    /* renamed from: u  reason: collision with root package name */
    public final int f10682u;

    /* renamed from: v  reason: collision with root package name */
    public Z5.n f10683v;

    static {
        int i7 = Z2.H.f4603a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public C0713d(int i7, int i8, int i9, int i10, int i11) {
        this.f10678q = i7;
        this.f10679r = i8;
        this.f10680s = i9;
        this.f10681t = i10;
        this.f10682u = i11;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Z5.n, java.lang.Object] */
    public final Z5.n a() {
        if (this.f10683v == null) {
            ?? obj = new Object();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f10678q).setFlags(this.f10679r).setUsage(this.f10680s);
            int i7 = Z2.H.f4603a;
            if (i7 >= 29) {
                AbstractC0711b.a(usage, this.f10681t);
            }
            if (i7 >= 32) {
                AbstractC0712c.a(usage, this.f10682u);
            }
            obj.f4918q = usage.build();
            this.f10683v = obj;
        }
        return this.f10683v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0713d.class != obj.getClass()) {
            return false;
        }
        C0713d c0713d = (C0713d) obj;
        if (this.f10678q == c0713d.f10678q && this.f10679r == c0713d.f10679r && this.f10680s == c0713d.f10680s && this.f10681t == c0713d.f10681t && this.f10682u == c0713d.f10682u) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f10678q) * 31) + this.f10679r) * 31) + this.f10680s) * 31) + this.f10681t) * 31) + this.f10682u;
    }
}
