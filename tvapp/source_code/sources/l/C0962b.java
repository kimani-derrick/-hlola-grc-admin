package l;

import m3.g;
/* renamed from: l.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0962b extends g {
    public static volatile C0962b d;

    /* renamed from: e  reason: collision with root package name */
    public static final ExecutorC0961a f12228e = new ExecutorC0961a(0);

    /* renamed from: c  reason: collision with root package name */
    public final C0964d f12229c = new C0964d();

    public static C0962b K() {
        if (d != null) {
            return d;
        }
        synchronized (C0962b.class) {
            try {
                if (d == null) {
                    d = new C0962b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }
}
