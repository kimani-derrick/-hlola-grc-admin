package Z0;

import M5.g;
import a1.C0197a;
import android.content.Context;
import e1.InterfaceC0567a;
import java.util.concurrent.atomic.AtomicBoolean;
import n5.y;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final y f4541a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4542b;

    /* renamed from: c  reason: collision with root package name */
    public final C0197a f4543c;
    public volatile InterfaceC0567a d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f4544e;

    public a(y yVar, Context context, C0197a c0197a) {
        g.f(yVar, "moshi");
        g.f(c0197a, "encryptedPreference");
        this.f4541a = yVar;
        this.f4542b = context;
        this.f4543c = c0197a;
        this.f4544e = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
        if (r3 == null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0212 A[LOOP:0: B:78:0x0210->B:79:0x0212, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022f  */
    /* JADX WARN: Type inference failed for: r0v7, types: [h6.u, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u4.v a() {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.a.a():u4.v");
    }

    public final InterfaceC0567a b() {
        InterfaceC0567a interfaceC0567a = this.d;
        if (interfaceC0567a == null || this.f4544e.get()) {
            synchronized (this) {
                interfaceC0567a = this.d;
                if (interfaceC0567a == null) {
                    Object b7 = a().b(InterfaceC0567a.class);
                    this.d = (InterfaceC0567a) b7;
                    this.f4544e.set(false);
                    interfaceC0567a = (InterfaceC0567a) b7;
                }
            }
        }
        g.e(interfaceC0567a, "result");
        return interfaceC0567a;
    }
}
