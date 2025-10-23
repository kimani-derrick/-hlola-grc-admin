package W5;
/* loaded from: classes.dex */
public final class K implements W {

    /* renamed from: q  reason: collision with root package name */
    public final boolean f3950q;

    public K(boolean z7) {
        this.f3950q = z7;
    }

    @Override // W5.W
    public final boolean a() {
        return this.f3950q;
    }

    @Override // W5.W
    public final l0 h() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.f3950q) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
