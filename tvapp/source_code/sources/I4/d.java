package I4;

import G4.g;
import java.util.Date;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class d implements H4.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f1256e = new a(0);
    public static final b f = new G4.f() { // from class: I4.b
        @Override // G4.a
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((g) obj2).a((String) obj);
                    return;
                default:
                    ((g) obj2).d(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };

    /* renamed from: g  reason: collision with root package name */
    public static final b f1257g = new G4.f() { // from class: I4.b
        @Override // G4.a
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((g) obj2).a((String) obj);
                    return;
                default:
                    ((g) obj2).d(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };

    /* renamed from: h  reason: collision with root package name */
    public static final c f1258h = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1259a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1260b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1261c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f1259a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f1260b = hashMap2;
        this.f1261c = f1256e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f1257g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f1258h);
        hashMap.remove(Date.class);
    }

    public final H4.a a(Class cls, G4.d dVar) {
        this.f1259a.put(cls, dVar);
        this.f1260b.remove(cls);
        return this;
    }
}
