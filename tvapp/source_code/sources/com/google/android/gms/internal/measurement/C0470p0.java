package com.google.android.gms.internal.measurement;
/* renamed from: com.google.android.gms.internal.measurement.p0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0470p0 extends AbstractRunnableC0415e0 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f8638u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ T f8639v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ C0430h0 f8640w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0470p0(C0430h0 c0430h0, T t5, int i7) {
        super(c0430h0, true);
        this.f8638u = i7;
        this.f8639v = t5;
        this.f8640w = c0430h0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0415e0
    public final void a() {
        switch (this.f8638u) {
            case 0:
                V v5 = this.f8640w.f8571h;
                g3.n.g(v5);
                v5.getGmpAppId(this.f8639v);
                return;
            case 1:
                V v7 = this.f8640w.f8571h;
                g3.n.g(v7);
                v7.generateEventId(this.f8639v);
                return;
            case 2:
                V v8 = this.f8640w.f8571h;
                g3.n.g(v8);
                v8.getCachedAppInstanceId(this.f8639v);
                return;
            case 3:
                V v9 = this.f8640w.f8571h;
                g3.n.g(v9);
                v9.getCurrentScreenClass(this.f8639v);
                return;
            default:
                V v10 = this.f8640w.f8571h;
                g3.n.g(v10);
                v10.getCurrentScreenName(this.f8639v);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0415e0
    public final void b() {
        switch (this.f8638u) {
            case 0:
                this.f8639v.d(null);
                return;
            case 1:
                this.f8639v.d(null);
                return;
            case 2:
                this.f8639v.d(null);
                return;
            case 3:
                this.f8639v.d(null);
                return;
            default:
                this.f8639v.d(null);
                return;
        }
    }
}
