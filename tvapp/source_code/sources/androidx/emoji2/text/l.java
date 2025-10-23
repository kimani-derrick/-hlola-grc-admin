package androidx.emoji2.text;

import android.os.Trace;
import com.google.android.gms.internal.measurement.R1;
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f5849q;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5849q) {
            case 0:
                try {
                    int i7 = G.e.f741a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (j.f5841j != null) {
                        j.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i8 = G.e.f741a;
                    Trace.endSection();
                    throw th;
                }
            default:
                R1.f8406k.incrementAndGet();
                return;
        }
    }
}
