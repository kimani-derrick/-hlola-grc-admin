package Z4;
/* loaded from: classes.dex */
public enum r implements I4.f {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("LOG_ENVIRONMENT_UNKNOWN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("LOG_ENVIRONMENT_AUTOPUSH"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("LOG_ENVIRONMENT_STAGING"),
    f4862r("LOG_ENVIRONMENT_PROD");
    

    /* renamed from: q  reason: collision with root package name */
    public final int f4864q;

    r(String str) {
        this.f4864q = r2;
    }

    @Override // I4.f
    public final int a() {
        return this.f4864q;
    }
}
