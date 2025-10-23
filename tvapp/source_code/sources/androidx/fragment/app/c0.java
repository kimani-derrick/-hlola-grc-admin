package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;
/* loaded from: classes.dex */
public final class c0 extends Writer {

    /* renamed from: r  reason: collision with root package name */
    public final StringBuilder f6027r = new StringBuilder(128);

    /* renamed from: q  reason: collision with root package name */
    public final String f6026q = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f6027r;
        if (sb.length() > 0) {
            Log.d(this.f6026q, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i7, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            char c5 = cArr[i7 + i9];
            if (c5 == '\n') {
                a();
            } else {
                this.f6027r.append(c5);
            }
        }
    }
}
