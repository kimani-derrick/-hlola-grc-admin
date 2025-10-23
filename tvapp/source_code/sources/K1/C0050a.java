package K1;

import java.io.Serializable;
import z5.C1526h;
/* renamed from: K1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050a extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f1568t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ C0051b f1569u;

    /* renamed from: v  reason: collision with root package name */
    public int f1570v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0050a(C0051b c0051b, D5.d dVar) {
        super(dVar);
        this.f1569u = c0051b;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1568t = obj;
        this.f1570v |= Integer.MIN_VALUE;
        Serializable a7 = this.f1569u.a(null, this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
