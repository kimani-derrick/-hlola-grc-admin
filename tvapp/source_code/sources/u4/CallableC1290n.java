package u4;

import java.util.concurrent.Callable;
import v4.InterfaceC1325c;
/* renamed from: u4.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC1290n implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f15013a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f15014b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C1292p f15015c;

    public CallableC1290n(C1292p c1292p, long j7, String str) {
        this.f15015c = c1292p;
        this.f15013a = j7;
        this.f15014b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1292p c1292p = this.f15015c;
        u uVar = c1292p.n;
        if (uVar == null || !uVar.f15059e.get()) {
            ((InterfaceC1325c) c1292p.f15027i.f15333b).d(this.f15013a, this.f15014b);
            return null;
        }
        return null;
    }
}
