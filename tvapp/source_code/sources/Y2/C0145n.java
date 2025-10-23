package Y2;

import java.io.IOException;
/* renamed from: Y2.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0145n extends IOException {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f4406r = 0;

    /* renamed from: q  reason: collision with root package name */
    public final int f4407q;

    public C0145n(int i7) {
        this.f4407q = i7;
    }

    public C0145n(int i7, String str, Throwable th) {
        super(str, th);
        this.f4407q = i7;
    }

    public C0145n(int i7, Throwable th) {
        super(th);
        this.f4407q = i7;
    }

    public C0145n(String str, int i7) {
        super(str);
        this.f4407q = i7;
    }
}
