package N3;
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: q  reason: collision with root package name */
    public static final a f2491q = new Object();

    @Override // N3.g
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // N3.g
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
