package Z4;
/* renamed from: Z4.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167d implements G4.d {

    /* renamed from: a  reason: collision with root package name */
    public static final C0167d f4816a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final G4.c f4817b = G4.c.a("appId");

    /* renamed from: c  reason: collision with root package name */
    public static final G4.c f4818c = G4.c.a("deviceModel");
    public static final G4.c d = G4.c.a("sessionSdkVersion");

    /* renamed from: e  reason: collision with root package name */
    public static final G4.c f4819e = G4.c.a("osVersion");
    public static final G4.c f = G4.c.a("logEnvironment");

    /* renamed from: g  reason: collision with root package name */
    public static final G4.c f4820g = G4.c.a("androidAppInfo");

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        C0165b c0165b = (C0165b) obj;
        G4.e eVar = (G4.e) obj2;
        eVar.e(f4817b, c0165b.f4808a);
        eVar.e(f4818c, c0165b.f4809b);
        eVar.e(d, "2.0.1");
        eVar.e(f4819e, c0165b.f4810c);
        eVar.e(f, r.f4862r);
        eVar.e(f4820g, c0165b.d);
    }
}
