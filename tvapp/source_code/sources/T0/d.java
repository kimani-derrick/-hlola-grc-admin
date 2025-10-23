package T0;
/* loaded from: classes.dex */
public final class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public final f f3203a = f.f3206c;

    @Override // T0.g
    public final Object a(J0.g gVar) {
        return this.f3203a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            if (M5.g.a(this.f3203a, ((d) obj).f3203a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3203a.hashCode();
    }
}
