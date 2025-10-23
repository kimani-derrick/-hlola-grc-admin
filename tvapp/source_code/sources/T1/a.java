package T1;

import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class a implements G4.d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3217a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final G4.c f3218b;

    /* renamed from: c  reason: collision with root package name */
    public static final G4.c f3219c;
    public static final G4.c d;

    /* renamed from: e  reason: collision with root package name */
    public static final G4.c f3220e;

    /* JADX WARN: Type inference failed for: r0v0, types: [T1.a, java.lang.Object] */
    static {
        J4.a aVar = new J4.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(J4.d.class, aVar);
        f3218b = new G4.c("window", Collections.unmodifiableMap(new HashMap(hashMap)));
        J4.a aVar2 = new J4.a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(J4.d.class, aVar2);
        f3219c = new G4.c("logSourceMetrics", Collections.unmodifiableMap(new HashMap(hashMap2)));
        J4.a aVar3 = new J4.a(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(J4.d.class, aVar3);
        d = new G4.c("globalMetrics", Collections.unmodifiableMap(new HashMap(hashMap3)));
        J4.a aVar4 = new J4.a(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(J4.d.class, aVar4);
        f3220e = new G4.c("appNamespace", Collections.unmodifiableMap(new HashMap(hashMap4)));
    }

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        W1.a aVar = (W1.a) obj;
        G4.e eVar = (G4.e) obj2;
        eVar.e(f3218b, aVar.f3744a);
        eVar.e(f3219c, aVar.f3745b);
        eVar.e(d, aVar.f3746c);
        eVar.e(f3220e, aVar.d);
    }
}
