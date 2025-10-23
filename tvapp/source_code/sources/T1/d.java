package T1;

import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class d implements G4.d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f3226a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final G4.c f3227b;

    /* renamed from: c  reason: collision with root package name */
    public static final G4.c f3228c;

    /* JADX WARN: Type inference failed for: r0v0, types: [T1.d, java.lang.Object] */
    static {
        J4.a aVar = new J4.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(J4.d.class, aVar);
        f3227b = new G4.c("logSource", Collections.unmodifiableMap(new HashMap(hashMap)));
        J4.a aVar2 = new J4.a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(J4.d.class, aVar2);
        f3228c = new G4.c("logEventDropped", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        W1.e eVar = (W1.e) obj;
        G4.e eVar2 = (G4.e) obj2;
        eVar2.e(f3227b, eVar.f3760a);
        eVar2.e(f3228c, eVar.f3761b);
    }
}
