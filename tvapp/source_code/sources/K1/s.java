package K1;

import com.boxhdo.domain.model.Movie;
import z5.C1526h;
/* loaded from: classes.dex */
public final class s extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public Object f1616t;

    /* renamed from: u  reason: collision with root package name */
    public Movie f1617u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f1618v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ t f1619w;

    /* renamed from: x  reason: collision with root package name */
    public int f1620x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, D5.d dVar) {
        super(dVar);
        this.f1619w = tVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1618v = obj;
        this.f1620x |= Integer.MIN_VALUE;
        Object a7 = this.f1619w.a(0L, this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
