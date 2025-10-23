package H2;

import Y2.InterfaceC0143l;
import Z2.AbstractC0156a;
import android.content.Context;
import com.google.android.gms.internal.measurement.K1;
import java.util.HashMap;
import java.util.HashSet;
import k.V0;
import k2.C0944i;
/* renamed from: H2.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013n implements InterfaceC0024z {

    /* renamed from: a  reason: collision with root package name */
    public final V0 f1138a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0143l f1139b;

    /* renamed from: c  reason: collision with root package name */
    public L4.f f1140c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f1141e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final float f1142g;

    /* renamed from: h  reason: collision with root package name */
    public final float f1143h;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, k.V0] */
    public C0013n(Context context, C0944i c0944i) {
        K1 k12 = new K1(context, 23);
        this.f1139b = k12;
        ?? obj = new Object();
        obj.f11960a = c0944i;
        obj.f11961b = new HashMap();
        obj.f11962c = new HashSet();
        obj.d = new HashMap();
        this.f1138a = obj;
        if (k12 != ((InterfaceC0143l) obj.f11963e)) {
            obj.f11963e = k12;
            ((HashMap) obj.f11961b).clear();
            ((HashMap) obj.d).clear();
        }
        this.d = -9223372036854775807L;
        this.f1141e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.f1142g = -3.4028235E38f;
        this.f1143h = -3.4028235E38f;
    }

    public static InterfaceC0024z d(Class cls, InterfaceC0143l interfaceC0143l) {
        try {
            return (InterfaceC0024z) cls.getConstructor(InterfaceC0143l.class).newInstance(interfaceC0143l);
        } catch (Exception e3) {
            throw new IllegalStateException(e3);
        }
    }

    @Override // H2.InterfaceC0024z
    public final InterfaceC0024z a(g5.b bVar) {
        AbstractC0156a.j(bVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        V0 v02 = this.f1138a;
        v02.f = bVar;
        for (InterfaceC0024z interfaceC0024z : ((HashMap) v02.d).values()) {
            interfaceC0024z.a(bVar);
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01da, code lost:
        if (r1.f9719t != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fa  */
    /* JADX WARN: Type inference failed for: r14v1, types: [e2.N, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [e2.O, e2.P] */
    /* JADX WARN: Type inference failed for: r9v29, types: [com.google.android.gms.internal.measurement.S1, java.lang.Object] */
    @Override // H2.InterfaceC0024z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final H2.AbstractC0000a b(e2.Z r25) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.C0013n.b(e2.Z):H2.a");
    }

    @Override // H2.InterfaceC0024z
    public final InterfaceC0024z c(L4.f fVar) {
        AbstractC0156a.j(fVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f1140c = fVar;
        V0 v02 = this.f1138a;
        v02.f11964g = fVar;
        for (InterfaceC0024z interfaceC0024z : ((HashMap) v02.d).values()) {
            interfaceC0024z.c(fVar);
        }
        return this;
    }
}
