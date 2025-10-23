package V;

import java.io.Serializable;
import java.util.Iterator;
/* renamed from: V.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086e extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public Serializable f3542t;

    /* renamed from: u  reason: collision with root package name */
    public Iterator f3543u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f3544v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ L4.f f3545w;

    /* renamed from: x  reason: collision with root package name */
    public int f3546x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0086e(L4.f fVar, D5.d dVar) {
        super(dVar);
        this.f3545w = fVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f3544v = obj;
        this.f3546x |= Integer.MIN_VALUE;
        return L4.f.F(this.f3545w, null, null, this);
    }
}
