package T1;

import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class f implements G4.d {

    /* renamed from: a  reason: collision with root package name */
    public static final f f3230a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final G4.c f3231b;

    /* renamed from: c  reason: collision with root package name */
    public static final G4.c f3232c;

    /* JADX WARN: Type inference failed for: r0v0, types: [T1.f, java.lang.Object] */
    static {
        J4.a aVar = new J4.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(J4.d.class, aVar);
        f3231b = new G4.c("currentCacheSizeBytes", Collections.unmodifiableMap(new HashMap(hashMap)));
        J4.a aVar2 = new J4.a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(J4.d.class, aVar2);
        f3232c = new G4.c("maxCacheSizeBytes", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        W1.f fVar = (W1.f) obj;
        G4.e eVar = (G4.e) obj2;
        eVar.c(f3231b, fVar.f3762a);
        eVar.c(f3232c, fVar.f3763b);
    }
}
