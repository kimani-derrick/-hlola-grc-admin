package Z2;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4645a;

    /* renamed from: b  reason: collision with root package name */
    public I.h f4646b = new I.h();

    /* renamed from: c  reason: collision with root package name */
    public boolean f4647c;
    public boolean d;

    public o(Object obj) {
        this.f4645a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f4645a.equals(((o) obj).f4645a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4645a.hashCode();
    }
}
