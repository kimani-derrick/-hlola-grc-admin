package T1;

import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class b implements G4.d {

    /* renamed from: a  reason: collision with root package name */
    public static final b f3221a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final G4.c f3222b;

    /* JADX WARN: Type inference failed for: r0v0, types: [T1.b, java.lang.Object] */
    static {
        J4.a aVar = new J4.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(J4.d.class, aVar);
        f3222b = new G4.c("storageMetrics", Collections.unmodifiableMap(new HashMap(hashMap)));
    }

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        ((G4.e) obj2).e(f3222b, ((W1.b) obj).f3747a);
    }
}
