package s3;

import java.lang.Thread;
/* renamed from: s3.f0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1173f0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final String f14014a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1169d0 f14015b;

    public C1173f0(C1169d0 c1169d0, String str) {
        this.f14015b = c1169d0;
        this.f14014a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f14015b.b().f13807v.c(th, this.f14014a);
    }
}
