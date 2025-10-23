package s3;
/* renamed from: s3.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1148C {
    public static final Object f = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13754a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC1147B f13755b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f13756c;
    public final Object d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f13757e = null;

    public C1148C(String str, Object obj, InterfaceC1147B interfaceC1147B) {
        this.f13754a = str;
        this.f13756c = obj;
        this.f13755b = interfaceC1147B;
    }

    public final Object a(Object obj) {
        Object obj2;
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC1204v0.f14367k == null) {
            return this.f13756c;
        }
        synchronized (f) {
            try {
                if (m3.i.f()) {
                    if (this.f13757e == null) {
                        obj2 = this.f13756c;
                    } else {
                        obj2 = this.f13757e;
                    }
                    return obj2;
                }
                try {
                    for (C1148C c1148c : AbstractC1203v.f14308a) {
                        if (!m3.i.f()) {
                            Object obj3 = null;
                            try {
                                InterfaceC1147B interfaceC1147B = c1148c.f13755b;
                                if (interfaceC1147B != null) {
                                    obj3 = interfaceC1147B.a();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (f) {
                                c1148c.f13757e = obj3;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC1147B interfaceC1147B2 = this.f13755b;
                if (interfaceC1147B2 == null) {
                    return this.f13756c;
                }
                try {
                    return interfaceC1147B2.a();
                } catch (IllegalStateException unused3) {
                    return this.f13756c;
                } catch (SecurityException unused4) {
                    return this.f13756c;
                }
            } finally {
            }
        }
    }
}
