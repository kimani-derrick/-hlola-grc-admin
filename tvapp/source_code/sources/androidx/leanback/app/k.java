package androidx.leanback.app;

import androidx.leanback.widget.Q0;
import i0.C0767a;
/* loaded from: classes.dex */
public final class k extends C0767a {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f6233h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ AbstractC0278g f6234i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractC0278g abstractC0278g, int i7) {
        super("SET_ENTRANCE_START_STATE");
        this.f6233h = i7;
        this.f6234i = abstractC0278g;
    }

    @Override // i0.C0767a
    public final void c() {
        switch (this.f6233h) {
            case 0:
                s sVar = (s) this.f6234i;
                sVar.x0(false);
                sVar.C0(false);
                return;
            default:
                H h7 = (H) this.f6234i;
                A1.b bVar = h7.f6183K0;
                Q0 q02 = h7.f6184L0;
                bVar.getClass();
                q02.f6466c.setChildrenVisibility(4);
                return;
        }
    }
}
