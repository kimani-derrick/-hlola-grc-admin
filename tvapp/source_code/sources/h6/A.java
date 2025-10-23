package h6;
/* loaded from: classes.dex */
public enum A {
    f11062r("http/1.0"),
    f11063s("http/1.1"),
    f11064t("spdy/3.1"),
    f11065u("h2"),
    f11066v("h2_prior_knowledge"),
    f11067w("quic");
    

    /* renamed from: q  reason: collision with root package name */
    public final String f11069q;

    A(String str) {
        this.f11069q = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11069q;
    }
}
