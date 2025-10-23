package n5;

import java.io.Closeable;
import java.io.Flushable;
/* loaded from: classes.dex */
public abstract class q implements Closeable, Flushable {

    /* renamed from: q  reason: collision with root package name */
    public int f12721q;

    /* renamed from: r  reason: collision with root package name */
    public int[] f12722r;

    /* renamed from: s  reason: collision with root package name */
    public String[] f12723s;

    /* renamed from: t  reason: collision with root package name */
    public int[] f12724t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f12725u;

    /* renamed from: v  reason: collision with root package name */
    public int f12726v;

    public abstract p a();

    public abstract p b();

    public abstract p f();

    public final String h() {
        return AbstractC1043D.c(this.f12721q, this.f12722r, this.f12723s, this.f12724t);
    }

    public abstract p j(String str);

    public abstract p n();

    public final int r() {
        int i7 = this.f12721q;
        if (i7 != 0) {
            return this.f12722r[i7 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public abstract p x(long j7);

    public abstract p y(String str);
}
