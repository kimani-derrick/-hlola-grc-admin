package Z4;
/* renamed from: Z4.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0169f implements G4.d {

    /* renamed from: a  reason: collision with root package name */
    public static final C0169f f4824a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final G4.c f4825b = G4.c.a("processName");

    /* renamed from: c  reason: collision with root package name */
    public static final G4.c f4826c = G4.c.a("pid");
    public static final G4.c d = G4.c.a("importance");

    /* renamed from: e  reason: collision with root package name */
    public static final G4.c f4827e = G4.c.a("defaultProcess");

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        C0181s c0181s = (C0181s) obj;
        G4.e eVar = (G4.e) obj2;
        eVar.e(f4825b, c0181s.f4865a);
        eVar.b(f4826c, c0181s.f4866b);
        eVar.b(d, c0181s.f4867c);
        eVar.g(f4827e, c0181s.d);
    }
}
