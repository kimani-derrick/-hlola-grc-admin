package n5;

import java.lang.reflect.Type;
/* loaded from: classes.dex */
public final class w extends k {

    /* renamed from: a  reason: collision with root package name */
    public final Type f12753a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12754b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f12755c;
    public k d;

    public w(Type type, String str, Object obj) {
        this.f12753a = type;
        this.f12754b = str;
        this.f12755c = obj;
    }

    @Override // n5.k
    public final Object b(n nVar) {
        k kVar = this.d;
        if (kVar != null) {
            return kVar.b(nVar);
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        k kVar = this.d;
        if (kVar != null) {
            kVar.f(qVar, obj);
            return;
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    public final String toString() {
        k kVar = this.d;
        if (kVar != null) {
            return kVar.toString();
        }
        return super.toString();
    }
}
