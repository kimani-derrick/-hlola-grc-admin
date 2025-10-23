package w4;
/* loaded from: classes.dex */
public final class r implements G4.d {

    /* renamed from: a  reason: collision with root package name */
    public static final r f16068a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final G4.c f16069b = G4.c.a("processName");

    /* renamed from: c  reason: collision with root package name */
    public static final G4.c f16070c = G4.c.a("pid");
    public static final G4.c d = G4.c.a("importance");

    /* renamed from: e  reason: collision with root package name */
    public static final G4.c f16071e = G4.c.a("defaultProcess");

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        G4.e eVar = (G4.e) obj2;
        U u7 = (U) ((u0) obj);
        eVar.e(f16069b, u7.f15948a);
        eVar.b(f16070c, u7.f15949b);
        eVar.b(d, u7.f15950c);
        eVar.g(f16071e, u7.d);
    }
}
