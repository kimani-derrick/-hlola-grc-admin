package w2;

import Z2.H;
import a3.C0208h;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
/* renamed from: w2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1379a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15738a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0208h f15739b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ InterfaceC1389k f15740c;

    public /* synthetic */ C1379a(InterfaceC1389k interfaceC1389k, C0208h c0208h, int i7) {
        this.f15738a = i7;
        this.f15740c = interfaceC1389k;
        this.f15739b = c0208h;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j7, long j8) {
        switch (this.f15738a) {
            case 0:
                ((C1381c) this.f15740c).getClass();
                C0208h c0208h = this.f15739b;
                c0208h.getClass();
                if (H.f4603a < 30) {
                    Handler handler = c0208h.f5042q;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j7 >> 32), (int) j7));
                    return;
                }
                c0208h.a(j7);
                return;
            default:
                ((g5.b) this.f15740c).getClass();
                C0208h c0208h2 = this.f15739b;
                c0208h2.getClass();
                if (H.f4603a < 30) {
                    Handler handler2 = c0208h2.f5042q;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j7 >> 32), (int) j7));
                    return;
                }
                c0208h2.a(j7);
                return;
        }
    }
}
