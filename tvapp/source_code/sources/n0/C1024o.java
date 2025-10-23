package n0;
/* renamed from: n0.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1024o extends M5.h implements L5.l {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f12571r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C0999A f12572s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1024o(C0999A c0999a, int i7) {
        super(1);
        this.f12571r = i7;
        this.f12572s = c0999a;
    }

    @Override // L5.l
    public final Object c(Object obj) {
        v vVar = (v) obj;
        switch (this.f12571r) {
            case 0:
                M5.g.f(vVar, "destination");
                return Boolean.valueOf(!this.f12572s.f12465k.containsKey(Integer.valueOf(vVar.f12607x)));
            default:
                M5.g.f(vVar, "destination");
                return Boolean.valueOf(!this.f12572s.f12465k.containsKey(Integer.valueOf(vVar.f12607x)));
        }
    }
}
