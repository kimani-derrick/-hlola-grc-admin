package K1;

import java.io.Serializable;
import java.util.ArrayList;
import z5.C1526h;
/* loaded from: classes.dex */
public final class C extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public D f1552t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f1553u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f1554v;

    /* renamed from: w  reason: collision with root package name */
    public /* synthetic */ Object f1555w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ D f1556x;

    /* renamed from: y  reason: collision with root package name */
    public int f1557y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d, D5.d dVar) {
        super(dVar);
        this.f1556x = d;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1555w = obj;
        this.f1557y |= Integer.MIN_VALUE;
        Serializable a7 = this.f1556x.a(null, this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
