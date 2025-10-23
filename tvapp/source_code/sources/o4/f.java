package o4;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final o f12933a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12934b;

    public f(o oVar, boolean z7) {
        this.f12933a = oVar;
        this.f12934b = z7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!fVar.f12933a.equals(this.f12933a) || fVar.f12934b != this.f12934b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f12933a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f12934b).hashCode();
    }
}
