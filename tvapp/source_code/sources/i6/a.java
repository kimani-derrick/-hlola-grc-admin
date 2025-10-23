package i6;

import M5.g;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f11388a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f11389b;

    public /* synthetic */ a(String str, boolean z7) {
        this.f11388a = str;
        this.f11389b = z7;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f11388a;
        g.f(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f11389b);
        return thread;
    }
}
