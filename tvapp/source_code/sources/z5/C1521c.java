package z5;
/* renamed from: z5.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1521c implements Comparable {

    /* renamed from: r  reason: collision with root package name */
    public static final C1521c f16465r = new C1521c();

    /* renamed from: q  reason: collision with root package name */
    public final int f16466q;

    /* JADX WARN: Type inference failed for: r0v0, types: [R5.a, R5.c] */
    /* JADX WARN: Type inference failed for: r0v3, types: [R5.a, R5.c] */
    /* JADX WARN: Type inference failed for: r0v5, types: [R5.a, R5.c] */
    public C1521c() {
        if (new R5.a(0, 255, 1).c(1) && new R5.a(0, 255, 1).c(9) && new R5.a(0, 255, 1).c(22)) {
            this.f16466q = 67862;
            return;
        }
        throw new IllegalArgumentException("Version components are out of range: 1.9.22".toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1521c c1521c = (C1521c) obj;
        M5.g.f(c1521c, "other");
        return this.f16466q - c1521c.f16466q;
    }

    public final boolean equals(Object obj) {
        C1521c c1521c;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1521c) {
            c1521c = (C1521c) obj;
        } else {
            c1521c = null;
        }
        if (c1521c != null && this.f16466q == c1521c.f16466q) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16466q;
    }

    public final String toString() {
        return "1.9.22";
    }
}
