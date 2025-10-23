package W5;
/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a  reason: collision with root package name */
    public static final D f3941a;

    static {
        String str;
        X5.e eVar;
        int i7 = b6.v.f7214a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null && Boolean.parseBoolean(str)) {
            d6.d dVar = G.f3945a;
            X5.e eVar2 = b6.o.f7208a;
            X5.e eVar3 = eVar2.f4295v;
            if (!(eVar2 instanceof D)) {
                eVar = RunnableC0118z.f4044z;
            } else {
                eVar = eVar2;
            }
        } else {
            eVar = RunnableC0118z.f4044z;
        }
        f3941a = eVar;
    }
}
