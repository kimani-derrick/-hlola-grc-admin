package W5;
/* loaded from: classes.dex */
public final class r extends M5.h implements L5.p {

    /* renamed from: s  reason: collision with root package name */
    public static final r f4015s = new r(2, 0);

    /* renamed from: t  reason: collision with root package name */
    public static final r f4016t = new r(2, 1);

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f4017r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i7, int i8) {
        super(i7);
        this.f4017r = i8;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        switch (this.f4017r) {
            case 0:
                return ((D5.i) obj).r((D5.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                D5.g gVar = (D5.g) obj2;
                return bool;
            default:
                return ((D5.i) obj).r((D5.g) obj2);
        }
    }
}
