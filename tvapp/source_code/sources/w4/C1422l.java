package w4;
/* renamed from: w4.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1422l implements G4.d {

    /* renamed from: a  reason: collision with root package name */
    public static final C1422l f16046a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final G4.c f16047b = G4.c.a("baseAddress");

    /* renamed from: c  reason: collision with root package name */
    public static final G4.c f16048c = G4.c.a("size");
    public static final G4.c d = G4.c.a("name");

    /* renamed from: e  reason: collision with root package name */
    public static final G4.c f16049e = G4.c.a("uuid");

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        G4.e eVar = (G4.e) obj2;
        O o7 = (O) ((o0) obj);
        eVar.c(f16047b, o7.f15931a);
        eVar.c(f16048c, o7.f15932b);
        eVar.e(d, o7.f15933c);
        String str = o7.d;
        if (str != null) {
            bArr = str.getBytes(F0.f15894a);
        } else {
            bArr = null;
        }
        eVar.e(f16049e, bArr);
    }
}
