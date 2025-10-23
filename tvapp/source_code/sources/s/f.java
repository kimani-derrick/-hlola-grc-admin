package s;
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: q  reason: collision with root package name */
    public i f13507q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ g f13508r;

    public f(g gVar) {
        this.f13508r = gVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f13507q.f13514b - ((i) obj).f13514b;
    }

    public final String toString() {
        String str = "[ ";
        if (this.f13507q != null) {
            for (int i7 = 0; i7 < 9; i7++) {
                str = str + this.f13507q.f13518h[i7] + " ";
            }
        }
        return str + "] " + this.f13507q;
    }
}
