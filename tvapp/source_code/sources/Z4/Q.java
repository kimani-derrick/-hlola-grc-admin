package Z4;

import W5.AbstractC0117y;
import Z2.C0159d;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import j2.C0834c;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import w2.C1382d;
import w2.C1383e;
/* loaded from: classes.dex */
public final class Q extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4790a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4791b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(D5.i iVar) {
        super(Looper.getMainLooper());
        this.f4790a = 0;
        M5.g.f(iVar, "backgroundDispatcher");
        this.f4791b = iVar;
    }

    private final void a(Message message) {
        Set<j2.n> set;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i7 = message.what;
        if (i7 != 0) {
            if (i7 == 1) {
                C0834c c0834c = (C0834c) this.f4791b;
                if (obj == c0834c.f11788x && c0834c.j()) {
                    c0834c.f11788x = null;
                    if (obj2 instanceof Exception) {
                        c0834c.l((Exception) obj2, false);
                        return;
                    }
                    try {
                        byte[] bArr = (byte[]) obj2;
                        if (c0834c.f11771e == 3) {
                            j2.x xVar = c0834c.f11769b;
                            byte[] bArr2 = c0834c.f11787w;
                            int i8 = Z2.H.f4603a;
                            xVar.E(bArr2, bArr);
                            C0159d c0159d = c0834c.f11774i;
                            synchronized (c0159d.f4622q) {
                                set = c0159d.f4624s;
                            }
                            for (j2.n nVar : set) {
                                nVar.b();
                            }
                            return;
                        }
                        byte[] E4 = c0834c.f11769b.E(c0834c.f11786v, bArr);
                        int i9 = c0834c.f11771e;
                        if ((i9 == 2 || (i9 == 0 && c0834c.f11787w != null)) && E4 != null && E4.length != 0) {
                            c0834c.f11787w = E4;
                        }
                        c0834c.f11780p = 4;
                        c0834c.h(new f2.d(19));
                        return;
                    } catch (Exception e3) {
                        c0834c.l(e3, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        C0834c c0834c2 = (C0834c) this.f4791b;
        if (obj == c0834c2.f11789y) {
            if (c0834c2.f11780p == 2 || c0834c2.j()) {
                c0834c2.f11789y = null;
                boolean z7 = obj2 instanceof Exception;
                androidx.fragment.app.D d = c0834c2.f11770c;
                if (z7) {
                    d.M((Exception) obj2, false);
                    return;
                }
                try {
                    c0834c2.f11769b.f((byte[]) obj2);
                    d.f5884s = null;
                    HashSet hashSet = (HashSet) d.f5883r;
                    O3.E s6 = O3.E.s(hashSet);
                    hashSet.clear();
                    O3.C listIterator = s6.listIterator(0);
                    while (listIterator.hasNext()) {
                        C0834c c0834c3 = (C0834c) listIterator.next();
                        if (c0834c3.m()) {
                            c0834c3.i(true);
                        }
                    }
                } catch (Exception e7) {
                    d.M(e7, true);
                }
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1382d c1382d = null;
        switch (this.f4790a) {
            case 0:
                M5.g.f(message, "msg");
                if (message.what == 3) {
                    Bundle data = message.getData();
                    String str = (data == null || (str = data.getString("SessionUpdateExtra")) == null) ? "" : "";
                    Log.d("SessionLifecycleClient", "Session update received: ".concat(str));
                    AbstractC0117y.p(AbstractC0117y.a((D5.i) this.f4791b), null, 0, new P(str, null), 3);
                    return;
                }
                Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
                super.handleMessage(message);
                return;
            case 1:
                a(message);
                return;
            case 2:
                byte[] bArr = (byte[]) message.obj;
                if (bArr != null) {
                    Iterator it = ((j2.g) this.f4791b).f11796B.iterator();
                    while (it.hasNext()) {
                        C0834c c0834c = (C0834c) it.next();
                        c0834c.p();
                        if (Arrays.equals(c0834c.f11786v, bArr)) {
                            if (message.what == 2 && c0834c.f11771e == 0 && c0834c.f11780p == 4) {
                                int i7 = Z2.H.f4603a;
                                c0834c.i(false);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                C1383e c1383e = (C1383e) this.f4791b;
                c1383e.getClass();
                int i8 = message.what;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            AtomicReference atomicReference = c1383e.d;
                            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                            while (!atomicReference.compareAndSet(null, illegalStateException) && atomicReference.get() == null) {
                            }
                        } else {
                            c1383e.f15758e.d();
                        }
                    } else {
                        C1382d c1382d2 = (C1382d) message.obj;
                        int i9 = c1382d2.f15749a;
                        int i10 = c1382d2.f15750b;
                        MediaCodec.CryptoInfo cryptoInfo = c1382d2.d;
                        long j7 = c1382d2.f15752e;
                        int i11 = c1382d2.f;
                        try {
                            synchronized (C1383e.f15754h) {
                                c1383e.f15755a.queueSecureInputBuffer(i9, i10, cryptoInfo, j7, i11);
                            }
                        } catch (RuntimeException e3) {
                            AtomicReference atomicReference2 = c1383e.d;
                            while (!atomicReference2.compareAndSet(null, e3) && atomicReference2.get() == null) {
                            }
                        }
                        c1382d = c1382d2;
                    }
                } else {
                    C1382d c1382d3 = (C1382d) message.obj;
                    try {
                        c1383e.f15755a.queueInputBuffer(c1382d3.f15749a, c1382d3.f15750b, c1382d3.f15751c, c1382d3.f15752e, c1382d3.f);
                    } catch (RuntimeException e7) {
                        AtomicReference atomicReference3 = c1383e.d;
                        while (!atomicReference3.compareAndSet(null, e7) && atomicReference3.get() == null) {
                        }
                    }
                    c1382d = c1382d3;
                }
                if (c1382d != null) {
                    C1383e.c(c1382d);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(Object obj, Looper looper, int i7) {
        super(looper);
        this.f4790a = i7;
        this.f4791b = obj;
    }
}
