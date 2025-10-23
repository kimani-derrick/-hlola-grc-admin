package H2;
/* renamed from: H2.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0023y {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1180a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1181b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1182c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1183e;

    public C0023y(long j7, Object obj) {
        this(obj, -1, -1, j7, -1);
    }

    public final boolean a() {
        if (this.f1181b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0023y)) {
            return false;
        }
        C0023y c0023y = (C0023y) obj;
        if (this.f1180a.equals(c0023y.f1180a) && this.f1181b == c0023y.f1181b && this.f1182c == c0023y.f1182c && this.d == c0023y.d && this.f1183e == c0023y.f1183e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f1180a.hashCode() + 527) * 31) + this.f1181b) * 31) + this.f1182c) * 31) + ((int) this.d)) * 31) + this.f1183e;
    }

    public C0023y(C0023y c0023y) {
        this.f1180a = c0023y.f1180a;
        this.f1181b = c0023y.f1181b;
        this.f1182c = c0023y.f1182c;
        this.d = c0023y.d;
        this.f1183e = c0023y.f1183e;
    }

    public C0023y(Object obj) {
        this(-1L, obj);
    }

    public C0023y(Object obj, int i7, int i8, long j7, int i9) {
        this.f1180a = obj;
        this.f1181b = i7;
        this.f1182c = i8;
        this.d = j7;
        this.f1183e = i9;
    }
}
