package V;

import java.io.FileInputStream;
/* loaded from: classes.dex */
public final class C extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public H f3499t;

    /* renamed from: u  reason: collision with root package name */
    public FileInputStream f3500u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f3501v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ H f3502w;

    /* renamed from: x  reason: collision with root package name */
    public int f3503x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(H h7, D5.d dVar) {
        super(dVar);
        this.f3502w = h7;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f3501v = obj;
        this.f3503x |= Integer.MIN_VALUE;
        return this.f3502w.f(this);
    }
}
