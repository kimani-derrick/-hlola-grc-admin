package O3;

import a.AbstractC0189a;
import java.util.Map;
/* renamed from: O3.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074s extends AbstractC0069m {

    /* renamed from: q  reason: collision with root package name */
    public final Object f2696q;

    /* renamed from: r  reason: collision with root package name */
    public int f2697r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C0075t f2698s;

    public C0074s(C0075t c0075t, int i7) {
        this.f2698s = c0075t;
        Object obj = C0075t.f2699z;
        this.f2696q = c0075t.i()[i7];
        this.f2697r = i7;
    }

    public final void a() {
        int i7 = this.f2697r;
        Object obj = this.f2696q;
        C0075t c0075t = this.f2698s;
        if (i7 != -1 && i7 < c0075t.size()) {
            if (AbstractC0189a.r(obj, c0075t.i()[this.f2697r])) {
                return;
            }
        }
        Object obj2 = C0075t.f2699z;
        this.f2697r = c0075t.d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2696q;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C0075t c0075t = this.f2698s;
        Map b7 = c0075t.b();
        if (b7 != null) {
            return b7.get(this.f2696q);
        }
        a();
        int i7 = this.f2697r;
        if (i7 == -1) {
            return null;
        }
        return c0075t.j()[i7];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C0075t c0075t = this.f2698s;
        Map b7 = c0075t.b();
        Object obj2 = this.f2696q;
        if (b7 != null) {
            return b7.put(obj2, obj);
        }
        a();
        int i7 = this.f2697r;
        if (i7 == -1) {
            c0075t.put(obj2, obj);
            return null;
        }
        Object obj3 = c0075t.j()[i7];
        c0075t.j()[this.f2697r] = obj;
        return obj3;
    }
}
