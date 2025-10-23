package N1;

import java.io.Serializable;
import z5.C1526h;
/* loaded from: classes.dex */
public final class c extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public d f2401t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f2402u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d f2403v;

    /* renamed from: w  reason: collision with root package name */
    public int f2404w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, D5.d dVar2) {
        super(dVar2);
        this.f2403v = dVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f2402u = obj;
        this.f2404w |= Integer.MIN_VALUE;
        Serializable a7 = this.f2403v.a(this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
