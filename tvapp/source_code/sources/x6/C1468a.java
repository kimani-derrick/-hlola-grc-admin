package x6;

import z5.C1530l;
/* renamed from: x6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1468a implements InterfaceC1480m {

    /* renamed from: r  reason: collision with root package name */
    public static final C1468a f16299r = new C1468a(0);

    /* renamed from: s  reason: collision with root package name */
    public static final C1468a f16300s = new C1468a(1);

    /* renamed from: t  reason: collision with root package name */
    public static final C1468a f16301t = new C1468a(2);

    /* renamed from: u  reason: collision with root package name */
    public static final C1468a f16302u = new C1468a(3);

    /* renamed from: v  reason: collision with root package name */
    public static final C1468a f16303v = new C1468a(4);

    /* renamed from: w  reason: collision with root package name */
    public static final C1468a f16304w = new C1468a(5);

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f16305q;

    public /* synthetic */ C1468a(int i7) {
        this.f16305q = i7;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, v6.h, v6.g] */
    @Override // x6.InterfaceC1480m
    public final Object o(Object obj) {
        switch (this.f16305q) {
            case 0:
                return obj.toString();
            case 1:
                h6.I i7 = (h6.I) obj;
                try {
                    ?? obj2 = new Object();
                    i7.f().R(obj2);
                    h6.H h7 = new h6.H(i7.b(), i7.a(), obj2, 0);
                    i7.close();
                    return h7;
                } catch (Throwable th) {
                    i7.close();
                    throw th;
                }
            case 2:
                return (h6.E) obj;
            case 3:
                return (h6.I) obj;
            case 4:
                ((h6.I) obj).close();
                return C1530l.f16479a;
            default:
                ((h6.I) obj).close();
                return null;
        }
    }
}
