package m;

import java.util.HashMap;
/* renamed from: m.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0984a extends f {

    /* renamed from: u  reason: collision with root package name */
    public final HashMap f12365u = new HashMap();

    @Override // m.f
    public final c b(Object obj) {
        return (c) this.f12365u.get(obj);
    }

    @Override // m.f
    public final Object c(Object obj) {
        Object c5 = super.c(obj);
        this.f12365u.remove(obj);
        return c5;
    }

    public final Object f(Object obj, Object obj2) {
        c b7 = b(obj);
        if (b7 != null) {
            return b7.f12370r;
        }
        HashMap hashMap = this.f12365u;
        c cVar = new c(obj, obj2);
        this.f12379t++;
        c cVar2 = this.f12377r;
        if (cVar2 == null) {
            this.f12376q = cVar;
        } else {
            cVar2.f12371s = cVar;
            cVar.f12372t = cVar2;
        }
        this.f12377r = cVar;
        hashMap.put(obj, cVar);
        return null;
    }
}
