package Z4;
/* renamed from: Z4.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171h implements G4.d {

    /* renamed from: a  reason: collision with root package name */
    public static final C0171h f4831a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final G4.c f4832b = G4.c.a("sessionId");

    /* renamed from: c  reason: collision with root package name */
    public static final G4.c f4833c = G4.c.a("firstSessionId");
    public static final G4.c d = G4.c.a("sessionIndex");

    /* renamed from: e  reason: collision with root package name */
    public static final G4.c f4834e = G4.c.a("eventTimestampUs");
    public static final G4.c f = G4.c.a("dataCollectionStatus");

    /* renamed from: g  reason: collision with root package name */
    public static final G4.c f4835g = G4.c.a("firebaseInstallationId");

    /* renamed from: h  reason: collision with root package name */
    public static final G4.c f4836h = G4.c.a("firebaseAuthenticationToken");

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        O o7 = (O) obj;
        G4.e eVar = (G4.e) obj2;
        eVar.e(f4832b, o7.f4783a);
        eVar.e(f4833c, o7.f4784b);
        eVar.b(d, o7.f4785c);
        eVar.c(f4834e, o7.d);
        eVar.e(f, o7.f4786e);
        eVar.e(f4835g, o7.f);
        eVar.e(f4836h, o7.f4787g);
    }
}
