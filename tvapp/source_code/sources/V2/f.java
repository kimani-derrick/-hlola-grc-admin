package V2;
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: q  reason: collision with root package name */
    public final int f3638q;

    /* renamed from: r  reason: collision with root package name */
    public final b f3639r;

    public f(int i7, b bVar) {
        this.f3638q = i7;
        this.f3639r = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f3638q, ((f) obj).f3638q);
    }
}
