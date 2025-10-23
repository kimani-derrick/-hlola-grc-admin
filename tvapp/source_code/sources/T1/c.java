package T1;

import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class c implements G4.d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f3223a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final G4.c f3224b;

    /* renamed from: c  reason: collision with root package name */
    public static final G4.c f3225c;

    /* JADX WARN: Type inference failed for: r0v0, types: [T1.c, java.lang.Object] */
    static {
        J4.a aVar = new J4.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(J4.d.class, aVar);
        f3224b = new G4.c("eventsDroppedCount", Collections.unmodifiableMap(new HashMap(hashMap)));
        J4.a aVar2 = new J4.a(3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(J4.d.class, aVar2);
        f3225c = new G4.c("reason", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        W1.d dVar = (W1.d) obj;
        G4.e eVar = (G4.e) obj2;
        eVar.c(f3224b, dVar.f3757a);
        eVar.e(f3225c, dVar.f3758b);
    }
}
