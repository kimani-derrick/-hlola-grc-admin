package n1;
/* loaded from: classes.dex */
public final class p extends M5.h implements L5.a {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f12647r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ androidx.activity.l f12648s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(androidx.activity.l lVar, int i7) {
        super(0);
        this.f12647r = i7;
        this.f12648s = lVar;
    }

    @Override // L5.a
    public final Object b() {
        switch (this.f12647r) {
            case 0:
                return this.f12648s.r();
            case 1:
                return this.f12648s.p();
            case 2:
                return this.f12648s.a();
            case 3:
                return this.f12648s.r();
            case 4:
                return this.f12648s.p();
            default:
                return this.f12648s.a();
        }
    }
}
