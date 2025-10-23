package a3;

import Z2.H;
import android.os.Handler;
import android.os.Message;
import e2.C0616l;
import w2.InterfaceC1389k;
/* renamed from: a3.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208h implements Handler.Callback {

    /* renamed from: q  reason: collision with root package name */
    public final Handler f5042q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ i f5043r;

    public C0208h(i iVar, InterfaceC1389k interfaceC1389k) {
        this.f5043r = iVar;
        Handler n = H.n(this);
        this.f5042q = n;
        interfaceC1389k.l(this, n);
    }

    public final void a(long j7) {
        i iVar = this.f5043r;
        if (this == iVar.f5048B1 && iVar.f15832Z != null) {
            if (j7 == Long.MAX_VALUE) {
                iVar.f15817O0 = true;
                return;
            }
            try {
                iVar.q0(j7);
                iVar.z0(iVar.f5076x1);
                iVar.f15821Q0.f11343e++;
                iVar.y0();
                iVar.Y(j7);
            } catch (C0616l e3) {
                iVar.f15819P0 = e3;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i7 = message.arg1;
        int i8 = message.arg2;
        int i9 = H.f4603a;
        a(((i7 & 4294967295L) << 32) | (4294967295L & i8));
        return true;
    }
}
