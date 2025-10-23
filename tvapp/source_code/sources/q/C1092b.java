package q;
/* renamed from: q.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1092b extends Throwable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13193q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1092b(String str, int i7) {
        super(str);
        this.f13193q = i7;
    }

    private final synchronized Throwable a() {
        return this;
    }

    private final synchronized Throwable b() {
        return this;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f13193q) {
            case 0:
                a();
                return this;
            default:
                b();
                return this;
        }
    }
}
