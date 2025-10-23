package R5;
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: t  reason: collision with root package name */
    public static final c f2929t = new a(1, 0, 1);

    public final boolean c(int i7) {
        if (this.f2922q <= i7 && i7 <= this.f2923r) {
            return true;
        }
        return false;
    }

    @Override // R5.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f2922q == cVar.f2922q) {
                    if (this.f2923r == cVar.f2923r) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // R5.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2922q * 31) + this.f2923r;
    }

    @Override // R5.a
    public final boolean isEmpty() {
        if (this.f2922q > this.f2923r) {
            return true;
        }
        return false;
    }

    @Override // R5.a
    public final String toString() {
        return this.f2922q + ".." + this.f2923r;
    }
}
