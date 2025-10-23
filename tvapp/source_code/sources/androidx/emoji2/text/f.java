package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import w0.G;
import w0.U;
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public int f5837a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5838b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5839c;

    public f(i iVar) {
        this.f5837a = 0;
        this.f5839c = new c();
        this.f5838b = iVar;
    }

    public static f a(U u7, int i7) {
        if (i7 != 0) {
            if (i7 == 1) {
                return new G(u7, 1);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new G(u7, 0);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.f5837a) {
            return 0;
        }
        return l() - this.f5837a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i7);

    public f(U u7) {
        this.f5837a = Integer.MIN_VALUE;
        this.f5839c = new Rect();
        this.f5838b = u7;
    }
}
