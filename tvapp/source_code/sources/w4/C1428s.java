package w4;
/* renamed from: w4.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1428s implements G4.d {

    /* renamed from: a  reason: collision with root package name */
    public static final C1428s f16072a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final G4.c f16073b = G4.c.a("batteryLevel");

    /* renamed from: c  reason: collision with root package name */
    public static final G4.c f16074c = G4.c.a("batteryVelocity");
    public static final G4.c d = G4.c.a("proximityOn");

    /* renamed from: e  reason: collision with root package name */
    public static final G4.c f16075e = G4.c.a("orientation");
    public static final G4.c f = G4.c.a("ramUsed");

    /* renamed from: g  reason: collision with root package name */
    public static final G4.c f16076g = G4.c.a("diskUsed");

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        G4.e eVar = (G4.e) obj2;
        V v5 = (V) ((w0) obj);
        eVar.e(f16073b, v5.f15951a);
        eVar.b(f16074c, v5.f15952b);
        eVar.g(d, v5.f15953c);
        eVar.b(f16075e, v5.d);
        eVar.c(f, v5.f15954e);
        eVar.c(f16076g, v5.f);
    }
}
