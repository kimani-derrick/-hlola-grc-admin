package e2;
/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: b  reason: collision with root package name */
    public static final C0 f9478b = new C0(false);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9479a;

    public C0(boolean z7) {
        this.f9479a = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0.class == obj.getClass() && this.f9479a == ((C0) obj).f9479a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return !this.f9479a ? 1 : 0;
    }
}
