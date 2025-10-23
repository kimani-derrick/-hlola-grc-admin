package s3;
/* loaded from: classes.dex */
public final class S0 extends AbstractC1184l {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f13876e;
    public final /* synthetic */ R0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S0(R0 r02, InterfaceC1193p0 interfaceC1193p0, int i7) {
        super(interfaceC1193p0);
        this.f13876e = i7;
        this.f = r02;
    }

    @Override // s3.AbstractC1184l
    public final void c() {
        switch (this.f13876e) {
            case 0:
                R0 r02 = this.f;
                r02.D();
                if (r02.R()) {
                    r02.b().f13803D.d("Inactivity, disconnecting from the service");
                    r02.Q();
                    return;
                }
                return;
            default:
                this.f.b().f13810y.d("Tasks have been queued for a long time");
                return;
        }
    }
}
