package Y5;

import W5.InterfaceC0099f;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final j f4515a = new j(-1, null, null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f4516b = b6.a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c  reason: collision with root package name */
    public static final int f4517c = b6.a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
    public static final B0.d d = new B0.d(6, "BUFFERED", false);

    /* renamed from: e  reason: collision with root package name */
    public static final B0.d f4518e = new B0.d(6, "SHOULD_BUFFER", false);
    public static final B0.d f = new B0.d(6, "S_RESUMING_BY_RCV", false);

    /* renamed from: g  reason: collision with root package name */
    public static final B0.d f4519g = new B0.d(6, "RESUMING_BY_EB", false);

    /* renamed from: h  reason: collision with root package name */
    public static final B0.d f4520h = new B0.d(6, "POISONED", false);

    /* renamed from: i  reason: collision with root package name */
    public static final B0.d f4521i = new B0.d(6, "DONE_RCV", false);

    /* renamed from: j  reason: collision with root package name */
    public static final B0.d f4522j = new B0.d(6, "INTERRUPTED_SEND", false);

    /* renamed from: k  reason: collision with root package name */
    public static final B0.d f4523k = new B0.d(6, "INTERRUPTED_RCV", false);

    /* renamed from: l  reason: collision with root package name */
    public static final B0.d f4524l = new B0.d(6, "CHANNEL_CLOSED", false);

    /* renamed from: m  reason: collision with root package name */
    public static final B0.d f4525m = new B0.d(6, "SUSPEND", false);
    public static final B0.d n = new B0.d(6, "SUSPEND_NO_WAITER", false);

    /* renamed from: o  reason: collision with root package name */
    public static final B0.d f4526o = new B0.d(6, "FAILED", false);

    /* renamed from: p  reason: collision with root package name */
    public static final B0.d f4527p = new B0.d(6, "NO_RECEIVE_RESULT", false);

    /* renamed from: q  reason: collision with root package name */
    public static final B0.d f4528q = new B0.d(6, "CLOSE_HANDLER_CLOSED", false);

    /* renamed from: r  reason: collision with root package name */
    public static final B0.d f4529r = new B0.d(6, "CLOSE_HANDLER_INVOKED", false);

    /* renamed from: s  reason: collision with root package name */
    public static final B0.d f4530s = new B0.d(6, "NO_CLOSE_CAUSE", false);

    public static final boolean a(InterfaceC0099f interfaceC0099f, Object obj, L5.l lVar) {
        B0.d d7 = interfaceC0099f.d(obj, lVar);
        if (d7 != null) {
            interfaceC0099f.o(d7);
            return true;
        }
        return false;
    }
}
