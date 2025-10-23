package V;

import java.io.Serializable;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class x extends F5.c {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ H f3585A;

    /* renamed from: B  reason: collision with root package name */
    public int f3586B;

    /* renamed from: t  reason: collision with root package name */
    public H f3587t;

    /* renamed from: u  reason: collision with root package name */
    public Object f3588u;

    /* renamed from: v  reason: collision with root package name */
    public Serializable f3589v;

    /* renamed from: w  reason: collision with root package name */
    public Object f3590w;

    /* renamed from: x  reason: collision with root package name */
    public z f3591x;

    /* renamed from: y  reason: collision with root package name */
    public Iterator f3592y;

    /* renamed from: z  reason: collision with root package name */
    public /* synthetic */ Object f3593z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(H h7, D5.d dVar) {
        super(dVar);
        this.f3585A = h7;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f3593z = obj;
        this.f3586B |= Integer.MIN_VALUE;
        return this.f3585A.c(this);
    }
}
