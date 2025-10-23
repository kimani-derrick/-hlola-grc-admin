package o4;
/* loaded from: classes.dex */
public final class k implements M4.b {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f12940c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f12941a = f12940c;

    /* renamed from: b  reason: collision with root package name */
    public volatile M4.b f12942b;

    public k(M4.b bVar) {
        this.f12942b = bVar;
    }

    @Override // M4.b
    public final Object get() {
        Object obj = this.f12941a;
        Object obj2 = f12940c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f12941a;
                    if (obj == obj2) {
                        obj = this.f12942b.get();
                        this.f12941a = obj;
                        this.f12942b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
